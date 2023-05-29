package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitywait {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		//max screen
		driver.manage().window().maximize();
		
		//implicity wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//step-2 load the url
		//obj.method()
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstnam']")).sendKeys("Dilip");

	}

}
