package com.example.studentmgmtsys.repository;

import com.example.studentmgmtsys.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {


}