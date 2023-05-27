package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		//max screen
		driver.manage().window().maximize();
		
		//step-2 load the url
		//obj.method()
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01270yx48x97fc3v8u90uahdvn272672.node0");
		
		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
	
		Select option= new Select(dd);
		
		//option.selectByIndex(2);
		
		option.selectByVisibleText("Cypress");
	}

}
