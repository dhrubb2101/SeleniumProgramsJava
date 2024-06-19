package com.opteamix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagworkflowtest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement userenter = driver.findElement(By.xpath("//input[@id='user-name']"));
		userenter.sendKeys("standard_user");
		Thread.sleep(3000);

		WebElement passenter = driver.findElement(By.xpath("//input[@id='password']"));
		passenter.sendKeys("secret_sauce");
		Thread.sleep(3000);

		WebElement loginclick = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginclick.click();
		Thread.sleep(3000);

		
		WebElement logoswag = driver.findElement(By.xpath("//div[@class='app_logo']"));
		if(logoswag.isDisplayed()) {
			System.out.println("logo is displayed,page is opening.");
			
		}else {
			System.out.println("logo is not displayed.");
		}
		
		WebElement addtocart1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		Thread.sleep(3000);
		addtocart1.click();
		Thread.sleep(3000);
		
		WebElement cartlogo = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartlogo.click();
		Thread.sleep(3000);

		WebElement checkout1 = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout1.click();
		Thread.sleep(3000);

		WebElement firstname1 = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstname1.click();
		firstname1.sendKeys("dhrubb");
		Thread.sleep(3000);


		WebElement lastname1 = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastname1.click();
		lastname1.sendKeys("Gupta");
		Thread.sleep(3000);

		WebElement postalcode1 = driver.findElement(By.xpath("//input[@id='postal-code']"));
		postalcode1.click();
		postalcode1.sendKeys("1234");
		Thread.sleep(3000);

		WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
		continue1.click();
		Thread.sleep(3000);

		WebElement finish1 = driver.findElement(By.xpath("//button[@id='finish']"));
		finish1.click();
		Thread.sleep(3000);

		WebElement thankyou1 = driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your order!']"));
		if(thankyou1.isDisplayed()) {
			System.out.println("It is displayed thankyou is displayed.");
		}else {
			System.out.println("Thankyou is not displayed.");
		}
		Thread.sleep(3000);

		WebElement backhome1 = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		backhome1.click();
		


		

		
		
		
	}

}
