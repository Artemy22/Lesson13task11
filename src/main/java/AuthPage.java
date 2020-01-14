import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage {

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    private WebElement accountCreateButton;

    public AuthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public AuthPage emailInput(String emailUnique) {
        emailInput.sendKeys(emailUnique);
        return this;
    }

    public AuthPage clickSubmitButton() {
        accountCreateButton.click();
        return this;
    }
}
