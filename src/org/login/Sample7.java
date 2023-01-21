package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample7 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpr\\eclipse-workspace\\SeleniumTestDay2\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("Praveenkumarasamy@gmail.com");
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("110894356");
		
		driver.quit();
	}

}
