package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.EmplyeeEntity;
import com.example.demo.repositary.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo er;
	public EmplyeeEntity saveinfo(EmplyeeEntity ee)
	{
		return er.save(ee);
	}
	public List<EmplyeeEntity> showinfo()
	{
		return er.findAll();
	}
	

}
