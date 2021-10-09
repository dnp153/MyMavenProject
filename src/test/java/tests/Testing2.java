package tests;

import org.testng.annotations.Test;

public class Testing2 {
	@Test(priority = 1)
	  public void test4() {
		  System.out.println("In Test 4");
	  }
	  
	  @Test(priority = 2, groups = {"Smoke", "Sanity"})
	  public void test5() {
		  System.out.println("In Test 5");
	  }
}
