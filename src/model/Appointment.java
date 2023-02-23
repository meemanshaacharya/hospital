package model;

public class Appointment extends Receptionist {

    int room_no;
    int date;

    public Appointment(int appointment_id, String doctor_name, String patient_name, int patient_id, int room_no, int date) {
        super(appointment_id, doctor_name, patient_name, patient_id);
        this.room_no = room_no;
        this.date = date;
    }
}
