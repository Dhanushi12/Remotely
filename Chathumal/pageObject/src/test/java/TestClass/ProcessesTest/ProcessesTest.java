package TestClass.ProcessesTest;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.LoginPage;
import PageClass.ProcessesPage.ProcessesPage;
import PageClass.UserPage.AddUserPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProcessesTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 110, description = "Verify users can navigate to Processes page by click on Processes option in left navigation ")
    public void NavigateProcessesPage() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(1000);

        String ExpectedDisplay = "Processes";
        String ActualDisplay = processobj.VerifyProcessesPage.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 111, description = "Verify user can search anything using global search in Processes")
    public void GlobalSearchProcesses() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.GlobalSearch.sendKeys("Remotely");
        Thread.sleep(2000);

        String ExpectedDisplay = "Processes";
        String ActualDisplay = processobj.GlobalSearchVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }

    }

    @Test(priority = 112, description = "Verify user can search Processes by applying required filters")
    public void RequiredFilters() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.ClickEntity.click();
        Thread.sleep(2000);
        processobj.SelectEntity.click();
        Thread.sleep(2000);

        processobj.ClickUsers.click();
        processobj.SelectUsers.click();
        Thread.sleep(2000);

        processobj.ClickDevices.click();
        processobj.SelectDevices.click();
        Thread.sleep(2000);

        Select dropdown1 = new Select(processobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        processobj.ApplyFilters.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Processes";
        String ActualDisplay = processobj.ViewProcesses.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }

    }

    @Test(priority = 113, description = "Verify user unable to search Processes without entering data")
    public void WithouData() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.ApplyFilters.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Processes";
        String ActualDisplay = processobj.GlobalSearchVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }

    }

    @Test(priority = 114, description = "Verify Processes can search by Name Filter")
    public void SearchByNameFilter() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.ClickEntity.click();
        Thread.sleep(2000);
        processobj.SelectEntity.click();
        Thread.sleep(2000);

        processobj.ClickUsers.click();
        processobj.SelectUsers.click();
        Thread.sleep(2000);

        processobj.ClickDevices.click();
        processobj.SelectDevices.click();
        Thread.sleep(2000);

        Select dropdown1 = new Select(processobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        processobj.ApplyFilters.click();
        Thread.sleep(2000);

        processobj.SearchByName.sendKeys("Any");

        Thread.sleep(400);

        String ExpectedMessage = "AnyDesk.exe";
        String ActualMessage = processobj.SearchNameValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 115, description = "Verify user can search Processes by Productivity Status filter ")
    public void SearchByProductivityStatusFilter() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.ClickEntity.click();
        Thread.sleep(2000);
        processobj.SelectEntity.click();
        Thread.sleep(2000);

        processobj.ClickUsers.click();
        processobj.SelectUsers.click();
        Thread.sleep(2000);

        processobj.ClickDevices.click();
        processobj.SelectDevices.click();
        Thread.sleep(2000);

        Select dropdown1 = new Select(processobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        processobj.ApplyFilters.click();
        Thread.sleep(2000);

        processobj.SearchByProductivityStatus.sendKeys("Undefined");

        Thread.sleep(400);

        String ExpectedMessage = "Undefined";
        String ActualMessage = processobj.SearchProductivityStatusValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

//    @Test(priority = 116, description = "Verify user can search Processes by Application Name filter ")
//    public void SearchByApplicationNameFilter() throws InterruptedException {
//        LoginPage logioobj = new LoginPage(driver);
//        ProcessesPage processobj = new ProcessesPage(driver);
//
//        logioobj.login(email, password);
//        processobj.ClickProcesses.click();
//        Thread.sleep(2000);
//
//        processobj.SearchByApplicationName.sendKeys("dhanushika@champitsolutions.com");
//
//        //Thread.sleep(500);
//
//        String ExpectedMessage = "dhanushika@champitsolutions.com";
//        String ActualMessage = processobj.SearchByApplicationNameValidation.getText().toString();
//        Assert.assertEquals(ActualMessage, ExpectedMessage);
//        if (ExpectedMessage.equals(ActualMessage)) {
//            System.out.println("Test pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//    }

    @Test(priority = 117, description = "Verify user can search Processes by Started Date filter ")
    public void SearchByStartedFilter() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.ClickEntity.click();
        Thread.sleep(2000);
        processobj.SelectEntity.click();
        Thread.sleep(2000);

        processobj.ClickUsers.click();
        processobj.SelectUsers.click();
        Thread.sleep(2000);

        processobj.ClickDevices.click();
        processobj.SelectDevices.click();
        Thread.sleep(2000);

        Select dropdown1 = new Select(processobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        processobj.ApplyFilters.click();
        Thread.sleep(2000);

        processobj.SearchByStarted.sendKeys("02/13/2024");

        Thread.sleep(300);

        String ExpectedMessage = "02/13/2024";
        String ActualMessage = processobj.SearchByStartedValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 118, description = "Verify user can search Processes by Duration filter ")
    public void SearchByDurationFilter() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.ClickEntity.click();
        Thread.sleep(2000);
        processobj.SelectEntity.click();
        Thread.sleep(2000);

        processobj.ClickUsers.click();
        processobj.SelectUsers.click();
        Thread.sleep(2000);

        processobj.ClickDevices.click();
        processobj.SelectDevices.click();
        Thread.sleep(2000);

        Select dropdown1 = new Select(processobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        processobj.ApplyFilters.click();
        Thread.sleep(2000);

        processobj.SearchByDuration.sendKeys("5h 1m");

        Thread.sleep(300);

        String ExpectedMessage = "5h 1m";
        String ActualMessage = processobj.SearchByDurationValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 119, description = "Verify user can search Processes in the page using global search filter in the Processes grid")
    public void GlobalSearchFilter() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.ClickEntity.click();
        Thread.sleep(2000);
        processobj.SelectEntity.click();
        Thread.sleep(2000);

        processobj.ClickUsers.click();
        processobj.SelectUsers.click();
        Thread.sleep(2000);

        processobj.ClickDevices.click();
        processobj.SelectDevices.click();
        Thread.sleep(2000);

        Select dropdown1 = new Select(processobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        processobj.ApplyFilters.click();
        Thread.sleep(2000);

        processobj.GlobalSearch1.sendKeys("chrome.exe");

        Thread.sleep(300);

        String ExpectedMessage = "chrome.exe";
        String ActualMessage = processobj.GlobalSearch1Validation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 120, description = "Verify that the user can retrieve system processes by toggling on the 'Show System Processes' switch in the Processes grid")
    public void ShowSystemProcessesFilter() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProcessesPage processobj = new ProcessesPage(driver);

        logioobj.login(email, password);
        processobj.ClickProcesses.click();
        Thread.sleep(2000);

        processobj.ClickEntity.click();
        Thread.sleep(2000);
        processobj.SelectEntity.click();
        Thread.sleep(2000);

        processobj.ClickUsers.click();
        processobj.SelectUsers.click();
        Thread.sleep(2000);

        processobj.ClickDevices.click();
        processobj.SelectDevices.click();
        Thread.sleep(2000);

        Select dropdown1 = new Select(processobj.SelectDate); //Click Entity type
        dropdown1.selectByValue("LastMonth");
        Thread.sleep(2000);

        processobj.ApplyFilters.click();
        Thread.sleep(2000);

        processobj.ToggleOn.click();
        Thread.sleep(2000);

        String ExpectedMessage = "System";
        String ActualMessage = processobj.ShowSystemProcessesFilterValidation.getText().toString();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        if (ExpectedMessage.equals(ActualMessage)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }
}
