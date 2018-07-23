package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class FirefoxDriverTestProgram {
	WebDriver driver;  //ctrl+shift+o
	
	public void invokeBrowser() {
		System.setProperty("webdriver.gecko.driver", "/usr/local/Cellar/geckodriver/0.20.1/bin/geckodriver");
		driver = new FirefoxDriver();
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
			//System.out.println(driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div/div/div/a")).getText());
			System.out.println(driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?tab=wm']")).getText()); 
			driver.findElement(By.id("lst-ib")).sendKeys("Cheese");
			driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FirefoxDriverTestProgram myObj = new FirefoxDriverTestProgram();
		myObj.invokeBrowser();

	}
	public void getNewCommands() {
		try {
			driver.get("http://www.google.com");
			String titleOfThePage = driver.getTitle();
			System.out.println(titleOfThePage);
			//System.out.println(driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div/div/div/a")).getText());
			System.out.println(driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?tab=wm']")).getText()); 
			driver.findElement(By.id("lst-ib")).sendKeys("Cheese");
			driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
