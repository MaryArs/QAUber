package a_stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testRegisterNowFlow.FinishRegistrationPageOF;
import testRegisterNowFlow.LoginPageOF;
import testRegisterNowFlow.RegistrationPageOF;

import java.util.concurrent.TimeUnit;

public class testRegistrationSteps {
    private WebDriver cd;
    private LoginPageOF logPage;
    private RegistrationPageOF regPage;
    private FinishRegistrationPageOF finRegPage;

    public void start(){
        System.setProperty("webdriver.chrome.driver", "/home/peer/dev/chromedriver");
        cd = new ChromeDriver();
        cd.get("http://fits.qauber.com/#/page/login");
        //Implicit wait
        cd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        cd.manage().window().maximize();

    }

    @Given("^User on Login Page press Register now link$")
    public void user_on_Login_Page_press_Register_now_link() throws Throwable {

        //Open url.
        LoginPageOF logPage = new LoginPageOF(cd);

        //Click on the button Register now. Return Registration page.
        RegistrationPageOF regPage = logPage.clickRegisterNow();
    }

    @When("^User fill out registration form$")
    public void user_fill_out_registration_form() throws Throwable{
        //Actions on the Registration page.
        regPage.enterUserName("Nammy");
        regPage.enterEmail("nam2@gmai.com");
        regPage.enterPassword("qauber");
        regPage.confirmPassword("qauber");
        //click on the button Continue registration
        FinishRegistrationPageOF finRegPage = regPage.submit();
    }

     @And("^User fill out continue registration form$")
     public void user_fill_out_continue_registration_form() throws Throwable{
         //Actions on the Finish registration page
         finRegPage.enterCompanyName("Shutterfly");
         finRegPage.enterCountry();
         finRegPage.enterAddress1("160 Easy way");
         finRegPage.enterAddress2("320 Bernard ave.");
         finRegPage.enterCity("Sunnyvale");
         finRegPage.enterState();
         finRegPage.enterPostCode("94050");
         finRegPage.enterPhone("650-332-54-88");
         finRegPage.enterEmail("qauber@gmai.com");
         finRegPage.enterNotes("test finish registration form");
     }
     @Then("^User is successfully registered$")
     public void finishRegistration(){
         finRegPage.finishRegistration();
     }
}
