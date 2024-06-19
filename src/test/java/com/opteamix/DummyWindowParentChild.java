package com.opteamix;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyWindowParentChild {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://dummypoint.com/Windows.html");
		
		driver.manage().window().maximize();
		
		String parentdummy = driver.getWindowHandle();
		
		System.out.println(parentdummy);
		
		WebElement clickbutton = driver.findElement(By.xpath("//input[@value ='Open a Popup Window']"));

		clickbutton.click();
				
		Thread.sleep(3000);
		
		Set<String> windowhandles = driver.getWindowHandles();

		System.out.println(windowhandles);
		
        Iterator<String> iterator = windowhandles.iterator();
		
		while(iterator.hasNext()) {
			
			String childwindow = iterator.next();
			
			if(!parentdummy.equalsIgnoreCase(childwindow)) {
				
				driver.switchTo().window(childwindow);
				
				driver.manage().window().maximize();
				
				WebElement frame1alert =  driver.findElement(By.xpath("//iframe[@id='f1']"));
				
				driver.switchTo().frame(frame1alert);
				
				WebElement promptalerteg =  driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
				
				promptalerteg.click();
				Thread.sleep(3000);
				
				Alert alert1 = driver.switchTo().alert();
				Thread.sleep(3000);
				alert1.accept();
				
				Thread.sleep(3000);

				String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
				System.out.println(text);
				driver.close();
				Thread.sleep(3000);

			}
		
		}

	}

}
