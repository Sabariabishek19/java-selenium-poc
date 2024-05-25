package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenAdjustment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		//maximize
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//fullscreen
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		//minimize
		Thread.sleep(2000);
		driver.manage().window().minimize();

	}

}
