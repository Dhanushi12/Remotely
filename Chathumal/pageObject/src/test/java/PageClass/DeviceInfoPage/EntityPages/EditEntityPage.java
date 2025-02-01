package PageClass.DeviceInfoPage.EntityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEntityPage {
    WebDriver driver_One;

    public EditEntityPage(WebDriver driver_Two) {

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }
    @FindBy(xpath = "//div[@id='root']/div[2]/div/ul/div/div/div[2]/div/div/div/li[11]/a")// EntityClick
    @CacheLookup
    public WebElement ClickEntity;

    @FindBy(xpath = "//input[@placeholder ='Filter by Name']")// EntityClick
    @CacheLookup
    public WebElement FilterEntity;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-13ddshk']")// click action button
    @CacheLookup
    public WebElement ActonButton;

    @FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']")// click edit button
    @CacheLookup
    public WebElement EditButton;

    @FindBy(xpath = "//h4[normalize-space()='Edit Entity']")// verify edit button
    @CacheLookup
    public WebElement EditButtonVerify;

    @FindBy(xpath = "//input[@placeholder ='Name']")// verify edit button
    @CacheLookup
    public WebElement Name;

    @FindBy(xpath = "//button[@id='submitButton']")// save button
    @CacheLookup
    public WebElement SaveButton;

    @FindBy(xpath = "//div[@class='notification notification-success notification-enter-done']")// Success message validation
    @CacheLookup
    public WebElement SuccessMessage;
}

