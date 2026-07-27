import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testGetUserName() {

        // Create a mock object
        UserRepository mockRepository = mock(UserRepository.class);

        // Define mock behavior
        when(mockRepository.findUserNameById(1))
                .thenReturn("Nivashini");

        // Pass mock object to service
        UserService userService = new UserService(mockRepository);

        // Call method
        String result = userService.getUserName(1);

        // Verify result
        assertEquals("Nivashini", result);
    }
}