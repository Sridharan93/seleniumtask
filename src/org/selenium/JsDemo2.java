package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		WebElement username = driver.findElement(By.id("email"));
		jk.executeScript("arguments[0].setAttribute('value','Jack123@gmail.com')", username);
		
		WebElement password = driver.findElement(By.id("pass"));
		jk.executeScript("arguments[0].setAttribute('value','Kanchi123')", password);
				
		Thread.sleep(2000);
				
		WebElement login = driver.findElement(By.id("send2"));
		jk.executeScript("arguments[0].click()", login);
					
	}
		
}
