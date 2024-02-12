package seleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(2000);

		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("ntk-admin");

		Thread.sleep(2000);

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");

		Thread.sleep(2000);

		WebElement loginBtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginBtn.click();

		Thread.sleep(2000);

		WebElement headerElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]"));

		String headerDash = headerElement.getText();
		Thread.sleep(2000);

		if (headerDash.equals("Dashboard")) {
			System.out.println("Header Text Verified as Dashboard");
		} else {
			System.out.println("Header Text Failed Verification");
		}

		tearDown();
	}

}