package com.full_creative.gradle_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories;

import com.googlecode.objectify.ObjectifyService;


@SpringBootApplication
@EnableDatastoreRepositories
public class GradleDemoApplication {

	public static void main(String[] args) {
		ObjectifyService.init();
		SpringApplication.run(GradleDemoApplication.class, args);
	}

	
	
}

