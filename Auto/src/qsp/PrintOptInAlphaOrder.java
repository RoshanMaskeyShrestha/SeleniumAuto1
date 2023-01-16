package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintOptInAlphaOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/hotel.html");
		WebElement lists = driver.findElement(By.id("mtr"));
		//ArrayList<String> al=new ArrayList<String>();
		TreeSet<String> hs=new TreeSet<>();
		Select s=new Select(lists);
		List<WebElement> allopt = s.getOptions();
		for (int i = 0; i < allopt.size(); i++) {
			String text = allopt.get(i).getText();
			if((hs.add(text))==false)
				System.out.println(hs);
			
		
		//Collections.sort(al);
	    //System.out.println(al);
		//for (String w : hs) {
			//System.out.println(w);
			
		//}
		}
		

	}

}
