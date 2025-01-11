package TestNGClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = {"Smoke"})
    public void addPayeeInAccount() {
        Assert.assertTrue(false);
        System.out.println("Add Payee Successfully");
    }
    @Test(dependsOnGroups = {"Smoke"})
    public void fundTransfer(){
        System.out.println("Transfer Fund Successfully");
    }
    @Test
    public void cashBackCredit(){
        System.out.println("Cashback credited Successfully");
    }
}
