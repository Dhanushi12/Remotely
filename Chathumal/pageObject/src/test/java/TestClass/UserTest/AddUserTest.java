package TestClass.UserTest;

import Common.BaseWeb;

import Common.ProperyRead;
import PageClass.UserPage.AddUserPage;
import PageClass.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class AddUserTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 41, description = "Verify user should be able to navigate to Users page by click on Users link in Left Navigation panel")
    public void TestNavigateUser() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        String ExpectedDisplay = "Users";
        String ActualDisplay = userobj.navValidation.getText().toString();
        Assert.assertEquals(ExpectedDisplay, ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 43, description = "Verify user can search anything in the page using global search")
    public void VerifyGlobalSearch() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();
        Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver,60);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Users')]")));
        userobj.ClickGlobalSearch.sendKeys("Dhanush1");

        Thread.sleep(500);

        String ExpectedMessage = "Dhanushi1 Devundarage1";
        String ActualMessage = userobj.SearchValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 44, description = "Verify user can search by Name Filter")
    public void SearchUsersByNameFilter() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.SearchByName.sendKeys("Sam");

        Thread.sleep(400);

        String ExpectedMessage = "Sam Wills";
        String ActualMessage = userobj.SearchNameValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 45, description = "Verify user can search by Name Filter")
    public void SearchUsersByEmailFilter() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.SearchByEmail.sendKeys("dhanushika@champitsolutions.com");

        //Thread.sleep(500);

        String ExpectedMessage = "dhanushika@champitsolutions.com";
        String ActualMessage = userobj.SearchEmailValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 46, description = "Verify user can search by ProductivityProfile Filter")
    public void SearchUsersByProductivityProfileFilter() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.SearchByProductivityProfile.sendKeys("General");

        Thread.sleep(400);

        String ExpectedMessage = "General";
        String ActualMessage = userobj.SearchProductivityProfileValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 47, description = "Verify user can search by Entity Filter")
    public void SearchUsersByEntityFilter() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.SearchByEntity.sendKeys("Champsoft Pvt.Ltd");

        Thread.sleep(300);

        String ExpectedMessage = "Champsoft Pvt.Ltd";
        String ActualMessage = userobj.SearchEntityValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 48, description = "Verify user can search by Activity Filter")
    public void SearchUsersByActivityFilter() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.SearchByActivity.sendKeys("Last seen a week ago");

        Thread.sleep(300);

        String ExpectedMessage = "Last seen a week ago";
        String ActualMessage = userobj.SearchActivityValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 49, description = "Verify user can search by Activity Filter")
    public void SearchUsersByStatusFilter() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.SearchByStatus.sendKeys("Active");

        Thread.sleep(3000);

        String ExpectedMessage = "Active";
        String ActualMessage = userobj.SearchStatusValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 50, description = "Verify user should be able to add new Users by clicking New button in Users page")
    public void AddUser() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();
       Thread.sleep(6000);
        userobj.ClickNewButton.click();

        userobj.EnterFirstName.sendKeys("Dhanushi123456"); // Enter Firstname
        Thread.sleep(6000);

        userobj.EnterLastName.sendKeys("danu1235"); // Enter Lastname
        Thread.sleep(3000);

        Thread.sleep(1000);

        Select dropdown1 = new Select(userobj.SelectRole); //Click Role item
        dropdown1.selectByValue("7");

        String alphabet = "abcdefgh";
        String s = RandomStringUtils.random(8, alphabet);
