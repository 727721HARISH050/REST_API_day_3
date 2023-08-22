package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.EmplyeeEntity;
import com.example.demo.service.EmployeeService;




@RestController
public class EmplyeeController {
	@Autowired
	EmployeeService es;
	@PostMapping("read")
	public EmplyeeEntity addinfo(@RequestBody EmplyeeEntity ee)
	{
		return es.saveinfo(ee);
	}
	@GetMapping("day3show")
	public List<EmplyeeEntity> show()
	{
		return es.showinfo();
	}

}