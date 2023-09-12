package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.HomeRepository;
import com.example.demo.Service.HomeService;

@Service
public class HomeSerivceImpl implements HomeService {

	
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		
		hr.save(s);
		
	}

	@Override
	public Iterable<Student> getAllData() {
		
		return hr.findAll();
	}

	@Override
	public void delete(int id) {
	hr.deleteById(id);
		
	}
}
