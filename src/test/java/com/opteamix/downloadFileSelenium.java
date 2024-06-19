package com.opteamix;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadFileSelenium {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement downloadFileSelenium = driver.findElement(By.xpath("//input[@name='download']"));
		
		downloadFileSelenium.click();
		
		String path = "C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Desktop";
		
		String filename = "review2TTM";
		
		boolean flag = false;
		File dir = new File(path);
		
		File[] files = dir.listFiles();
		
		if(files.length == 0 || files == null) {
			System.out.println("the directory is empty");
		}else {
			for(File listFile : files) {
				if(listFile.getName().contains(filename)) {
					System.out.println(filename);
				}
				flag = true;
			}
		}
		
	
}
	

}

