package PageClass.DeviceInfoPage.EntityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserEntityPage {
    WebDriver driver_One;

    public AddUserEntityPage(WebDriver driver_Two) {

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }
    @FindBy(xpath = "//div[@id='root']/div[2]/div/ul/div/div/div[2]/div/div/div/li[11]/a")// EntityClick
    @CacheLookup
    public WebElement ClickEntity;

    @FindBy(id = ":rf:")// EntityClick
    @CacheLookup
    public WebElement FilterEntity;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-13ddshk']")// click action button
    @CacheLookup
    public WebElement ActonButton;

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Add Sub Entity'])[1]/following::li[1]")// click adduser
    @CacheLookup
    public WebElement ClickAddUser;
    @FindBy(xpath = "//body//div[@id='root']//div[@class='row']//div[@class='row']//div[1]//label[1]']")// verify adduser
    @CacheLookup
    public WebElement VerifyAddUser;
}
