package PageClass.NetworkPage;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NetworkPage {
    WebDriver driver_One;

    public NetworkPage (WebDriver driver_Two){
        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }

    @FindBy(xpath="//a[@resourceid=\"5\"]")
    @CacheLookup
    public WebElement ClickNetwork;

    @FindBy(xpath = "//span[normalize-space()='Network']")
    @CacheLookup
    public WebElement VerifyNetworkPage;

    @FindBy(xpath = "//input[@id=\"search\"]")// Click Network
    @CacheLookup
    public WebElement GlobalSearch;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/nav[1]/ol[1]/li[2]/span[1]")// verify Network
    @CacheLookup
    public WebElement GlobalSearchVerify;

    @FindBy(xpath = "//div[@class=\"border rounded   d-flex align-items-center justify-content-between truncate\"]")// Click Network
    @CacheLookup
    public WebElement ClickEntity;

    @FindBy(xpath = "//span[normalize-space()='ChampSoft Inc']")// Click Network
    @CacheLookup
    public WebElement SelectEntity;

    @FindBy(xpath = "//div[@class='border rounded p-2 d-flex align-items-center justify-content-between truncate']")// verify Network
    @CacheLookup
    public WebElement ClickUsers;

    @FindBy(xpath = "//span[normalize-space()='Remotly']")// Click User
    @CacheLookup
    public WebElement SelectUsers;

    @FindBy(xpath = "//div[@class='border rounded px-2   d-flex align-items-center justify-content-between']")// verify Network
    @CacheLookup
    public WebElement ClickDevices;

    @FindBy(xpath = "//span[normalize-space()='REMOTLY-L0072-CHAMPSOFT']")// verify Network
    @CacheLookup
    public WebElement SelectDevices;

    @FindBy(xpath = "//select[@id='device']")// Select Date
    @CacheLookup
    public WebElement SelectDate;

    @FindBy(xpath = "//button[@class='col-md-12 btn btn-primary p-2']")// verify Network
    @CacheLookup
    public WebElement ApplyFilters;

    @FindBy(xpath = "//div[@class='card-header sub-card-header']")// verify Network
    @CacheLookup
    public WebElement ViewNetwork;


}
