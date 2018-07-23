package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseElementLocatorTechniques {
	
	ChromeDriver driver;
	
	public void invokeBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "/Volumes/home/Users/pooja/Documents/Selenium/Setup/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
	}
	public void closeBrowser() {
		driver.close();
		//driver.quit();
	}
	public void backBrowser() {
		driver.navigate().back();
	}
	public void elementLocatorTechniques(String technique, String techniqueValue) {

		try {
		if (technique=="ID")
		{
				driver.findElement(By.id(techniqueValue)).sendKeys("lenovo laptop");
				Thread.sleep(2000);
			
		} else if ( technique =="name"){
			driver.findElement(By.name(techniqueValue)).click();
			Thread.sleep(2000);
		} else if ( technique=="class") {
			driver.findElement(By.className(techniqueValue)).click();
		}else if (technique=="linkText") {
			driver.findElement(By.linkText(techniqueValue)).click();
		}else if ( technique=="linkTextPartial") {
			driver.findElement(By.partialLinkText(techniqueValue)).click();
		} else if ( technique=="cssSelectorId") {
			driver.findElement(By.cssSelector(techniqueValue)).sendKeys("pooja.jayaraman03@gmail.com");
		} else if (technique=="xPath") {
		    System.out.println("Get Text is" + driver.findElement(By.xpath(techniqueValue)).toString());	
		}
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	public static void main(String[] args) {
		UseElementLocatorTechniques myObj = new UseElementLocatorTechniques();
		try {
			myObj.invokeBrowser("http://www.amazon.in");
			myObj.elementLocatorTechniques("linkText", "Your Amazon.in");
			myObj.elementLocatorTechniques("cssSelectorId", "Input#ap_email");
			myObj.backBrowser();
			myObj.elementLocatorTechniques("linkTextPartial", "Customer S");
			myObj.backBrowser();
			myObj.elementLocatorTechniques("ID","twotabsearchtextbox");
			myObj.elementLocatorTechniques("class", "nav-input");
			myObj.elementLocatorTechniques("name","s-ref-checkbox-1464437031");
			myObj.backBrowser();
			myObj.backBrowser();
			//myObj.elementLocatorTechniques("xPath", "//div[@id='nav-tools']/a[@id='nav-link-accountList']/span[1]");
			myObj.elementLocatorTechniques("xPath", "//*[@id=\"navbar\"]/div[2]");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				myObj.closeBrowser();
		}
	}

}
