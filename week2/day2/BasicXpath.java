package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		//max screen
		driver.manage().window().maximize();
		
		//step-2 load the url
		//obj.method()
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		//ctrl+2-L
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//(//input[@class='inputLogin'])[2]
		//ctrl+2-l
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
	}

}
