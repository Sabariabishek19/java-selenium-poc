package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

//skip the test case
public class InvocationSkipTestNg {
	 @Test(priority = 1,invocationCount = 5)
     public void calls() {
  	   Reporter.log("calls",true);
     }
     @Test(invocationCount = 3,enabled =false)
     public void settings() {
  	   Reporter.log("settings",true);
     }
     @Test(priority = -1,invocationCount = 3)
     public void chats() {
  	   Reporter.log("chats",true);
}

}
