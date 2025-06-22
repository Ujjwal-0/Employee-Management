package com.ujjwal.employeemanagement.employeemanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ujjwal.employeemanagement.employeemanagement.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "Name of the employee cannot be blank")
    @Size(min = 3, max = 10, message = "Number of characters should be in the range [3,10]")
    private String name;

    @NotBlank(message = "Email of employee should be not blank")
    @Email(message = "Email should be a valid email")
    private String email;

    @NotNull(message = "Age of employee cannot be null")
    @Max(value = 80, message = "Age of Employee cannot be greater than 80")
    @Min(value = 18, message = "Age of Employee cannot be less than 18")
    private Integer age;

    @NotBlank(message = "Role of employee should be not blank")
    //@Pattern(regexp = "^(ADMIN|USER)$", message = "Role of employee can be user or admin")
    @EmployeeRoleValidation
    private String role;

    @PastOrPresent(message = "DateofJoining field cannot be in the future")
    private LocalDate dateOfJoining;

    @JsonProperty("isActive")
    private Boolean isActive;

    public EmployeeDTO(){

    }

    public EmployeeDTO(Long id, String name, String email, Integer age, LocalDate dateOfJoining, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }


}
