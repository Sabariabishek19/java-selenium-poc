package locators;
//css selector
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementCCSSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abi@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("button[value='1']")).click();

	}

}
