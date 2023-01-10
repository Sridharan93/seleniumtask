package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		WebElement options = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		Select s = new Select(options);
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		System.out.println("========List of all Elements=======");
		List<WebElement> alloptions = s.getOptions();
		for(WebElement a:alloptions) {
			System.out.println(a.getText());
		}

        System.out.println("=====selected Elements======");	
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        for(WebElement b:allSelectedOptions) {
        	System.out.println(b.getText());
        }
        
        System.out.println("=====Unselected Elements======");	
        alloptions.removeAll(allSelectedOptions);
        for(WebElement c:alloptions) {
        	System.out.println(c.getText());
        }
        
        
		
	}

}
