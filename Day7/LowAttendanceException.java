package Day7;

// Custom checked exception
public class LowAttendanceException extends Exception {
    public LowAttendanceException(String message) {
        super(message);
    }
}
