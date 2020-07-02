package c;

public class ProxyAnother {

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class proxyTest {
	  public static void main(String[] args) {
	    Proxy proxy = new Proxy();
	    proxy.setHttpProxy("<HOST:PORT>");
	    ChromeOptions options = new ChromeOptions();
	    options.setCapability("proxy", proxy);
	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.quit();
	  }
	}


	https://www.guru99.com/selenium-proxy-authentication.html


	from selenium import webdriver
	from selenium.webdriver.common.by import By
	from selenium.webdriver.support.ui import WebDriverWait
	from selenium.webdriver.support import expected_conditions as EC import random

PROXY="88.157.149.250:8080";

chrome_options=webdriver.ChromeOptions()chrome_options.add_argument('--proxy-server=%s'%PROXY)# 
// a[starts-with(@href,
// 'https://www.amazon.com/')]/@href
LINKS_XPATH='//*[contains(@id,"result")]/div/div[3]/div[1]/a'
	browser = webdriver.Chrome(executable_path="C:\\Users\Andrei\Downloads\chromedriver_win32\chromedriver.exe",
	                           chrome_options=chrome_options)
	browser.get(
	    'https://www.amazon.com/s/ref=lp_11444071011_nr_p_8_1/132-3636705-
			4291947?rh=n%3A3375251%2Cn%3A%213375301%2Cn%3A10971181011%2Cn%3A11444071011%2Cp_8%3A2229059011')
	links = browser.find_elements_by_xpath(LINKS_XPATH)
	for link in links:
	    href = link.get_attribute('href')
	    print(href)

	==========================
	from selenium import webdriver

	PROXY = "88.157.149.250:8080" # IP:PORT or HOST:PORT

	chrome_options = webdriver.ChromeOptions()
	chrome_options.add_argument('--proxy-server=%s' % PROXY)

	chrome = webdriver.Chrome(chrome_options=chrome_options)
	chrome.get("http://google.com")
	-------------------------------------------
	from selenium import webdriver

	PROXY = "88.157.149.250:8080" # IP:PORT or HOST:PORT

	chrome_options = webdriver.ChromeOptions()
	chrome_options.add_argument('--proxy-server=%s' % PROXY)

	chrome = webdriver.Chrome(chrome_options=chrome_options)
	chrome.get("http://google.com")
	-------------------------------------------------------


}

