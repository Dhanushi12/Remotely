package TestClass.NetworkTest;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.LoginPage;
import PageClass.NetworkPage.NetworkPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NetworkTest extends BaseWeb{
    ProperyRead read= new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 100, description = "Verify users can navigate to Network page by click on Network option in left navigation ")
    public void NavigateNetworkPage() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        NetworkPage networkobj = new NetworkPage(driver);

        logioobj.login(email, password);
        networkobj.ClickNetwork.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Network";
        String ActualDisplay = networkobj.VerifyNetworkPage.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 101, description = "Verify user can search anything using global search in Network")
    public void GloablsearchNetwork() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        NetworkPage networkobj = new NetworkPage(driver);

        logioobj.login(email, password);
        networkobj.ClickNetwork.click();
        Thread.sleep(2000);

        networkobj.GlobalSearch.sendKeys("Remotely");
        Thread.sleep(2000);

        String ExpectedDisplay = "Network";
        String ActualDisplay = networkobj.GlobalSearchVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }

    }

    @Test(priority = 102, description = "Verify user can search Network by applying required filters")
    public void RequiredFilters() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        NetworkPage networkobj = new NetworkPage(driver);

        logioobj.login(email, password);
        networkobj.ClickNetwork.click();
        Thread.sleep(2000);

        networkobj.ClickEntity.click();
        Thread.sleep(2000);
        networkobj.SelectEntity.click();
//        Select dropdown1 = new Select(screenobj.SelectEntity); //Select Entity type
//        dropdown1.selectByValue("22");
        Thread.sleep(2000);

        networkobj.ClickUsers.click();
        networkobj.SelectUsers.click();
        Thread.sleep(2000);

        networkobj.ClickDevices.click();
        networkobj.SelectDevices.click();
        Thread.sleep(2000);

        Select dropdown1 = new Select(networkobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        networkobj.ApplyFilters.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Network";
        String ActualDisplay = networkobj.ViewNetwork.getText().toString();
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
        NetworkPage networkobj = new NetworkPage(driver);

        logioobj.login(email, password);
        networkobj.ClickNetwork.click();
        Thread.sleep(2000);

        networkobj.ApplyFilters.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Network";
        String ActualDisplay = networkobj.GlobalSearchVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }

    }



}
