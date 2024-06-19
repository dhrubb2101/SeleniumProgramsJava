package com.opteamix;

import java.io.File;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileDownloadSeleniumEg {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement psw = driver.findElement(By.name("password"));
		Thread.sleep(3000);
		 psw.click();
		psw.sendKeys("admin123");
		
		WebElement username = driver.findElement(By.name("username"));
		Thread.sleep(1000);
		username.click();
		username.sendKeys("Admin");
		
		WebElement log = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		log.click();
		Thread.sleep(3000);
		WebElement downloadFileSelenium = driver.findElement(By.linkText("Recruitment"));
		Thread.sleep(3000);
		downloadFileSelenium.click();
		
		Thread.sleep(3000);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement downfile = driver.findElement(By.xpath("(//i[@class = 'oxd-icon bi-download'])[19]"));

	//	js.executeScript("arguments[0].scrollIntoView();",downfile);
		
		Thread.sleep(3000);

		
		
		downfile.click();
		
		String path = "C:\\Users\\dgupta\\Downloads";
		String filename = "resume";
		
		File dir = new File(path);
		
		File[] files = dir.listFiles();
		
		if(files.length == 0 || files == null) {
			System.out.println("the directory is empty");
		}else {
			for(File listFile : files) {
				if(listFile.getName().contains(filename)) {
					System.out.println(filename);
				}
			}
		}
		
}

	

}
