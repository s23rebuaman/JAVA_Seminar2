package service;

import model.Student;
import model.Professor;
import model.Degree;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;

public class MainService {
	
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();

	public static void main(String[] args) {
		System.out.println("-----------------------------STUDENTI------------------------------");
		Student st1 = new Student();
		//System.out.println(st1); //0: Testa Students //tiString tiek izsaukts automātiski

		Student st2 = new Student("Janis", "Berzins");
		//System.out.println(st2); //1: Janis Berzins
		
		Student st3 = new Student("Anna Paula", "Jauka-Nejauka");
		//System.out.println(st3); //2: Anna Paula Jauka-Nejauka
		
		Student st4 = new Student("1234kcdljhceghcv", "Skirm$ante");
		//System.out.println(st4); //3: Unknown Unknown
		
		Student st5 = new Student("Laura", "Gudra");
		
		/*
		allStudents.add(st1);
		allStudents.add(st2);
		allStudents.add(st3);
		allStudents.add(st4);
		*/
		allStudents.addAll(Arrays.asList(st1, st2, st3, st4));
		System.out.println(allStudents);
		
		
		System.out.println("-----------------------------PROFESORI------------------------------");
		
		Professor p1 = new Professor();
		//System.out.println(p1); //0: Testa Profesors bsc
		
		Professor p2 = new Professor("Karina", "Skirtmante", Degree.mg);
		//System.out.println(p2); //1: Karina Skirtmane
		
		Professor p3 = new Professor("123456789qwertyui", "Skirtm$ante", Degree.unknown);
		//System.out.println(p3); //3:
		
		allProfessors.addAll(Arrays.asList(p1, p2, p3));
		System.out.println(allProfessors);
		
		try {
			createProfessor("Karlis", "Immers", Degree.mg);
			createProfessor("Raita", "Rollande", Degree.dr);
			createProfessor("Juris", "Zagars", Degree.dr);
			//createProfessor("Karlis", "Immers", Degree.mg);//sagaidu izņēmumu
			System.out.println("Pievienots jauns profesors:" + allProfessors);
			System.out.println("10001 profesors: " + retrieveProfessorById(10001));
			
			updateProfessorById(10001, "Karina", "Krinkele", Degree.dr);
			System.out.println("Atjaunots eksitsējošs profesors: " + allProfessors);
			
			deleteProfessorById(10000);
			System.out.println("Izdzēsts testa profesors: " + allProfessors);
			
			System.out.println("Profesori ar dr grādu: " + filterProfessorByDegree(Degree.dr));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------KURSI------------------------------");
		Course c1 = new Course();
		//System.out.println(c1); 
		
		Course c2 = new Course("Java programmesana", 6, p2);
		//System.out.println(c2); 
		
		Course c3 = new Course("Datu stdtfe6t75", 3, p3);
		//System.out.println(c3); 
		try {
			Course c4 = new Course("Tīmekļa operētājsistēmas", 6, retrieveProfessorById(10003));
			allCourses.addAll(Arrays.asList(c1, c2, c3, c4));
		
		
		allCourses.addAll(Arrays.asList(c1, c2, c3));
		System.out.println(allCourses);
		
		System.out.println("-----------------------------ATZIMES------------------------------");
		Grade g1 = new Grade();
		//System.out.println(g1); 
		
		Grade g2 = new Grade(10, st2, c2);
		//System.out.println(g2); 
		
		Grade g3 = new Grade(34, st4, c3);
		//System.out.println(g3); 
		
		Grade g4 = new Grade(9, st2, c3);
		Grade g5 = new Grade(4, st5, c2);
		
		allGrades.addAll(Arrays.asList(g1, g2, g3, g4, g5));
		System.out.println(allGrades);
		System.out.println("Jāņa vidējā atzīme: " + calculateAverageGradeForStudentById(1));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	//CRUD - create, retrieve, update, delete
	//C - create
	public static void createProfessor(String name, String surname, Degree degree) throws Exception {
		//Pārbauda, vai tāds profesors jau eksistē
		for(Professor tempP : allProfessors) { //vai sakrīt šis vārds
			if(tempP.getName().equals(name)  //ar to vārdu kas šeit padots
					&& tempP.getSurname().equals(surname)
					&& tempP.getDegree().equals(degree)) 
			{
				throw new Exception("Tāds profesors jau eskistē sistēmā");
			}
		}
		
		//Professor newProfessor = new Professor(name, surname, degree);
		//allProfessors.add(newProfessor);
		allProfessors.add(new Professor(name, surname, degree));
		
	}
	
	//R - retrieve
	public static Professor retrieveProfessorById(int id) throws Exception {
		if(id < 0) {
			throw new Exception("Id nevar būt negatīvs");
		}
		for(Professor tempP : allProfessors) {
			if(tempP.getP_ID() == id) {
				return tempP;
			}
		}
		throw new Exception("Profesors ar norādīto id neeksitsē");
	}
	
	//U - update
	public static void updateProfessorById(int id, String inputName, String inputSurname, Degree inputDegree) throws Exception{
		Professor foundProfessor = retrieveProfessorById(id); //pārbauda vai eksitsē
		if(inputName != null && !foundProfessor.getName().equals(inputName)) {
			foundProfessor.setName(inputName);
		}
		if(inputSurname != null && !foundProfessor.getSurname().equals(inputSurname)) {
			foundProfessor.setSurname(inputSurname);
		}
		if(inputDegree != null && !foundProfessor.getDegree().equals(inputDegree)) {
			foundProfessor.setDegree(inputDegree);
		}
	}
	
	//D - delete
	public static void deleteProfessorById(int id) throws Exception{
		Professor foundProfessor = retrieveProfessorById(id);
		allProfessors.remove(foundProfessor);
	}
	
	// Profesoru filtrēšana pēc grāda ------------------
	public static ArrayList<Professor> filterProfessorByDegree(Degree inputDegree) throws Exception{
		if(inputDegree == null) {
			throw new Exception("Nav pareizi ievadīti dati par grādu");
		}
		ArrayList<Professor> results = new ArrayList<Professor>();
		for(Professor tempP : allProfessors) {
			if(tempP.getDegree().equals(inputDegree)) {
				results.add(tempP);
			}
		}
		return results;
	}
	
	// vidējās atzīmes aprēkināšanu, ja padod studenta id
	public static float calculateAverageGradeForStudentById(int id) throws Exception {
		retrieveStudentById(id); //pārbaudam, vai students vispātr eksist;e, ja eskistē, turpinam, ja nē, izmet izņēmumu
		
		int howManyGrades = 0;
		float sum = 0;
		for(Grade tempG : allGrades) {
			if(tempG.getStudent().getStID() == id) {
				howManyGrades++;
				sum += tempG.getGrValue();
				//System.out.println(tempG);
			}
		}
		if(howManyGrades == 0) {
			throw new Exception("Studentam nav piesaistīta neviena atzīme");
		}
		return sum/howManyGrades;
	}
	
	public static Student retrieveStudentById(int id) throws Exception {
		if(id < 0) {
			throw new Exception("Id nevar būt negatīvs");
		}
		for(Student tempS : allStudents) {
			if(tempS.getStID() == id) {
				return tempS;
			}
		}
		throw new Exception("Srofesors ar norādīto id neeksitsē");
	}
	
	// uztaisīt kādam no pasniedzējiem vēl vienu kursu
	// aprēķināt cik kursus pasniedz konkrētais pasniedzējs

}
