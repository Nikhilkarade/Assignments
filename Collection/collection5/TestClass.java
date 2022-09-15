package com.yash.collection5;

import java.util.Collections;
import java.util.Vector;

public class TestClass {

	public static void main(String[] args) {

		Vector<Student> student = new Vector<>();

		student.add(new Student("Nikhil", 86, 1));
		student.add(new Student("Rahul", 96, 2));
		student.add(new Student("Dinesh", 99, 4));
		student.add(new Student("Tushar", 100, 9));
		student.add(new Student("Suraj", 88, 34));

		for (Student s : student)

			System.out.println("Name:" + s.name + "->" + "Marks:" + s.marks + "->" + "ID:" + s.id);

		System.out.println();

		Collections.sort(student);

		for (Student s : student)

			System.out.println("Name:" + s.name + "->" + "Marks:" + s.marks + "->" + "ID:" + s.id);

	}

}
