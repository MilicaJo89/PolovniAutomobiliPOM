package UtilClass;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class Methods{

    public static WebDriverWait wait;

    public static WebDriver driver;


    String FilePath = "C:\\Users\\milicaj\\IdeaProjects\\PolovniAutomobiliPOM\\src\\test\\java\\UtilClass\\Data.properties";


    public static final Logger logger = Logger.getLogger("MyLogger");



    public static String generateemail() {
        int min = 1;
        int max = 1000000;
        int b = (int) (Math.random() * (max - min + 1) + min);
        String s = "tinaturner90" + "+" + b + "@protonmail.com";
        System.out.println(s);
        return s;
    }

    public void hover(By xpath) {
        WebElement hoverable = driver.findElement(xpath);
        new Actions(driver).moveToElement(hoverable).perform();
    }

    public void type(By textbox, String text) {
        WebElement password = driver.findElement(textbox);
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys(text);
    }

    public void clickonElement(By xpath) {
        try {
            wait.until(visibilityOf(driver.findElement(xpath))).click();
        } catch (Exception e) {
            wait.until(presenceOfElementLocated(xpath)).click();
        }
    }

    public void elementIsPresent(By xpath) {
        wait.until(visibilityOf(driver.findElement(xpath))).isDisplayed();
    }


    public void switchpages() {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(2));
    }

    public WebDriver setup() {
        System.setProperty("webdriver.geckodriver", "\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        driver = new FirefoxDriver();
        driver.get("https://www.polovniautomobili.com");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        return driver;
    }


    public void scrollIntoView(By xpath) {
        WebElement element = driver.findElement(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getFromProperties(String property) throws IOException {
        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream(FilePath);
        prop.load(ip);
        String item = prop.getProperty(property);
        ip.close();
        prop.clear();
        return item;
    }

    @AfterMethod
    public void failTakeScreenshot(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotfile, new File("C:\\Users\\milicaj\\Pictures\\Screenshots\\Failtest.png"));
        }
    }
}