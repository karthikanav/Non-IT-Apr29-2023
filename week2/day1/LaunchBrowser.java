package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//To launchbrowser
		//step-1
		ChromeDriver driver=new ChromeDriver();
		
		//max screen
		driver.manage().window().maximize();
		
		//step-2 load the url
		//obj.method()
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//syntax-driver.findElement(By.id("value"));
		
		//webelement-ctrl+2+l
		//findelement returntype-----webelement
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("demoslaesManager");
		user.clear();
		user.sendKeys("DemoCsr");
		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		//it willclose currentbrowser
		driver.close();
		
		
	}

}
