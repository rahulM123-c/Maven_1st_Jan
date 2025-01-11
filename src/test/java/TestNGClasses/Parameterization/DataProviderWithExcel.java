package TestNGClasses.Parameterization;

import com.google.common.collect.Table;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*public class DataProviderWithExcel {

    @DataProvider(name = "test-data")
    public Object[][] dataFun() throws IOException {                              // return type is always in Array when we use @DataProvider before any method

        Object[][] arrObj = getExcelData("C:\\Users\\91898\\OneDrive\\Desktop", "TestCase");
        return arrObj;
        }

        public String[][] getExcelData(String fileName, String sheetName) throws IOException {
            FileInputStream file = new FileInputStream(fileName);         // normal file acces
            XSSFWorkbook wb = new XSSFWorkbook(file);          //excel file access
            XSSFSheet sheet = wb.getSheet(sheetName);
            XSSFRow row = sheet.getRow(0);
            int noOfRow = sheet.getPhysicalNumberOfRows();
            int noOfCol = row.getLastCellNum();
            Cell cell;

            String[][] data = new String[noOfRow - 1][noOfCol];

            for (int i = 1; i < noOfRow - 1; i++) {
                for (int j = 0; i < noOfCol; j++) ;
                {

                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();

                }
            }
            return data;
        }

    @Test(dataProvider = "test-data")
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
}*/