package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class switchFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		WebElement ele = d.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(d);
		a.moveToElement(ele).perform();  
		 d.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(2000); 
		d.switchTo().frame(0);
		 d.findElement(By.id("userName")).sendKeys("98763565426");
		 d.findElement(By.id("close-pop")).click();
		 d.switchTo().defaultContent();
		 d.findElement(By.id("inputValEnter")).sendKeys("Phone");

		 
		 
		

	}

}
