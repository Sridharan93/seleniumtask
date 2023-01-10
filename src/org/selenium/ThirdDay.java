package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdDay {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.iitm.ac.in/the-institute/about-iit-madras/history");
		
		// driver.manage().window().maximize();
		
        WebElement description = driver.findElement(By.xpath("//p[contains(text(),'It all began in 1956, when Pandit Jawaharlal Nehru, Prime Minister of India, was on an official ')]"));
		
	    String info = description.getText();
	    
	    System.out.println(info);
	    
      
		
	 		
}	

}
