package com.example.studentmgmtsys;

import com.example.studentmgmtsys.entity.Student;
import com.example.studentmgmtsys.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMgmtSysApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtSysApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student student1 = new Student("Paschal", "Ezinwa", "paschalezinwa@gmail.com");
				studentRepository.save(student1);

		Student student2 = new Student("Chiamaka", "Nwadike", "chiamakanwadike@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Adedoyin", "Mary", "maryadedoyin@gmail.com");
		studentRepository.save(student3);

	}
}
