package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		
	    driver.manage().window().maximize();
	   
	  	   Thread.sleep(2000);
	   		   
	   Actions act =new Actions(driver);
	   	  	  	  	   
       WebElement drag1= driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));     
            
       WebElement drop1 = driver.findElement(By.id("bank"));
                     
       act.dragAndDrop(drag1,drop1).perform();
       
       WebElement drag2= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));  
      
       WebElement drop2 = driver.findElement(By.id("amt7"));
     
       act.dragAndDrop(drag2,drop2).perform();
}      
}
