package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;

import base.Base;

public class Cartpage extends Base {

	By prodname1 = By.xpath("(//div[@class='inventory_item_name'])[1]");
	By prodname2 = By.xpath("(//div[@class='inventory_item_name'])[2]");
    By cart=By.className("shopping_cart_link");
	public ArrayList<String> clickcart() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		driver.findElement(cart).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		String str3 = driver.findElement(prodname1).getText();
		String str4 = driver.findElement(prodname2).getText();
		ArrayList<String> prods = new ArrayList<String>();
		{
			prods.add(str3);
			prods.add(str4);
			

			return prods;
		}

	}

}
