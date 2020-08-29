package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadDemo  {

	public static String url = "https://the-internet.herokuapp.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement fileUpload = driver.findElement(By.linkText("File Upload"));
		fileUpload.click();
		
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		chooseFile.sendKeys("C:\\Users\\Ihor Kysil\\eclipse-workspace\\JavaBasics\\testdata/SampleTestData.xlsx");
		
		WebElement uploadButton = driver.findElement(By.id("file-submit"));
		uploadButton.click();
		
		
	}
}
