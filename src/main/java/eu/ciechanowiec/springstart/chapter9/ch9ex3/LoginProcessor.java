package eu.ciechanowiec.springstart.chapter9.ch9ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author Herman Ciechanowiec
 */
@Component
@RequestScope
class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    private String username;
    private String password;

    @Autowired
    LoginProcessor(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    boolean login() {
        loginCountService.incrementByOne();

        String username = this.getUsername();
        String password = this.getPassword();

        boolean loginResult = false;
        if ("natalie".equals(username) && "password".equals(password)) {
            loginResult = true;
            loggedUserManagementService.setUsername(username);
        }

        return loginResult;
    }

    String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }
}
