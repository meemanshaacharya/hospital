package model;

public class Patient extends Receptionist{

 String phone_number;
    String address;
    int age;

    public Patient(int appointment_id, String doctor_name, String patient_name, int patient_id, String phone_number, String address, int age) {
        super(appointment_id, doctor_name, patient_name, patient_id);
        this.phone_number = phone_number;
        this.address = address;
        this.age = age;
    }
}
