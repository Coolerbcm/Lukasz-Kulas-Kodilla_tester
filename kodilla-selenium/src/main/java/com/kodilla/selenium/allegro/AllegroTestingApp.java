package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");

        WebElement chooseCategory = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/header/div[1]/div/div/div/form/div[3]/div/select"));
        Select category = new Select(chooseCategory);
        category.selectByIndex(3);

        WebElement decline = driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[2]"));
        decline.click();

        WebElement productField = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/header/div[1]/div/div/div/form/input"));
        productField.sendKeys("mavic mini");
        productField.submit();
    }
}