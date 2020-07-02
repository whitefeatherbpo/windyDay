package c;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeAutomationExtension {
public static void main(String[] args) {
	
System.setProperty(“webdriver.chrome.driver”, “C:\\selenium\\chromedriver.exe”);
Proxy proxy = new Proxy();
proxy.setHttpProxy(“rdc-proxy.server.com:PORT”);
proxy.setSslProxy(“rdc-proxy.server.com:PORT”);
DesiredCapabilities capabilities = DesiredCapabilities.chrome();
capabilities.setCapability(“proxy”, proxy);
ChromeOptions options = new ChromeOptions();
options.addArguments(“start-maximized”);
capabilities.setCapability(ChromeOptions.CAPABILITY, options);
WebDriver driver = new ChromeDriver(capabilities);
driver.get(“http://www.google.com”);
driver.manage().window().maximize();
driver.quit();
}
}
