package locators;


import org.openqa.selenium.WebDriver;
import locators.allLocators.LandingPage_Locators;

public class Landing{

	public static void landingtest(WebDriver driver) throws InterruptedException {

		driver.findElement(LandingPage_Locators.lightoutlineicon).click();

		Thread.sleep(1000);
		
		driver.findElement(LandingPage_Locators.darkoutlineicon).click();
		Thread.sleep(1000);
		
		driver.findElement(LandingPage_Locators.access).click();
		
	
		
		//driver.findElement(LandingPage_Locators.Logos).click();
	
		
	}

}
