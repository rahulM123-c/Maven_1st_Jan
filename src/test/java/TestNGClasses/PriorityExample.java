package TestNGClasses;

import org.testng.annotations.Test;

public class PriorityExample {

@Test(priority = 1)
    public void testMatchZ() {
        System.out.println("Z Test Match");
    }
    @Test(priority = 0)
    public void testMatchY() {
        System.out.println("Y Test Match");
    }
    @Test(priority = -1, groups = "smoke")
    public void testMatchR() {
        System.out.println("R Test Match");
    }
    @Test(priority = 5, description = "This is 5th test match")
    public void testMatchM() {
        System.out.println("M Test Match");
    }
    @Test(priority = 2)
    public void testMatchV() {
        System.out.println("V Test Match");
    }
    @Test(priority = 2)
    public void testMatchA() {
        System.out.println("A Test Match");
    }

}
