package PageClass.DeviceInfoPage.EntityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteEntityPage {
    WebDriver driver_One;

    public DeleteEntityPage(WebDriver driver_Two) {

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

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Add User'])[1]/following::li[1]")// click delete button
    @CacheLookup
    public WebElement DeleteButton;

    @FindBy(xpath = "//div[@class='modal-header']")// click delete button
    @CacheLookup
    public WebElement Deletepopup;

    @FindBy(xpath = "//button[@class='btn btn-danger']")// click delete icon
    @CacheLookup
    public WebElement Deleteicon;
}
