package model;

public class Doctor extends Receptionist {
    int doctor_id;
    String speciality;
    int age;

    public Doctor(int appointment_id, String doctor_name, String patient_name, int patient_id, int doctor_id, String speciality, int age) {
        super(appointment_id, doctor_name, patient_name, patient_id);
        this.doctor_id = doctor_id;
        this.speciality = speciality;
        this.age = age;
    }
}
