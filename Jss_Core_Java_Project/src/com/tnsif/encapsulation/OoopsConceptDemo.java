package com.tnsif.encapsulation;

public class OoopsConceptDemo {
	 private  int age;
		private  String name;
		private  String email;
		
		
		
		public int getAge() {
			return age;
		}



		public void setAge(int age) {
			this.age = age;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		@Override
		public String toString() {
			return "OoopsConceptDemo [age=" + age + ", name=" + name + ", email=" + email + "]";
		}


	

}
