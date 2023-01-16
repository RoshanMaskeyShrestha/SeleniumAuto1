package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspider");
		List<WebElement> alllinks = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		
		int count = alllinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = alllinks.get(i).getText();
			System.out.println(text);
			
		}
		alllinks.get(count-1).click();
		
		
		
		
		
		
		
		
		
		

	}

}
