package PageClass.UserPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
    WebDriver driver_One;

    public AddUserPage(WebDriver driver_Two){

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two, this);
    }
    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/ul[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/li[12]/a[1]") //Click on Users
    @CacheLookup
    public WebElement ClickUser;

    @FindBy(xpath = "//h4[contains(text(),'Users')]") //Navigate to Users section
    @CacheLookup
    public WebElement navValidation;

    @FindBy(xpath = "//button[@class='btn btn-primary col-12 pull-right']") //click on new button
    @CacheLookup
    public WebElement ClickNewButton;

    @FindBy(id = "firstName") //First name
    @CacheLookup
    public WebElement EnterFirstName;

    @FindBy(id = "lastName") //Last name
    @CacheLookup
    public WebElement EnterLastName;

    @FindBy(id = "roleType") // Role
    @CacheLookup
    public WebElement SelectRole;

    @FindBy(id = "emailAddress") //Email
    @CacheLookup
    public WebElement EnterEmail;

    @FindBy(id = "accountStatus") // Account Status
    @CacheLookup
    public WebElement SelectAccountStatus;

    @FindBy(xpath = "//select[@id='entityType']") // Entity Type
    @CacheLookup
    public WebElement SelectEntity;

    @FindBy(xpath = "//body/div[@id='root']/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]") // TimeZone
    @CacheLookup
    public WebElement SelectTimeZone;

    @FindBy(xpath = "//div[@class='select__control css-13cymwt-control']") // TimeZone
    @CacheLookup
    public WebElement ClickTime;

    @FindBy(xpath = "//div[@id='react-select-2-option-1']") // TimeZone
    @CacheLookup
    public WebElement SelectTime;

    @FindBy(id = "occupation") // Productivity Profile
    @CacheLookup
    public WebElement SelectProductivityProfile;

    @FindBy(xpath = "//button[contains(text(),'Save')]")// save button
    @CacheLookup
    public WebElement ClickSave;

    @FindBy(xpath = "//div[normalize-space()='Please enter a name.']")// name validation
    @CacheLookup
    public WebElement NameValidation;

    // @FindBy(id = ":r4f:") // GlobalSearch
//    @CacheLookup
//    public WebElement ClickGlobalSearch;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]") // GlobalSearch
    @CacheLookup
    public WebElement ClickGlobalSearch;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/span[1]/div[1]")// Search validation
    @CacheLookup
    public WebElement SearchValidation;

//    @FindBy(id = ":r47:") // GlobalSearch
//    @CacheLookup
//    public WebElement SearchByName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]") // Global Search
    @CacheLookup
    public WebElement SearchByName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]")// Search by Name validation
    @CacheLookup
    public WebElement SearchNameValidation;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]") // Email Search
    @CacheLookup
    public WebElement SearchByEmail;

    @FindBy(xpath = "//td[contains(text(),'dhanushika@champitsolutions.com')]")// Search by Email validation
    @CacheLookup
    public WebElement SearchEmailValidation;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[4]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]") // Productivity Profile Search
    @CacheLookup
    public WebElement SearchByProductivityProfile;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[4]")// Search by Productivity Profile validation
    @CacheLookup
    public WebElement SearchProductivityProfileValidation;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[5]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]") // Entity Search
    @CacheLookup
    public WebElement SearchByEntity;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[5]/div[1]/span[1]")// Search by Entity validation
    @CacheLookup
    public WebElement SearchEntityValidation;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[6]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]") // Activity Search
    @CacheLookup
    public WebElement SearchByActivity;

    @FindBy(xpath = "//tbody/tr[2]/td[6]/div[1]/div[1]")// Search by Activity validation
    @CacheLookup
    public WebElement SearchActivityValidation;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[7]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]") // Activity Search
    @CacheLookup
    public WebElement SearchByStatus;

    @FindBy(xpath = "//tbody/tr[6]/td[7]/div[1]/div[1]/span[1]/span[1]")// Search by Activity validation
    @CacheLookup
    public WebElement SearchStatusValidation;

    @FindBy(xpath = "//span[@class='cursor-pointer']") // Click On Name Hyperlink (First span of the page, catching first name)
    @CacheLookup
    public WebElement ClickOnName;

    @FindBy(xpath = "//span[normalize-space()='Productivity']")// Navigate Productivity Page Validation
    @CacheLookup
    public WebElement NavigateProductivityPageValidation;

