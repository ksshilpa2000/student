package com.Student.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Student.Service.StudentService;

import com.Student.Student.Model.Student;

@RestController //which defines class containing rest api
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		List<Student> list=studentService.getAllStudents();
		return list;
	}
	
	@GetMapping("/get/byName/{name}")
	public List<Student> getByName(@PathVariable("name")String name)
	{
		List<Student> list=studentService.getByName(name);
		return list;
	}
	@GetMapping("/get/byid/{id}")
	public Student getById(@PathVariable("id")int id)
	{
		Student s=studentService.getById(id);
		return s;
	}
	
	@PostMapping("/save")
	public Student createStudent(@RequestBody Student student) {
		Student student1=studentService.save(student);
		return student1;
		
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		Student s=studentService.update(student);
		return student;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		String isDeleteSuccess=studentService.delete(id);
		return isDeleteSuccess;
		
	}
	
}
	
