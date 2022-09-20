package com.yash.springboot.SpringBootProject1.service;

import java.util.List;

import com.yash.springboot.SpringBootProject1.model.Student;

public interface Service {

	void savedata(Student s);

	List getData();

	void deleteData(int id);

//	void updateData(Student s);

}
