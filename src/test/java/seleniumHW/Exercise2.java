package seleniumHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement regLink = driver.findElement(By.partialLinkText("Register"));
		regLink.click();
		Thread.sleep(2000);

		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("Jackie");
		Thread.sleep(2000);

		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("Chapman");
		Thread.sleep(2000);

		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys("813-601-8327");
		Thread.sleep(2000);

		WebElement emailField = driver.findElement(By.name("userName"));
		emailField.sendKeys("jrchapman85@gmail.com");
		Thread.sleep(2000);

		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("2415 Needham Dr");
		Thread.sleep(2000);

		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Valrico");
		Thread.sleep(2000);

		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("FL");
		Thread.sleep(2000);

		WebElement zipCodeField = driver.findElement(By.name("postalCode"));
		zipCodeField.sendKeys("33596");
		Thread.sleep(2000);

		WebElement userNameField = driver.findElement(By.name("email"));
		userNameField.sendKeys("jrchapman85@gmail.com");
		Thread.sleep(2000);

		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("jackie");
		Thread.sleep(2000);

		WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
		confirmPasswordField.sendKeys("jackie");
		Thread.sleep(2000);

		WebElement loginBtn = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		loginBtn.click();

		WebElement registerConfirmation = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));

		String result = registerConfirmation.getText();
		Thread.sleep(2000);

		if (result.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		tearDown();
	}

}
