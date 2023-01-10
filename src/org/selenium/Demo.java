package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	    driver.manage().window().maximize();
	   
	  	Thread.sleep(2000);
	   		   
	   Actions act =new Actions(driver);
	   	  	  	  	   
       WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
       firstname.click();
       
      Robot r = new Robot();
      
      r.keyPress(KeyEvent.VK_SHIFT);
      r.keyPress(KeyEvent.VK_J);
      r.keyRelease(KeyEvent.VK_SHIFT);
      r.keyRelease(KeyEvent.VK_J);
      r.keyPress(KeyEvent.VK_O);
      r.keyRelease(KeyEvent.VK_O);
      r.keyPress(KeyEvent.VK_E);
      r.keyRelease(KeyEvent.VK_E);
      
      WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
      lastname.click();
      
      r.keyPress(KeyEvent.VK_SHIFT);
      r.keyPress(KeyEvent.VK_R);
      r.keyRelease(KeyEvent.VK_SHIFT);
      r.keyRelease(KeyEvent.VK_R);
      r.keyPress(KeyEvent.VK_O);
      r.keyRelease(KeyEvent.VK_O);
      r.keyPress(KeyEvent.VK_O);
      r.keyRelease(KeyEvent.VK_O);
      r.keyPress(KeyEvent.VK_T);
      r.keyRelease(KeyEvent.VK_T);
      
      WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
      address.click();
      
      r.keyPress(KeyEvent.VK_5);
      r.keyRelease(KeyEvent.VK_5);
      r.keyPress(KeyEvent.VK_SHIFT);
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_SHIFT);
      r.keyRelease(KeyEvent.VK_A);
      r.keyPress(KeyEvent.VK_COMMA);
      r.keyRelease(KeyEvent.VK_COMMA);
      r.keyPress(KeyEvent.VK_SHIFT);
      r.keyPress(KeyEvent.VK_B);
      r.keyRelease(KeyEvent.VK_SHIFT);
      r.keyRelease(KeyEvent.VK_B);
      r.keyPress(KeyEvent.VK_I);
      r.keyRelease(KeyEvent.VK_I);
      r.keyPress(KeyEvent.VK_G);
      r.keyRelease(KeyEvent.VK_G);
      r.keyPress(KeyEvent.VK_SPACE);
      r.keyRelease(KeyEvent.VK_SPACE);
      r.keyPress(KeyEvent.VK_S);
      r.keyRelease(KeyEvent.VK_S);
      r.keyPress(KeyEvent.VK_T);
      r.keyRelease(KeyEvent.VK_T);
      r.keyPress(KeyEvent.VK_R);
      r.keyRelease(KeyEvent.VK_R);
      r.keyPress(KeyEvent.VK_E);
      r.keyRelease(KeyEvent.VK_E);
      r.keyPress(KeyEvent.VK_E);
      r.keyRelease(KeyEvent.VK_E);
      r.keyPress(KeyEvent.VK_T);
      r.keyRelease(KeyEvent.VK_T);
      
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      r.keyPress(KeyEvent.VK_S);
      r.keyRelease(KeyEvent.VK_S);
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyPress(KeyEvent.VK_L);
      r.keyRelease(KeyEvent.VK_L);
      r.keyPress(KeyEvent.VK_E);
      r.keyRelease(KeyEvent.VK_E);
      r.keyPress(KeyEvent.VK_M);
      r.keyRelease(KeyEvent.VK_M);
      r.keyPress(KeyEvent.VK_MINUS);
      r.keyRelease(KeyEvent.VK_MINUS);
      r.keyPress(KeyEvent.VK_5);
      r.keyRelease(KeyEvent.VK_5);
      
      WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
      email.click();
      
      r.keyPress(KeyEvent.VK_J);
      r.keyRelease(KeyEvent.VK_J);
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyPress(KeyEvent.VK_C);
      r.keyRelease(KeyEvent.VK_C);
      r.keyPress(KeyEvent.VK_K);
      r.keyRelease(KeyEvent.VK_K);
      r.keyPress(KeyEvent.VK_1);
      r.keyRelease(KeyEvent.VK_1);
      r.keyPress(KeyEvent.VK_8);
      r.keyRelease(KeyEvent.VK_8);
      r.keyPress(KeyEvent.VK_SHIFT);
      r.keyPress(KeyEvent.VK_2);
      r.keyRelease(KeyEvent.VK_SHIFT);
      r.keyRelease(KeyEvent.VK_2);
      r.keyPress(KeyEvent.VK_G);
      r.keyRelease(KeyEvent.VK_G);
      r.keyPress(KeyEvent.VK_M);
      r.keyRelease(KeyEvent.VK_M);
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyPress(KeyEvent.VK_I);
      r.keyRelease(KeyEvent.VK_I);
      r.keyPress(KeyEvent.VK_L);
      r.keyRelease(KeyEvent.VK_L);
      r.keyPress(KeyEvent.VK_PERIOD);
      r.keyRelease(KeyEvent.VK_PERIOD);
      r.keyPress(KeyEvent.VK_C);
      r.keyRelease(KeyEvent.VK_C);
      r.keyPress(KeyEvent.VK_O);
      r.keyRelease(KeyEvent.VK_O);
      r.keyPress(KeyEvent.VK_M);
      r.keyRelease(KeyEvent.VK_M);
      
      WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
      phone.click();
      
      r.keyPress(KeyEvent.VK_9);
      r.keyRelease(KeyEvent.VK_9);
      r.keyPress(KeyEvent.VK_9);
      r.keyRelease(KeyEvent.VK_9);
      r.keyPress(KeyEvent.VK_9);
      r.keyRelease(KeyEvent.VK_9);
      r.keyPress(KeyEvent.VK_8);
      r.keyRelease(KeyEvent.VK_8);
      r.keyPress(KeyEvent.VK_8);
      r.keyRelease(KeyEvent.VK_8);
      r.keyPress(KeyEvent.VK_1);
      r.keyRelease(KeyEvent.VK_1);
      r.keyPress(KeyEvent.VK_2);
      r.keyRelease(KeyEvent.VK_2);
      r.keyPress(KeyEvent.VK_3);
      r.keyRelease(KeyEvent.VK_3);
      r.keyPress(KeyEvent.VK_4);
      r.keyRelease(KeyEvent.VK_4);
      r.keyPress(KeyEvent.VK_5);
      r.keyRelease(KeyEvent.VK_5);
         
      
}      
	
}
