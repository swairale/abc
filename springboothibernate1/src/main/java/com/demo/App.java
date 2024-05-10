package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Student;
import com.demo.service.StudentService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(App.class, args);
		StudentService ss=context.getBean(StudentService.class);
		
		Student s1=new Student();
		//s1.setSid(8);
		s1.setSname("kapil kadam");
		s1.setScity("satara");
		s1.setSpercentage(89.34);
		System.out.println(ss.save(s1));
	}

}
