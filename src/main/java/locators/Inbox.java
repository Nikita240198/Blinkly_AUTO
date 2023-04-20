package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



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
	
	
WebElement element = driver.findElement(By.cssSelector("[aria-label='Select all']"));
Actions action = new Actions(driver);
action.moveToElement(element).click().perform();


Thread.sleep(2000);


 WebElement element1 = driver.findElement(By.cssSelector("[data-target='deleteModal']"));
Actions action1 = new Actions(driver);
action1.moveToElement(element1).click().perform();
Thread.sleep(2000);




	}
}

	
		
