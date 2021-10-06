package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='display_name']")
    WebElement publicDisplayName;

    @FindBy(xpath = "//textarea[@id='description']")
    WebElement aboutMe;

    @FindBy(xpath = "//header[contains(concat(' ',normalize-space(@class),' '),' formatted-header ')]")
    WebElement myProfileHeader;

    @FindBy(xpath = "//span[text()='Click to change photo']")
    WebElement changePhoto;

    @FindBy(xpath = "//input[@id='inspector-toggle-control-0']")
    WebElement hideGravatarProfile;

    @FindBy(xpath = "//button[text()='Save profile details']")
    WebElement saveProfileDetails;

    @FindBy(xpath = "//span[contains(concat(' ',normalize-space(@class),' '),' components-form-toggle is-checked ')]")
    WebElement gravatarHidden;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
        driver.get("https://wordpress.com/me");
        PageFactory.initElements(driver, this);
    }

    public boolean isProfileLoaded(){
        return myProfileHeader.isDisplayed();
    }

    public boolean isFirstNameDisplayed(){
        return firstName.isDisplayed();
    }

    public boolean isLastNameDisplayed(){
        return lastName.isDisplayed();
    }

    public boolean isDisplayNameDisplayed(){
        return publicDisplayName.isDisplayed();
    }

    public boolean isAboutMeDisplayed(){
        return aboutMe.isDisplayed();
    }

    public boolean isGravatarHidden(){
        return gravatarHidden.isEnabled();
    }

    public void clickHideGravatarProfile(){
        hideGravatarProfile.click();
    }

    public void clickSaveProfile(){
        saveProfileDetails.click();
    }

}
