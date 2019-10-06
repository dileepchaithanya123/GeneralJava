package com.personal.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectParticularText {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dponnuru/workspace/GeneralJava/Selenium/Drivers/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ap-solut.com/en/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/div/p/span"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(ele).build().perform();
		
		
		String Color = driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/div/p/span")).getCssValue("color");
		
		System.out.println(Color);
		
		
		
		driver.quit();
		
		
	}

}
