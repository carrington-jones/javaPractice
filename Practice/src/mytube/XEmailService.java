package mytube;

public class XEmailService implements NotificationService {
    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
