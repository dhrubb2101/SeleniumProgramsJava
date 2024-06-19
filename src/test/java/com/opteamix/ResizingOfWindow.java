package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingOfWindow {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.geckodriver.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement  target = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		Thread.sleep(3000);

		//dragAndDropBy(WebElement source, int xOffset, int yOffset) //status: WORKS

		act.dragAndDropBy(target, 30, 30).perform();
		
		Thread.sleep(3000);

		System.out.println("Resizing of element Completed");

	}

}
