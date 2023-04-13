package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import locators.allLocators.InboxPage_Locators;

public class Inbox {
	public static void Inboxtest(WebDriver driver) throws InterruptedException{
		
	//driver.findElement(By.cssSelector("button.large_btn")).click();
		
//	driver.findElement(By.cssSelector("li[id='mailbox-list-63e35ac496f7ac37db7dc9f3']")).click();
//	Thread.sleep(1000);	
//	driver.findElement(By.cssSelector("li[id='mailbox-list-63e35ac496f7ac37db7dc9f6']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.cssSelector("li[id='mailbox-list-63e35ac496f7ac37db7dc9f4']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.cssSelector("li[id='mailbox-list-63e35ac496f7ac37db7dc9f7']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.cssSelector("div[id='module_view']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.cssSelector("div[id='list_view']")).click();
	
	
driver.findElement(By.xpath("//input[@class='filled-in toggle-all']")).click();
Thread.sleep(3000);
	


	}
}

	
		
