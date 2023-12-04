package edu.sb.learning._sb_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Coach coach = context.getBean(Coach.class);

		System.out.println("----- spring boot application start --------");
		System.out.println(coach.getDailyWorkout());
		System.out.println("----- spring boot application end --------");

	}

}
