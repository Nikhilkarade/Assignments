package com.yash.springboot.SpringBootProject1.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.springboot.SpringBootProject1.model.Student;
import com.yash.springboot.SpringBootProject1.repository.HomeRepository;

@Service
public class ServiceImpl implements com.yash.springboot.SpringBootProject1.service.Service{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void savedata(Student s) {
		
		hr.save(s);
		
	}

	@Override
	public List getData() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
	}

//	@Override
//	public void updateData(Student s) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void updateData(Student s) {
//		// TODO Auto-generated method stub
//
//		hr.s
//	}

//	@Override
//	public void deleteData(Student s) {
//		// TODO Auto-generated method stub
//		hr.delete(s);
//	}

}
