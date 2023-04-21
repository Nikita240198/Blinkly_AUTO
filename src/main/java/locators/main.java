package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Mind/Downloads/chromedriver_mac64/chromedriver");

		WebDriver driver = new ChromeDriver();
		try {

		driver.get("https://staging.blinkly.com/");
		
		Thread.sleep(1000);
		
		Landing.landingtest(driver);
		
		
        Login.Logintest(driver);
        for(int i=0;i<5;i++) Compose.SendingEmail(driver,i+1);
    
    	
       //Inbox.Inboxtest(driver);
       
       
       
    
        
	driver.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			driver.close();
		}
	}

}
