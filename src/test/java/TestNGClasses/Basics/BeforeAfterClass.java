package TestNGClasses.Basics;

import org.testng.annotations.*;

public class BeforeAfterClass {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeM(){
        System.out.println("Before Method");
    }


    @Test(groups = "smoke")
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
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

}
