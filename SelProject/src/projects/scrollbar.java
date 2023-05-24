package projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=9156824353283199039&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062066&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10), "2");
      
		JavascriptExecutor js=(JavascriptExecutor) d; //typecasting
		js.executeScript(Window.(0,5000));
		js.
	}

}
