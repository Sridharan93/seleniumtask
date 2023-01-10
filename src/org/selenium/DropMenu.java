package org.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropMenu {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHARAN V\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("srid9329");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Kanchi123@");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByValue("Paris");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
        s2.selectByValue("Deluxe");		
		
        WebElement roomcount = driver.findElement(By.id("room_nos"));
		Select s3= new Select(roomcount);
		s3.selectByVisibleText("2 - Two");
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.clear();
		datein.sendKeys("12/12/2022");
		
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.clear();
		dateout.sendKeys("14/12/2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("1");
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
		
		WebElement next = driver.findElement(By.id("continue"));
		next.click();
		
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("Virat");
		
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("Kohli");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("Plot No.105,West Cross Road,Chennai-600025 ");
		
		WebElement cardnumber = driver.findElement(By.name("cc_num"));
		cardnumber.sendKeys("4050855679865561");
		
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(cardtype);
		s6.selectByVisibleText("Master Card");
		
		WebElement expmonth = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(expmonth);
		s7.selectByValue("12");
		
		WebElement expyear = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(expyear);
		s8.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("456");
		
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		
		Thread.sleep(5000);
		
		WebElement orderno = driver.findElement(By.id("order_no"));
		String printorder = orderno.getAttribute("value");
		System.out.println(printorder);
		
		boolean multiple = s7.isMultiple();
		System.out.println(multiple);
		
		
					
	}

}
