package com.example.basicsofspring.BasicSpringProject;

import com.example.basicsofspring.BasicSpringProject.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicSpringProjectApplicationTests {
	@Autowired
	MyController myController;

	@Test
	void autoWiredGetMyController(){
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
