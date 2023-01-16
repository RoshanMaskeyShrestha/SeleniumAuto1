package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		WebElement mon = driver.findElement(By.id("month"));
		Select s=new Select(mon);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("5");
		Thread.sleep(3000);
		s.selectByVisibleText("Feb");
		
		



	
		

	}

}
