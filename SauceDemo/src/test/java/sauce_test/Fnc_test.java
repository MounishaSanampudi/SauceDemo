package sauce_test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import pages.Cart;
import pages.Cartpage;
import pages.Login;
import pages.Next_page;

//@Test
public class Fnc_test {
	public void validatelogin() {
		Login login = new Login();
		Next_page nextpage = new Next_page();
		login.setup();
		login.openURL("https://www.saucedemo.com/");
		login.validlogin("standard_user", "secret_sauce");
		String str = nextpage.getheading();
		System.out.println(str);
		if (str.equals("Products")) {
			System.out.println("sucessful login");

		} else {
			System.out.println("login failed");
		}
		login.teardown();
	}

	@Test
	public void add_to_cart() {
		Cart cart = new Cart();
		Cartpage cartpage = new Cartpage();
		cart.setup();
		cart.openURL("https://www.saucedemo.com/");
		cart.validlogin("standard_user", "secret_sauce");
		ArrayList<String> text = cart.addcart();
		for (String mou : text) {
			System.out.println(mou);
		}
		ArrayList<String> prods = cartpage.clickcart();
		for (String kav : prods) {
			System.out.println(kav);
		}
		//int score = 0;
		for (int i = 0; i < text.size(); i++) {
			if ((text.get(i)).equals(prods.get(1)) ) {
	
				System.out.println("both are same");
				//score++;
				//System.out.println("score is "+score);
			}
			else {
				//System.out.println("score is "+ score);
				System.out.println("not same");
			}

		}
	}
}
