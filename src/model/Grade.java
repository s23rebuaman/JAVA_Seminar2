package model;

public class Grade {
	//1. mainīgie ---------------------------------------------------
	private long g_ID;
	private int value;
	private Course course;
	
	private static long counter = 0;
	
	//2. getters ---------------------------------------------------
	public long getG_ID(){
		return g_ID;
	}
	
	public int getValue(){
		return value;
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
	public void setValue(int inputValue) { //ja ir referenču datu tips, jāpārbauda ar is null
		if(inputValue > 0 && inputValue <= 10) {
			value = inputValue;
		}
		else {
			value = 0;
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
		setValue(9);
		setCourse(new Course());
	}
	
	//5. argumenta konstruktors ---------------------------------------------------
	public Grade(int inputVlaue, Course inputCourse) {
		setG_ID();
		setValue(inputVlaue);
		setCourse(inputCourse);
	}
	
	//6. toString funkcija ---------------------------------------------------
	//pārrakstam object klases String funkciju
	@Override
	public String toString() {
		return g_ID + ": " + value + " " + course;
	}
	/*
	@Override
	public String toString() {
		return "Student [st_ID=" + st_ID + ", name=" + name + ", surname=" + surname + "]";
	}
	*/
	
	//7. citas funkijas (ja nepieciešams) ---------------------------------------------------
	
}
