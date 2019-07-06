package com.model.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.test.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel,Long>{


}
