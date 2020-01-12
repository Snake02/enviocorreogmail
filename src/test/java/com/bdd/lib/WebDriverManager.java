package com.bdd.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class WebDriverManager {

    public static WebDriver setCustomDriver(String browser){

        System.out.println("Ejecutando en: "+browser);
        System.out.println("setCustomDriver");
        File file;
        WebDriver webDriver = null;

        if ("chrome".equals(browser)) {
            ChromeOptions options = new ChromeOptions();
            file = new File("driver/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            webDriver = new ChromeDriver(options);
        } else if ("iexplorer".equals(browser)) {
            file = new File("driver/IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            webDriver = new InternetExplorerDriver();
            // webDriver.manage().window().maximize();
        }

        return webDriver;

    }

}
