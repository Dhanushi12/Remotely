package TestClass.DeviceInfo;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DeviceInfoPage.DeviceInforSearchPage;
import PageClass.LoginPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeviceInforSearchTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 125, description ="Verify user able to Naviagte to the Device Info page")
    public  void  TestNavigateDevice() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceInforSearchPage devobj = new DeviceInforSearchPage(driver);


        logioobj.login(email,password);
        devobj.ClickDevice.click();
        String ExpectedDisplay ="Device Info";
        String ActualDisplay = devobj.VerifyDevice.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 126, description ="Verify user able to search device using required fields")
    public  void  Serchbyrequired() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceInforSearchPage devobj = new DeviceInforSearchPage(driver);


        logioobj.login(email,password);
        devobj.ClickDevice.click();
        Thread.sleep(6000);
        devobj.clickentity.click();
        devobj.SelectEntity.click();

        //devobj.clickuser.click();
        devobj.user.click();

        devobj.clickenterd.click();
        devobj.deviceenter.click();

        devobj.applybutton.click();

        String ExpectedDisplay ="Device Info";
        String ActualDisplay = devobj.VerifyDevice.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }
    @Test(priority = 127, description ="Verify user able to search by date")
    public  void  Serchbydate() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceInforSearchPage devobj = new DeviceInforSearchPage(driver);


        logioobj.login(email,password);
        devobj.ClickDevice.click();
        Thread.sleep(6000);
        devobj.clickentity.click();
        devobj.SelectEntity.click();

        devobj.clickuser.click();
        devobj.user.click();


        devobj.clickenterd.click();
        devobj.deviceenter.click();
        Thread.sleep(10000);

        Select dropdown2 = new Select(devobj.SelectDate);
        dropdown2.selectByValue("Today");


        devobj.applybutton.click();

        String ExpectedDisplay ="Device Info";
        String ActualDisplay = devobj.VerifyDevice.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }}



    @Test(priority = 128, description ="Verify user unable to search without entering data")
    public  void  withoutdata() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeviceInforSearchPage devobj = new DeviceInforSearchPage(driver);


        logioobj.login(email,password);
        devobj.ClickDevice.click();
        Thread.sleep(6000);


        devobj.applybutton.click();

        String ExpectedDisplay ="Device Info";
        String ActualDisplay = devobj.VerifyDevice.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }}
}
