package LoginTest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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
		email.sendKeys("sai8179kumar@gmail.com"); //Enter Email
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.xpath("//input[@id = 'ap_password']"));
		password.sendKeys(""); //Enter Password
		driver.findElement(By.xpath("//input[@id = 'signInSubmit']")).click();
		
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("zebronics wired headphones", Keys.ENTER);
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement product = driver.findElement(By.xpath("(//div[contains(@class, 'a-section aok-relative s-image-fixed-height')])[1]"));
		product.click();
		
		driver.getWindowHandles();
		
		for(String wind :driver.getWindowHandles() ) {
			if(!wind.equals(parentwindow)) {
				driver.switchTo().window(wind);
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("buy-now-button")));
				element.click();
			}
		}
				
		WebElement payment = driver.findElement(By.xpath("//input[@value = 'SelectableAddCreditCard']"));
		payment.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait<WebDriver> flw = new FluentWait<WebDriver>(driver)
							 .withTimeout(Duration.ofSeconds(10))
							 .pollingEvery(Duration.ofSeconds(5))
							 .ignoring(NoSuchElementException.class);
		
	}

}
