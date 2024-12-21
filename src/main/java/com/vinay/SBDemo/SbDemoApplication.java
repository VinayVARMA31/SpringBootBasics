package com.vinay.SBDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbDemoApplication {

	public static void main(String[] args) {
	
	
	ApplicationContext context=	SpringApplication.run(SbDemoApplication.class, args);

  // Dev d = new Dev();
  
 Dev d = context.getBean(Dev.class);
  d.build();

	}

}
