package HW_Lesson_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RemoveFromCart {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--blink-settings=imageEnabled=false");

        WebDriver webDriver = WebDriverManager.chromiumdriver().create();
        webDriver.get("https://www.vsemayki.ru/");
        webDriver.manage().window().setSize(new Dimension(1500, 1100));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.findElement(By.xpath(".//div[span[text()='Поцелуй бабочек']]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/li[2]")).click();
        //webDriver.findElement(By.xpath(".//div[li[text()='XS (42)']]")).click();
        webDriver.findElement(By.xpath(".//div[button[text()='Добавить в корзину']]")).click();
        webDriver.findElement(By.xpath(".//div[button[text()='Перейти в корзину']]")).click();
        webDriver.findElement(By.xpath(".//div[span[text()='Удалить товар']]")).click();




    Thread.sleep(5000);
}
}

