/*
1. Открыть главную страницу automationpractice.com
2. В поле поиска ввести “Blouse” и выполнить поиск
3. Переключится на режим просмотра ‘List”
4. Добавить товар в корзину
5. В секции Summary увеличить количество товаров на 1
6. Проверить что значения Total для товара , Total products, Total shipping , Total всех товаров , Tax и TOTAL общий отображается корректно
7. Удалить товар из корзины
8. Проверить что корзина пустая
 */

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lesson13task11 {
    private WebDriver driver = new ChromeDriver();

    private void runDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/artem/IdeaProjects/chromedriver");
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @Test
    public void buyCheckQuantity() throws InterruptedException {
        runDriver();
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Blouse");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[2]/span")).click();
        String getPricebyOne = (driver.findElement(By.xpath("//*[@id=\"our_price_display\"]")).getText()).replace("$", "");
        double onePrice = Double.parseDouble(getPricebyOne.trim());
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
        Thread.sleep(5000);

        String getQuantity = driver.findElement(By.xpath("//*[@id=\"layer_cart_product_quantity\"]")).getText();
        double doubleQuantity = Double.parseDouble(getQuantity.trim());
        Assert.assertEquals(2, doubleQuantity, 0.0);
        driver.close();
    }

    @Test
    public void checkTotalProducts() throws InterruptedException {
        runDriver();
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Blouse");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[2]/span")).click();
        String getPricebyOne = (driver.findElement(By.xpath("//*[@id=\"our_price_display\"]")).getText()).replace("$", "");
        double onePrice = Double.parseDouble(getPricebyOne.trim());
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
        Thread.sleep(5000);

        String getTotalProducts = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[1]/span")).getText().replace("$", "");
        double doubleTotalProducts = Double.parseDouble(getTotalProducts.trim());

        Assert.assertEquals(54, doubleTotalProducts, 0.0);
        driver.close();

    }

    @Test
    public void checkShipping() throws InterruptedException {
        runDriver();
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Blouse");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[2]/span")).click();
        String getPricebyOne = (driver.findElement(By.xpath("//*[@id=\"our_price_display\"]")).getText()).replace("$", "");
        double onePrice = Double.parseDouble(getPricebyOne.trim());
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
        Thread.sleep(5000);
        String getTotalShipping = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[2]/span")).getText().replace("$", "");
        double doubleTotalShipping = Double.parseDouble((getTotalShipping.trim()));

        Assert.assertEquals(2, doubleTotalShipping, 0.0);
        driver.close();

    }

    @Test
    public void finalTotal() throws InterruptedException {
        runDriver();
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Blouse");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[2]/span")).click();
        String getPricebyOne = (driver.findElement(By.xpath("//*[@id=\"our_price_display\"]")).getText()).replace("$", "");
        double onePrice = Double.parseDouble(getPricebyOne.trim());
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
        Thread.sleep(5000);

        String getFinalTotal = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[3]/span")).getText().replace("$", "");
        double doubleFinalTotal = Double.parseDouble((getFinalTotal.trim()));
        Assert.assertEquals(56, doubleFinalTotal, 0.0);
        driver.close();
    }

    @Test
    public void emptyTrashCan() throws InterruptedException {
        runDriver();
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Blouse");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[2]/span")).click();
        String getPricebyOne = (driver.findElement(By.xpath("//*[@id=\"our_price_display\"]")).getText()).replace("$", "");
        double onePrice = Double.parseDouble(getPricebyOne.trim());
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"2_7_0_0\"]/i")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).isDisplayed());
        driver.close();

    }
}