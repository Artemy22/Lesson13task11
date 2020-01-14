import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver(DriverType.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @AfterMethod
    public void cleanup() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}