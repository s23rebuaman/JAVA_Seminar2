package model;

public class Grade {
	//1. mainīgie ---------------------------------------------------
	private long g_ID;
	private int grValue;
	private Student student;
	private Course course;
	
	private static long counter = 30000;
	
	//2. getters ---------------------------------------------------
	public long getG_ID(){
		return g_ID;
	}
	
	public int getGrValue(){
		return grValue;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Course getCourse(){
		return course;
	}
	
	//3. setter ---------------------------------------------------
	public void setG_ID() {
		g_ID = counter++;
	}
	/*
	public void setName(String name) {
		this.name = name;
	}
	*/
	public void setGrValue(int inputGrValue) {
		if(inputGrValue > 0 && inputGrValue <= 10) {
			grValue = inputGrValue;
		}
		else {
			grValue = 0;
		}
	}
	
	public void setStudent(Student inputStuent) {
		if(inputStuent != null) {
			student = inputStuent;
		}
		else {
			student = new Student();
		}
	}
	
	public void setCourse(Course inputCourse) {
		if(inputCourse != null) {
			course = inputCourse;
		}
		else {
			course = new Course();
		}
	}
	
	//4. bez arguemnta konstruktors ---------------------------------------------------
	public Grade() {
		setG_ID();
		setGrValue(9);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	//5. argumenta konstruktors ---------------------------------------------------
	public Grade(int inputGrValue, Student inputStudent, Course inputCourse) {
		setG_ID();
		setGrValue(inputGrValue);
		setStudent(inputStudent);
		setCourse(inputCourse);
	}
	
	//6. toString funkcija ---------------------------------------------------
	//pārrakstam object klases String funkciju
	@Override
	public String toString() {
		return g_ID + ": " + grValue + " (" + course.getTitle() + ") -> " + student.getName().charAt(0) + ". " + student.getSurname();
	}
	/*
	@Override
	public String toString() {
		return "Student [st_ID=" + st_ID + ", name=" + name + ", surname=" + surname + "]";
	}
	*/
	
	//7. citas funkijas (ja nepieciešams) ---------------------------------------------------
	
}
