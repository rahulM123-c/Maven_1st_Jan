package TestNGClasses.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

    @Test(description = "verify bmw radio button, check practice page text, enable button")
    public void VerifyPracticePage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        WebElement practicePage = driver.findElement(By.xpath("//h1[text()= 'Practice Page']"));
        WebElement enableBtn = driver.findElement(By.id("enabled-example-input"));

        Assert.assertFalse(bmwRadioBtn.isSelected(), "bmwRadioBtn shouldn't be selected by default");
        Assert.assertEquals(practicePage.getText(), "Practice Page", "Practice Page text should be visible");
        Assert.assertTrue(enableBtn.isDisplayed(), "enable Textbox should be enable");

        driver.close();

    }
}
