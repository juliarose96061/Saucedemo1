package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class LoginTest extends BaseTest {

    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login();

        assertTrue(loginPage.isErrorMsgDisplayed());
        assertEquals("Epic sadface: Username and password do not match any user in this service", loginPage.getErrorText());
    }
}
