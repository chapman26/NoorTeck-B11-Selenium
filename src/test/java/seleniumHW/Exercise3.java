package seleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise3 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.nopcommerce.com");
		Thread.sleep(2000);

		WebElement registerLink = driver.findElement(By.partialLinkText("Register"));
		registerLink.click();
		Thread.sleep(2000);

		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		Thread.sleep(2000);

		WebElement firstNameField = driver.findElement(By.name("FirstName"));
		firstNameField.sendKeys("Jackie");
		Thread.sleep(2000);

		WebElement lastNameField = driver.findElement(By.name("LastName"));
		lastNameField.sendKeys("Chapman");
		Thread.sleep(2000);

		WebElement dayDropdown = driver.findElement(By.name("DateOfBirthDay"));

		Select selectDay = new Select(dayDropdown);

		selectDay.selectByValue("26");
		Thread.sleep(2000);

		WebElement monthDropdown = driver.findElement(By.name("DateOfBirthMonth"));

		Select selectMonth = new Select(monthDropdown);

		selectMonth.selectByValue("2");
		Thread.sleep(2000);

		WebElement yearDropdown = driver.findElement(By.name("DateOfBirthYear"));

		Select selectYear = new Select(yearDropdown);

		selectYear.selectByValue("1985");
		Thread.sleep(2000);

		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.sendKeys("chapmanenterprise@gmail.com");
		Thread.sleep(2000);

		WebElement companyField = driver.findElement(By.name("Company"));
		companyField.sendKeys("NoorTeck");
		Thread.sleep(2000);

		WebElement newsletter = driver.findElement(By.id("Newsletter"));
		newsletter.click();
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("jackie");
		Thread.sleep(2000);

		WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));
		confirmPassword.sendKeys("jackie");
		Thread.sleep(2000);

		WebElement registerBtn = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
		registerBtn.click();
		Thread.sleep(2000);

		WebElement registerComplete = driver
				.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));

		String result = registerComplete.getText();
		Thread.sleep(2000);

		if (result.contains("Your registration completed")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		tearDown();
	}

}
