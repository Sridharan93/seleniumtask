package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCapture {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile =  new File("C:\\Users\\SRIDHARAN V\\Desktop\\Java\\Screenshot\\Amazon.jpg");
		FileUtils.copyFile(sourcefile, targetfile);
		
		
}

}
