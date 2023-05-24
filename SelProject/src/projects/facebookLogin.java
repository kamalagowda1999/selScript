package projects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated meth  od stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		//d.manage().timeouts().
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		s.selectByValue("5");
		
		List<WebElement> all = s.getOptions();
		System.out.println(all.size());
		
		
	//print all options
    ArrayList a=new ArrayList();
    for(WebElement o:all)
    {
    	String text = o.getText();
    	System.out.println(text);
    	a.add(text);
    }
    System.out.println(a);
    
    System.out.println(s.isMultiple());
    System.out.println("After sorting");
    Collections.sort(a);
    for(Object obj:a)
    {
    	System.out.println(obj);
    }
    d.close();
    
	}

}
