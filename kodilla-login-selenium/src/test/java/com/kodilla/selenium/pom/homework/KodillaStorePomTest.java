package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

class KodillaStorePomTest {

        KodillaStoreSearch storeSearch;

        WebDriver driver;

        @BeforeEach
        public void setup() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);
            driver.navigate().to("https://kodilla.com/pl/test/store");
            storeSearch = new KodillaStoreSearch(driver);
        }
        @AfterEach
        public void testDown() {
            driver.close();
        }
        @Test
    public void searchForNoteBook() throws InterruptedException {
            storeSearch.textField.sendKeys("Notebook");
            assertTrue(storeSearch.numberOfResultIsEqualTo(2));
        }
    @Test
    public void searchForSchool() throws InterruptedException {
        storeSearch.textField.sendKeys("School");
        assertTrue(storeSearch.numberOfResultIsEqualTo(1));
    }
    @Test
    public void searchForBrand() throws InterruptedException {
        storeSearch.textField.sendKeys("Brand");
        assertTrue(storeSearch.numberOfResultIsEqualTo(1));
    }
    @Test
    public void searchForBusiness() throws InterruptedException {
        storeSearch.textField.sendKeys("Business");
        assertTrue(storeSearch.numberOfResultIsEqualTo(0));
    }
    @Test
    public void searchForGaming() throws InterruptedException {
        storeSearch.textField.sendKeys("Gaming");
        assertTrue(storeSearch.numberOfResultIsEqualTo(1));
    }
    @Test
    public void searchForPowerful() throws InterruptedException {
        storeSearch.textField.sendKeys("Powerful");
        assertTrue(storeSearch.numberOfResultIsEqualTo(0));
    }
    @Test
    public void searchForNoteBookWithAllCapitalLetters() throws InterruptedException {
        storeSearch.textField.sendKeys("NOTEBOOK");
        assertTrue(storeSearch.numberOfResultIsEqualTo(2));
    }
    @Test
    public void searchForNoteBookWithAllLowerCase() throws InterruptedException {
        storeSearch.textField.sendKeys("notebook");
        assertTrue(storeSearch.numberOfResultIsEqualTo(2));
    }
}