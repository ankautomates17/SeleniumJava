package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		
		//1. FF browser:
		//geckodriver
    	// C:\\downloads\\geckodriver.exe -- windows 
	    // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ankit\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");	
	    // WebDriver driver = new FirefoxDriver(); //launch FF
		
	    
	    //2. chrome browser:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankit\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("http://www.google.com");	//enter url
		
		String title = driver.getTitle(); //get title
		
		System.out.println(title);
		
		//validation point:
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in-correct title");
		}
	   
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit(); //quit the browser
		
		
	}

}