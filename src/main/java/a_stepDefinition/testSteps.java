package a_stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePageOf;
import pages.ReportsPage;
import pages.ReportsPageOf;

public class testSteps {
    private WebDriver driver;
    private HomePageOf hp;
    private ReportsPage rp;

    @Given("^user is on fits login page$")
    public void userLogin(){
        System.setProperty("webdriver.chrome.driver", "/home/peer/dev/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://fits.qauber.com/#/page/login");
        hp = new HomePageOf(driver);
    }

    @When("^user enters username and password$")
    public void enterDetails(){

        hp.enterUserName("mary.arsitova@gmail.com");
        hp.enterPassword("123456");
        rp = hp.submitDetais();
    }

    @Then("^user should be on reports page$")
    public void validate() throws InterruptedException {
        Assert.assertTrue(rp.getHeaderText().equals("Reports"), "Not on Reports page!");
    }
}
