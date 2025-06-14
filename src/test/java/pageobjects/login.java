package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverClass.DriverSetup;

public class login extends DriverSetup {

	@Test
	public void E2E() {

		driver.findElement(By
				.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement email = driver.findElement(By.xpath("//input[@id = 'ap_email']"));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("sai8179kumar@gmail.com"); //enter Email
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.xpath("//input[@id = 'ap_password']"));
		password.sendKeys("Amazon1@1"); //enter password
		driver.findElement(By.xpath("//input[@id = 'signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("zebronics wired headphones", Keys.ENTER);
		WebElement addToCart = driver.findElement(By.xpath("(//button[@type = 'button'])[1]"));
		addToCart.click();

		WebElement gotoCart = driver.findElement(By.xpath("(//span[contains(text(), 'Cart')])[2]"));
		wait.until(ExpectedConditions.visibilityOf(gotoCart));
		gotoCart.click();
		
		WebElement Checkout = driver.findElement(By.xpath("//input[@name = 'proceedToRetailCheckout']"));
		Checkout.click();

		WebElement address = driver
				.findElement(By.xpath("(//input[@type = 'submit' and @class = 'a-button-input'])[last()]"));
		address.click();


	}

}
