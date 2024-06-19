package com.opteamix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagLabsddbtest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		XSSFWorkbook workbook1;
		XSSFSheet sheet1 = null;
		XSSFCell cell1;
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		
		File src1 = new File("C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\Testdata1.xlsx");
		
		FileInputStream fis1 = new FileInputStream(src1);
		
		workbook1=new XSSFWorkbook(fis1);
		
		sheet1=workbook1.getSheetAt(0);

		
		for(int i=1;i<=sheet1.getLastRowNum();i++) {
			
			// import the data from the username cell
			
			cell1 = sheet1.getRow(i).getCell(0);
			
			driver.findElement(By.xpath("//input[@id='user-name']")).clear();
			
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(cell1.getStringCellValue());
			Thread.sleep(3000);
			//import the data from the password cell
			
			cell1 = sheet1.getRow(i).getCell(1);
			
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cell1.getStringCellValue());
			Thread.sleep(3000);

		

	}

}
}

