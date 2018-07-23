package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
	WebDriver driver;  //ctrl+shift+o
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Volumes/home/Users/pooja/Documents/Selenium/Setup/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		getCommands();
	}
	
	public void getCommands() {
		try {
			driver.get("http://www.google.com");
			String titleOfThePage = driver.getTitle();
			System.out.println(titleOfThePage);
			driver.findElement(By.id("lst-ib")).sendKeys("Cheese");
			driver.findElement(By.id("lst-ib")).submit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SearchGoogle myObj = new SearchGoogle();
		myObj.invokeBrowser();

	}

}
