package TestClass.Report;

import Common.BaseWeb;
import Common.ProperyRead;
import PageClass.DeviceInfoPage.DeviceInforSearchPage;
import PageClass.LoginPage;
import PageClass.ReportPage.TestReportPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReportTest extends BaseWeb {
    ProperyRead read = new ProperyRead();
    String email = read.getEmail();
    String password = read.getPassword();

    @Test(priority = 130, description ="Verify user able to Naviagte to the Device Info page")
    public  void  TestNavigatereport() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        TestReportPage repobj = new TestReportPage(driver);

        logioobj.login(email,password);
     repobj.ClickReport.click();
        String ExpectedDisplay ="Reports";
        String ActualDisplay = repobj.VerifyReport.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 131, description ="Verify user able to apply filter and search")
    public  void  Serchreport() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        TestReportPage repobj = new TestReportPage(driver);

        logioobj.login(email,password);
        repobj.ClickReport.click();
        repobj.clickEntity.click();
        repobj.selectentity.click();
        Thread.sleep(6000);
        repobj.applybutton.click();



        String ExpectedDisplay ="Udeni Kumarasiri";
        String ActualDisplay = repobj.verify.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }

    @Test(priority = 132, description ="Verify user able to download the report")
    public  void  downloadreport() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        TestReportPage repobj = new TestReportPage(driver);

        logioobj.login(email,password);
        repobj.ClickReport.click();
        repobj.clickEntity.click();
        repobj.selectentity.click();
        Thread.sleep(6000);
        repobj.applybutton.click();
        Thread.sleep(6000);
        repobj.downloadbutton.click();



        String ExpectedDisplay ="PDF Report downloaded.";
        String ActualDisplay = repobj.downloadreport.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }
    @Test(priority = 133, description ="Verify average productivity is displyed")
    public  void  AverageProductivity() throws InterruptedException{
        LoginPage logioobj = new LoginPage(driver);
        TestReportPage repobj = new TestReportPage(driver);

        logioobj.login(email,password);
        repobj.ClickReport.click();
        repobj.clickEntity.click();
        repobj.selectentity.click();
        Thread.sleep(6000);
        repobj.applybutton.click();



        String ExpectedDisplay ="ChampSoft Inc";
        String ActualDisplay = repobj.Aproduct.getText().toString();
        Assert.assertEquals(ExpectedDisplay,ActualDisplay);
        if (ActualDisplay.equals(ExpectedDisplay)){
            System.out.println("Test pass");
        }
        else {
            System.out.println("Test Fail");
        }
    }
}
