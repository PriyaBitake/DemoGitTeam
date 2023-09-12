package com.example.demo.Service;

import com.example.demo.Model.Student;

public interface HomeService {

	void saveData(Student s);

	Iterable<Student> getAllData();

	public void delete(int id);

	Student getSingleData(int id);

}
