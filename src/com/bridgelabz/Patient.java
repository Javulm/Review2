package com.bridgelabz;

public class Patient {
    private String name;
    private int age;
    private String phoneNumber;
    private String city;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
    void patientDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(city);
        System.out.println(state);
    }
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age + ", " + "Phonenumber=" + phoneNumber+ ", " + "City=" + city + ", " + "State=" + state ;
    }
}

