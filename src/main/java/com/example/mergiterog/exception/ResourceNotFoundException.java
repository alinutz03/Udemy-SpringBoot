package com.example.mergiterog.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Getter
public class ResourceNotFoundException extends RuntimeException {

    private String resourceName;
    private String fieldName;
    private Long fielValue;

    public ResourceNotFoundException(String resourceName, String fieldName, Long fielValue) {
        super(String.format("%s not found with %s: '%s' ", resourceName, fieldName, fielValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fielValue = fielValue;
    }


}
