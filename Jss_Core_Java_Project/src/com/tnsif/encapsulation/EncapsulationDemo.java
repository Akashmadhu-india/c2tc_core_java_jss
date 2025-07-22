package com.tnsif.encapsulation;

public class EncapsulationDemo {
	public static void main(String[]args) {
		OoopsConceptDemo obj=new OoopsConceptDemo();
		obj.setAge(21);
		obj.setName("gaya");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj);
		OoopsConceptDemo obj1=new OoopsConceptDemo();
		System.out.println(obj1);
	}

}
