package entities;

public class Estudantes {

		private String name;
		private String email;
		
		public Estudantes () {
			
		}
		public Estudantes (String name,String email) {
			this.name = name;
			this.email = email;
		}
		public void setName(String name)  {
			this.name = name;
		}
		public String getName () {
			return this.name;
		}
		public void setEmail (String email) {
			this.email = email;
		}
		public String getEmail () {
			return this.email;
		}
}
