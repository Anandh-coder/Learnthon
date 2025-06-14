package ui_api;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Ekart_Rahul {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebElement el1 = driver.findElement(By.xpath("//h4[text()='Brocolli - 1 Kg']//parent::div//div[@class = 'product-action']//button"));
		el1.click();
		WebElement el2 = driver.findElement(By.xpath("//a[@class = 'cart-icon']"));
		el2.click();
		WebElement el3 = driver.findElement(By.xpath("//button[text() = 'PROCEED TO CHECKOUT']"));
		el3.click();
		Thread.sleep(2000);
		WebElement el4 = driver.findElement(By.xpath("//button[text() ='Place Order']"));
		el4.click();
		Select country_drp = new Select(driver.findElement(By.xpath("//select")));
		country_drp.selectByValue("India");
		driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		driver.findElement(By.xpath("//button[text() = 'Proceed']")).click();
	}

}
