package com.tnsif.encapsulation;

public class Person {
	private int age;
	private String name;
	private int income;
	private String gender;
	 
	
	
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



	public int getIncome() {
		return income;
	}



	public void setIncome(int income) {
		this.income = income;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", income=" + income + ", gender=" + gender + "]";
	}

}
