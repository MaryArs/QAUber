package TestRegisterNowFlow;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishRegistrationPageOF {
    private WebDriver driver;

    public FinishRegistrationPageOF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='name']")
    WebElement companyName;
    @FindBy(xpath = "//select[@name='country']/option[text()='United States']")
    WebElement country;
    @FindBy(xpath = "//input[@name='address1']")
    WebElement address1;
    @FindBy(xpath = "//input[@ng-model='reg.company.address2']")
    WebElement address2;
    @FindBy(xpath = "//input[@name = 'city']")
    WebElement city;
    @FindBy(xpath = "//select[@name='state']/option[text()='California']")
    WebElement state;
    @FindBy(xpath = "//input[@name='zip']")
    WebElement postCode;
    @FindBy(xpath = "//input[@name='phone']")
    WebElement contactPhone;
    @FindBy(xpath = "//input[@name='email']")
    WebElement contactEmail;
    @FindBy(xpath = "//div[@class='form-group']/textarea[@ng-model='reg.company.notes']")
    WebElement notes;
    @FindBy(id = "registerConfirm")
    WebElement finishRegBtn;

    public void enterCompanyName(String cName) {
        companyName.sendKeys(cName);
    }

    public void enterCountry() {
        country.click();
    }

    public void enterAddress1(String addr1) {
        address1.sendKeys(addr1);
    }

    public void enterAddress2(String addr2) {
        address2.sendKeys(addr2);
    }

    public void enterCity(String cit) {
        city.sendKeys(cit);
    }

    public void enterState() {
        state.click();
    }

    public void enterPostCode(String zip) {
        postCode.sendKeys(zip);
    }

    public void enterPhone(String phone) {
        contactPhone.sendKeys(phone);
    }

    public void enterEmail(String email) {
        contactEmail.sendKeys(email);
    }

    public void enterNotes(String note) {
        notes.sendKeys(note);
    }

    public void finishRegistration() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", finishRegBtn);
        System.out.println(finishRegBtn.getText());
        finishRegBtn.click();
    }

}
