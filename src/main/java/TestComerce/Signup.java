package TestComerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.junit.Assert.assertNotNull;
import static java.lang.Thread.sleep;

public class Signup {

    @Test
    public void testE() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32");
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver =new ChromeDriver();
        driver.get("http://125.234.104.133/web_php/gr03/Views/Index.php?Home");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/nav[2]/div[1]/ul[1]/li[3]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("tranvthinhpool");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("vanthinh.123");
        Thread.sleep(1000);
        //driver.findElement(By.id("btnsignin")).click();
        driver.findElement(By.id("btnsignin")).click();
        WebElement  profile =driver.findElement(By.xpath("//div[contains(text(),'MY ACCOUNT')]"));
        assertNotNull(profile);
        driver.close();
    }
    @Test
    public void testTypePro () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32");
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver =new ChromeDriver();
        driver.get("http://125.234.104.133/web_php/gr03/Views/Index.php?Home");
        driver.manage().window().maximize();
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
        driver.close();
        }
     @Test
    public void testtitle(){

         System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32");
         WebDriverManager.chromedriver().setup();
         WebDriver driver;
         driver =new ChromeDriver();
         driver.get("http://125.234.104.133/web_php/gr03/Views/Index.php?Home");
         driver.manage().window().maximize();
         String expectedTitle = "HNT - Style";
         String actualTitle =driver.getTitle();
         System.out.println("The title of wed :" + actualTitle);
         Assert.assertEquals(actualTitle, expectedTitle);
         driver.close();
    }


};
