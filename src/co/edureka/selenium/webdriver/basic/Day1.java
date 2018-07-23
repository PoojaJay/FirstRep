package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1 {
 
    WebDriver driver;
    
    public void invokeBrowser() {
    	
    	try {
    	System.setProperty("webdriver.chrome.driver", "/Volumes/home/Users/pooja/Documents/Selenium/Setup/chromedriver");
	    	driver = new ChromeDriver();
	    	driver.manage().deleteAllCookies();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    	
	    	driver.get("http://www.edureka.co");
	    	searchCourse();
	    	
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void searchCourse() {
    	
    	driver.findElement(By.id("homeSearchBar")).sendKeys("java");
    	driver.findElement(By.id("homeSearchBarIcon")).click();
    	String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		//driver.findElement(By.linkText("Today's Deals")).click();
		String currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
    	
    }
	public static void main(String[] args) {
		Day1 myObj = new Day1();
		myObj.invokeBrowser();

	}

}
