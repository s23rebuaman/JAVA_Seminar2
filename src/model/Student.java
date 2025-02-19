package model;

public class Student {
	//1. mainīgie
	private long st_ID;
	private String name;
	private String surname;
	
	//2. getters
	public long getStID(){
		return st_ID;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSurname(){
		return surname;
	}
	
	//3. setter
	public void setSt_ID(long st_ID) {
		this.st_ID = st_ID;
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
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
	//4. bez arguemnta konstruktors
	//5. argumenta konstruktors
	//6. toString funkcija
	//7. citas funkijas (ja nepieciešams)
	
}
