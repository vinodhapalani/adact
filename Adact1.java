package org.adact;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adact1 {


    public static void main(String[] args) throws IOException    {
		

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\vinod\\eclipse-workspace\\adact\\driver\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://adactinhotelapp.com/");
		  driver.manage().window().maximize();
		  
		  
		  TakesScreenshot ts=(TakesScreenshot)(driver);
		    
		    File Screenshot=ts.getScreenshotAs(OutputType.FILE);
		    
		    File f= new File("C:\\Users\\vinod\\eclipse-workspace\\adact\\WebPageScreenShot//adactinhotelapp.com.png");
		    
		    
			FileUtils.copyFile(Screenshot, f);
				
			} 
    }

