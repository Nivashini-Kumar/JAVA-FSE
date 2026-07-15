import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class NotificationManagerTest {

    @Test
    public void testEmailNotification() {

        
        EmailService mockEmailService = mock(EmailService.class);

       
        NotificationManager notificationManager =
                new NotificationManager(mockEmailService);

        
        notificationManager.notifyUser("Welcome User");

        
        verify(mockEmailService).sendEmail("Welcome User");
    }
}