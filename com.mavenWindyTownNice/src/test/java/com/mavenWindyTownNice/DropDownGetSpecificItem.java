package com.mavenWindyTownNice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGetSpecificItem {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select select=new Select (driver.findElement(By.name("country")));
		select.selectByVisibleText("UGANDA");
		
		driver.findElement(By.xpath("//*[@name='submit']")).submit();
		
	driver.quit();
	}

}
