package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCapture2 {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourcefile, new File("C:\\Users\\SRIDHARAN V\\Desktop\\Java\\Screenshot\\Facebook.jpg"));
					} 
		catch (IOException e){
			String message = e.getMessage();
			System.out.println(message);
			}

        WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("kohli789@gmail.com");
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File sourcefile1 = ts1.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourcefile1, new File("C:\\Users\\SRIDHARAN V\\Desktop\\Java\\Screenshot\\Facebook1.jpg"));
		}
		catch (IOException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Kanchi@123");
		
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		File sourcefile2 = ts2.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourcefile2, new File("C:\\Users\\SRIDHARAN V\\Desktop\\Java\\Screenshot\\Facebook2.jpg"));
		}
		catch (IOException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		File sourcefile3 = ts3.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourcefile3, new File("C:\\Users\\SRIDHARAN V\\Desktop\\Java\\Screenshot\\Facebook3.jpg"));
		}
		catch (IOException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
				
		Thread.sleep(3000);
		driver.quit();
}
}
