package model;

public class Professor {
	//1. mainīgie ---------------------------------------------------
	private long p_ID;
	private String name;
	private String surname;
	private Degree degree;
	
	private static long counter = 10000;
	
	//2. getters ---------------------------------------------------
		public long getP_ID(){
			return p_ID;
		}
		
		public String getName(){
			return name;
		}
		
		public String getSurname(){
			return surname;
		}
		
		public Degree getDegree(){
			return degree;
		}
		
		//3. setter ---------------------------------------------------
		public void setP_ID() {
			p_ID = counter++;
		}
		
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
				surname = inputSurname;
			}
			else {
				surname = "Unknown";
			}
		}
		
		public void setDegree(Degree inputDegree) {
			if(inputDegree != null) {
				degree = inputDegree;
			}
			else{
				degree = Degree.unknown;
			}
		}
		
		//4. bez arguemnta konstruktors ---------------------------------------------------
		public Professor() {
			setP_ID();
			setName("Testa");
			setSurname("Profesors");
			setDegree("Students");
		}
		
		//5. argumenta konstruktors ---------------------------------------------------
		public Professor(String name, String surname, Degree degree) {
			setP_ID();
			setName(name);
			setSurname(surname);
			setDegree(degree);
		}

		@Override
		public String toString() {
			return "Professor [p_ID=" + p_ID + ", name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
		}
		
		//6. toString funkcija ---------------------------------------------------
		
		
		//7. citas funkijas (ja nepieciešams) ---------------------------------------------------
		
	}