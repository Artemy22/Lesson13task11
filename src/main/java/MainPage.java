import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signIn;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public MainPage clickSighIn() {
        signIn.click();
        return this;
    }
}
