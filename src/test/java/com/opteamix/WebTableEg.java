package com.opteamix;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/tables");

		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		//WebElement tableEg = driver.findElement(By.id("table1"));

		// rows

		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int size = rowno.size();
		System.out.println(size);

		// column

		List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		int size1 = col.size();
		System.out.println(size1);

		// cell data

		WebElement cell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[2]"));
		String size2 = cell.getText();
		System.out.println(size2);
		String expectedcelldata = "John";
		if (size2.equalsIgnoreCase(expectedcelldata)) {
			System.out.println("th data matches");
		} else {
			System.out.println("the data dosent matches");
		}
		

	}

}
