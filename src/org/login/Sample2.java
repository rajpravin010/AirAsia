package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpr\\eclipse-workspace\\SeleniumTestDay2\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement txtSrc = driver.findElement(By.id("src"));
		txtSrc.sendKeys("chennai");
		
		WebElement txtDest = driver.findElement(By.id("dest"));
		txtDest.sendKeys("coimbatore");
		
		driver.quit();
	}

}
