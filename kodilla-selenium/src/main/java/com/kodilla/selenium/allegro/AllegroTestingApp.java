package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get("https://allegro.pl/");

        Thread.sleep(2335);
        WebElement decline = driver.findElement(By.cssSelector("[data-role='reject-rodo']"));
        decline.click();

        Thread.sleep(3634);
        WebElement chooseCategory = driver.findElement(By.cssSelector("select[data-role='filters-dropdown-toggle']"));
        Select category = new Select(chooseCategory);
        category.selectByIndex(3);

        Thread.sleep(4213);
        WebElement productField = driver.findElement(By.cssSelector("[data-role='search-input']"));
        productField.sendKeys("mavic mini");
        productField.submit();
        Thread.sleep(4543);

        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));
         if (!elements.isEmpty()) {
             WebElement element = elements.get(0);
             String productInfo = element.getText();
             System.out.println("Product information: " + productInfo);
             } else {
             System.out.println("List is empty");
         }
    }
}
