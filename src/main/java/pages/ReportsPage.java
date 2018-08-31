package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsPage {
    //webdriver
    private WebDriver driver;

    //Constructor

    public ReportsPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    By header = By.xpath("/html/body/div[2]/section/div/h3");
    By arrowToSignOutWindow = By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a/@href");
    By signOutBtn = By.xpath("//label[text()= 'Sign out']/span");

    //actions
    public String getHeaderText(){
        String headText;
        WebElement element = driver.findElement(header);
        headText = element.getText();
        return headText;
    }

    //create report


    //signout
    public void signOut(){
        //TODO: MARINA TO IMPLEMENT THIS METHOD
        WebElement elementArrow = driver.findElement(arrowToSignOutWindow);
        elementArrow.click();
        WebElement elementSignOut = driver.findElement(signOutBtn);
        elementSignOut.click();

    }



}
