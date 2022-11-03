package com.Student.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Student.DAO.StudentDAO;
import com.Student.Student.Model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDAO studentDAO;
	
	public String get() {
		// TODO Auto-generated method stub
		return "success";
	}
	
	public List<Student> getAllStudents(){
		return studentDAO.getAllStudents();
		
	}

	public List<Student> getByName(String name) {
		if(name=="") {
			return null;
		}
		else {
		return  studentDAO.getByName(name);
		}
		}
		
		public Student getById(int id) {
			return  studentDAO.getById(id);
	}

		public Student save(Student student) {
			return studentDAO.save(student);
		}

		public Student update(Student student) {
			
			return studentDAO.update(student);
		}

		public String delete(int id) {
			studentDAO.delete(id);
			return "success";
		}
	

}
