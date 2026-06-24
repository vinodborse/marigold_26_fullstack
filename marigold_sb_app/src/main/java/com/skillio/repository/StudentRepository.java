package com.skillio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillio.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	List<Student> findByName(String name);
	Optional<Student> findByMail(String mail);
}
