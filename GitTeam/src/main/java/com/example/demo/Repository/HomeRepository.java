package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;

@Repository
public interface HomeRepository extends JpaRepository<Student, Integer> {
	
	public Student findById(int id);

}
