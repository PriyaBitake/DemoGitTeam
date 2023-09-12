package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	

	@PostMapping("/saveData")
	public String saveData(@RequestBody Student s)
	{
		
		hs.saveData(s);
		return "Data Save Zala Re ba ";
	}
	
	@GetMapping("/getAll")
	public Iterable<Student> getAllData()
	{
		return hs.getAllData();
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")int id) {
		hs.delete(id);
		return" data is deleted";
	}
	
	@GetMapping("/getSingleData/{id}")
	public Student getSingleData(@PathVariable int id)
	{
		
		Student s=hs.getSingleData(id);
		
		return s;
		
	}
	
	@PutMapping("/updateData")
	public String updateData(@RequestBody Student s)
	{
		hs.saveData(s);
		return "Data Updated ";
	}
	
}