//    @FindBy(xpath = "//span[@class='cursor-pointer']") // Click On Entity Hyperlink
//    @CacheLookup
//    public WebElement ClickOnEntity;

//    @FindBy(xpath = "//div[@class='MuiBox-root css-rvp98e']//span[contains(text(),'Champsoft Pvt.Ltd')]") // Click On Entity Hyperlink
//    @CacheLookup
//    public WebElement ClickOnEntity;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]") // Click On Entity Hyperlink
    @CacheLookup
    public WebElement SearchByName1;

    @FindBy(xpath = "//span[normalize-space()='Champsoft Pvt.Ltd']") // Click On Entity Hyperlink
    @CacheLookup
    public WebElement ClickOnEntity;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/nav[1]/ol[1]/li[2]/a[1]/span[1]")// Navigate Entity Page Validation
    @CacheLookup
    public WebElement NavigateEntityPageValidation;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[3]/span[1]/*[1]") // Click On Screenshot Icon
    @CacheLookup
    public WebElement ClickOnScreenshotIcon;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/h4[1]")// Navigate Entity Page Validation
    @CacheLookup
    public WebElement NavigateScreenshotPageValidation;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[3]/span[2]/*[1]") // Click On Network Icon
    @CacheLookup
    public WebElement ClickOnNetworkIcon;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]")// Navigate Network Page Validation
    @CacheLookup
    public WebElement NavigateNetworkPageValidation;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[3]/span[3]/*[1]") // Click On Processes Icon
    @CacheLookup
    public WebElement ClickOnProcessesIcon;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]")// Navigate Processes Page Validation
    @CacheLookup
    public WebElement NavigateProcessesPageValidation;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[3]/span[4]/*[1]") // Click On Device Information Icon
    @CacheLookup
    public WebElement ClickOnDeviceInformationIcon;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]")// Navigate Device Information Page Validation
    @CacheLookup
    public WebElement NavigateDeviceInformationPageValidation;

    @FindBy(xpath = "//tbody/tr[1]/td[8]/button[1]/*[1]") // Click On Row Actions
    @CacheLookup
    public WebElement ClickOnRowActions;

    @FindBy(xpath = "//body/div[3]/div[3]/ul[1]/li[1]") // Click On View Option
    @CacheLookup
    public WebElement ClickOnViewOption;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]")// Navigate Personal Information Page Validation
    @CacheLookup
    public WebElement NavigatePersonalInformationPageValidation;

    @FindBy(xpath = "//tbody/tr[1]/td[8]/button[1]/*[1]") // Click On Row Actions 2
    @CacheLookup
    public WebElement ClickOnRowActions1;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/ul[1]/li[2]") // Click On Edit Option
    @CacheLookup
    public WebElement ClickOnEditOption;

    @FindBy(xpath = "//span[normalize-space()='Edit User']")// Navigate Edit Page Validation
    @CacheLookup
    public WebElement NavigateEditUserPageValidation;

    @FindBy(xpath = "//tbody/tr[1]/td[8]/button[1]/*[1]") // Click On Row Actions 3
    @CacheLookup
    public WebElement ClickOnRowActions2;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/ul[1]/li[3]") // Click On Reset Password Option
    @CacheLookup
    public WebElement ClickOnResetPasswordOption;

    @FindBy(xpath = "//h5[@class='modal-title']")// Navigate Reset Password Popup Validation
    @CacheLookup
    public WebElement NavigateResetPasswordPopupValidation;

    @FindBy(xpath = "//tbody/tr[1]/td[8]/button[1]/*[1]") // Click On Row Actions
    @CacheLookup
    public WebElement ClickOnRowActions3;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/ul[1]/li[4]") // Click On Delete User
    @CacheLookup
    public WebElement ClickOnDeleteUser;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/h5[1]")// Navigate Delete User Popup Validation
    @CacheLookup
    public WebElement NavigateDeleteUserPopupValidation;
}

