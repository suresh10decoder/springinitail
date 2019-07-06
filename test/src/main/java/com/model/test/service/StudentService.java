package com.model.test.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.test.model.StudentModel;
import com.model.test.repository.StudentRepository;


@Component
public class StudentService {
@Autowired
StudentRepository repository;
public StudentModel insert(StudentModel add)
{
	return repository.save(add);
	
}
public ArrayList<StudentModel> getall()
{
	return (ArrayList<StudentModel>) repository.findAll();
}
public StudentModel update(StudentModel alter)
{
	return repository.save(alter);
}
public long delete(long id)

{
	
 repository.deleteById(id);
			return id;
}
public Optional<StudentModel> getById(long id)
{
	return repository.findById(id);
}
public void deleteAll()
{
	repository.deleteAll();
}
}
