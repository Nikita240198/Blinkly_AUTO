package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Compose {

	public static void SendingEmail(WebDriver driver, int i) throws InterruptedException {
		driver.findElement(By.cssSelector("button.large_btn")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.cssSelector("input#inputTo")).sendKeys("praveenchouhan@staging.blinkly.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#inputSubjectM")).sendKeys("Automatic mail " + i);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div.note-editable>div")).sendKeys("Hello \n my name is nikita. \n this is a auto mactic generated mail no - " +i);
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("button#submitbtnM")).click();
		
		
		Thread.sleep(2000);
		
//		CC
//		driver.findElement(By.cssSelector("a#link-add-ccM")).click();
//		Thread.sleep(2000);
//  	Bcc
//		driver.findElement(By.cssSelector("a#link-add-bccM")).click();
//		Thread.sleep(2000);
		
		
		

	}
}
