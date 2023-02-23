package model;

import java.util.Random;
import java.util.Scanner;

public class Receptionist {

    int appointment_id;
    String doctor_name;
    String patient_name;
    int patient_id;

    public Receptionist(int appointment_id, String doctor_name, String patient_name, int patient_id) {
        this.appointment_id = appointment_id;
        this.doctor_name = doctor_name;
        this.patient_name = patient_name;
        this.patient_id = patient_id;
    }

    public void queries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 0 for emergency and 1 for appointment");
        int ask_id = scanner.nextInt();
        if (ask_id == 1) {
            System.out.println("Are You an old patient or new?");
            String ask1 = scanner.nextLine();
            if (ask1 =="old") {
                System.out.println("Your patient id is " + this.patient_id);
                System.out.println("Are you making appointment for same doctor");
                boolean ask2 = scanner.nextBoolean();
                if (ask2 == true) {
                    Random rand = new Random();
                    for (int i = 1; i <= 10; i++) {
                        int resRandom = rand.nextInt((9999 - 100) + 1) + 10;


                        System.out.println("Your appointment id is " + resRandom);
                    }
                }

            } else {
                System.out.println("Your name, age and contact number?");
                String name = scanner.nextLine();
                int age = scanner.nextInt();
                String contact = scanner.nextLine();
                Random rand = new Random();
                for (int i = 1; i <= 10; i++) {
                    int resRandom = rand.nextInt((9999 - 100) + 1) + 10;


                    System.out.println("Your appointment id is " + resRandom);

                }

            }
        }
    }

    public void bill_format(){
        System.out.println("Any Extra Charge? if yes enter 1");
        Scanner scanner=new Scanner(System.in);
        int sc= scanner.nextInt();
        if(sc==1){
            System.out.println("Enter Charge for Treatment");
            int charge= scanner.nextInt();
            System.out.println("Enter Charge for Medicine");
            int medicine= scanner.nextInt();
            int total_charge=500+medicine+charge;
            System.out.println("         *****************************Bill*****************************");
            System.out.println("       Patient Id:"+ this.patient_id);
            System.out.println("       Patient Name:"+ this.patient_name);
            System.out.println("       Doctor Name:"+ this.doctor_name);
            System.out.println("       Appointment Id:"+ this.appointment_id);
            System.out.println("       Total Charge:"+total_charge);
        }
        else {
            System.out.println("*****************************Bill*****************************");
            System.out.println("Patient Id:"+ this.patient_id);
            System.out.println("Patient Name:"+ this.patient_name);
            System.out.println("Doctor Name:"+ this.doctor_name);
            System.out.println("Appointment Id:"+ this.appointment_id);
            System.out.println("Total Charge:"+500);
        }



    }
}
