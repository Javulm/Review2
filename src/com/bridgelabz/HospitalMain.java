package com.bridgelabz;
import java.util.Scanner;
public class HospitalMain {
      static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Hospital management system.");
        int i = 0;
        Hospital patient = new Hospital();
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
}