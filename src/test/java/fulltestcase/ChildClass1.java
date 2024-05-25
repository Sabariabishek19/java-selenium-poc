package fulltestcase;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChildClass1 extends BaseClass{
	@Test
	public void tc1() {
		driver.findElement(By.className("_3RX0a-")).click();
	}
	//Reporter.log(driver.getCurrentUrl(),true);
	
}
