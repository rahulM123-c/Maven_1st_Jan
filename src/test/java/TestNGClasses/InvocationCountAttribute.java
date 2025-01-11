package TestNGClasses;

import org.testng.annotations.Test;

public class InvocationCountAttribute {

@Test(invocationCount = 10, invocationTimeOut = 1)
public void testCaseRun() {
    System.out.println("Run this test case");
}
}
