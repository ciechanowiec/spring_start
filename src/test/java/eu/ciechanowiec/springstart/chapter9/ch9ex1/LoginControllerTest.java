package eu.ciechanowiec.springstart.chapter9.ch9ex1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LoginControllerTest {

    @Mock
    private Model model;

    @Mock
    private LoginProcessor loginProcessor;

    @InjectMocks
    private LoginController loginController;

    @Test
    public void testLoginPost() {
        BDDMockito.given(loginProcessor.login())
                  .willReturn(true);
        String result = loginController
                        .loginPost("username", "password", model);
        assertEquals("ch9ex1_login.html", result);
        Mockito.verify(model)
               .addAttribute("message", "You are now logged in.");
    }

    @Test
    public void testLoginFails() {
        BDDMockito.given(loginProcessor.login())
                  .willReturn(false);

        String result = loginController
               .loginPost("username", "password", model);

        assertEquals("ch9ex1_login.html", result);
        Mockito.verify(model).addAttribute("message", "Login failed!");

    }
}