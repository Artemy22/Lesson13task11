/*
1. Create a new Maven project;
2. Add TestNG dependency and Selenium Web Driver;
3. Add several test classes and 4-5 tests to each class.
4. Write @BeforeTest method where you should create your instance of a
WebDriver.
5. Write @AfterTest method where you should close your browser.
6. Add a testng.xml configuration file.
7. Configure the test suite to run all tests from the first class and only two from the second.
8. Create a @DataProvider method to generate some data for your tests.
9. Add your data provider to any test you wish.
1) You can write your tests for any web site or for your project.
2) You can use dataProvider to generate login information.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
    private WebDriver driver = new ChromeDriver();

    private double generatedNumbsT2() {
        return Math.random();
    }

    @BeforeClass
    public void runDriver() {

        System.setProperty("webdriver.chrome.driver", "/home/artem/IdeaProjects/chromedriver");
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @Test(groups = {"highPriority"})
    public void title1() {
        System.out.println("Test 1");
    }

    @Test(groups = {"highPriority"})
    public void setEmail() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"contact-link\"]")).click();
    }

    @Test(groups = {"lowPriority"})
    public void somethingNew() {
        System.out.println("Test 1");
    }

//    @AfterClass
//    public void closeDr() {
//        driver.close();
//    }

}