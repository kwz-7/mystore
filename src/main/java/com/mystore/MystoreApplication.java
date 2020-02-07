package com.mystore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(basePackages = "com.mystore.mapper" ,annotationClass = Repository.class)
public class MystoreApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MystoreApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MystoreApplication.class, args);
	}

}
