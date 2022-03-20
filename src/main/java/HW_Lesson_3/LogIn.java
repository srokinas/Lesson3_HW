package HW_Lesson_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LogIn {

    public static void main(String[] args) throws InterruptedException {
       ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("--blink-settings=imageEnabled=false");

        WebDriver webDriver = WebDriverManager.chromiumdriver().create();
        webDriver.get("https://www.vsemayki.ru/");
        webDriver.manage().window().setSize(new Dimension(1500, 1100));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //#1
        webDriver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div[2]/div/div[5]/div ")).click();

        WebElement authPopup = webDriver.findElement(By.xpath("//div[@class='modal-content']"));
        authPopup.findElement(By.name("login")).sendKeys("svetlana.srokina@mail.ru");
        authPopup.findElement(By.name("pass")).sendKeys("Qwerty_123");
        //authPopup.findElement(By.cssSelector("div.recaptcha-checkbox-border")).click();
        authPopup.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/button[1]")).click();

        Thread.sleep(5000);

        webDriver.quit();

    }
}