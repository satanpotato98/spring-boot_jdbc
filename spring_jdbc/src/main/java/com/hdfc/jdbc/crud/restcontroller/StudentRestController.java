package com.hdfc.jdbc.crud.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.jdbc.crud.entity.Student;
import com.hdfc.jdbc.crud.service.IStudentservice;


@RestController
@RequestMapping("/api/jdbc")
public class StudentRestController {
	
	@Autowired
	IStudentservice service;
	
	@PostMapping(value="/add",consumes = "application/json")
	public String   addStudent(@RequestBody Student s) {
		
		String  msg = null;
		
		int  count =	service.addStudent(s);
		
		if(count > 0) {
			
			msg = count + " Record Inserted Successfully";
			
		}
		else {
			
			msg = "Insert fail..";
		}
		
		return msg;
		
		
	}
	
	@GetMapping(value="/getall",produces = "application/json")
	public List<Student>  getStudents(){  //responsebody
		
		
	List<Student>  list =		service.getStudents();
		
		return list;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public  ResponseEntity<String>   delStudent(@PathVariable int id) {
		
		
		int count =		service.delStudent(id);
		
		
	return	new ResponseEntity<String>(count+" Record Deleted",HttpStatus.GONE);
		
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable int id, @RequestBody Student s){
		int count=service.updateStudent(id, s);
		return new ResponseEntity<String>(count+" Record updated",HttpStatus.ACCEPTED);
	}
	
	
	

}
