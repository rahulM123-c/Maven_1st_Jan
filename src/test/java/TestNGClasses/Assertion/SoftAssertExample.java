package TestNGClasses.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test(description = "verify bmw radio button, check practice page text, enable button")
    public void VerifySoftAssert() {
        SoftAssert ast = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        WebElement practicePage = driver.findElement(By.xpath("//h1[text()= 'Practice Page']"));
        WebElement enableBtn = driver.findElement(By.id("enabled-example-input"));

        ast.assertFalse(bmwRadioBtn.isSelected(), "bmwRadioBtn shouldn't be selected by default");
        ast.assertEquals(practicePage.getText(), "Practice Page", "Practice Page text should be visible");
        ast.assertTrue(enableBtn.isDisplayed(), "enable Textbox should be enable");

        ast.assertAll();
        driver.close();

    }


    }

