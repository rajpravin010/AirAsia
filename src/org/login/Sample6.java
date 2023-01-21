package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpr\\eclipse-workspace\\SeleniumTestDay2\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("praveenkumarasamy@gmail.com");
		
		driver.quit();
	}

}
