package com.model.test.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.test.model.StudentModel;
import com.model.test.service.StudentService;


@RestController
@RequestMapping("Studentdetail")
public class StudentController {
@Autowired
StudentService service;

@PostMapping("insert")
public StudentModel insert(@RequestBody StudentModel add)
{
	return service.insert(add);
}
@GetMapping("getall")
public  ArrayList<StudentModel> getall()
{
	return service.getall();
}
@PutMapping("update/{id}")
public StudentModel update(@PathVariable long id,@RequestBody StudentModel alter)
{
	return service.update(alter);
}
@DeleteMapping("delete/{id}")
public long delete(@PathVariable long id,@RequestBody StudentModel cancel)
{
	return service.delete(id);
}
@DeleteMapping("delete")
public void deleteAll()
{
	service.deleteAll();
}
@GetMapping("getbyid/{id}")
public Optional<StudentModel> getById(@PathVariable long id)
{
	return service.getById(id);
}
}