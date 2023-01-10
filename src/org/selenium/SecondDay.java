package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondDay {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		// driver.manage().window().maximize();
		
        WebElement vehicle1 = driver.findElement(By.xpath("//input[@name='vehicle'][2]"));
		
	    vehicle1.click();
		
		
		WebElement vehicle2 = driver.findElement(By.xpath("//input[@name='vehicle'][3]"));
		
	    vehicle2.click();
		
	  
		
}	
}
