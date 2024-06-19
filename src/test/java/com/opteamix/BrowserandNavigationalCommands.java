package com.opteamix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserandNavigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//get page title 
		
		String pagetitle = driver.getTitle();
		
		System.out.println(pagetitle);
		
		//get page source
		
		String pagesrc = driver.getPageSource();
		
		System.out.println(pagesrc);
		
		//get current url
		
		String currenturl = driver.getCurrentUrl();
		
		System.out.println(currenturl);
		
		// navigate back
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//navigate forward
		
		driver.navigate().forward();
		
		Thread.sleep(3000);

		
		//navigate refresh
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		//closes the current browser session
		
		driver.close();
		
		

	}

}
