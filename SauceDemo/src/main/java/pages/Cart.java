package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;


import base.Base;

public class Cart extends Base {
	By username = By.id("user-name");
	By password = By.id("password");
	By lgnbtn = By.id("login-button");
	By addbtn = By.xpath("//button[text()='Add to cart']");
	By linktext1 = By.xpath("(//div[@class='inventory_item_name'])[1]");
	By linktext2 = By.xpath("(//div[@class='inventory_item_name'])[2]");

	public void validlogin(String uname, String pass) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(lgnbtn).click();
	}

	public ArrayList<String> addcart() {
		String str1=driver.findElement(linktext1).getText();
		driver.findElement(addbtn).click();
		String str2=driver.findElement(linktext2).getText();
		driver.findElement(addbtn).click();
		ArrayList<String> text=new ArrayList<String>();
		text.add(str1);
		text.add(str2);
		
		return text;
		
			
		}
	}
	

