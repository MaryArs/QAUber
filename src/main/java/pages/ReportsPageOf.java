package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportsPageOf {
    //webdriver
    private WebDriver driver;

    //Constructor

    public ReportsPageOf(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Locators
    @FindBy(xpath ="//div[@ng-class='app.viewAnimation']/h3" )
    WebElement header;
    @FindBy(xpath ="//ul[@class='nav navbar-nav navbar-right']/li/a/span" )
    WebElement arrowToSignOutWindow;
    @FindBy(xpath ="//button[text()= 'Sign out']" )
    WebElement signOutBtn;



    //actions
    public String getHeaderText(){
        String headText;
        headText = header.getText();
        return headText;
    }

    //create report


    //signout
    public void signOut(){
        //TODO: MARINA TO IMPLEMENT THIS METHOD
        WebDriverWait wait = new WebDriverWait(driver, 600);
        wait.until(ExpectedConditions.elementToBeClickable(arrowToSignOutWindow));
        arrowToSignOutWindow.click();
        WebDriverWait waitBtn = new WebDriverWait(driver, 600);
        waitBtn.until(ExpectedConditions.elementToBeClickable(signOutBtn));
        signOutBtn.click();

    }
}
