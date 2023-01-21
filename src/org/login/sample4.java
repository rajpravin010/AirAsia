package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpr\\eclipse-workspace\\SeleniumTestDay2\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement txtUserName = driver.findElement(By.id("userName"));
		txtUserName.sendKeys("rajpravin010@gmail.com");
		
		driver.quit();
		
	}

}
