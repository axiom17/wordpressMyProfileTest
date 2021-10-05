package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import pages.ReadPage;

import java.util.concurrent.TimeUnit;

public class MyProfileTest {

    private WebDriver driver;
    private String email = "e.levi.allen@gmail.com", password = "P@tr!ck1025";

    private String chromeDriverPath = "C:\\Users\\elevi\\code\\wordpressMyProfileTest\\chromedriver.exe";

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        HomePage home = new HomePage(driver);
        home.clickLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail(email);
        loginPage.clickContinueButton();
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        ReadPage readPage = new ReadPage(driver);
        readPage.clickMyProfile();
    }

    @Test
    public void testMyProfile(){

        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.isProfileLoaded());
        Assert.assertTrue(profilePage.isAboutMeDisplayed());
        Assert.assertTrue(profilePage.isFirstNameDisplayed());
        Assert.assertTrue(profilePage.isLastNameDisplayed());
        Assert.assertTrue(profilePage.isDisplayNameDisplayed());

    }

    @Test
    public void testHideGravatar(){
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickHideGravatarProfile();
        profilePage.clickSaveProfile();

        Assert.assertTrue(profilePage.isGravatarHidden());
    }

    @After
    public void close(){
        driver.close();
    }

}
