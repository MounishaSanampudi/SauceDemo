package pages;

import org.openqa.selenium.By;


import base.Base;

public class Login extends Base 
{
	By username=By.id("user-name");
	By password=By.id("password");
	By lgnbtn=By.id("login-button");
	public void validlogin(String uname, String pass) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(lgnbtn).click();
	}

}