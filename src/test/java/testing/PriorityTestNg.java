package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;
//priority
public class PriorityTestNg {
       @Test(priority = -1)
       public void calls() {
    	   Reporter.log("calls",true);
       }
       @Test(priority = 0)
       public void settings() {
    	   Reporter.log("settings",true);
       }
       @Test(priority = 1)
       public void chats() {
    	   Reporter.log("chats",true);
       }
       @Test(priority = -2)
       public void share() {
    	   Reporter.log("shares",true);
       }
}
