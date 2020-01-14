import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrPage {

    @FindBy(xpath = "//*[@id=\"customer_firstname\"]")  // Done
    private WebElement customerFirstNameInput;

    @FindBy(xpath = "//*[@id=\"customer_lastname\"]")  // Done
    private WebElement customerLastNameInput;

    @FindBy(xpath = "//*[@id=\"passwd\"]")  // Done
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"firstname\"]")  // Done
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@id=\"lastname\"]")  // Done
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id=\"address1\"]")  // Done
    private WebElement address1Input;

    @FindBy(xpath = "//*[@id=\"city\"]")  // Done
    private WebElement cityInput;

    @FindBy(xpath = "//*[@id=\"postcode\"]")  // Done
    private WebElement postcodeInput;

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")  // Done
    private WebElement phoneMobileInput;

    @FindBy(xpath = "//*[@id=\"alias\"]")  // Done
    private WebElement aliasInput;

    @FindBy(xpath = "//*[@id=\"submitAccount\"]")
    private WebElement submitButton;

    public RegistrPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public RegistrPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public RegistrPage customerFirstName(String custFirstName) {
        customerFirstNameInput.sendKeys(custFirstName);
        return this;
    }

    public RegistrPage customerLastName(String custLastName) {
        customerLastNameInput.sendKeys(custLastName);
        return this;
    }

    public RegistrPage password(String passwordS) {
        passwordInput.sendKeys(passwordS);
        return this;
    }

    public RegistrPage firstName(String FirstName) {
        firstNameInput.sendKeys(FirstName);
        return this;
    }

    public RegistrPage lastName(String LastName) {
        lastNameInput.sendKeys(LastName);
        return this;
    }

    public RegistrPage address(String addressI) {
        address1Input.sendKeys(addressI);
        return this;
    }

    public RegistrPage city(String cityI) {
        cityInput.sendKeys(cityI);
        return this;
    }

    public RegistrPage postCode(String pCode) {
        postcodeInput.sendKeys(pCode);
        return this;
    }

    public RegistrPage phoneMobile(String phoneMob) {
        phoneMobileInput.sendKeys(phoneMob);
        return this;
    }

    public RegistrPage alias(String aliasI) {
        aliasInput.sendKeys(aliasI);
        return this;
    }

}