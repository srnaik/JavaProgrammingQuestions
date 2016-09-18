package com.sac;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Student>{

	@Override
	public int compare(Student studentOne, Student studentTwo) {

		if(studentOne.getGpa() > studentOne.getGpa())
			return  1;
		else
			return -1;

	}

}
