package com.example.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired //extends another class
         StudentService stuService;
	@PutMapping("/UpdateDetails")
	public StudentEntity UpdateInfo(@RequestBody StudentEntity st1)
	{
		return stuService.UpdateDetails(st1);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id")int id)
	{
		stuService.deleteDetails(id);
		return "Deleted details";
	}
}