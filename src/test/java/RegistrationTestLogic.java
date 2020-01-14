/*
завдагння з реестрації переробити використовуючи патерн білдер
завдання покупкою переробити використовуючи патерни пейд обжект пейдж фекторі вебдрайвер менеджер та вебдрайвер фекторі
 */

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTestLogic extends BaseTest {

    private MainPage mainPage;
    private AuthPage authPage;
    private RegistrPage registrPage;


    @BeforeMethod
    public void setupMainPage() {
        mainPage = new MainPage(driver);
        authPage = new AuthPage(driver);
        registrPage = new RegistrPage(driver);
    }

    @Test
    public void sighIn() throws InterruptedException {
        Thread.sleep(1000);
        mainPage.clickSighIn();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        authPage.emailInput("qaqasqa1231@qa.qa");
        authPage.clickSubmitButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        registrPage.customerFirstName("custFirstName");
        registrPage.customerLastName("custLastName");
        registrPage.password("Password123456789");
        registrPage.firstName("Firstname");
        registrPage.lastName("Lastname");
        registrPage.address("myAddress, 123");
        registrPage.city("CityFake");
        registrPage.postCode("12345");
        registrPage.phoneMobile("+380800000000");
        registrPage.alias("FakeAlias");
        registrPage.clickSubmitButton();
    }
}