package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExtract {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=syntax+for+link+text+in+selenium+java&rlz=1C1ONGR_enIN1090IN1090&oq=syntax+for+link+text+in+selenium+java&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIHCAEQIRigAdIBCTE2NTI0ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//driver.findElement(By.linkText("How to get a link text in Selenium?")).click();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.partialLinkText("Partial Link Text in Selenium")).click();
	}

}
