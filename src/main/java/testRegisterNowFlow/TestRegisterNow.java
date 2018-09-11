package TestRegisterNowFlow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class TestRegisterNow {
    private WebDriver cd;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/peer/dev/chromedriver");
        WebDriver cd = new ChromeDriver();

        //Implicit wait.
        cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        cd.manage().window().maximize();

        //Get the url.
        LoginPageOF lPage = new LoginPageOF(cd);

        //Click on the button Register Now. Return Registration page.
        RegistrationPageOF regPage = lPage.clickRegisterNow();

        //Actions on the Registration page.
        regPage.enterUserName("Arty");
        regPage.enterEmail("art2@gmai.com");
        regPage.enterPassword("qauber");
        regPage.confirmPassword("qauber");
        FinishRegistrationPageOF finRegPage = regPage.submit();

        //Actions on the Finish registration page.
        finRegPage.enterCompanyName("Ancddhu");
        finRegPage.enterCountry();
        finRegPage.enterAddress1("160 Easy way");
        finRegPage.enterAddress2("320 Bernard ave.");
        finRegPage.enterCity("Sunnyvale");
        finRegPage.enterState();
        finRegPage.enterPostCode("94050");
        finRegPage.enterPhone("650-332-54-88");
        finRegPage.enterEmail("qauber@gmai.com");
        finRegPage.enterNotes("test finish registration form");
        finRegPage.finishRegistration();
    }

    @Test
    public void testFinihRegistration() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/peer/dev/chromedriver");
        WebDriver cd = new ChromeDriver();

        //Implicit wait
        cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        cd.manage().window().maximize();

        //Open url.
        LoginPageOF logPage = new LoginPageOF(cd);

        //Click on the button Register now. Return Registration page.
        RegistrationPageOF regPage = logPage.clickRegisterNow();

        //Actions on the Registration page.
        regPage.enterUserName("Nammy");
        regPage.enterEmail("nam2@gmai.com");
        regPage.enterPassword("qauber");
        regPage.confirmPassword("qauber");
        //click on the button Continue registration
        FinishRegistrationPageOF finRegPage = regPage.submit();

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
        finRegPage.finishRegistration();
    }
}


