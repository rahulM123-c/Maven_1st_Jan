package TestNGClasses.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGMethods {

    public static WebDriver driver;


        @BeforeMethod
        public void PreRequisite() {
            driver = new ChromeDriver();
        }


        @Test
        public void Test_1 () {
            driver.get("https://www.abhibus.com/");

        }
        @Test
            public void TestCase_2() {
            driver.get("https://www.amazon.in/");


        }
    @AfterMethod
    public void teardown(){
            driver.close();

    }

}