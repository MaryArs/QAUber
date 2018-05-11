import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeDriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/peer/dev/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4");
		driver.findElement(By.name("uid")).sendKeys("mngr99261");
		driver.findElement(By.name("password")).sendKeys("hyqYpEm");
		driver.findElement(By.name("btnLogin")).click();
		
		Alert alert = driver.switchTo().alert();
		
		//alert.dismiss();
		String text = alert.getText();
		System.out.println(text);
		if(text.equals("User or Password is not valid")){
			System.out.println("Test Case Passed!!!");
		}else{
			System.out.println("Test Case Failed!!!");
		}
		alert.accept();
	}
}
