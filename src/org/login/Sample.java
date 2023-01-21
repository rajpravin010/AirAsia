package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpr\\eclipse-workspace\\SeleniumTestDay2\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement textUser = driver.findElement(By.id("email"));
		textUser.sendKeys("8675227876");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Praveen@11");
		
		//driver.quit();
		
	}

}
