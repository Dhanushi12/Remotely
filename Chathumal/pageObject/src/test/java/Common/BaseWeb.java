package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseWeb {

    public static WebDriver driver;

    public static Logger logger;

    @BeforeMethod
    public void BrowserSetUp(){



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://qa.remotly.tech/#/login");
        driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.MINUTES);

      driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
       // WebDriverWait wait = new WebDriverWait(driver,60);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }

   @AfterMethod
  public void CloseBrowser(){
   driver.quit();

    }

}
