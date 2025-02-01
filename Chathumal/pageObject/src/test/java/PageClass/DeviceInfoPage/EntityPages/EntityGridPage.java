package PageClass.DeviceInfoPage.EntityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntityGridPage {

    WebDriver driver_One;

    public EntityGridPage(WebDriver driver_Two) {

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }
    @FindBy(xpath = "//div[@id='root']/div[2]/div/ul/div/div/div[2]/div/div/div/li[11]/a")// EntityClick
    @CacheLookup
    public WebElement ClickEntity;

    @FindBy(xpath = "//input[@placeholder='Filter by Name']")// First
    @CacheLookup
    public WebElement FilterEntity;

    @FindBy(xpath= "//span[@class='MuiBox-root css-69vcag']")// verifyFirst
    @CacheLookup
    public WebElement VerifyFilterEntity;

    @FindBy(xpath = "//input[@placeholder='Filter by Type']")// type
    @CacheLookup
    public WebElement Type;

    @FindBy(id = "//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-1be1d0b']")// type
    @CacheLookup
    public WebElement verifyType;

    @FindBy(xpath = "//input[@placeholder='Filter by Total Users']")// totaluserCount
    @CacheLookup
    public WebElement TotalUserCount;
    @FindBy(id = "//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-12d9iey']")// verifytotaluserCount
    @CacheLookup
    public WebElement VerifyUserCount;

    @FindBy(xpath = "//input[@placeholder='Filter by ']")// totaluserCount
    @CacheLookup
    public WebElement TotalEntityCount;
    @FindBy(id = "//span[@class='MuiBox-root css-69vcag']")// verifytotaluserCount
    @CacheLookup
    public WebElement VerifyEntityCount;
}

