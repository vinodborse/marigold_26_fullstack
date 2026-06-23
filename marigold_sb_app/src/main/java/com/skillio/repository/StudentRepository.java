package com.skillio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillio.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
}
