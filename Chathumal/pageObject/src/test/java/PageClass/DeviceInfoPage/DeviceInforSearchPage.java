package PageClass.DeviceInfoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeviceInforSearchPage {

    WebDriver driver_One;

    public DeviceInforSearchPage(WebDriver driver_Two){

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two,this);

    }

    @FindBy(xpath = "//a[normalize-space()='Device Info']")// device
    @CacheLookup
    public WebElement ClickDevice;


    @FindBy(xpath = "//span[normalize-space()='Device Info']")// deviceverify
    @CacheLookup
    public WebElement VerifyDevice;

    @FindBy(xpath = "//div[@class='border rounded   d-flex align-items-center justify-content-between truncate']")// deviceverify
    @CacheLookup
    public WebElement clickentity;
    @FindBy(xpath = "//span[normalize-space()='ChampSoft Inc']")// deviceverify
    @CacheLookup
    public WebElement SelectEntity;


    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/span/svg")// user
    @CacheLookup
    public WebElement clickuser;

    @FindBy(xpath = "//span[normalize-space()='L0080-CHAMPSOFT']")// user
    @CacheLookup
    public WebElement user;

    @FindBy(xpath = "//div[@class='border rounded px-2   d-flex align-items-center justify-content-between']")// user
    @CacheLookup
    public WebElement clickenterd;


    @FindBy(xpath = "//span[normalize-space()='UDENI-W']")// devicev
    @CacheLookup
    public WebElement deviceenter;

    @FindBy(xpath = "//button[@class='col-md-12 btn btn-primary p-2']")// apply button
    @CacheLookup
    public WebElement applybutton;

    @FindBy(id = "device")// date
    @CacheLookup
    public WebElement SelectDate;
}
