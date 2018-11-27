package com.luv2code.springdemo.mvc;


import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "field required")
    @Size(min = 1, message = "field required")
    private String lastName;

    @NotNull(message = "field required")
    @Min(value = 0, message = "value must be greater than or equal to 0")
    @Max(value = 10, message = "value must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "5 chars/digits requiredl")
    private String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}