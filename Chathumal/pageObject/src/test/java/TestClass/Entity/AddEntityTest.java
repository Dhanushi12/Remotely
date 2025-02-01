package TestClass.Entity;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DeviceInfoPage.EntityPages.AddEntityPage;
import PageClass.LoginPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddEntityTest extends BaseWeb {

    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 9, description ="Verify user should be able to navigate to New Entity page by click on Add new button in  entity page")
    public  void  TestNavigateEntity() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        AddEntityPage entityobj = new AddEntityPage(driver);

        logioobj.login(email,password);
        entityobj.ClickEntity.click();
        String ExpectedDisplay ="Entity";
        String ActualDisplay = entityobj.navValidation.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 10, description ="Verify user should be able to  Create new Entity")
    public  void  AddEntityWithValidData() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        AddEntityPage entityobj = new AddEntityPage(driver);

        logioobj.login(email,password);
        Thread.sleep(1000);
        entityobj.ClickEntity.click();
        Thread.sleep(6000);
        entityobj.ClickNewButton.click();
        Thread.sleep(6000);

        entityobj.EnterName.sendKeys("qatest");

        Select dropdown2 = new Select(entityobj.SelectEntity);
        dropdown2.selectByValue("1");
        Thread.sleep(6000);

        Select dropdown1 = new Select(entityobj.SelectPEntity);
        dropdown1.selectByValue("5");

        Thread.sleep(6000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");

        Thread.sleep(6000);
        entityobj.ClickSave.click();

        String ExpectedMessage ="Successfully created the entity.";
        String ActualMessage= entityobj.SuccessMessage.getText().toString();
        Assert.assertEquals(ActualMessage,ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }
    @Test(priority = 11, description ="Verify user should not be able to add new entity without giving Name")
    public  void  AddEntityWithoutName() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        AddEntityPage entityobj = new AddEntityPage(driver);

        logioobj.login(email,password);
        entityobj.ClickEntity.click();
        Thread.sleep(6000);
        entityobj.ClickNewButton.click();

        Select dropdown1 = new Select(entityobj.SelectPEntity);
        dropdown1.selectByValue("13");

        Select dropdown2 = new Select(entityobj.SelectEntity);
        dropdown2.selectByValue("1");
        Thread.sleep(6000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");

        Thread.sleep(6000);
        entityobj.ClickSave.click();

        String ExpectedMessage ="Please enter a name.";
        String ActualMessage= entityobj.NameValidation.getText().toString();
        Assert.assertEquals(ActualMessage,ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }
    @Test(priority = 12, description ="Verify user should not be able to add new entity without giving Entity type")
    public  void  AddEntityWithoutEntityType() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        AddEntityPage entityobj = new AddEntityPage(driver);

        logioobj.login(email,password);
        Thread.sleep(1000);
        entityobj.ClickEntity.click();
       Thread.sleep(1000);
        entityobj.ClickNewButton.click();

        entityobj.EnterName.sendKeys("TEST");
        Thread.sleep(6000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");

        Thread.sleep(6000);
        entityobj.ClickSave.click();


        String ExpectedMessage1 ="Please select an entity type.";
        String ActualMessage= entityobj.EntityValidation.getText().toString();
        Assert.assertEquals(ExpectedMessage1,ActualMessage);
        if (ExpectedMessage1.equals(ActualMessage)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");

        }
    }
    }