package hospitalmgmt;

public class DuplicateAppointmentException extends Exception {

    private String message;

    public DuplicateAppointmentException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
