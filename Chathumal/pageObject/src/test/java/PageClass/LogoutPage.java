package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    WebDriver driver_One;

    public LogoutPage(WebDriver driver_Two){

        driver_One = driver_Two;
        PageFactory.initElements(driver_Two,this);

    }

    @FindBy(xpath = "//div[@class='border rounded-full w-8 h-8 d-flex align-items-center justify-centent-center ms-2 mb-2']")
    @CacheLookup
    public WebElement ClickArrow;

    @FindBy(xpath = "//a[@class='dropdown-item text-danger']")
    @CacheLookup
    public WebElement Logout;

    @FindBy(xpath = "//h5[normalize-space()='Welcome']")
    @CacheLookup
    public WebElement logvalidate;

//    public void logout (){
//        ClickArrow.click();
//        Logout.click();
//    }


}
