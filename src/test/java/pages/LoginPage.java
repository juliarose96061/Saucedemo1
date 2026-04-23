package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private final By loginField = By.xpath("//input[@name='user-name']");
    private final By passwordField = By.xpath("//input[@type='password']");
    private final By loginButton = By.xpath("//input[@class='submit-button btn_action']");
    private final By errorMsg =  By.xpath("//h3[@data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(Base_URL);
    }

    public void login(){
        driver.findElement(loginField).sendKeys("standard_user");
        driver.findElement(passwordField).sendKeys("secret");
        driver.findElement(loginButton).click();
    }

    public String getErrorText(){
        return driver.findElement(errorMsg).getText();
    }

    public boolean isErrorMsgDisplayed(){
        return driver.findElement(errorMsg).isDisplayed();
    }
}
