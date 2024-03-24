package com.example.mergiterog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Spring Boot Blog REST APIs",
                "Spring Boot Blog REST APIs Documentation",
                "1",
                "term od Services",
                new Contact("Alina Popescu", "https://www.linkedin.com/in/alina-p-3b4200141/", "alinaelena1347@gmail.com"),
                "Licence of API",
                "https://www.linkedin.com/in/alina-p-3b4200141/",
                Collections.emptyList()

        );
    }
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
