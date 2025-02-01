package TestClass.Entity;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DeviceInfoPage.EntityPages.EditEntityPage;
import PageClass.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditEntityTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 18, description ="Verify user can navigate to Edit entity page by click on Edit option in Actions column dropdown in Entity grid")
    public  void  TestNavigateEntity() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        EditEntityPage editentityobj = new EditEntityPage(driver);


        logioobj.login(email,password);
        editentityobj.ClickEntity.click();

        editentityobj.FilterEntity.sendKeys("qatest");
        editentityobj.ActonButton.click();
        editentityobj.EditButton.click();
        String ExpectedDisplay ="Edit Entity";
        String ActualDisplay = editentityobj.EditButtonVerify.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }


    @Test( priority = 19 ,description ="Verify user can change Entity name")
    // @Severity(SeverityLevel.MINOR)
    public  void  TestChangeName() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        EditEntityPage editentityobj = new EditEntityPage(driver);


        logioobj.login(email,password);
        editentityobj.ClickEntity.click();
        Thread.sleep(1000);
        editentityobj.FilterEntity.sendKeys("qatest");
        editentityobj.ActonButton.click();
        editentityobj.EditButton.click();
        Thread.sleep(6000);
        editentityobj.Name.sendKeys("Anushka123");
        Thread.sleep(6000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");
        Thread.sleep(6000);
      editentityobj.SaveButton.click();
        String ExpectedDisplay ="Successfully updated the entity.";
        String ActualDisplay = editentityobj.SuccessMessage.getText().toString();
        Assert.assertEquals(ActualDisplay,ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }
}
