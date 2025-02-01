package TestClass.Entity;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DeviceInfoPage.EntityPages.DeleteEntityPage;
import PageClass.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteEntityTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 34, description ="Verify user can go to Delete Entity confirmation popup by click on Delete in actions column of entity grid")
    public  void  DeletePopupOpen() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        DeleteEntityPage delobj = new DeleteEntityPage(driver);


        logioobj.login(email,password);
        Thread.sleep(100);
        delobj.ClickEntity.click();
        delobj.FilterEntity.sendKeys("qatest");
        delobj.ActonButton.click();
        delobj.DeleteButton.click();
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            Assert.assertTrue(alert.getText().contains("Are you sure you want to delete this entity?"));
        } catch (Exception e) {
            //exception handling

//        WebDriverWait wait = new WebDriverWait(driver,100);
//        String ExpectedDisplay ="Delete Entity";
//        String ActualDisplay = delobj.Deletepopup.getText().toString();
//        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
//        if (ActualDisplay.equals(ExpectedDisplay)){
//            System.out.println("Test pass");
//        }
//        else {
//            System.out.println("Test Fail");
//        }
  }}

    @Test(priority = 35, description ="Verify user can Delete Entity by click on delete button in delete entity popup")
    public  void  EntityDelete() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        DeleteEntityPage delobj = new DeleteEntityPage(driver);


        logioobj.login(email, password);
        delobj.ClickEntity.click();
        delobj.FilterEntity.sendKeys("ee");
        delobj.ActonButton.click();
        delobj.DeleteButton.click();


        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.elementToBeClickable(delobj.Deleteicon));delobj.Deleteicon.click();

    }
}
