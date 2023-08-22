package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.EmplyeeEntity;

public interface EmployeeRepo extends JpaRepository<EmplyeeEntity, Integer>{

}
