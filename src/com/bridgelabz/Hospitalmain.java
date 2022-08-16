package com.bridgelabz;

import javax.xml.namespace.QName;

public class Hospitalmain {

    public static void main(String[] args) {
        System.out.println("Welcome to hospital management system");

        Patient patient1 = new Patient();
        patient1.setName("abc");
        patient1.setAge(20);
        patient1.setCity("belgaum");
        patient1.setState("Karnataka");
        patient1.setPhoneNumber("987654321");
        patient1.patientDetails();
    }
}
