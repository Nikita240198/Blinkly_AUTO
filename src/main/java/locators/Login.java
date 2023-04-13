package locators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import locators.allLocators.Loginpage_Locator;

public class Login {

	public static void Logintest(WebDriver driver) throws InterruptedException {

		driver.findElement(Loginpage_Locator.Name).sendKeys("nikitabargal");

		driver.findElement(Loginpage_Locator.Passwod).sendKeys("Qwerty@123");
		Thread.sleep(1000);

		WebElement sliders = driver.findElement(Loginpage_Locator.Slider);
		Actions actions = new Actions(driver);
		actions.click(sliders);
		String tmep[] = driver.findElement(Loginpage_Locator.SliderValue).getAttribute("innerText").split(" ");
		String t = tmep[3];
		int k = Integer.parseInt(t);
	

		if (k == 1) {

			actions.sendKeys(Keys.ARROW_LEFT);
			actions.sendKeys(Keys.ARROW_RIGHT);
		} else {
			for (int i = 1; i < k; i++) {
				actions.sendKeys(Keys.ARROW_RIGHT);
			}
		}

		actions.build().perform();

		driver.findElement(Loginpage_Locator.Button).click();
		
		Thread.sleep(10000);

	}
}


