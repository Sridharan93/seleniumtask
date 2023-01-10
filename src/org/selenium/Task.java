package org.selenium;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
		
		WebElement framef1 = driver.findElement(By.id("f1"));
		driver.switchTo().frame(framef1);
		
		WebElement element1 = driver.findElement(By.id("java"));
		element1.click();
		
		WebElement framef2 = driver.findElement(By.id("f2"));
		driver.switchTo().frame(framef2);
		
		WebElement element2 = driver.findElement(By.id("selenium"));
		element2.click();
		
		WebElement framef3 = driver.findElement(By.id("f3"));
		driver.switchTo().frame(framef3);
		
		WebElement element3 = driver.findElement(By.id("python"));
		element3.click();
		
		WebElement framef4 = driver.findElement(By.id("f4"));
		driver.switchTo().frame(framef4);
		
		WebElement element4 = driver.findElement(By.id("sql"));
		element4.click();
		
		WebElement framef5 = driver.findElement(By.id("f5"));
		driver.switchTo().frame(framef5);
		
		WebElement element5 = driver.findElement(By.id("jack"));
		String text = element5.getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.quit();
	
}
}
