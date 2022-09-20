package com.yash.springboot.SpringBootProject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springboot.SpringBootProject1.model.Student;
import com.yash.springboot.SpringBootProject1.service.Service;

@RestController
public class HomeController {

	@Autowired
	Service sr;
	
	@PostMapping(value = "/saveData")
	public String postEnquiryDetails(@RequestBody Student s) {
		sr.savedata(s);
		return "Saved Student Details";
	}
	
	@GetMapping(value = "/getData")
	public Iterable<Student> getEnquiryDetails() {
		
		List l=sr.getData();
		
		return l;
	}
	@DeleteMapping(value="/deleteData/{id}")
	public Iterable<Student> deleteEnquiryDetails(@PathVariable int id) {
		
		sr.deleteData(id);
		 List l=sr.getData();
		
		return l;
	}
	@PutMapping(value = "/updateData")
	public Iterable<Student> updateEnquiryDetails(@RequestBody Student s) {
		sr.savedata(s);
//		sr.updateData(s);
		 List l=sr.getData();
			
			return l;
	}
	
	
}
