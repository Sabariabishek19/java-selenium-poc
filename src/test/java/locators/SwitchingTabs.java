package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//Locators
public class SwitchingTabs {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("sabariabishek19@gmail.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.xpath("//strong[text()='Access Modifier']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,850)", "");
		
		driver.findElement(By.xpath("path[dl=\"M0,0l15,0l0,15l-15,0Z\"]")).click();
		//driver.close();
		

	}

}
