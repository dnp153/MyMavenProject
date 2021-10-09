package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
  //Create new user test@test.com
  @Test(priority = 1)
  public void createUser() {
	  System.out.println("I am in home test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(3>4, "Verifying Element"); // We use regular assert in industry.
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
  //Edit user test@test.com
  @Test(priority = 2, dependsOnMethods = "createUser", groups = "Smoke")
  public void editUser() {
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(3>4, "Verifying Element");
	  System.out.println("After Assertion");
	  softAssert.assertAll(); //similar to error collector in Junit.
  }
  
  //Delete user test@test.com
  @Test(priority = 3, dependsOnMethods = "editUser")
  public void deleteUser() {
	  System.out.println("I am in end test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(3>4, "Verifying Element"); // We use regular assert in industry.
	  System.out.println("After Assertion");
	  softAssert.assertEquals("abc1", "abc");
	  System.out.println("After second Assertion");
	  softAssert.assertAll();
  }
  
  
}
