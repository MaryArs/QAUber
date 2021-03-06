package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.ReportsPage;

import java.util.concurrent.TimeUnit;

public class TestLoginForHomePage {
    private WebDriver cd;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/peer/dev/chromedriver");
        WebDriver cd = new ChromeDriver();

        //implicit wait
        cd.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//        System.setProperty("webdriver.gecko.driver", "/home/peer/dev/geckodriver");
//        FirefoxDriver cd = new FirefoxDriver();
//        cd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        cd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //get the url
        HomePage lp = new HomePage(cd);

        //find the element
        //sendkeys/click

        //enterusername
        lp.enterUserName("talluri.work@gmail.com");

        //enterpassword
        lp.enterPassword("qauber#");


        //press enter
        ReportsPage rpObject =  lp.submitDetais();

        //validate the text on reports page
        String rpHeaderTxt = rpObject.getHeaderText();
        if(rpHeaderTxt.equals("Reports")){
            System.out.println("PASS " + rpHeaderTxt);
        }
        else{
            System.out.println("FAIL " + rpHeaderTxt);
            }
        //signout
        rpObject.signOut();
    }
}
