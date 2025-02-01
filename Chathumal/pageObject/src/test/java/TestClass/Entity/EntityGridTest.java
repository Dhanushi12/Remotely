package TestClass.Entity;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DeviceInfoPage.EntityPages.EntityGridPage;
import PageClass.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntityGridTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 36, description ="Verify user can search Entities by its name")
    public  void  SearchEntityByName() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        EntityGridPage gridobj = new EntityGridPage(driver);


        logioobj.login(email,password);
        gridobj.ClickEntity.click();
        Thread.sleep(6000);
        gridobj.FilterEntity.sendKeys("qatest");
       Thread.sleep(1000);
        String ExpectedDisplay ="qatest";
        String ActualDisplay = gridobj.VerifyFilterEntity.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }

    }
    @Test(priority = 37, description ="Verify user can search Entities by its type")
    public  void  SearchEntityByType() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        EntityGridPage gridobj = new EntityGridPage(driver);


        logioobj.login(email,password);
        gridobj.ClickEntity.click();
        gridobj.Type.sendKeys("Organization");
        Thread.sleep(1000);
        String ExpectedDisplay ="Organization";
        String ActualDisplay = gridobj.VerifyFilterEntity.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }}

    @Test(priority = 38, description ="Verify user can search Entities by its  Total Users count")
    public  void  SearchEntityByTotalUserAccount() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        EntityGridPage gridobj = new EntityGridPage(driver);


        logioobj.login(email,password);
        gridobj.ClickEntity.click();
        gridobj.TotalUserCount.sendKeys("1");
        Thread.sleep(1000);
        String ExpectedDisplay ="1";
        String ActualDisplay = gridobj.VerifyFilterEntity.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }}

    @Test(priority = 39, description ="Verify user can search entties by its total entity count")
    public  void  SearchEntityByTotalEntityAccount() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        EntityGridPage gridobj = new EntityGridPage(driver);


        logioobj.login(email,password);
        gridobj.ClickEntity.click();
        gridobj.TotalEntityCount.sendKeys("16");
        Thread.sleep(1000);
        String ExpectedDisplay ="16";
        Thread.sleep(6000);
        String ActualDisplay = gridobj.VerifyFilterEntity.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }}
}
