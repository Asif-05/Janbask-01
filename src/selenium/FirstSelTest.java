package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chromium.ChromiumOptions;

public class FirstSelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**	
        WebDriverManager.
		ChromeDriverService options = new ChromiumOptions();
		//Accept all the certificate
		options.setAcceptInsecureCerts(true);
		ChromeDriver driver = new ChromeDriver(options);
		//Initiate the URL
		driver.get(“https://www.google.com”);
**/
		WebDriver driver;
		
		driver = WebDriver.Chrome(service=ChromeService(ChromeDriverManager().install()));
		

	}

}
