package mytube;

public class XEmailService implements NotificationService {

    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }

    @Override
    public void notify(User user) {

    }
}
