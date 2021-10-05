package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="http://wordpress.com";

    @FindBy(xpath="//a[@title='Log In']")
    private WebElement loginButton;

    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickLogin(){
        loginButton.click();
    }


}
