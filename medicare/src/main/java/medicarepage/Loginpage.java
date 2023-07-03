package medicarepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	@FindBy(xpath="//*[@id=\"username\"]")	
	public static WebElement Email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[3]/div/input[2]")
	public static WebElement Login;

	@FindBy(xpath="//*[@id=\"listProducts\"]/a")
	public static WebElement View_Product;

	@FindBy(xpath="//*[@id=\"productListTable\"]/tbody/tr[1]/td[6]/a[2]/span")
	public static WebElement Paracetamol;
	
	@FindBy(xpath="//*[@id=\"cart\"]/tfoot/tr[2]/td[4]/a")
	public static WebElement Checkout;
}
