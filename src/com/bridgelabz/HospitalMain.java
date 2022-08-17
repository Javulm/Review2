package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HospitalMain {
    ArrayList<Patient> patientDetails = new ArrayList();
    Hospital hospital1 = new Hospital("Govt Hospital", "Belgaum","Karnataka", Department.CARDIOLOGY);
    Hospital hospital2 = new Hospital("Apollo Hospital", "Belgaum","Karnataka", Department.ONCOLOGY);
    Hospital hospital3 = new Hospital("Medicare Hospital", "Belgaum","Karnataka", Department.GYNOCOLOGY);
    Hospital hospital4 = new Hospital("Joseph Hospital", "Belgaum","Karnataka", Department.NEUROLOGY);
   map<Object, ArrayList<patientsDetails>> hospitals = new HashMap<Object,ArrayList<patientsDetails>>();
        hospitals.put(hospital1, patientDetails);
        hospitals.put(hospital2, patientDetails);
        hospitals.put(hospital3, patientDetails);
        hospitals.put(hospital4, patientDetails);

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Hospital management system.");
        int i = 0;
        HospitalMain patient = new HospitalMain();
        while (i == 0) {
            System.out.println("Select any option");
            System.out.println("1.Add details.\n2.Edit details. \n3.Show Patient Details. \n4.Delete details");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    patient.addPatientDetails();
                    break;
                case 2:
                    patient.editPatientDetails();
                    break;
                case 3:
                    patient.showPatientDetails();
                    break;
                default:
                    i = 1;
                    System.out.println("Wrong option");
                    break;
            }
        }
    }
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