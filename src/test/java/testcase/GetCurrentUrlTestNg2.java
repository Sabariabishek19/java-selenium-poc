package testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetCurrentUrlTestNg2 {
	 @Test
     public void tc1(){
    	 WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.linkedin.com/feed/");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		
 		Reporter.log(driver.getCurrentUrl(),true);
    	 
 		driver.quit();
}
}
