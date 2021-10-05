package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ReadPage {

    WebDriver driver;

    public ReadPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    By gravatarLink = By.xpath("//img[@class='gravatar']");

    public void clickMyProfile(){
        driver.findElement(gravatarLink).click();
    }

}
