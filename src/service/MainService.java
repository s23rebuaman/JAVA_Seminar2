package service;

import model.Student;
import model.Professor;
import model.Degree;
import model.Course;
import model.Grade;

public class MainService {

	public static void main(String[] args) {
		System.out.println("-----------------------------STUDENTI------------------------------");
		Student st1 = new Student();
		System.out.println(st1); //0: Testa Students //tiString tiek izsaukts automātiski

		Student st2 = new Student("Janis", "Berzins");
		System.out.println(st2); //1: Janis Berzins
		
		Student st3 = new Student("Anna Paula", "Jauka-Nejauka");
		System.out.println(st3); //2: Anna Paula Jauka-Nejauka
		
		Student st4 = new Student("1234kcdljhceghcv", "Skirm$ante");
		System.out.println(st4); //3: Unknown Unknown
		
		System.out.println("-----------------------------PROFESORI------------------------------");
		
		Professor p1 = new Professor();
		System.out.println(p1); //0: Testa Profesors bsc
		
		Professor p2 = new Professor("Karina", "Skirtmante", Degree.mg);
		System.out.println(p2); //1: Karina Skirtmane
		
		Professor p3 = new Professor("123456789qwertyui", "Skirtm$ante", Degree.unknown);
		System.out.println(p3); //3:
		
		System.out.println("-----------------------------KURSI------------------------------");
		Course c1 = new Course();
		System.out.println(c1); 
		
		Course c2 = new Course("Java programmesana", 6, p2);
		System.out.println(c2); 
		
		Course c3 = new Course("Datu stdtfe6t75", 3, p3);
		System.out.println(c3); 
		
		System.out.println("-----------------------------ATZIMES------------------------------");
		Grade a1 = new Grade();
		System.out.println(a1); 
		
		Grade a2 = new Grade(6, c2);
		System.out.println(a2); 
		
		Grade a3 = new Grade(34, c3);
		System.out.println(a3); 
		
	}

}
