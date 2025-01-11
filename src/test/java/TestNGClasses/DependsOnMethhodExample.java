package TestNGClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethhodExample {

    @Test
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login Page");
    }


    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage() {
        System.out.println("Verify Home Page");
    }

    @Test(groups = "smoke")
    public void onBoardingPage() {
        System.out.println("Verify Onboarding Page");
    }
}