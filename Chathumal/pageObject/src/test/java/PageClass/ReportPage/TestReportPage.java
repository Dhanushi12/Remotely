package PageClass.ReportPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestReportPage {

    WebDriver driver_One;

    public TestReportPage(WebDriver driver_Two) {

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);

    }
    @FindBy(xpath = "//a[normalize-space()='Reports']")// Report
    @CacheLookup
    public WebElement ClickReport;

    @FindBy(xpath = "//span[normalize-space()='Reports']")// reportverify
    @CacheLookup
    public WebElement VerifyReport;

    @FindBy(xpath = "//div[@class='border rounded   d-flex align-items-center justify-content-between truncate']")// entityclick
    @CacheLookup
    public WebElement clickEntity;

    @FindBy(xpath = "//span[normalize-space()='ChampSoft Inc']")// reportverify
    @CacheLookup
    public WebElement selectentity;

    @FindBy(xpath = "//button[@class='btn btn-primary ml-2']")// reportverify
    @CacheLookup
    public WebElement applybutton;

    @FindBy(xpath = "//button[@class='btn btn-primary p-2 col-md-12']")// reportverify
    @CacheLookup
    public WebElement downloadbutton;

    @FindBy(xpath = "//div[normalize-space()='Udeni Kumarasiri']")// reportverify
    @CacheLookup
    public WebElement verify;

    @FindBy(xpath = "//div[@class='notification notification-success notification-enter-done']")//
    @CacheLookup
    public WebElement downloadreport;

    @FindBy(xpath = "//h5[normalize-space()='ChampSoft Inc']")//
    @CacheLookup
    public WebElement Aproduct;

    @FindBy(xpath = "//button[@class='btn btn-primary ml-2']")//
    @CacheLookup
    public WebElement clickappy;
}