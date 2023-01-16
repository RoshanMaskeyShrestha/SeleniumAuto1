package qsp;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VerifyingUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.id("navbarPages"));
		Actions a= new Actions(driver);
		a.moveToElement(resources).perform()
		
		
		
	}
		
	}
		
		

       
       
        
			
		
		
	     
	     
	     
	
	     
	     
	



	    
	    
	   
	 
	   
	    
	    
	     
	     
	    
		

	


