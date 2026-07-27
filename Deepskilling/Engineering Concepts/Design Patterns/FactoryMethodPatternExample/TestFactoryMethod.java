public class TestFactoryMethod {

    public static void main(String[] args) {

        NotificationFactory emailFactory =
                new EmailNotificationFactory();

        Notification email =
                emailFactory.createNotification();

        email.send();

        NotificationFactory smsFactory =
                new SMSNotificationFactory();

        Notification sms =
                smsFactory.createNotification();

        sms.send();
    }
}