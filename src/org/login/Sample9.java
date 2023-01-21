package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpr\\eclipse-workspace\\SeleniumTestDay2\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement userTxt = driver.findElement(By.name("DUMMY1"));
		userTxt.sendKeys("8675227876");
		
		WebElement usrClc = driver.findElement(By.id("user-id-goahead"));
		usrClc.click();
		
		WebElement usertxt = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		usertxt.sendKeys("3355342");
		
		WebElement userPass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		userPass.sendKeys("5689451256");
		
		driver.quit();
		
		
		
		
	}

}
