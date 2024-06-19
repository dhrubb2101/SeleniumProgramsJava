package com.opteamix;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollVerticalandHorizontal {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");

		//driver.manage().window().maximize();

		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// horizonatal scroll

		js.executeScript("window.scrollBy(600,0)", "");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(-400,0)", "");
		
		Thread.sleep(3000);

		
		driver.manage().window().maximize();


		Thread.sleep(3000);
		
		//vertical scroll
//		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,600)","");
		
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-400)","");
		
		Thread.sleep(3000);
		
		
		
		
		

		
		

		
		
		
		

	}

}