//        String uuid = UUID.randomUUID().toString();
        userobj.EnterEmail.sendKeys(s+"@gmail.com"); // Enter Email


        Select dropdown2 = new Select(userobj.SelectAccountStatus); //Select Account Status
        dropdown2.selectByValue("Active");

        Thread.sleep(2000);
        Select dropdown3 = new Select(userobj.SelectEntity); //Click Entity type
        dropdown3.selectByValue("22");

        //Select dropdown4 = new Select(userobj.SelectTimeZone);
        //dropdown4.selectByValue("+00:00 UTC");

        Thread.sleep(2000);

        userobj.ClickTime.click(); // Click TimeZone dropdown
        Thread.sleep(6000);

        userobj.SelectTime.click(); // Select a TimeZone from the dropdown items

        Select dropdown5 = new Select(userobj.SelectProductivityProfile); //Click Productivity Profile item
        dropdown5.selectByValue("191");

        userobj.ClickSave.click();

        String ExpectedDisplay = "Users";
        String ActualDisplay = userobj.navValidation.getText().toString();
        Assert.assertEquals(ExpectedDisplay, ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 51, description = "Verify User Can Navigate User Productivity Page By Clicking User's Name Hyperlink")
    public void NavigateUserProductivityPageByClickingNameHyperlink() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.ClickOnName.click();

        Thread.sleep(400);

        String ExpectedMessage = "Productivity";
        String ActualMessage = userobj.NavigateProductivityPageValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 52, description = "Verify User Can Navigate Entity Page By Clicking Entity Hyperlink")
    public void NavigateEntityPageByClickingEntityHyperlink() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        Thread.sleep(6000);
        userobj.ClickUser.click();

        Thread.sleep(6000);

        userobj.SearchByName1.sendKeys("Dhanushi1");
        Thread.sleep(6000);

        userobj.ClickOnEntity.click();

        //Thread.sleep(400);

        String ExpectedMessage = "Entity";
        String ActualMessage = userobj.NavigateEntityPageValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 53, description = "Verify user can navigate to screenshot page of the relevant user by click on screenshot icon under user's name")
    public void NavigateScreenshotPageByClickingScreenshotIcon() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.ClickOnScreenshotIcon.click();

        Thread.sleep(400);

        String ExpectedMessage = "Screenshots";
        String ActualMessage = userobj.NavigateScreenshotPageValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 54, description = "Verify user can navigate to Network page of the relevant user by click on network icon under user's name")
    public void NavigateNetworkPageByClickingNetworkIcon() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.ClickOnNetworkIcon.click();

        Thread.sleep(400);

        String ExpectedMessage = "Network";
        String ActualMessage = userobj.NavigateNetworkPageValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 55, description = "Verify user can navigate to Processes page of the relevant user by click on processes icon under user's name")
    public void NavigateProcessesPageByClickingScreenshotIcon() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.ClickOnProcessesIcon.click();

        Thread.sleep(400);

        String ExpectedMessage = "Processes";
        String ActualMessage = userobj.NavigateProcessesPageValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 56, description = "verify user can navigate to  device information page of the relevant user by click on device information icon under user's name")
    public void NavigateDeviceInformationPageByClickingScreenshotIcon() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();

        Thread.sleep(2000);

        userobj.ClickOnDeviceInformationIcon.click();

        Thread.sleep(400);

        String ExpectedMessage = "Device Summary";
        String ActualMessage = userobj.NavigateDeviceInformationPageValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 57, description = "Verify user can navigate to Personal Information page of the user by click on view option in action column of the relevant user")
    public void NavigatePersonalInformationPageByClickingView() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();
        Thread.sleep(2000);

        userobj.ClickOnRowActions.click();
        Thread.sleep(400);

        userobj.ClickOnViewOption.click();
        Thread.sleep(400);

        String ExpectedMessage = "Personal Information";
        String ActualMessage = userobj.NavigatePersonalInformationPageValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 58, description = "Verify user can naviagte to Edit User page of the relevant user by click on Edit option in action column of the relevant user")
    public void NavigateEditUserPageByClickingEdit() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        Thread.sleep(6000);
        userobj.ClickUser.click();
        Thread.sleep(2000);

        userobj.ClickOnRowActions1.click();
        Thread.sleep(400);

        userobj.ClickOnEditOption.click();
        Thread.sleep(400);

        String ExpectedMessage = "Edit User";
        String ActualMessage = userobj.NavigateEditUserPageValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 59, description = "Verify user can navigate to Personal Information page of the user by click on view option in action column of the relevant user")
    public void NavigateResetPasswordPageByClickingView() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();
        Thread.sleep(2000);

        userobj.ClickOnRowActions2.click();
        Thread.sleep(400);


        userobj.ClickOnResetPasswordOption.click();
        Thread.sleep(400);

        String ExpectedMessage = "Reset Gayan Gunasinghe's Password";
        String ActualMessage = userobj.NavigateResetPasswordPopupValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 60, description = "Verify user can navigate to Personal Information page of the user by click on view option in action column of the relevant user")
    public void NavigateDeletePageByClickingView() throws InterruptedException {
        LoginPage loginobj = new LoginPage(driver);
        AddUserPage userobj = new AddUserPage(driver);

        loginobj.login(email, password);
        userobj.ClickUser.click();
        Thread.sleep(2000);

        userobj.ClickOnRowActions3.click();
        Thread.sleep(400);

        userobj.ClickOnDeleteUser.click();
        Thread.sleep(400);

        String ExpectedMessage = "Delete User";
        String ActualMessage = userobj.NavigateDeleteUserPopupValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }
}

