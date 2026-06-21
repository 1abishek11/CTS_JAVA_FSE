import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

interface EmailService {
    void sendEmail(String msg);
}

class UserService {

    private EmailService email;

    UserService(EmailService email) {
        this.email = email;
    }

    void register() {
        email.sendEmail("Welcome");
    }
}

public class UserServiceTest {

    @Test
    void testEmail() {

        EmailService e =
                mock(EmailService.class);

        UserService u =
                new UserService(e);

        u.register();

        verify(e, times(1))
                .sendEmail(anyString());
    }
}