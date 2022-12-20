package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleDegeri {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");


        System.out.println(driver.getWindowHandles()); //[CDwindow-A4A6573A5E03B931E1A4B67F1C794373]

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");

        System.out.println(driver.getWindowHandles());

        Thread.sleep(3000);
        driver.quit();
    }
}
