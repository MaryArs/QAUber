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
    private FirefoxDriver driver = null;

    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "/home/peer/dev/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://fits.qauber.com");

    }


    @Test//(groups = {"Reports"})
    public void loginTest() throws InterruptedException {

        WebElement logintextbox = driver.findElementByXPath("//*[@id='exampleInputEmail1']");
        logintextbox.sendKeys("mary.arsitova@gmail.com");
        WebElement searchbutton = driver.findElementByXPath("//input[@id= 'exampleInputPassword1']");
        searchbutton.sendKeys("123456");
        Thread.sleep(3000);
        WebElement login = driver.findElementByXPath("/html/body/div[2]/div/div/div[1]/div[2]/form/button");
        login.click();
    }
//groups = {"Reports"},
    @Test(dependsOnMethods = {"loginTest"}, dataProvider = "dataProviderAddReport")

    public void addReportsTest(String caseIDex, String lastNameex, String firstNameex, String middleNameex,
                               String nickNameex, String dateOfBirthex, String ageex, String heightex, String weightex,
                               String primaryLanguageex, String streetAddressex, String cityex,// String stateex,
                               String zipCodeex,
                               String telephoneex, String emailex, String socialSecurityex, String driverLicenseex,
                               String otherIDex,  String otherIdStateex, String  otherIdTypeex, String schoolNameex, String schoolAddressex,
                               String schoolCityex, String schoolZipex, String schoolTelephoneex,
                               String parentNameex, String parentAddressex, String parentCityex, String parentZipex, String parentTelephoneex) throws InterruptedException {

        WebElement addReport = driver.findElementByXPath("//a[@title = 'Add Report']");
        addReport.click();
        Thread.sleep(3000);
        WebElement subjectInformation = driver.findElementByXPath("//div[@title= 'Subject Information']");
        subjectInformation.click();
        driver.findElementByXPath("//input[@name='caseNumber']").sendKeys(caseIDex);
        driver.findElementByXPath("//select[@ng-model='wizard.report.suspectType']/option[text()='Victim']").click();
        driver.findElementByXPath("//input[@name='lastName']").sendKeys(lastNameex);
        driver.findElementByXPath("//input[@name='firstName']").sendKeys(firstNameex);
        driver.findElementByXPath("//input[@name='middleName']").sendKeys(middleNameex);
        driver.findElementByXPath("//input[@name='Nickname']").sendKeys(nickNameex);
        driver.findElementByXPath("//input[@uib-datepicker-popup='MM/dd/yyyy']").sendKeys(dateOfBirthex);
        driver.findElementByXPath("//input[@name='Age']").sendKeys(ageex);
        driver.findElementByXPath("//select[@ng-model='wizard.report.sex']/option[text()='F']").click();
        driver.findElementByXPath("//select[@ng-model='wizard.report.race']/option[text()='Other']").click();
        driver.findElementByXPath("//input[@name='Height']").sendKeys(heightex);
        driver.findElementByXPath("//input[@name='Weight']").sendKeys(weightex);
        driver.findElementByXPath("//select[@ng-model='wizard.report.build']/option[text()='Athletic']").click();
        driver.findElementByXPath("//select[@ng-model='wizard.report.hairColor']/option[text()='Black']").click();
        driver.findElementByXPath("//select[@ng-model='wizard.report.hairLength']/option[text()='Long']").click();
        driver.findElementByXPath("//select[@ng-model='wizard.report.hairStyle']/option[text()='Curly']").click();
        driver.findElementByXPath("//select[@ng-model='wizard.report.eyeColor']/option[text()='Blue']").click();
        driver.findElementByXPath("//select[@ng-model='wizard.report.complexion']/option[text()='Light']").click();
        driver.findElementByXPath("//select[@ng-model='wizard.report.teeth']/option[text()='Silver']").click();
        driver.findElementByXPath("//select[@ng-model='wizard.report.handPreference']/option[text()='Right']").click();
        driver.findElementByXPath("//input[@name='primary-language']").sendKeys(primaryLanguageex);
        driver.findElementByXPath("//input[@name='street-address']").sendKeys(streetAddressex);
        driver.findElementByXPath("//select[@ng-model='wizard.report.country']/option[text()='United States']").click();
        driver.findElementByXPath("//input[@name='city']").sendKeys(cityex);
        driver.findElementByXPath("//select[@ng-model='wizard.report.state']/option[text()='California']").click();
        driver.findElementByXPath("//input[@name='zip']").sendKeys(zipCodeex);
        driver.findElementByXPath("//input[@name='phone']").sendKeys(telephoneex);
        driver.findElementByXPath("//input[@name='email']").sendKeys(emailex);
        driver.findElementByXPath("//label[text()= 'Pedestrian']/span").click();
        // next page Identifiers
        driver.findElementByXPath("//div[@title= 'Identifiers']").click();
        driver.findElementByXPath("//input[@ng-model='wizard.report.tattoos']/../span").click();
        //next page ID Information
        driver.findElementByXPath("//div[@title= 'ID Information']").click();
        driver.findElementByXPath("//input[@name = 'socialSecurity']").sendKeys(socialSecurityex);
        driver.findElementByXPath("//input[@name = 'driverLicense']").sendKeys(driverLicenseex);
        driver.findElementByXPath("//select[@ng-model='wizard.report.dlState']/option[text()='California']").click();
        driver.findElementByXPath("//input[@name= 'other-id']").sendKeys(otherIDex);
        driver.findElementByXPath("//select[@name = 'otherIdCountry']/option[@value = 'US']").click();
        driver.findElementByXPath("//input[@name = 'otherIdState']").sendKeys(otherIdStateex);
        driver.findElementByXPath("//input[@name='other-id-type']").sendKeys(otherIdTypeex);
        //School Information
        driver.findElementByXPath("//input[@name='school-name']").sendKeys(schoolNameex);
        driver.findElementByXPath("//input[@name='school-address']").sendKeys(schoolAddressex);
        driver.findElementByXPath("//input[@name='school-city']").sendKeys(schoolCityex);
        driver.findElementByXPath("//select[@ng-model='wizard.report.schoolState']/option[@value = 'CA']").click();
        driver.findElementByXPath("//input[@name='school-zip']").sendKeys(schoolZipex);
        driver.findElementByXPath("//input[@name='schoolTelephone']").sendKeys(schoolTelephoneex);
        //Parent Information
        driver.findElementByXPath("//input[@name='parent-name']").sendKeys(parentNameex);
        driver.findElementByXPath("//input[@name='parent-address']").sendKeys(parentAddressex);
        driver.findElementByXPath("//input[@name='parent-city']").sendKeys(parentCityex);
        driver.findElementByXPath("//select[@ng-model='wizard.report.parentState']/option[@value = 'CA']").click();
        driver.findElementByXPath("//input[@name='parentZip']").sendKeys(parentZipex);
        driver.findElementByXPath("//input[@name='parentTelephone']").sendKeys(parentTelephoneex);
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
    public  Object[][] dataProviderAddReport() throws Exception{

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
        driver.quit();
    }
}
