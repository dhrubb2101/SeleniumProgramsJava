package com.opteamix;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlingEg {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		//get the parent window handle
		
		String parentwindow = driver.getWindowHandle();
				
		System.out.println(parentwindow);
		
		WebElement clickhere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		
		clickhere.click();
		
		//get all window handles the parent and child handle 
		
		Set<String>windowhandles = driver.getWindowHandles();
		
		System.out.println(windowhandles);

		//Iterate among the windows
		
		Iterator<String> iterator = windowhandles.iterator();
		
		while(iterator.hasNext()) {
			
			String childwindow = iterator.next();
			
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				
				driver.switchTo().window(childwindow);
				
				String text = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();

				System.out.println(text);
				
				driver.close();
				
			}
		}
	}

}
