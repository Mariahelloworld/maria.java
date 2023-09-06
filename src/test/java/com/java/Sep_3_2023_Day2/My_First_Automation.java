package com.java.Sep_3_2023_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_First_Automation {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver(); // Ctrl+Shift+o
		driver.manage().window().maximize();
		driver.get("http://www.rediff.com");
		driver.quit();
		
		
		WebDriver driver1 = new FirefoxDriver(); // Ctrl+Shift+o
		driver1.manage().window().maximize();
		driver1.get("http://www.flipkart.com");
		driver1.quit();
		
		
		WebDriver driver2 = new EdgeDriver(); // Ctrl+Shift+o
		driver2.manage().window().maximize();
		driver2.get("http://tutorialsninja.com/demo");
		driver2.quit();
	}

}
