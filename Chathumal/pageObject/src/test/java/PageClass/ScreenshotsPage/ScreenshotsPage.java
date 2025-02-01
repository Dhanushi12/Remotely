package PageClass.ScreenshotsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenshotsPage {
    WebDriver driver_One;

    public ScreenshotsPage(WebDriver driver_Two) {

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/li[5]/a[1]")// Click Screenshots
    @CacheLookup
    public WebElement ClickScreenshots;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/nav[1]/ol[1]/li[2]/span[1]")// verify Screenshots
    @CacheLookup
    public WebElement VerifyScreenshotsPage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/li[5]/a[1]")// Click Screenshots
    @CacheLookup
    public WebElement GlobalSearch;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/nav[1]/ol[1]/li[2]/span[1]")// verify Screenshots
    @CacheLookup
    public WebElement GlobalSearchVerify;

    @FindBy(xpath = "//div[@class='border rounded   d-flex align-items-center justify-content-between truncate']")// Click Screenshots
    @CacheLookup
    public WebElement ClickEntity;

    @FindBy(xpath = "//span[normalize-space()='ChampSoft Inc']")// Click Screenshots
    @CacheLookup
    public WebElement SelectEntity;

    @FindBy(xpath = "//div[@class='border rounded p-2 d-flex align-items-center justify-content-between truncate']")// verify Screenshots
    @CacheLookup
    public WebElement ClickUsers;

//    @FindBy(xpath = "//span[normalize-space()='ChampSoft Inc']")// Click Screenshots
//    @CacheLookup
//    public WebElement SelectOrg;

    @FindBy(xpath = "//span[normalize-space()='Remotly']")// Click User
    @CacheLookup
    public WebElement SelectUsers;

    @FindBy(xpath = "//div[@class='border rounded px-2   d-flex align-items-center justify-content-between']")// verify Screenshots
    @CacheLookup
    public WebElement ClickDevices;

    @FindBy(xpath = "//span[normalize-space()='REMOTLY-L0072-CHAMPSOFT']")// verify Screenshots
    @CacheLookup
    public WebElement SelectDevices;

//    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/nav[1]/ol[1]/li[2]/span[1]")// verify Screenshots
//    @CacheLookup
//    public WebElement ClickDate;

//    @FindBy(xpath = "//select[@id='device']//option[@value='LastMonth']")// Select Date
//    @CacheLookup
//    public WebElement SelectDate;

    @FindBy(xpath = "//select[@id='device']")// Select Date
    @CacheLookup
    public WebElement SelectDate;

//      @FindBy(xpath = "//select[@id='device']")// verify Screenshots
//      @CacheLookup
//      public WebElement ClickDate;


    @FindBy(xpath = "//button[@class='col-md-12 btn btn-primary p-2']")// verify Screenshots
    @CacheLookup
    public WebElement ApplyFilters;

    @FindBy(xpath = "//div[@class='card-header sub-card-header']")// verify Screenshots
    @CacheLookup
    public WebElement ViewScreenshots;

}