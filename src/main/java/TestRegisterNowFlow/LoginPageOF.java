package TestRegisterNowFlow;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ReportsPage;

public class LoginPageOF {
    //create a variable for web driver object
    private WebDriver driver;
    // page url
    String url = "http://fits.qauber.com/#/page/login";
    //Locators of the elements
    @FindBy(xpath = "//input[@id='exampleInputEmail1']")
    WebElement userName;
    @FindBy(xpath = "//*[@id='exampleInputPassword1']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;
    @FindBy(linkText = "Register Now")
    WebElement registerNow;

    public void isLoaded() throws Error {
        waitForVisibility(registerNow);
    }

    private void waitForVisibility(WebElement element) throws Error {
        new WebDriverWait(driver, 300)
                .until(ExpectedConditions.visibilityOf(element));
    }

    // Constructor(store driver object and it opens url page).
    public LoginPageOF(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    //Actions that can be perfomed
    //enter username
    public void enterUserName(String uName) {
        userName.sendKeys(uName);
    }

    //Enter password.
    public void enterPassword(String passwd) {
        password.sendKeys(passwd);
    }

    //Click on login button or press enter.
    public ReportsPage submitDetais() {
        password.sendKeys(Keys.ENTER);
        //or element.sendkeys(Keys.ENTER);
        //at this point we are on Reports page
        ReportsPage rp = new ReportsPage(driver);
        return rp;
    }

    //Click on the button Register now.
    public RegistrationPageOF clickRegisterNow() throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(driver,120);
        // By linkText= new  By.ByLinkText("Register Now");
        // wait.until(ExpectedConditions.invisibilityOfElementLocated(registerNow));
        Actions actions = new Actions(driver);
        // Thread.sleep(120);
        actions.moveToElement(registerNow).click().perform();
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].scrollIntView()", registerNow);
//        jse.executeScript("arguments[0].click()", registerNow);
        registerNow.sendKeys(Keys.RETURN);
        RegistrationPageOF r = new RegistrationPageOF(driver);
        return r;
    }
}
