package com.example.basicsofspring.BasicSpringProject;

import com.example.basicsofspring.BasicSpringProject.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringProjectApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(BasicSpringProjectApplication.class, args);
		System.out.println("Inside Main Method");
		System.out.println(ctx.getBean(MyController.class).sayHello());
	}

}
