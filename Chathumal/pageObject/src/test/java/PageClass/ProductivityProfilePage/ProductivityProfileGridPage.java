package PageClass.ProductivityProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductivityProfileGridPage {
    WebDriver driver_One;

    public ProductivityProfileGridPage(WebDriver driver_Two) {

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/ul/div/div[1]/div[2]/div/div/div/li[14]")// Click Productivity
    @CacheLookup
    public WebElement ClickProductivity;

    @FindBy(xpath = "//span[normalize-space()='Productivity profiles']")// verify Productivity
    @CacheLookup
    public WebElement VerifyProductivity;

    @FindBy(xpath = "//button[normalize-space()='New']")// Add new prod
    @CacheLookup
    public WebElement AddNewProductivity;

    @FindBy(xpath = "//h5[@class='modal-title']")// verify Add new prod
    @CacheLookup
    public WebElement VerifyAddNewProductivity;
    @FindBy(id = ":rp:")// global search
    @CacheLookup
    public WebElement GlobalSerch;
    @FindBy(xpath ="//td[normalize-space()='Software Architect']")
    @CacheLookup
    public WebElement GlobalSerchverify;
    @FindBy(id = ":re:")
    @CacheLookup
    public WebElement SearchByName;

    @FindBy(xpath ="//td[normalize-space()='Software Architect']")
    @CacheLookup
    public WebElement SearchBynameVerify;

    @FindBy(id =":rh:")
    @CacheLookup
    public WebElement SearchByProcesse;

    @FindBy(xpath ="//span[@class='MuiBox-root css-69vcag']")
    @CacheLookup
    public WebElement SearchByProcesseVerify;

    @FindBy(id =":rk:")
    @CacheLookup
    public WebElement SearchByUnprodctivity;

    @FindBy(xpath ="//span[@class='MuiBox-root css-69vcag']")
    @CacheLookup
    public WebElement VerifySearchByUnprodctivity;
    @FindBy(xpath ="//tbody/tr[1]/td[4]/button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M6 10c-1.1')]")
    @CacheLookup
    public WebElement ActionButton;

    @FindBy(xpath ="//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']")
    @CacheLookup
    public WebElement EditButton;

    @FindBy(xpath ="//h4[normalize-space()='Software Architect']")
    @CacheLookup
    public WebElement Editverify;

    @FindBy(xpath ="/html/body/div[3]/div[3]/ul/li[2]")
    @CacheLookup
    public WebElement DuplicateButton;

    @FindBy(xpath ="//h5[@class='modal-title']")
    @CacheLookup
    public WebElement DuplicateVerify;

    @FindBy(xpath ="//tbody/tr[1]/td[3]/div[1]/label[3]")
    @CacheLookup
    public WebElement Defult;

    @FindBy(id = "entity")
    @CacheLookup
    public WebElement EntityEnter;

    @FindBy(id = "title")
    @CacheLookup
    public WebElement Name;

    @FindBy(xpath = "//div[@class='notification notification-error notification-enter-done']")
    @CacheLookup
    public WebElement ErooMessage;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    @CacheLookup
    public WebElement savebutton;

    @FindBy(xpath="//tbody/tr[1]/td[4]/button[1]")
    @CacheLookup
    public WebElement ClickAction;

    @FindBy (xpath = "/html[1]/body[1]/div[3]/div[3]/ul[1]/li[2]")
    @CacheLookup
    public WebElement ClickDuplicate;

    @FindBy(id = "title")
    @CacheLookup
    public WebElement DuplicateName;

    @FindBy (xpath = "//button[contains(text(),'Save')]")
    @CacheLookup
    public WebElement ClickSave;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/nav[1]/ol[1]/li[2]/span[1]")
    @CacheLookup
    public WebElement VerifyDuplicate;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    public WebElement GlobalSearchName;

    @FindBy(xpath="//tbody/tr[2]/td[4]/button[1]/*[1]")
    @CacheLookup
    public WebElement ClickAction1;

    @FindBy (xpath = "//body/div[3]/div[3]/ul[1]/li[2]")
    @CacheLookup
    public WebElement ClickRename;

    @FindBy(id = "title")
    @CacheLookup
    public WebElement Rename1;

    @FindBy (xpath = "//button[contains(text(),'Update')]")
    @CacheLookup
    public WebElement ClickUpdate;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/nav[1]/ol[1]/li[2]/span[1]")
    @CacheLookup
    public WebElement VerifyUpdate;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    public WebElement GlobalSearchName1;

    @FindBy(xpath="//tbody/tr[2]/td[4]/button[1]/*[1]")
    @CacheLookup
    public WebElement ClickAction2;

    @FindBy (xpath = "//body/div[4]/div[3]/ul[1]/li[1]")
    @CacheLookup
    public WebElement ClickEdit;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/div[1]")
    @CacheLookup
    public WebElement GlobalSearchName2;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/div[1]/label[4]/span[1]/input[1]")
    @CacheLookup
    public WebElement ClickRadio;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]")
    @CacheLookup
    public WebElement VerifyMessage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    public WebElement GlobalSearchName3;

    @FindBy(xpath="//tbody/tr[1]/td[4]/button[1]/*[1]")
    @CacheLookup
    public WebElement ClickAction3;

    @FindBy (xpath = "/html[1]/body[1]/div[3]/div[3]/ul[1]/li[4]")
    @CacheLookup
    public WebElement ClickDelete;

    @FindBy (xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/h5[1]")
    @CacheLookup
    public WebElement NavPopup;

    @FindBy (xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/button[2]")
    @CacheLookup
    public WebElement ClickYes;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/nav[1]/ol[1]/li[2]/span[1]")
    @CacheLookup
    public WebElement VerifyMessage1;

}
