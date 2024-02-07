package com.oops.encapsulation;
// Encapsulation: hiding the details of any object as programmers point of view from outside.
public class EmployeeDto {
    // Attributes = properties
    private String name;
    private Integer id;
    private String address;

    // Behaviour = Methods
    // DTO : accessor = getters, mutator = setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
