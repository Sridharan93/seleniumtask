package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.id("fruits"));
		Select s = new Select(multi);
		s.selectByValue("banana");
		s.selectByValue("orange");
		
		System.out.println("=====List of all element=====");
		List<WebElement> options = s.getOptions();
		for (WebElement li1:options) {
			String text = li1.getText();
			System.out.println(text);
		}
		
		System.out.println("====List of Selected Elements====");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement li2:allSelectedOptions) {
			System.out.println(li2.getText());
		}
		
		System.out.println("=====first selected element====");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		System.out.println("====Unselected Element List====");
	    options.removeAll(allSelectedOptions);
	    
	    for (WebElement li3:options) {
	    	String text2 = li3.getText();
	    	System.out.println(text2);
	    }
		
	    driver.close();
		
		
	
}
}
