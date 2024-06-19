package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().window().maximize();

		
		WebElement sourceEg = driver.findElement(By.xpath("//div[@id='column-a']"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		//drag and drop
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceEg, dest).perform();
		
		Thread.sleep(3000);

		
	}

}
