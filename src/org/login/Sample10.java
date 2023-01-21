package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample10 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpr\\eclipse-workspace\\SeleniumTestDay2\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
		
		driver.get("https://netbanking.hdfcbank.com/");
		
		//Thread.sleep(3000);
		
		WebElement usrtxt = driver.findElement(By.xpath("//input[@type='text']"));
		
		usrtxt.sendKeys("33553421");
		
	}
	

}
