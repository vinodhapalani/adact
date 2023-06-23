package org.adact;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adact {

	     public static void main(String[] args) {
			

			  System.setProperty("webdriver.chrome.driver","C:\\Users\\vinod\\eclipse-workspace\\adact\\driver\\chromedriver.exe");
			  
			  WebDriver driver=new ChromeDriver();
			  driver.get("http://adactinhotelapp.com/");
			  driver.manage().window().maximize();
			  
            JavascriptExecutor js=(JavascriptExecutor)driver;
			  
			  WebElement username=driver.findElement(By.id("user name"));
              js.executeScript("arguments[0].setAttribute('value',vinodhapalani4@gmail.com)'", username);
              
              WebElement password=driver.findElement(By.xpath("//td[@nbsp='Password'] "));
              js.executeScript("arguments[0].setAttribute('valve',vinodha1990)'", password);
              
              WebElement loginbutton=driver.findElement(By.name("login"));
              js.executeScript("argument[0].setAttribute.click()'", loginbutton);
		}    
	     }			  

