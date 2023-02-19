package com.users.application;

import com.users.application.usersjpa.Users;
import org.apache.coyote.Request;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class UsersApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();
		SpringApplication.run(UsersApplication.class, args);
	}

//	@Bean
//	public Docket getDocket() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.paths(PathSelectors.any())
//				.apis(RequestHandlerSelectors.basePackage("com.users.application"))
//				.build();
//	}

}
