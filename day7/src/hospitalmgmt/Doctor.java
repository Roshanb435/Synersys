package hospitalmgmt;

import java.util.*;

public class Doctor extends User {

    Map<String, List<Patient>> appointmentMap = new HashMap<>();

    public void addAppointment(Patient p) throws DuplicateAppointmentException {

        String key = p.email;   // check only email

        if (appointmentMap.containsKey(key)) {
            throw new DuplicateAppointmentException(
                "Duplicate found " + p.email
            );
        }

        List<Patient> list = new ArrayList<>();
        list.add(p);
        appointmentMap.put(key, list);
    }

    public void displaydetails() {
        System.out.println("List of patients:");
        for (List<Patient> list : appointmentMap.values()) {
            for (Patient p : list) {
                System.out.println(p);
            }
        }
    }
}
