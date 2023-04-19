package base;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{ 
	public static FirefoxDriver driver;
	
	public void setup() {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	public void openURL(String URL){
		driver.get(URL);
	}
	public void teardown() {
		driver.quit();
	}

}
