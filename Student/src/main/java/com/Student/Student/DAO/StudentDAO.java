package com.Student.Student.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Student.Student.Model.Student;
import com.Student.Student.Repository.StudentRepository;

@Service
public class StudentDAO {
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		List<Student> students= studentRepository.findAll();
		if(students==null) {
			return null;
		}
		else {
			return students;
		}
		
	}
	public List<Student> getByName(String name) {
		return studentRepository.findAllByName(name);
	}
	
	public Student getById(int id) {
		return studentRepository.findById(id).get();
	}
	public Student save(Student student) {
		return  studentRepository.save(student);
		
	}
	public Student update(Student student) {
			return studentRepository.save(student);
	}
	public void delete(int id) {
		studentRepository.deleteById(id);
		
	}
}