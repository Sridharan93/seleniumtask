package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropMenu2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement skill = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skill);
		s1.selectByValue("AutoCAD");
		
		List<WebElement> skilllist = s1.getOptions();
		System.out.println(skilllist.size());
		
		// Iteration by using for loop
//		 for (int i = 0; i < skilllist.size(); i++) {
//			WebElement webelement = skilllist.get(i);
//			String text = webelement.getText();
//			System.out.println(text);
//		    }
		// Iteration by using foreach loop
		for(WebElement a:skilllist) {
			String skillname = a.getText();
			System.out.println(skillname);
		}
		
		
}
}
