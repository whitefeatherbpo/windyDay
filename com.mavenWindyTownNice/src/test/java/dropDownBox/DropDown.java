package dropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select select= new Select(driver.findElement(By.name("country")));
		
		List<WebElement> allCountry= select.getOptions();
		
		System.out.println(allCountry.size());
		
		for (int i=0; i<allCountry.size();i++) {
			System.out.println(allCountry.get(i).getText());
		}
		
		driver.quit();
	}
	

}
