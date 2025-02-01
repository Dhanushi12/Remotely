package TestClass.Entity;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DeviceInfoPage.EntityPages.AddSubEntityPage;
import PageClass.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddSubEntityTest extends BaseWeb {

    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 31, description ="Verify user can navigate to New Entity page by click on Add Sub Entity option in action column of Entity grid")
    public  void  NavigteSubEntity() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        AddSubEntityPage addsobj = new AddSubEntityPage(driver);


        logioobj.login(email, password);
        addsobj.ClickEntity.click();
        Thread.sleep(3000);
        addsobj.FilterEntity.sendKeys("anushka");
        addsobj.ActonButton.click();
        addsobj.ClickSubEntity.click();

        String ExpectedDisplay ="New Entity";
        String ActualDisplay = addsobj.VerifySubEntity.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }


    }
    @Test(priority = 32, description ="Verify Parent Entity dropdown value in New Entity page should be auto sected according to the selected entity for add sub entity")
    public  void  VerifyPerantEntity() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        AddSubEntityPage addsobj = new AddSubEntityPage(driver);


        logioobj.login(email, password);
        addsobj.ClickEntity.click();
        Thread.sleep(1000);
        addsobj.FilterEntity.sendKeys("qatest");
        Thread.sleep(6000);
        addsobj.ActonButton.click();
        addsobj.ClickSubEntity.click();
        Thread.sleep(6000);

        String ExpectedDisplay = "Parent Entity";
        String ActualDisplay = addsobj.VerifyPernatEntity.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }
    }
