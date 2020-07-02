package c;

import org.openqa.selenium.WebDriver;

public class ProxyForRemoteServer{

	protected String proxyUser = "user@company.com";
	protected String proxyPass = "password";
	protected String proxyUrl;

	public static void main(String[] args) {
		
		
		public WebDriver initDriverWebPcProxy(String url) throws IOException {
		    proxyUrl = "http://" + proxyUser + ":" + proxyPass + "@" + url;

		    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		    proxy.setHttpProxy(proxyUrl);
		    proxy.setSslProxy(proxyUrl);
		    capabilities.setCapability("proxy", proxy);
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("start-maximized");


		    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		    driver = new ChromeDriver(capabilities);

		    return driver;
		}	

	}

}
