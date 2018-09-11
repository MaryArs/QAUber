package TestRegisterNowFlow;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageOF {
    private WebDriver driver;
    @FindBy(name = "account_name")
    WebElement name;
    @FindBy(name = "account_email")
    WebElement email;
    @FindBy(id = "id-password")
    WebElement passwd;
    @FindBy(name = "account_password_confirm")
    WebElement confirmPasswd;
    @FindBy(xpath = "//button[text()= 'Continue registration']")
    WebElement continueButton;

    //Constructor.
    public RegistrationPageOF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String uName) {
        name.sendKeys(uName);
    }

    public void enterEmail(String em) {
        email.sendKeys(em);
    }

    public void enterPassword(String pswd) {
        passwd.sendKeys(pswd);

    }

    public void confirmPassword(String confPswd) {
        confirmPasswd.sendKeys(confPswd);

    }

    public FinishRegistrationPageOF submit() {
        passwd.sendKeys(Keys.ENTER);
        FinishRegistrationPageOF fPage = new FinishRegistrationPageOF(driver);
        return fPage;
    }
}
