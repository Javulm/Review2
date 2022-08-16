package com.bridgelabz;

public class HospitalMain {

    public static void main(String[] args) {
        System.out.println("Welcome to hospital management system");
        System.out.println("patient details:");
        Patient patient1 = new Patient();
        patient1.setName("abc");
        patient1.setAge(20);
        patient1.setCity("belgaum");
        patient1.setState("Karnataka");
        patient1.setPhoneNumber("987654321");
        patient1.patientDetails();

        System.out.println("hospital details:");
        Hospital hospital1=new Hospital();
        hospital1.setHospitalName("Govt hospital");
        hospital1.setHospitalId("1234");
    }
}
