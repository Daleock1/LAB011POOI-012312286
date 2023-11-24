	package ListaDeLibros;
	
	public class Autor {
		
			String name;
			String email;
			char gender;
			public Autor(String name, String email, char gender) {
				super();
				this.name = name;
				this.email = email;
				this.gender = gender;
			}
			public String getName() {
				return name;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public char getGender() {
				return gender;
			}
			@Override
			public String toString() {
				return name + " " + gender + " at " + email;
			}
			
			
	}
