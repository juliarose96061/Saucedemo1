package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class LoginTest extends BaseTest {
    @Test
    public void correctLogin() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("wrong_password");
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
        String errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();

        assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());
        assertEquals("Epic sadface: Username and password do not match any user in this service", errorMessage);
    }
}
