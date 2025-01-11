import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenExample {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.27.0");
driver.close();
    }
}
