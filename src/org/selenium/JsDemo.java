package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		WebElement username = driver.findElement(By.id("email"));
		jk.executeScript("arguments[0].setAttribute('value','Jack123@gmail.com')", username);
		
		WebElement password = driver.findElement(By.id("pass"));
		jk.executeScript("arguments[0].setAttribute('value','Kanchi123')", password);
				
		WebElement login = driver.findElement(By.name("login"));
		jk.executeScript("arguments[0].click()", login);
					
	}
		
}
