import model.Appointment;
import model.Doctor;
import model.Patient;
import model.Receptionist;

public class main {
    public static void main(String[] args) {
        Doctor d1=new Doctor(1,"Ranjita Parajuli","Nita Shrestha",12,234,"Dental",33);
        Doctor d2=new Doctor(2,"Anamika Gautam","Nita Shrestha",12,234,"OPD",44);
        Doctor d3=new Doctor(3,"Rabindra Karki","Nita Shrestha",12,234,"Ophthamology",67);
        Doctor d4=new Doctor(4,"Ram Acharya","Nita Shrestha",12,234,"General",66);

        Patient p1=new Patient(12,"Ranjita Parajuli","Nita Shrestha",12,"014423567","boudha",23);
        Patient p2=new Patient(124,"Binita Shrestha","014487033",12,"014423567","Boudha",29);
        Patient p3=new Patient(126,"Nita Shrestha","014423567",12,"014423567","boudha",23);
        Patient p4=new Patient(128,"Nita Shrestha","014423567",12,"014423567","boudha",23);

Appointment appointment1=new Appointment(1,"Ranjita Parajuli","Nita Shrestha",12,234,1/02);
Appointment appointment2=new Appointment(2,"Ranjita Parajuli","Binita Shrestha",12,234,1/03);

        Receptionist r1=new Receptionist(1,"Ranjita Parajuli","Nita Shrestha",123);

        r1.bill_format();

        r1.queries();
    }
}
