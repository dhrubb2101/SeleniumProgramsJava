package com.opteamix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdowEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement drpdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select s = new Select(drpdown);

		// select by visible text
		s.selectByVisibleText("Option 2");
		Thread.sleep(2000);

		// select by value
		s.selectByValue("1");
		Thread.sleep(2000);

		// select by index

		s.selectByIndex(2);

	}

}