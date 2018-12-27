package com.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan("com.springjpa.label")
@SpringBootApplication
@EnableCaching
public class SpringJpaPostgreSqlApplication extends SpringBootServletInitializer{


	public static void main(String[] args){SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringJpaPostgreSqlApplication.class);
	}

}
