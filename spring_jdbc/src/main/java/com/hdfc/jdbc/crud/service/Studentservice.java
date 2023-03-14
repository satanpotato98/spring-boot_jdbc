package com.hdfc.jdbc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.jdbc.crud.dao.IStudentdao;
import com.hdfc.jdbc.crud.entity.Student;

@Service
public class Studentservice implements IStudentservice {
	
	@Autowired
	private IStudentdao dao;
	
	@Override
	public int addStudent(Student s) {
		// TODO Auto-generated method stub
		return dao.addStudent(s);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return dao.getStudents();
	}

	@Override
	public int delStudent(int id) {
		// TODO Auto-generated method stub
		return dao.delStudent(id);
	}

	@Override
	public int updateStudent(int id, Student s) {
		// TODO Auto-generated method stub
		return dao.updateStudent(id, s);
	}

}
