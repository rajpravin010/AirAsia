package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpr\\eclipse-workspace\\SeleniumTestDay2\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		//WebElement txtUser = driver.findElement(By.name("username"));
		//txtUser.sendKeys("rajpravin010@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement txtUser2 = driver.findElement(By.xpath("//input[@name='username']"));
		txtUser2.sendKeys("rajpravin010@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement userPass = driver.findElement(By.name("password"));
		userPass.sendKeys("8675227876");
		
		
		
		
		
		
		driver.quit();
		
		
		
	}

}
