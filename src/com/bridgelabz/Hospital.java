package com.bridgelabz;

public class Hospital {
String hospitalName;
String city;
String state;

String department;

    public void setHospitalName(String hospitalName) {
        this.hospitalName=hospitalName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHospName() {
        return hospitalName;
    }

    @Override
    public String toString() {
        return "Hospital Details:" +
                "HospitalName='" + hospitalName + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Department='" + department + '\'' ;
    }

    void hospitalDetails() {
        System.out.println(hospitalName);
        System.out.println(department);
        System.out.println(city);
        System.out.println(state);
    }
}
