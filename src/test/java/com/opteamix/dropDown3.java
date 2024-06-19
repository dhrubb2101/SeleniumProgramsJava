package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");

		driver.manage().window().maximize();

		WebElement About = driver.findElement(By.xpath("//a[@id='navbarDropdown']"));

		About.click();

		Thread.sleep(3000);

		// WebElement getInvolved = driver.findElement(By.linkText("Get Involved"));
		
		//WebElement getInvolved = driver.findElement(By.partialLinkText("Get"));
		
		WebElement getInvolved = driver.findElement(By.xpath("//a[normalize-space()='Sponsor Us']"));

		getInvolved.click();

		Thread.sleep(3000);
	}

}
