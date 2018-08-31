package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ReportsPage;

import java.util.concurrent.TimeUnit;

public class TestLoginForHomePage {
    private WebDriver cd;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/peer/dev/chromedriver");
        WebDriver cd = new ChromeDriver();

        //implicit wait
        cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //signout
        rpObject.signOut();

//        cd.findElement(By.xpath("/html/body/div[2]/header/nav/div[2]/ul[2]/li/a/span")).click();
//        cd.findElement(By.xpath("/html/body/div[2]/aside[2]/nav/div/div/div[1]/div/div/div[3]/button")).click();



    }
}
