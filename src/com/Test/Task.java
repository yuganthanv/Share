package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Task {







	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathiravan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();
		
        WebElement reg = driver.findElement(By.xpath("//a[@ href='Register.html']"));
        reg.click();
        
       

	}




}	






















