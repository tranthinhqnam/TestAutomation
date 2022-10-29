package TestComerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestException;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import java.awt.*;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertNotNull;

public class TestS {

    WebDriver driver;
    JavascriptExecutor jse;

    @Test
    public void Search() throws InterruptedException {

        // Khai bao browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32");
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver =new ChromeDriver();
        //Dieu huong den trang chu
        driver.get("http://125.234.104.133/web_php/gr03/Views/Index.php?Home");
        driver.manage().window().maximize();
        // Click chuot vao element SHOP
        driver.findElement(By.partialLinkText("SHOP")).click();
        sleep(2000);
        driver.findElement(By.name("action")).click();
        sleep(2000);
        driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[4]/form[1]/input[4]")).click();
        sleep(2000);
        driver.findElement(By.name("update")).click();
        sleep(2000);
        driver.findElement(By.xpath("//button[@id='btn2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btn_ok")).click();
        Thread.sleep(2000);
        // Chon Ok khi alert hien ra
        driver.findElement(By.xpath("//a[@id='btn_ok']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("tranvthinhpool");
        driver.findElement(By.name("password")).sendKeys("vanthinh.123");
        driver.findElement(By.id("btnsignin")).click();
        WebElement listt =driver.findElement(By.xpath("//tbody/tr[2]/td[3]"));
        assertNotNull(listt);
        driver.close();
    }

    @Test
    public void search_Product() throws InterruptedException {
        // Khai bao browser

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32");
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        //Dieu huong den trang chu

        driver.get("http://125.234.104.133/web_php/gr03/Views/Index.php?Home");
        driver.manage().window().maximize();
        //Click vao icon tim kiem
        driver.findElement(By.cssSelector("div.container-fluid:nth-child(2) div.row.header:nth-child(2) nav.navbar.nav-icon.navbar-expand-lg.navbar-expand-md:nth-child(4) div.collapse.navbar-collapse ul.navbar-nav li.nav-item:nth-child(1) a.nav-link > i.fas.fa-search")).click();
        //Nhập T-shirt TUV vào ô tìm kiếm
        Thread.sleep(2000);
        driver.findElement(By.className("search_box")).sendKeys("T_shirt");
        driver.findElement(By.xpath("//input[@id='go']")).sendKeys(Keys.ENTER);
        WebElement search =driver.findElement(By.xpath("//h3[contains(text(),'T-shirt TUV')]"));
        assertNotNull(search);


    }


    @Test
    public void deleteProduct() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32");
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        //Dieu huong den trang chu
        driver.get("http://125.234.104.133/web_php/gr03/Views/Index.php?Home");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("SHOP")).click();
        sleep(2000);
        driver.findElement(By.name("action")).click();
        sleep(2000);
        driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[4]/form[1]/input[4]")).click();
        sleep(2000);
      //  driver.findElement(By.name("update")).click();
        sleep(2000);
       driver.findElement(By.cssSelector(".bi")).click();
        sleep(2000);
        WebElement product_left = driver.findElement(By.xpath("//p[contains(text(),'There are 0 products in the cart')]"));
        assertNotNull(product_left);
        driver.quit();
    }
}







