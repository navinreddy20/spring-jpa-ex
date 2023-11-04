package com.telusko.springjpaex;

import com.telusko.springjpaex.model.Student;
import com.telusko.springjpaex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaExApplication.class, args);

		Student s = new Student();
		s.setId(101);
		s.setName("Laksshmi");
		s.setAge(16);

		StudentService service = context.getBean(StudentService.class);
		System.out.println(service.getStudents());

	}
}
// Pojo and Utility