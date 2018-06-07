package loggingtoFITS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class loginAndFillReportsPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/home/peer/dev/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://fits.qauber.com");
        WebElement logintextbox = driver.findElementByXPath("//*[@id='exampleInputEmail1']");
        logintextbox.sendKeys("mary.arsitova@gmail.com");
        WebElement searchbutton = driver.findElementByXPath("//input[@id= 'exampleInputPassword1']");
        searchbutton.sendKeys("123456");
        Thread.sleep(3000);
        WebElement login = driver.findElementByXPath("/html/body/div[2]/div/div/div[1]/div[2]/form/button");
        login.click();
        WebElement addReport = driver.findElementByXPath("html/body/div[2]/aside[1]/div/nav/ul/li[4]/a/span");
        addReport.click();
        Thread.sleep(3000);
        WebElement subjectInformation = driver.findElementByXPath("//div[@title= 'Subject Information']");
        subjectInformation.click();
        WebElement caseID = driver.findElementByXPath("//input[@name='caseNumber']");
        caseID.sendKeys("000001");
        WebElement lastName = driver.findElementByXPath("//input[@name='lastName']");
        lastName.sendKeys("Arsitova");
        WebElement firstName = driver.findElementByXPath("//input[@name='firstName']");
        firstName.sendKeys("Marina");
        WebElement middleName = driver.findElementByXPath("//input[@name='middleName']");
        middleName.sendKeys("Viktorovna");
        WebElement nickName = driver.findElementByXPath("//input[@name='Nickname']");
        nickName.sendKeys("ArtMary");
        WebElement age = driver.findElementByXPath("//input[@name='Age']");
        age.sendKeys("25");
        WebElement height = driver.findElementByXPath("//input[@name='Height']");
        height.sendKeys("130");
        WebElement weight = driver.findElementByXPath("//input[@name='Weight']");
        weight.sendKeys("140.24");
        WebElement primaryLanguage = driver.findElementByXPath("//input[@name='primary-language']");
        primaryLanguage.sendKeys("en");
        WebElement streetAddress = driver.findElementByXPath("//input[@name='street-address']");
        streetAddress.sendKeys("208 Easy ave.");
        WebElement city = driver.findElementByXPath("//input[@name='city']");
        city.sendKeys("Sunnyvale");
        WebElement state = driver.findElementByXPath("//input[@name='state']");
        state.sendKeys("CA");
        WebElement zipCode = driver.findElementByXPath("//input[@name='zip']");
        zipCode.sendKeys("94084");
        WebElement telephone = driver.findElementByXPath("//input[@name='phone']");
        telephone.sendKeys("6695674355");
        WebElement email = driver.findElementByXPath("//input[@name='email']");
        email.sendKeys("mary.arsitova@gmail.com");



    }
}
