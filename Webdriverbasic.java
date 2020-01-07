package seleniumsessions;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;;


public class Webdriverbasic {

        
        public static void main(String[] args) {
        	
            //Chrome Browser
            System.setProperty("webdriver.chromeriver.exe.driver", "C:\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();//using chrome browser
            driver.get("https://www.google.com");
            
	    //print the title
            String Title = driver.getTitle();
            System.out.println(Title);
            
            //Check if the title printed is correct or incorrect
            if(Title.equals("Google")) {
                System.out.println("correct title");
            }
            else {
            	System.out.println("Incorrect title");
            }
            
            //geturl method
            System.out.println(driver.getCurrentUrl());
            
            //getPageSource method
            System.out.println(driver.getPageSource());
            
            //Quit the browser
            driver.quit();
            
            
	}
        
        

}
