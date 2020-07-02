package c;

public class AuthenticatedProxy {

	
		
		
		PROXY_IP = "<some IP address>"
				UID = "<the user id>"
				PWD = "<the password">

				options = webdriver.ChromeOptions()
				options.add_argument("--proxy-server=%s:%s@%s" % (UID,PWD,PROXY_IP))

				driver = webdriver.Chrome(executable_path=".\\driver\\chromedriver.exe",
				                          chrome_options=options)
				driver.get("<site URL>")

	



from seleniumwire import WebDriver
options = {
    'proxy': {
        'http': 'http://username:password@host:port', 
        'https': 'https://username:password@host:port',
        'no_proxy': 'localhost,127.0.0.1' # excludes
    }
}
browser = webdriver.Chrome(path_to_driver, seleniumwire_options=options)

}

// https://stackoverflow.com/questions/30451190/how-to-use-authenticated-proxy-in-selenium-chromedriver