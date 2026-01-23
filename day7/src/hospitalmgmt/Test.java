package hospitalmgmt;

public class Test {

    public static void main(String[] args) {

        System.out.println("--------------Booking Appointment----------------");

        Doctor d = new Doctor();

        Patient[] patients = {
            new Patient(25, 'M', "roshan@gmail.com", "24-12-2025", "roshan"),
            new Patient(30, 'M', "hello@gmail.com", "26-12-2025", "roshan2"),
            new Patient(25, 'F', "sai@gmail.com", "26-12-2022", "sai"),
            new Patient(25, 'F', "pri@gmail.com", "26-12-2022", "Pri"),
            new Patient(25, 'F', "pri@gmail.com", "26-12-2022", "Priya"),
            new Patient(25, 'F', "roshan@gmail.com", "26-12-2022", "Hrithik")
        };

        for (Patient p : patients) {
            try {
                d.addAppointment(p);
            } catch (DuplicateAppointmentException e) {
                System.out.println(e);
            }
        }

        d.displaydetails();
    }
}
