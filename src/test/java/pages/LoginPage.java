package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By emailAddress = By.id("usernameOrEmail");

    By continueButton = By.xpath("//button[text()='Continue']");

    By password = By.xpath("//input[@id='password']");

    By loginButton = By.xpath("//button[text()='Log In']");

    public void enterEmail(String email){
        driver.findElement(emailAddress).sendKeys(email);
    }

    public void enterPassword(String pw){
        driver.findElement(password).sendKeys(pw);
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

}
