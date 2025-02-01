package TestClass.ProductivityProfileTest;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.LoginPage;
import PageClass.ProductivityProfilePage.ProductivityProfileGridPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductivityProfileGridTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 80, description = "Verify user can navigate to Productivity Profile page by click on Producitvity Profile option in left navigation")
    public void TestNavigateProductivity() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        String ExpectedDisplay = "Productivity profiles";
        String ActualDisplay = prodobj.VerifyProductivity.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 81, description = "Verify user can navigate to Add new Productivity profile popup by click on Add New button in top right corner")
    public void TestNavigateAddnewProductivity() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(10000);
        prodobj.AddNewProductivity.click();
        Thread.sleep(2000);
        String ExpectedDisplay = "New Productivity Profile";
        String ActualDisplay = prodobj.VerifyAddNewProductivity.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 82, description = "Verify user can search anything using global search in Productivity Profile grid")
    public void Gloablsearch() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(6000);
        prodobj.GlobalSerch.sendKeys("Software");
        Thread.sleep(6000);
        String ExpectedDisplay = "Software Architect";
        String ActualDisplay = prodobj.GlobalSerchverify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 83, description = "Verify user can search Productivity profile by name filter ")
    public void SearchByName() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(2000);
        prodobj.SearchByName.sendKeys("Software");
        String ExpectedDisplay = "Software Architect";
        String ActualDisplay = prodobj.SearchBynameVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 84, description = "Verify user can search productivity profile by Productive processes count filter  ")
    public void SearchByProcess() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(2000);
        prodobj.SearchByProcesse.sendKeys("240");
        Thread.sleep(6000);
        String ExpectedDisplay = "240";
        String ActualDisplay = prodobj.SearchByProcesseVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 85, description = "Verify user can search productivity profile by unproductive processes count filter  ")
    public void SearchByUnproctitivity() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(2000);
        prodobj.SearchByUnprodctivity.sendKeys("80");
        Thread.sleep(1000);
        String ExpectedDisplay = "80";
        String ActualDisplay = prodobj.VerifySearchByUnprodctivity.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 86, description = "Verify user can go to edit productivity profile page by click on Edit option in action column ")
    public void navigateedit() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(6000);
        prodobj.SearchByName.sendKeys("Software");
        Thread.sleep(6000);
        prodobj.ActionButton.click();
        prodobj.EditButton.click();

        String ExpectedDisplay = "Software Architect";
        String ActualDisplay = prodobj.Editverify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 87, description = "Verify user can navigate to Duplicate Productivity profile by click on Duplicate option in Action column ")
    public void navigateDuplicate() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(2000);
        prodobj.SearchByName.sendKeys("Software");
        Thread.sleep(6000);
        prodobj.ActionButton.click();
        prodobj.DuplicateButton.click();

        Thread.sleep(1000);

        String ExpectedDisplay = "Duplicate Productivity Profile";
        String ActualDisplay = prodobj.DuplicateVerify.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 88, description = "Verify user cannot edit default productivity profiles ")
    public void Defaultprod() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(2000);
        prodobj.SearchByName.sendKeys("Software");
        Thread.sleep(1000);
        prodobj.ActionButton.click();
        prodobj.EditButton.click();

        String ExpectedDisplay = "Undefined";
        String ActualDisplay = prodobj.Defult.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 89, description = "Verify Entity is a required field in New Productivity profile popup")
    public void EntityIsRequired() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(6000);
        prodobj.AddNewProductivity.click();
        Thread.sleep(2000);
        prodobj.Name.sendKeys("test");
        prodobj.savebutton.click();
        String ExpectedDisplay = "Oops, Something went wrong";
        String ActualDisplay = prodobj.ErooMessage.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 90, description = "Verify Name is a required filed in new productivity profile popup")
    public void NameIsRequired() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(6000);
        prodobj.AddNewProductivity.click();
        Thread.sleep(2000);
        Select dropdown1 = new Select(prodobj.EntityEnter);
        dropdown1.selectByValue("5");

        prodobj.savebutton.click();
        String ExpectedDisplay = "Oops, Something went wrong";
        String ActualDisplay = prodobj.ErooMessage.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 91, description = "Verify user can duplicate productivity profiles using duplicate option in action column of Productivity Profile grid ")
    public void DuplicateProductivityProfiles() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(1000);

        prodobj.ClickAction.click();
        Thread.sleep(1000);

        prodobj.ClickDuplicate.click();
        Thread.sleep(1000);

        prodobj.DuplicateName.sendKeys("9");
        Thread.sleep(1000);

        prodobj.ClickSave.click();
        Thread.sleep(1000);

        String ExpectedDisplay = "Productivity profiles";
        String ActualDisplay = prodobj.VerifyDuplicate.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 92, description = "Verify user can rename added custom Productivity profiles through rename option in action column ")
    public void RenameExistingCustomProductivityProfiles() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(1000);

        prodobj.GlobalSearchName.sendKeys("Software");
        Thread.sleep(2000);

        prodobj.ClickAction1.click();
        Thread.sleep(2000);

        prodobj.ClickRename.click();
        Thread.sleep(1000);

        prodobj.Rename1.sendKeys("3");
        Thread.sleep(1000);

        prodobj.ClickUpdate.click();
        Thread.sleep(1000);

        String ExpectedDisplay = "Productivity profiles";
        String ActualDisplay = prodobj.VerifyUpdate.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 93, description = "Verify user can change the type of identified processes of custom productivity profiles through edit option in action column ")
    public void EditTypeOfIdentifiedProcessesOfCustomProductivityProfiles() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(1000);

        prodobj.GlobalSearchName1.sendKeys("Software");
        Thread.sleep(2000);

        prodobj.ClickAction2.click();
        Thread.sleep(2000);

        prodobj.ClickEdit.click();
        Thread.sleep(2000);

        prodobj.GlobalSearchName2.sendKeys("Dell.UCA.Systray.exe");
        Thread.sleep(2000);

        prodobj.ClickRadio.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Custom type updated successfully";
        String ActualDisplay = prodobj.VerifyMessage.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 94, description = "Verify user can delete custom productivity profiles through delete option in action column on productivity profile grid ")
    public void DeleteCustomProductivityProfiles() throws InterruptedException {
        LoginPage logioobj = new LoginPage(driver);
        ProductivityProfileGridPage prodobj = new ProductivityProfileGridPage(driver);

        logioobj.login(email, password);
        prodobj.ClickProductivity.click();
        Thread.sleep(1000);

        prodobj.GlobalSearchName3.sendKeys("Dhanushi");
        Thread.sleep(2000);

        prodobj.ClickAction3.click();
        Thread.sleep(2000);

        prodobj.ClickDelete.click();
        Thread.sleep(2000);

        prodobj.NavPopup.click();
        Thread.sleep(2000);

        prodobj.ClickYes.click();
        Thread.sleep(2000);

        String ExpectedDisplay = "Productivity profiles";
        String ActualDisplay = prodobj.VerifyMessage1.getText().toString();
        Assert.assertEquals(ActualDisplay, ExpectedDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test Fail");
        }
    }

}