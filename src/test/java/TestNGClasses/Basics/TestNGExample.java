package TestNGClasses.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {

@Test
    public void testcase_1() {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.abhibus.com/");
    System.out.println("hello new world");

    driver.close();
}

    @Test
    public void testcase_2() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.abhibus.com/");
        System.out.println("It's Friday");
        driver.close();




    }

}
