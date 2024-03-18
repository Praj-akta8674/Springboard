//package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class products {
	
	
	    public static void main(String args[]){  
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\prajakta\\OneDrive\\Documents\\DEVOPS\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        //Launch website 
	        driver.get("https://facebook.com/");
	       }  
	   }

//("webdriver.chrome.driver","C:\\Users\\prajakta\\OneDrive\\Documents\\DEVOPS\\chromedriver.exe");