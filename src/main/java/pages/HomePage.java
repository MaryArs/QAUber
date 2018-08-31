package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    //create a variable for web driver object
    private WebDriver driver;
    // page url
    String url = "http://fits.qauber.com/#/page/login";
    //Locators of the elements
    //username textbox
    By userName = By.name("account_email");
    //password text box
    By password = By.xpath("//*[@id=\"exampleInputPassword1\"]");
    //login button
    By loginBtn = By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/form/button");
    //forgot password link
    By forgotPwdLink = By.linkText("Forgot your password?");
    //register button
    By registerBtn = By.partialLinkText("Register");

    // constructor(store driver object and it opens url page)
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
    }

    //Actions that can be perfomed
    //enter username
    public void enterUserName(String uName) {
        WebElement element = driver.findElement(userName);
        element.sendKeys(uName);
    }

    //enter password
    public void enterPassword(String passwd) {
        WebElement element = driver.findElement(password);
        element.sendKeys(passwd);
    }

    //click on login button or press enter

    public ReportsPage submitDetais() {
        WebElement element = driver.findElement(password);
        element.submit();
        //or element.sendkeys(Keys.ENTER);
        //at this point we are on Reports page
        ReportsPage rp = new ReportsPage(driver);
        return rp;
    }
}
