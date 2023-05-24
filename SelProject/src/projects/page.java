package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d1 = new FirefoxDriver();
/*System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver d = new ChromeDriver();*/
d1.get("https://www.youtube.com/");
d1.close();
	}

}
