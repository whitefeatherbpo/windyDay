package dropDownBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingupYahoo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.xpath("//*[@class='ureg-fname input-with-icon icon-name '] ")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//*[@id='usernamereg-lastName']")).sendKeys("Kishor");
		driver.findElement(By.xpath("//*[@id='usernamereg-yid']")).sendKeys("whitefeatherbpo");
		driver.findElement(By.xpath("//*[@id='usernamereg-password']")).sendKeys("123654789");
		driver.findElement(By.xpath("//*[@id='usernamereg-phone']")).sendKeys("9294000029");

		Select select = new Select(driver.findElement(By.xpath("//*[@id='usernamereg-month']")));

		select.selectByIndex(11);

		driver.findElement(By.xpath("//*[@id='usernamereg-day']")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id='usernamereg-year']")).sendKeys("1980");
		driver.findElement(By.xpath("//*[@id='usernamereg-freeformGender']")).sendKeys("Male");
		driver.findElement(By.xpath("//*[@id='reg-submit-button']")).click();

		driver.close();

	}

}

//  //a[contains(text(),'Bank of Universe')]/parent::*/following-sibling::td[3];
// //*[@id='anyname']/table/tbody/tr[3]/td[4]
