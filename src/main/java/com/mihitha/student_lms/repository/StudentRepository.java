package com.mihitha.student_lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mihitha.student_lms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
