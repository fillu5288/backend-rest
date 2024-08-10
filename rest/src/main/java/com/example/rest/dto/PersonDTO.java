package com.example.rest.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name dolzno bit bolshe 2 i do 30")
    private String name;

    @Min(value = 0, message = "Age dolzno bit bolshe 0")
    private int age;

    @Email
    @NotEmpty(message = "Email should not be empty")
    private String email;
}
