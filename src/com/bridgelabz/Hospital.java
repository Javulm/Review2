package com.bridgelabz;

public class Hospital {
String hospitalName;
String city;
String state;
private Enum<?> Department;

    public Hospital(String hospitalName, String city, String state, Enum<?> department) {
        super();
        this.hospitalName = hospitalName;
        this.city = city;
        this.state = state;
        Department = department;
    }
}
