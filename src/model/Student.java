package model;

public class Student {
	//1. mainīgie ---------------------------------------------------
	private long st_ID;
	private String name;
	private String surname;
	
	private static long counter = 0;
	
	//2. getters ---------------------------------------------------
	public long getStID(){
		return st_ID;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSurname(){
		return surname;
	}
	
	//3. setter ---------------------------------------------------
	public void setSt_ID() {
		st_ID = counter++;
	}
	/*
	public void setName(String name) {
		this.name = name;
	}
	*/
	public void setName(String inputName) {
		if(inputName != null && inputName.matches("[A-Z]{1}[a-z]{3,10}([ ][A-Z]{1}[a-z]{3,10})?")) {
			name = inputName;
		}
		else {
			name = "Unknown";
		}
	}
	
	public void setSurname(String inputSurname) {
		if(inputSurname != null && inputSurname.matches("[A-Z]{1}[a-z]{3,10}([-][A-Z]{1}[a-z]{3,10})?")) {
			name = inputSurname;
		}
		else {
			name = "Unknown";
		}
	}
	
	//4. bez arguemnta konstruktors ---------------------------------------------------
	public Student() {
		setSt_ID();
		setName("Testa");
		setSurname("Students");
	}
	
	//5. argumenta konstruktors ---------------------------------------------------
	public Student(String name, String surname) {
		setSt_ID();
		setName(name);
		setSurname(surname);
	}
	
	//6. toString funkcija ---------------------------------------------------
	//pārrakstam object klases String funkciju
	@Override
	public String toString() {
		return st_ID + ": " + name + " " + surname;  //2: Karlis Lielais
	}
	/*
	@Override
	public String toString() {
		return "Student [st_ID=" + st_ID + ", name=" + name + ", surname=" + surname + "]";
	}
	*/
	
	//7. citas funkijas (ja nepieciešams) ---------------------------------------------------
	
}
