package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ReadPage {

    WebDriver driver;

    @FindBy(xpath = "//img[@class='gravatar']")
    WebElement gravatarLink;

    public ReadPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void clickMyProfile(){
        gravatarLink.click();
    }

}
