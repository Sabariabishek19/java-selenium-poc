package testing;
//testNG
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterTestNg {
         @Test
         public void demo() {
        	 Reporter.log("hello",true);
        	 Reporter.log("selenium",false);
         }
}
