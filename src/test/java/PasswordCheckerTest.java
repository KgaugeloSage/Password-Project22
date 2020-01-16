import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {
    PasswordChecker passwordCheckerTest = new PasswordChecker();

    @Test
    void passwordIsValid() {
        String password = "Bello@10111";
        passwordCheckerTest.passwordIsValid(password);
        assertEquals(6, passwordCheckerTest.counter,"Are all password requirements met?");
    }

    @Test
    void passwordIsOk() {
        String password = "Bello#";
        passwordCheckerTest.passwordIsValid(password);
        assertTrue(passwordCheckerTest.passwordIsOk());
    }
}