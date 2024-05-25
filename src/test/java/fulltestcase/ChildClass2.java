package fulltestcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChildClass2 extends BaseClass {
	@Test
	public void tc2() {
		driver.findElement(By.className("_1wE2Px")).click();
	}

}
