package PageClass.DevicePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeviceSearchPage {
    WebDriver driver_One;

    public DeviceSearchPage(WebDriver driver_Two) {

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ul/div/div[1]/div[2]/div/div/div/li[13]/a")// EntityDevice
    @CacheLookup
    public WebElement ClickDevice;

    @FindBy(xpath = "//input[@placeholder='Filter by Name']")// SearchBy name
    @CacheLookup
    public WebElement ByName;

    @FindBy(xpath = "//span[normalize-space()='94-CHAMPSOFT']")// Verify name
    @CacheLookup
    public WebElement VerifyName;

    @FindBy(xpath = "//input[@placeholder='Filter by Description']")// SearchBy description
    @CacheLookup
    public WebElement Description;

    @FindBy(xpath = "//span[normalize-space()='Microsoft Windows 11 Home Single Language Standalone Workstation']")// Verify description
    @CacheLookup
    public WebElement VerifyDescription;

    @FindBy(xpath = "//input[@placeholder='Filter by Entity Name']")// SearchBy ENTITY
    @CacheLookup
    public WebElement ByEntity;

    @FindBy(xpath = "//span[normalize-space()='ChampSoft']")// Verify description
    @CacheLookup
    public WebElement VerifyEntity;

    @FindBy(xpath = "//input[@placeholder='Filter by Users']")// SearchBy User
    @CacheLookup
    public WebElement ByUser;

    @FindBy(xpath = "//span[normalize-space()='Udeni']")// Verify user
    @CacheLookup
    public WebElement VerifyUser;

    @FindBy(xpath = "//input[@placeholder='Filter by Device Type']")// SearchBy type
    @CacheLookup
    public WebElement ByType;

    @FindBy(xpath = "//span[normalize-space()='Laptop']")// Verify type
    @CacheLookup
    public WebElement VerifyType;

    @FindBy(xpath = "//input[@placeholder='Filter by Last Activity']")// SearchBy last a
    @CacheLookup
    public WebElement ByLastActivity;

    @FindBy(xpath = "//span[normalize-space()='PM']")// Verify lasta
    @CacheLookup
    public WebElement VerifyLastActivity;

}
