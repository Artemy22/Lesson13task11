import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
    WebDriverFactory() {
    }
    public static WebDriver getDriver(DriverType type) {

        switch (type) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

            case IE:
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();

            default:
                throw new IllegalArgumentException("No implementation for provided driver type");
        }
    }
}