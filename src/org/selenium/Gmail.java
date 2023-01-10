package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tnebnet.org/awp/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("j_username"));
		
		username.sendKeys("chitti.sridharan@gmail.com");
		
		WebElement password = driver.findElement(By.name("j_password"));
		
		password.sendKeys("12345Add");
		
		 WebElement login = driver.findElement(By.name("submit"));
		
		 login.click();
		
			
	}
		
}
