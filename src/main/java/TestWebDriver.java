import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestWebDriver {
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
        driver.close();
       // String d = driver.getPageSource();
       // System.out.println(d);

    }
}
