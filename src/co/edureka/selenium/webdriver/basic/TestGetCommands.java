package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {
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
			driver.get("http://www.amazon.com");
			String titleOfThePage = driver.getTitle();
			System.out.println(titleOfThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl =driver.getCurrentUrl();
			System.out.println(currentUrl);
			System.out.println(driver.getPageSource());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TestGetCommands myObj = new TestGetCommands();
		myObj.invokeBrowser();

	}

}
