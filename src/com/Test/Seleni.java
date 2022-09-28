package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleni {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kathiravan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		WebElement a = driver.findElement(By.xpath("(//div[@class='product-container']//div/div/a/span)[5]"));
		
		
		
		
		
		
		
	}

}
