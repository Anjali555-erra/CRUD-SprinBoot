package com.demo.studentPortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.studentPortal.entity.Student;

public interface studentRepository extends JpaRepository<Student,Long> {

}
