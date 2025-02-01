package TestClass.ScreenshotsTest;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.LoginPage;
import PageClass.ProductivityProfilePage.ProductivityProfileGridPage;
import PageClass.ScreenshotsPage.ScreenshotsPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenshotsTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 100, description = "Verify users can navigate to Screenshots page by click on Screenshots option in left navigation ")
    public void NavigateScreenshotsPage() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ScreenshotsPage screenobj = new ScreenshotsPage(driver);

        logioobj.login(email, password);
        screenobj.ClickScreenshots.click();
        Thread.sleep(1000);

        String ExpectedDisplay = "Screenshots";
        String ActualDisplay = screenobj.VerifyScreenshotsPage.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 101, description = "Verify user can search anything using global search in Screenshots")
    public void GloablsearchScreenshots() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ScreenshotsPage screenobj = new ScreenshotsPage(driver);

        logioobj.login(email, password);
        screenobj.ClickScreenshots.click();
        Thread.sleep(2000);

        screenobj.GlobalSearch.sendKeys("Remotely");
        Thread.sleep(2000);

        String ExpectedDisplay = "Screenshots";
        String ActualDisplay = screenobj.GlobalSearchVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }

    }

    @Test(priority = 102, description = "Verify user can search Screenshots by applying required filters")
    public void RequiredFilters() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ScreenshotsPage screenobj = new ScreenshotsPage(driver);

        logioobj.login(email, password);
        screenobj.ClickScreenshots.click();
        Thread.sleep(2000);

        screenobj.ClickEntity.click();
        Thread.sleep(2000);
        screenobj.SelectEntity.click();
//        Select dropdown1 = new Select(screenobj.SelectEntity); //Select Entity type
//        dropdown1.selectByValue("22");
        Thread.sleep(2000);

        screenobj.ClickUsers.click();
        screenobj.SelectUsers.click();
        Thread.sleep(2000);

        screenobj.ClickDevices.click();
        screenobj.SelectDevices.click();
        Thread.sleep(2000);

//        screenobj.ClickDate.click();
//        screenobj.SelectDate.click();
//        Thread.sleep(2000);

        Select dropdown1 = new Select(screenobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        screenobj.ApplyFilters.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Screenshots";
        String ActualDisplay = screenobj.ViewScreenshots.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }

    }

    @Test(priority = 101, description = "Verify user unable to search without entering data")
    public void WithouData() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ScreenshotsPage screenobj = new ScreenshotsPage(driver);

        logioobj.login(email, password);
        screenobj.ClickScreenshots.click();
        Thread.sleep(2000);

        screenobj.ApplyFilters.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Screenshots";
        String ActualDisplay = screenobj.GlobalSearchVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }

    }
}