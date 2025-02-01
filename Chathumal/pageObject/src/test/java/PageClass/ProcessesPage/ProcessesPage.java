package PageClass.ProcessesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessesPage {
    WebDriver driver_One;

    public ProcessesPage (WebDriver driver_Two){
        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }

    @FindBy(xpath="//a[@resourceid=\"6\"]")
    @CacheLookup
    public WebElement ClickProcesses;

    @FindBy(xpath = "//span[normalize-space()='Processes']")
    @CacheLookup
    public WebElement VerifyProcessesPage;

    @FindBy(xpath = "//input[@id=\"search\"]")// Click Processes
    @CacheLookup
    public WebElement GlobalSearch;

    @FindBy(xpath = "//h4[contains(text(),'Processes')]")// verify Processes
    @CacheLookup
    public WebElement GlobalSearchVerify;

    @FindBy(xpath = "//div[@class=\"border rounded   d-flex align-items-center justify-content-between truncate\"]")// Click Processes
    @CacheLookup
    public WebElement ClickEntity;

    @FindBy(xpath = "//span[normalize-space()='ChampSoft Inc']")// Click Processes
    @CacheLookup
    public WebElement SelectEntity;

    @FindBy(xpath = "//div[@class='border rounded p-2 d-flex align-items-center justify-content-between truncate']")// verify Processes
    @CacheLookup
    public WebElement ClickUsers;

    @FindBy(xpath = "//span[normalize-space()='Remotly']")// Click User
    @CacheLookup
    public WebElement SelectUsers;

    @FindBy(xpath = "//div[@class='border rounded px-2   d-flex align-items-center justify-content-between']")// verify Processes
    @CacheLookup
    public WebElement ClickDevices;

    @FindBy(xpath = "//span[normalize-space()='REMOTLY-L0072-CHAMPSOFT']")// verify Processes
    @CacheLookup
    public WebElement SelectDevices;

    @FindBy(xpath = "//select[@id='device']")// Select Date
    @CacheLookup
    public WebElement SelectDate;

    @FindBy(xpath = "//button[@class='col-md-12 btn btn-primary p-2']")// verify Processes
    @CacheLookup
    public WebElement ApplyFilters;

    @FindBy(xpath = "//div[@class='card-header sub-card-header']")// verify Processes
    @CacheLookup
    public WebElement ViewProcesses;

    @FindBy(xpath = "//input[@id=\":rd:\"]") // Search
    @CacheLookup
    public WebElement SearchByName;

    @FindBy(xpath = "//span[normalize-space()='AnyDesk.exe']")// Search by Name validation
    @CacheLookup
    public WebElement SearchNameValidation;

    @FindBy(xpath = "//input[@id=\":rg:\"]") // Search // Productivity Profile Search
    @CacheLookup
    public WebElement SearchByProductivityStatus;

    @FindBy(xpath = "//span[normalize-space()='Undefined']")// Search by Productivity Profile validation
    @CacheLookup
    public WebElement SearchProductivityStatusValidation;

//    @FindBy(xpath = "//input[@id=\":rj:\"]") // Email Search
//    @CacheLookup
//    public WebElement SearchByApplicationName;
//
//    @FindBy(xpath = "//td[contains(text(),'dhanushika@champitsolutions.com')]")// Search by Email validation
//    @CacheLookup
//    public WebElement SearchByApplicationNameValidation;

    @FindBy(xpath = "//input[@id=\\\":rm:\\\"]") // Search By Started
    @CacheLookup
    public WebElement SearchByStarted;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")// Search by Entity validation
    @CacheLookup
    public WebElement SearchByStartedValidation;

    @FindBy(xpath = "//input[@id=\\\":rq:\\\"]") // Entity Search
    @CacheLookup
    public WebElement SearchByDuration;

    @FindBy(xpath = "//tbody/tr[1]/td[5]")// Search by Entity validation
    @CacheLookup
    public WebElement SearchByDurationValidation;

    @FindBy(xpath = "//input[@id=\\\":rq:\\\"]") // Entity Search
    @CacheLookup
    public WebElement GlobalSearch1;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")// Search by Entity validation
    @CacheLookup
    public WebElement GlobalSearch1Validation;

    @FindBy(xpath = "//input[@class=\"PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3\"]") // Entity Search
    @CacheLookup
    public WebElement ToggleOn;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")// Search by Entity validation
    @CacheLookup
    public WebElement ShowSystemProcessesFilterValidation;
}
