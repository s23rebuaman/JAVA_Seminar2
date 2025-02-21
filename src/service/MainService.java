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
		
		try {
			createProfessor("Karlis", "Immers", Degree.mg);
			//createProfessor("Karlis", "Immers", Degree.mg);//sagaidu izņēmumu
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(allProfessors);
		
		System.out.println("-----------------------------KURSI------------------------------");
		Course c1 = new Course();
		//System.out.println(c1); 
		
		Course c2 = new Course("Java programmesana", 6, p2);
		//System.out.println(c2); 
		
		Course c3 = new Course("Datu stdtfe6t75", 3, p3);
		//System.out.println(c3); 
		
		allCourses.addAll(Arrays.asList(c1, c2, c3));
		System.out.println(allCourses);
		
		System.out.println("-----------------------------ATZIMES------------------------------");
		Grade g1 = new Grade();
		//System.out.println(g1); 
		
		Grade g2 = new Grade(6, st2, c2);
		//System.out.println(g2); 
		
		Grade g3 = new Grade(34, st4, c3);
		//System.out.println(g3); 
		
		allGrades.addAll(Arrays.asList(g1, g2, g3));
		System.out.println(allGrades);
		
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

}
