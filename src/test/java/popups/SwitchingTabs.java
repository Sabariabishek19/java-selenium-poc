package popups;
//child browser popup

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		//Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		//Thread.sleep(3000);
		driver.switchTo().window(parent);
		//Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("java");
		//Thread.sleep(3000);
		driver.quit();
	}

}
