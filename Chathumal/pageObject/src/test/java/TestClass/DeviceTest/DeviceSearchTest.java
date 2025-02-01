package TestClass.DeviceTest;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DevicePage.DeviceSearchPage;
import PageClass.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeviceSearchTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 62, description ="Verify User able to Serach device by Name")
    public  void  SearchByName() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceSearchPage devobj = new DeviceSearchPage(driver);


        logioobj.login(email,password);
        Thread.sleep(6000);
        devobj.ClickDevice.click();
        devobj.ByName.sendKeys("L00");

        String ExpectedDisplay ="94-CHAMPSOFT";
        String ActualDisplay = devobj.VerifyName.getText().toString();
        Assert.assertEquals(ActualDisplay,ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
}
    @Test(priority = 63, description ="Verify User able to Serach device by Description")
    public  void  SearchByDescription() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceSearchPage devobj = new DeviceSearchPage(driver);


        logioobj.login(email,password);
        Thread.sleep(60);
        devobj.ClickDevice.click();
        devobj.Description.sendKeys("Microsoft");

        String ExpectedDisplay ="Microsoft Windows 11 Home Single Language Standalone Workstation";
        String ActualDisplay = devobj.VerifyDescription.getText().toString();
        Assert.assertEquals(ActualDisplay,ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 64, description ="Verify User able to Serach device by Entity")
    public  void  SearchByEntity() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceSearchPage devobj = new DeviceSearchPage(driver);


        logioobj.login(email,password);
        Thread.sleep(6000);
        devobj.ClickDevice.click();
        devobj.ByEntity.sendKeys("CHAMPSOFT");
        Thread.sleep(6000);

        String ExpectedDisplay ="ChampSoft";
        String ActualDisplay = devobj.VerifyEntity.getText().toString();
        Assert.assertEquals(ActualDisplay,ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }
    @Test(priority = 65, description ="Verify User able to Serach device by User")
    public  void  SearchByUser() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceSearchPage devobj = new DeviceSearchPage(driver);


        logioobj.login(email,password);
        Thread.sleep(1000);
        devobj.ClickDevice.click();
        devobj.ByUser.sendKeys("udeni");

        String ExpectedDisplay ="Udeni";
        String ActualDisplay = devobj.VerifyUser.getText().toString();
        Assert.assertEquals(ActualDisplay,ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 66, description ="Verify User able to Serach device by Type")
    public  void  SearchByType() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceSearchPage devobj = new DeviceSearchPage(driver);


        logioobj.login(email,password);
        Thread.sleep(6000);
        devobj.ClickDevice.click();
        devobj.ByType.sendKeys("Laptop");
        Thread.sleep(6000);

        String ExpectedDisplay ="Laptop";
        String ActualDisplay = devobj.VerifyType.getText().toString();
        Assert.assertEquals(ActualDisplay,ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }
    @Test(priority = 67, description ="Verify User able to Serach device by LastActivity")
    public  void  SearchByLastActivity() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceSearchPage devobj = new DeviceSearchPage(driver);


        logioobj.login(email,password);
        Thread.sleep(1000);
        devobj.ClickDevice.click();
        devobj.ByLastActivity.sendKeys("PM");
        Thread.sleep(1000);

        String ExpectedDisplay ="PM";
        String ActualDisplay = devobj.VerifyLastActivity.getText().toString();
        Assert.assertEquals(ActualDisplay,ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }

}
