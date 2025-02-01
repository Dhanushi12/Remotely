package TestClass.Entity;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DeviceInfoPage.EntityPages.AddUserEntityPage;
import PageClass.LoginPage;
import org.testng.annotations.Test;

public class AddUserEntityTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 25, description ="Verify user can navigate to New User page by click on Add User in actions column of entity grid")
    public  void  NavigteAddUserEntity() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        AddUserEntityPage adduobj = new AddUserEntityPage(driver);


        logioobj.login(email, password);
        adduobj.ClickEntity.click();
        adduobj.FilterEntity.sendKeys("anushka");
        adduobj.ActonButton.click();
        adduobj.ClickAddUser.click();

//        String ExpectedDisplay = "First Name";
//        String ActualDisplay = adduobj.VerifyAddUser.getText().toString();
//        Assert.assertEquals(ExpectedDisplay, ActualDisplay);
//        if (ActualDisplay.equals(ExpectedDisplay)) {
//            System.out.println("Test pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//
//    }
    }}
