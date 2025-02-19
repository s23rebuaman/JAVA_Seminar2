package service;

import model.Student;
import model.Professor;
import model.Degree;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1); //0: Testa Students //tiString tiek izsaukts automātiski

		Student st2 = new Student("Janis", "Berzins");
		System.out.println(st2); //1: Janis Berzins
		
		Student st3 = new Student("Anna Paula", "Jauka-Nejauka");
		System.out.println(st3); //2: Anna Paula Jauka-Nejauka
		
		Student st4 = new Student("1234kcdljhceghcv", "Skirm$ante");
		System.out.println(st4); //3: Unknown Unknown
		
		System.out.println("-----------------------------------------------------------");
		
		Professor p1 = new Professor();
		System.out.println(p1); //0: Testa Profesors bsc
		
		Professor p2 = new Professor("Karina", "Skirtmante", Degree.mg);
		System.out.println(p2); //1: Karina Skirtmane
		
		Professor p3 = new Professor("123456789qwertyui", "Skirtm$ante", Degree.unknown);
		System.out.println(p3); //3:
	}

}
