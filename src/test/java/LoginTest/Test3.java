package LoginTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement email = driver.findElement(By.xpath("//input[@id = 'ap_email']"));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys(""); //Enter Email
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.xpath("//input[@id = 'ap_password']"));
		password.sendKeys(""); //Enter Password
		driver.findElement(By.xpath("//input[@id = 'signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("zebronics wired headphones", Keys.ENTER);
		WebElement addToCart = driver.findElement(By.xpath("(//button[@type = 'button'])[1]"));
		addToCart.click();
		
		WebElement gotoCart = driver.findElement(By.xpath("(//span[contains(text(), 'Cart')])[2]"));
		wait.until(ExpectedConditions.visibilityOf(gotoCart));
		gotoCart.click();
		//input[@name = 'proceedToRetailCheckout']
		WebElement Checkout = driver.findElement(By.xpath("//input[@name = 'proceedToRetailCheckout']"));
		Checkout.click();
		
		WebElement address = driver.findElement(By.xpath("(//input[@type = 'submit' and @class = 'a-button-input'])[last()]"));
		address.click();
		
		WebElement payment =  driver.findElement(By.xpath("//input[@id = 'pp-XJ3b7Y-166']']"));
		wait.until(ExpectedConditions.visibilityOf(payment));
		payment.click();
		
	}

}
