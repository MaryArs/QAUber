package pages;

import org.apache.velocity.tools.generic.ResourceTool;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOf {
    //create a variable for web driver object
    private WebDriver driver;
    // page url
    String url = "http://fits.qauber.com/#/page/login";
    //Locators of the elements
    @FindBy(xpath="//input[@id='exampleInputEmail1']")
    WebElement userName;
    @FindBy(xpath ="//*[@id='exampleInputPassword1']")
    WebElement password;
    @FindBy(xpath ="//button[@type='submit']")
    WebElement loginBtn;
    @FindBy(linkText = "Forgot your password?" )
    WebElement forgotPwdLink;
    @FindBy(partialLinkText = "Register")
    WebElement registerBtn;


    // constructor(store driver object and it opens url page)
    public HomePageOf(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    //Actions that can be perfomed
    //enter username
    public void enterUserName(String uName) {
       userName.sendKeys(uName);
    }

    //enter password
    public void enterPassword(String passwd) {
        password.sendKeys(passwd);
    }

    //click on login button or press enter

    public ReportsPage submitDetais() {
        password.sendKeys(Keys.ENTER);
        //or element.sendkeys(Keys.ENTER);
        //at this point we are on Reports page
        ReportsPage rp = new ReportsPage(driver);
        return rp;
    }
}
