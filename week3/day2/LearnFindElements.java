package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.systeminfo.SystemInfo;

public class LearnFindElements {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		
		driver.get("https://www.leafground.com/link.xhtml");
	
//		WebElement link = driver.findElement(By.tagName("a"));
//		Dimension size = link.getSize();
		
		
		//return type of findelements is List<webelement>
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int size = link.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			String text = link.get(i).getText();
			
			System.out.println(text);
			
		}
	}

}
