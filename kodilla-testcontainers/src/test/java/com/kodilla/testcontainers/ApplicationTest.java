package com.kodilla.testcontainers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.SKIP;

@ExtendWith(NetworkExtension.class)
public class ApplicationTest {

    public Network network;
    public GenericContainer webServer;
    public BrowserWebDriverContainer chrome;

    @BeforeEach
    public void init() {

        network = Network.newNetwork();

        webServer =
                new GenericContainer(
                        new ImageFromDockerfile()
                                .withFileFromClasspath("/tmp/index.html", "index.html")
                                .withDockerfileFromBuilder(builder ->
                                        builder
                                                .from("httpd:2.4")
                                                .copy("/tmp/index.html", "/usr/local/apache2/htdocs")
                                                .build()))
                        .withNetwork(network)
                        .withNetworkAliases("my-server")
                        .withExposedPorts(80);

        chrome =
                new BrowserWebDriverContainer<>()
                        .withNetwork(network)
                        .withRecordingMode(SKIP, null)
                        .withCapabilities(new ChromeOptions());
    }
    @Test
    public void customImageTest() throws IOException, InterruptedException {
//        Thread.sleep(120000);
        RemoteWebDriver driver = chrome.getWebDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlToBe("http://localhost:" + chrome.getMappedPort(80) + "/wd/hub"));

        driver.get("http://my-server/");



        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        String title = driver.findElement(By.id("title")).getText();
        assertEquals("My dockerized web page.", title);
    }
}