package loginTestNG;

import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTestFits {

    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "/home/peer/dev/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://fits.qauber.com");

    }


    @Test(groups = {"UserLogin", "Reports"})
    public void loginTest(String emailID, String password) throws InterruptedException {

        FirefoxDriver driver = new FirefoxDriver();
        WebElement logintextbox = driver.findElementByXPath("//*[@id='exampleInputEmail1']");
        logintextbox.sendKeys("mary.arsitova@gmail.com");
        WebElement searchbutton = driver.findElementByXPath("//input[@id= 'exampleInputPassword1']");
        searchbutton.sendKeys("123456");
        Thread.sleep(3000);
        WebElement login = driver.findElementByXPath("/html/body/div[2]/div/div/div[1]/div[2]/form/button");
        login.click();
    }

    @Test(dependsOnMethods = {"loginTest"}, groups = {"Reports"}, dataProvider = "dataProviderAddReport")
    public void addReportsTest(String caseIDex) throws InterruptedException {
        FirefoxDriver driver = new FirefoxDriver();
        WebElement addReport = driver.findElementByXPath("html/body/div[2]/aside[1]/div/nav/ul/li[4]/a/span");
        addReport.click();
        Thread.sleep(3000);
        WebElement subjectInformation = driver.findElementByXPath("//div[@title= 'Subject Information']");
        subjectInformation.click();
        //WebElement caseID =
                driver.findElementByXPath("//input[@name='caseNumber']").get(0).sendKeys(caseIDex);
        WebElement suspectType = driver.findElementByXPath("//select[@ng-model='wizard.report.suspectType']/option[text()='Victim']");
        suspectType.click();
        WebElement lastName = driver.findElementByXPath("//input[@name='lastName']");
        lastName.sendKeys("Arsitova");
        WebElement firstName = driver.findElementByXPath("//input[@name='firstName']");
        firstName.sendKeys("Marina");
        WebElement middleName = driver.findElementByXPath("//input[@name='middleName']");
        middleName.sendKeys("Viktorovna");
        WebElement nickName = driver.findElementByXPath("//input[@name='Nickname']");
        nickName.sendKeys("ArtMary");
        WebElement dateOfBirth = driver.findElementByXPath("//input[@uib-datepicker-popup='MM/dd/yyyy']");
        dateOfBirth.sendKeys("09/14/1980");
        WebElement age = driver.findElementByXPath("//input[@name='Age']");
        age.sendKeys("25");
        WebElement sex = driver.findElementByXPath("//select[@ng-model='wizard.report.sex']/option[text()='F']");
        sex.click();
        WebElement race = driver.findElementByXPath("//select[@ng-model='wizard.report.race']/option[text()='Other']");
        race.click();
        WebElement height = driver.findElementByXPath("//input[@name='Height']");
        height.clear();
        height.sendKeys("130");
        WebElement weight = driver.findElementByXPath("//input[@name='Weight']");
        weight.clear();
        weight.sendKeys("140.24");
        WebElement build = driver.findElementByXPath("//select[@ng-model='wizard.report.build']/option[text()='Athletic']");
        build.click();
        WebElement hairColor = driver.findElementByXPath("//select[@ng-model='wizard.report.hairColor']/option[text()='Black']");
        hairColor.click();
        WebElement hairLength = driver.findElementByXPath("//select[@ng-model='wizard.report.hairLength']/option[text()='Long']");
        hairLength.click();
        WebElement hairStyle = driver.findElementByXPath("//select[@ng-model='wizard.report.hairStyle']/option[text()='Curly']");
        hairStyle.click();
        WebElement eyeColor = driver.findElementByXPath("//select[@ng-model='wizard.report.eyeColor']/option[text()='Blue']");
        eyeColor.click();
        WebElement complexion = driver.findElementByXPath("//select[@ng-model='wizard.report.complexion']/option[text()='Light']");
        complexion.click();
        WebElement teeth = driver.findElementByXPath("//select[@ng-model='wizard.report.teeth']/option[text()='Silver']");
        teeth.click();
        WebElement handPreference = driver.findElementByXPath("//select[@ng-model='wizard.report.handPreference']/option[text()='Right']");
        handPreference.click();
        WebElement primaryLanguage = driver.findElementByXPath("//input[@name='primary-language']");
        primaryLanguage.sendKeys("en");
        WebElement streetAddress = driver.findElementByXPath("//input[@name='street-address']");
        streetAddress.sendKeys("208 Easy ave.");
        WebElement country = driver.findElementByXPath("//select[@ng-model='wizard.report.country']/option[text()='United States']");
        country.click();
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
        WebElement radiobutton = driver.findElementByXPath("//label[text()= 'Pedestrian']/span");
        radiobutton.click();
        // next page Identifiers
        WebElement identifiers = driver.findElementByXPath("//div[@title= 'Identifiers']");
        identifiers.click();
        WebElement identifier = driver.findElementByXPath("//input[@ng-model='wizard.report.tattoos']/../span");
        identifier.click();
        //next page ID Information
        WebElement idInformation = driver.findElementByXPath("//div[@title= 'ID Information']");
        idInformation.click();
        WebElement socialSecurity = driver.findElementByXPath("//input[@name = 'socialSecurity']");
        socialSecurity.sendKeys("314-45-6799");
        WebElement driverLicense = driver.findElementByXPath("//input[@name = 'driverLicense']");
        driverLicense.sendKeys("F23765554");
        WebElement idState = driver.findElementByXPath("//select[@ng-model='wizard.report.dlState']/option[text()='California']");
        idState.click();
        WebElement otherID = driver.findElementByXPath("//input[@name= 'other-id']");
        otherID.sendKeys("no");
        WebElement otherIdCountry = driver.findElementByXPath("//select[@name = 'otherIdCountry']/option[@value = 'US']");
        otherIdCountry.click();
        WebElement otherIdState = driver.findElementByXPath("//input[@name = 'otherIdState']");
        otherIdState.sendKeys("CA");
        WebElement otherIdType = driver.findElementByXPath("//input[@name='other-id-type']");
        otherIdType.sendKeys("passport 7388667");
        //School Information
        WebElement schoolName = driver.findElementByXPath("//input[@name='school-name']");
        schoolName.sendKeys("Challenger high school");
        WebElement schoolAddress = driver.findElementByXPath("//input[@name='school-address']");
        schoolAddress.sendKeys("380 Bernardo dr.");
        WebElement schoolCity = driver.findElementByXPath("//input[@name='school-city']");
        schoolCity.sendKeys("Palo Alto");
        WebElement schoolState = driver.findElementByXPath("//select[@ng-model='wizard.report.schoolState']/option[@value = 'CA']");
        schoolState.click();
        WebElement schoolZip = driver.findElementByXPath("//input[@name='school-zip']");
        schoolZip.sendKeys("94082");
        WebElement schoolTelephone = driver.findElementByXPath("//input[@name='schoolTelephone']");
        schoolTelephone.sendKeys("450-55-55-44");
        //Parent Information
        WebElement parentName = driver.findElementByXPath("//input[@name='parent-name']");
        parentName.sendKeys("Michelle Otkins");
        WebElement parentAddress = driver.findElementByXPath("//input[@name='parent-address']");
        parentAddress.sendKeys("255 Acalanes dr.");
        WebElement parentCity = driver.findElementByXPath("//input[@name='parent-city']");
        parentCity.sendKeys("Palo Alto");
        WebElement parentState = driver.findElementByXPath("//select[@ng-model='wizard.report.parentState']/option[@value = 'CA']");
        parentState.click();
        WebElement parentZip = driver.findElementByXPath("//input[@name='parentZip']");
        parentZip.sendKeys("94080");
        WebElement parentTelephone = driver.findElementByXPath("//input[@name='parentTelephone']");
        parentTelephone.sendKeys("650-55-55-44");
        //Employer Information
        WebElement subjectOccupation = driver.findElementByXPath("//input[@name='occupation']");
        subjectOccupation.sendKeys("IT");
        WebElement employerName = driver.findElementByXPath("//input[@name='employer-name']");
        employerName.sendKeys("SmartP");
        WebElement employerAddress = driver.findElementByXPath("//input[@name='employer-address']");
        employerAddress.sendKeys("1 Eveline av.");
        WebElement employerCity = driver.findElementByXPath("//input[@name='employer-city']");
        employerCity.sendKeys("Mountain View");
        WebElement employerState = driver.findElementByXPath("//select[@ng-model='wizard.report.employerState']/option[@value = 'CA']");
        employerState.click();
        WebElement employerZip = driver.findElementByXPath("//input[@name='employer-zip']");
        employerZip.sendKeys("96075");
        WebElement employerTelephone = driver.findElementByXPath("//input[@name='employerTelephone']");
        employerTelephone.sendKeys("644-65-55-44");
        //next page Gang Membership
        WebElement gangMembership = driver.findElementByXPath("//div[@title= 'Gang Membership']");
        gangMembership.click();
        //Distribution
        WebElement distribution = driver.findElementByXPath("//input[@ng-model='wizard.report.robbery']/../span");
        distribution.click();
        //Stop Information
        WebElement reasonForStop = driver.findElementByXPath("//input[@name='reasonForStop']");
        reasonForStop.sendKeys("robbery");
        WebElement locationOfStop = driver.findElementByXPath("//input[@name='locationOfStop']");
        locationOfStop.sendKeys("Mountain View");
        WebElement dispositionOfStop = driver.findElementByXPath("//input[@name='dispositionOfStop']");
        dispositionOfStop.sendKeys("Mountain View");
        //Gang Membership Criteria
        WebElement gangName = driver.findElementByXPath("//input[@name='gang-name']");
        gangName.sendKeys("Ank");
        WebElement howLong = driver.findElementByXPath("//input[@name='howLong']");
        howLong.sendKeys("2 years");
        WebElement validatecheckbox1 = driver.findElementByXPath("//label[text()= 'Gang Tattoos']/span");
        validatecheckbox1.click();
        WebElement validatecheckbox2 = driver.findElementByXPath("//label[text()= 'Gang Clothing']/span");
        validatecheckbox2.click();
        //Parole / Probation Status
        WebElement onProbation = driver.findElementByXPath("//label[text()= 'On Probation']/span");
        onProbation.click();
        WebElement probationOfficer = driver.findElementByXPath("//input[@name='probation-officer']");
        probationOfficer.sendKeys("Jack Nilson");
        WebElement probationOfficerPhone = driver.findElementByXPath("//input[@name='probationOfficerPhone']");
        probationOfficerPhone.sendKeys("790 34 556");
        //Other Information
        WebElement otherInformation = driver.findElementByXPath("//textarea[@name='other-information']");
        otherInformation.sendKeys("other information");
        WebElement officerID = driver.findElementByXPath("//input[@name='officerID']");
        officerID.sendKeys("F876433");
        WebElement beat = driver.findElementByXPath("//input[@name='beat']");
        beat.sendKeys("no");
        //next page Vehicle
        WebElement vehicle = driver.findElementByXPath("//div[@title= 'Vehicle']");
        vehicle.click();
        WebElement vehicleLicense = driver.findElementByXPath("//input[@name='vehicleLicense']");
        vehicleLicense.sendKeys("F5678900CA");
        WebElement vehicleMake = driver.findElementByXPath("//input[@name='vehicleMake']");
        vehicleMake.sendKeys("car");
        WebElement vehicleModel = driver.findElementByXPath("//input[@name='vehicleModel']");
        vehicleModel.sendKeys("Toyota");
        WebElement vehicleBodystyle = driver.findElementByXPath("//input[@name='vehicleBodystyle']");
        vehicleBodystyle.sendKeys("Hatchback");
        WebElement vehicleYear = driver.findElementByXPath("//input[@name='vehicleYear']");
        vehicleYear.clear();
        vehicleYear.sendKeys("2015");
        WebElement vehicleColor = driver.findElementByXPath("//input[@name='vehicleColor']");
        vehicleColor.sendKeys("Grey");
        WebElement vehicleState = driver.findElementByXPath("//select[@ng-model='wizard.report.vehicleState']/option[@value = 'CA']");
        vehicleState.click();
        WebElement vehicleOddities = driver.findElementByXPath("//input[@name='vehicleOddities']");
        vehicleOddities.sendKeys("no");

    }

    @DataProvider
    public  Object[][] dataProviderMethod() throws Exception{

        Object[][] testObjArray = readExcel(
                "src/main/resources/TestData.xls", "TestingSheet");
        return testObjArray;
    }

    public static Object[][] readExcel(String xlFilePath, String sheetName) throws Exception {
        String[][] tabArray = null;
        try {
            Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
            Sheet sheet = workbook.getSheet(sheetName);
            int startRow = 1;
            int startCol = 0;
            int ci, cj;
            int totalRows = 0;
            int totalCols = 0;
            totalRows = sheet.getRows();
            totalCols = sheet.getColumns();
            System.out.println("total cols = " + totalCols);
            System.out.println("total rows = " + totalRows);
            tabArray = new String[totalRows - 1][totalCols];
            ci = 0;
            for (int i = startRow; i < totalRows; i++, ci++) {
                cj = 0;
                for (int j = startCol; j < totalCols; j++, cj++) {
                    tabArray[ci][cj] = sheet.getCell(j, i).getContents();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not read the Excel sheet");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not read the Excel sheet");
            e.printStackTrace();
        }
        return (tabArray);
    }

    @AfterTest
    public void closeBrowser() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.quit();
    }
}
