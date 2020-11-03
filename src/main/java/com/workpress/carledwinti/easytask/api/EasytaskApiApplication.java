package com.workpress.carledwinti.easytask.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class EasytaskApiApplication {
  public static void main(String[] args) {
		SpringApplication.run(EasytaskApiApplication.class, args);
	}

}
