package TestNGClasses.Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    @BeforeMethod
    public void beforeM(){
        System.out.println("Before Method");
    }


    @Test (description = "verify test case one")
    public void demo1(){
        System.out.println("test1");
    }

    @Test
    public void demo2(){
        System.out.println("test2");
    }
    @Test
    public void demo3(){
        System.out.println("test3");
    }
    @AfterMethod
    public void afterM(){
        System.out.println("After Method");
    }

}
