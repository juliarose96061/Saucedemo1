package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    WebDriver driver;
    public static final String Base_URL = "https://www.saucedemo.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
