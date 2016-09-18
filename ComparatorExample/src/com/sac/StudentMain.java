package com.sac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentMain {
	
	

	public static void main(String[] args) {
		
		Student studentOne = new Student();
		studentOne.setGpa(3.5);
		studentOne.setFirstName("ABC");
		studentOne.setLastName("XYZ");
		
		Student studentTwo = new Student();
		studentTwo.setGpa(3.75);
		studentTwo.setFirstName("DEF");
		studentTwo.setLastName("UVW");
		
		Student studentThree = new Student();
		studentThree.setGpa(3.10);
		studentThree.setFirstName("JPA");
		studentThree.setLastName("HIB");
		
		ArrayList<Student> studentArrayList = new ArrayList<>();
		studentArrayList.add(studentOne);
		studentArrayList.add(studentTwo);
		studentArrayList.add(studentThree);
		
		Collections.sort(studentArrayList, new ComparatorImpl());
		
		for (Student student : studentArrayList) {
			System.out.println(student.getFirstName() + "\t " + student.getGpa());
		}

	}

}
