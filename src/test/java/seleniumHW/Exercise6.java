package seleniumHW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);

		WebElement alertWithTextbox = driver.findElement(By.partialLinkText("Alert with Textbox"));
		alertWithTextbox.click();
		Thread.sleep(2000);

		WebElement demonstrate = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		demonstrate.click();
		Thread.sleep(2000);

		Alert name = driver.switchTo().alert();
		name.sendKeys("Jackie");
		Thread.sleep(2000);

		name.accept();
		Thread.sleep(2000);

		// driver.findElement(By.textboxLocator).sendKeys(Keys.F5);--> textboxLocator
		// has an error
		// Thread.sleep(2000);

		WebElement alertWithOkAndCancel = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertWithOkAndCancel.click();
		Thread.sleep(2000);

		WebElement displayAlert = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		displayAlert.click();
		Thread.sleep(2000);

		Alert pressBtn = driver.switchTo().alert();
		String text = pressBtn.getText();

		if (text.contains("Press a Button")) {
			pressBtn.accept();
		} else {
			pressBtn.dismiss();
		}

		tearDown();
	}

}
