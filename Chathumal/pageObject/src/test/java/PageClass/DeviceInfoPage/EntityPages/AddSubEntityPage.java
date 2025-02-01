package PageClass.DeviceInfoPage.EntityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSubEntityPage {
    WebDriver driver_One;

    public AddSubEntityPage(WebDriver driver_Two) {

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }
    @FindBy(xpath = "//div[@id='root']/div[2]/div/ul/div/div/div[2]/div/div/div/li[11]/a")// EntityClick
    @CacheLookup
    public WebElement ClickEntity;

    @FindBy(xpath = "//input[@placeholder='Filter by Name']")// EntityClick
    @CacheLookup
    public WebElement FilterEntity;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-13ddshk']")// click action button
    @CacheLookup
    public WebElement ActonButton;

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Edit'])[1]/following::li[1]")// click sub entity
    @CacheLookup
    public WebElement ClickSubEntity;

    @FindBy(xpath = "//h4[normalize-space()='New Entity']")// click sub entity
    @CacheLookup
    public WebElement VerifySubEntity;
    @FindBy(xpath = "//label[normalize-space()='Parent Entity']")// click pernat entity
    @CacheLookup
    public WebElement VerifyPernatEntity;
}
