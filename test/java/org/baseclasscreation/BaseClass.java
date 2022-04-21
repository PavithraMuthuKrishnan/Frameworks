package org.baseclasscreation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void browserConfiguration() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	public static void openUrl(String url) {
    driver.get(url);
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public WebElement locateById( String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement locateByName( String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
	public WebElement locateByclassName( String className) {
		WebElement findElement = driver.findElement(By.className(className));
		return findElement;
	}
	public WebElement locateByxPath( String value) {
		WebElement findElement = driver.findElement(By.xpath(value));
		return findElement;
	}
	public static void insertText(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void buttonClick(WebElement element ) {
		element.click();
	}	
	public static void ddnByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex( index);
	}

	public static void ddnByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue( value);
	}
	public static void ddnByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText( value);
	}
	public void dropdnByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex( index);
	}
	public void dropdnByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue( value);
	}
	public void dropdnByVisibleText(WebElement element,String value) {
		Select s = new Select(element);
		s.deselectByVisibleText( value);
	}
	
		public static void implicitlyWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		
		
	}
		public static void refreshPage() {
			driver.navigate().refresh();

		}
		
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	

