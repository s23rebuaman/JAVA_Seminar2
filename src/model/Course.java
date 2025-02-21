package model;

public class Course {
	//1. mainīgie ---------------------------------------------------
	private long c_ID;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 20000;
	
	//2. getters ---------------------------------------------------
		public long getC_ID(){
			return c_ID;
		}
		
		public String getTitle(){
			return title;
		}
		
		public int getCreditPoints(){
			return creditPoints;
		}
		
		public Professor getPrpfessor(){
			return professor;
		}
		
		//3. setter ---------------------------------------------------
		public void setC_ID() {
			c_ID = counter++;
		}
		
		public void setTitle(String inputTitle) {
			if(inputTitle != null && inputTitle.matches("[A-Za-z ]{4,20}")) {
				title = inputTitle;
			}
			else {
				title = "Unknown";
			}
		}
		
		public void setCreditPoints(int inputCreditPoints) {
			if(inputCreditPoints > 0 && inputCreditPoints <= 30) {
				creditPoints = inputCreditPoints;
			}
			else {
				creditPoints = 1;
			}
		}
		
		public void setProfessor(Professor inputProfessor) {
			if(inputProfessor != null) {
				professor = inputProfessor;
			}
			else{
				professor = new Professor();
			}
		}
		
		//4. bez arguemnta konstruktors ---------------------------------------------------
		public Course() {
			setC_ID();
			setTitle("Testa kurss");
			setCreditPoints(1);
			setProfessor(new Professor());
		}
		
		//5. argumenta konstruktors ---------------------------------------------------
		public Course(String inputTitle, int inputCreditPoints, Professor inputProfessor) {
			setC_ID();
			setTitle(inputTitle);
			setCreditPoints(inputCreditPoints);
			setProfessor(inputProfessor);
		}

		//6. toString funkcija ---------------------------------------------------
		public String toString() {
			return c_ID + ": " + title + " (" + creditPoints + " KP) " + professor.getName().charAt(0) + ". " + professor.getSurname();
		}
		
		//7. citas funkijas (ja nepieciešams) ---------------------------------------------------
		
	}