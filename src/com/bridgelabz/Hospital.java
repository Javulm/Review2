package com.bridgelabz;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
	ArrayList<Patient> patientDetails = new ArrayList();
	 static Scanner sc = new Scanner(System.in);
public void addPatientDetails () {
    Patient patients = new Patient();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First Name of patient:");
    patients.setName(sc.next());
    System.out.println("Enter the Age:");
    patients.setAge(sc.nextInt());
    System.out.println("Enter the Phone number:");
    patients.setPhoneNumber(sc.next());
    System.out.println("Enter the City:");
    patients.setCity(sc.next());
    System.out.println("Enter the State:");
    patients.setState(sc.next());
    patientDetails.add(patients);
    System.out.println(patients.toString());
}
public void editPatientDetails() {
    System.out.println("To edit enter your first name:");
    String name = sc.next();

    for (int i = 0; i < patientDetails.size(); i++) {
        if (patientDetails.get(i).getName().equals(name)) {
            System.out.println("Select number to change:");
            System.out.println("\n1.first name\n2.age\n3.Phone number\n4.city\n5.State\n");
            int edit = sc.nextInt();

            switch (edit) {
                case 1:
                    System.out.println("Enter your name");
                    patientDetails.get(i).setName(sc.next());
                    break;
                case 2:
                    System.out.println("Enter your age");
                    patientDetails.get(i).setAge(sc.nextInt());
                case 3:
                    System.out.println("Enter phone number");
                    patientDetails.get(i).setPhoneNumber(sc.next());
                    break;
                case 4:
                    System.out.println("Enter city");
                    patientDetails.get(i).setCity(sc.next());
                    break;
                case 5:
                    System.out.println("Enter state");
                    patientDetails.get(i).setState(sc.next());
                    break;
            }
            System.out.println(patientDetails);
        } else
            System.out.println("Please Enter correct First name");
    }
}
public void showPatientDetails() {
    for (Patient c : patientDetails) {
        System.out.println(c);
    }
}
}
