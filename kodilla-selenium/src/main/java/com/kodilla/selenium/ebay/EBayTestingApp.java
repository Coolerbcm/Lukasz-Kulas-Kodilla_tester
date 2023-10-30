package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement inputfield = driver.findElement(By.name("_nkw"));
        inputfield.sendKeys("Laptop");
        inputfield.submit();

    }
}
