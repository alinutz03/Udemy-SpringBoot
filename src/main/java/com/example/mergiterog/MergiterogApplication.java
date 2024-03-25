package com.example.mergiterog;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@OpenAPIDefinition(
//        info = @Info(
//                title = "Spring Boot Blog App REST APIs",
//                description = "Spring Boot Blog App REST APIs Documentation",
//                version = "v1.0," ,
//                contact = @Contact(
//                        name = "Alina",
//                        email = "alinaelena1347@gmail.com",
//                        url= "ceva url"
//                ),
//                license = @License(
//                        name = "Apache 2.0",
//                        url = "ceva url 2"
//                )
//        ),
//        externalDocs = @ExternalDocumentation(
//                description =" Spring Boot Blog Application"
//        )
//)
public class MergiterogApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(MergiterogApplication.class, args);
    }

}
