package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStoreSearch {
    @FindBy(id = "searchField")
    WebElement textField;

    //WebDriver driver;

    @FindBy(css = "section>div>div")
    private List<WebElement> elements;

    public KodillaStoreSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public boolean numberOfResultIsEqualTo(int length) {
        return length == elements.size();
    }
}
