package com.opteamix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDrivenTestingReadExcel {

	public static void main(String[] args) throws IOException {
		

		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell;

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\opteamix_drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//import excel sheet
		
		File src = new File("C:\\Users\\dgupta\\OneDrive - Opteamix LLC\\Documents\\Testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		// load the work book
		
		workbook = new XSSFWorkbook(fis);
		
		//access the sheet from the work book
		
		sheet = workbook.getSheetAt(0);
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			
			// import the data from the username cell
			
			cell = sheet.getRow(i).getCell(0);
			
			driver.findElement(By.xpath("//input[@name = 'email']")).clear();
			
			driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(cell.getStringCellValue());
			
			//import the data from the password cell
			
			cell = sheet.getRow(i).getCell(1);
			
			driver.findElement(By.xpath("//input[@name = 'pass']")).clear();
			
			driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys(cell.getStringCellValue());
			
			
		}
		
		
		
	}

}
