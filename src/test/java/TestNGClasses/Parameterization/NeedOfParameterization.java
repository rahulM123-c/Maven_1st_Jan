package TestNGClasses.Parameterization;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    @Parameters({"cityName", "courseName"})
    @Test
    public void VerifyNeedOfParameterization(String cityName, String courseName) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(cityName +" " + courseName);
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        driver.close();
    }
}