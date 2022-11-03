package com.Student.Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Student.Student.Model.Student;
@EnableJpaRepositories
public interface  StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findAllByName(String name);
}