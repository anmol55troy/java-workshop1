package week6workshop;

public class NotificationService {

    public boolean sendEmail(String email, String message) {
        if (email == null || message == null) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }
}
