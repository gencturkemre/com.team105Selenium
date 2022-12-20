package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        bu dörtlü Her test metodu başına yazılacaktır.
        implicitlyWait gittiğimiz sayfa acılıncaya veya aradıgımız webelement bulununcaya kadar
              driver'in bekleyebılecegı maxımım sureyi belirler

         Hemen mevcut değilse, bir öğe ararken sürücünün beklemesi gereken süreyi belirtir.
        */


        Thread.sleep(3000);
        driver.quit();
    }
}
