package com.hdfc.jdbc.crud.dao;

import java.util.List;

import com.hdfc.jdbc.crud.entity.Student;

public interface IStudentdao {
	public int addStudent(Student s);
	public List<Student> getStudents();
	public int delStudent(int id);
	public int updateStudent(int id, Student s);
	
}
