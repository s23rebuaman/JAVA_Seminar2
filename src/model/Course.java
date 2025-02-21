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
		public Course(String title, int CreditPoints, Professor professor) {
			setC_ID();
			setTitle("Testa kurss");
			setCreditPoints(1);
			setProfessor(new Professor());
		}

		@Override
		public String toString() {
			return p_ID + ": " + name + " " + surname + " " + degree;
		}
		
		//6. toString funkcija ---------------------------------------------------
		
		
		//7. citas funkijas (ja nepieciešams) ---------------------------------------------------
		
	}