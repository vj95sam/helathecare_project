package medicare_admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Edit_page {
	
	@FindBy(xpath="//*[@id=\"productsTable\"]/tbody/tr[1]/td[8]/a/span")
	public static WebElement editbutton;

	@FindBy(xpath="//input[@id=\"unitPrice\"]")
	public static WebElement unit_price;
	
	@FindBy(xpath="//input[@id=\"quantity\"]")
	public static WebElement quantity;
	
	@FindBy(xpath="//input[@type=\"submit\"][1]")
	public static WebElement save;
	
	@FindBy(xpath="//div[@class=\"slider round\"][1]")
	public static WebElement enable;
	
	@FindBy(xpath="//button[@data-bb-handler=\"confirm\"]")
	public static WebElement saveok;
	
	@FindBy(xpath="//button[@data-bb-handler=\"ok\"]")
	public static WebElement ok;
	
	@FindBy(xpath="//span[@class=\"caret\"]")
	public static WebElement logout;
	
	@FindBy(xpath="//a[@href=\"/medicare/logout\"]")
	public static WebElement logoutbutton;
	
	@FindBy(xpath="//*[@id=\"listProducts\"]/a")
	public static WebElement View_Product;
	
	@FindBy(xpath="//input[@type=\"search\"]")
	public static WebElement search;
	
	@FindBy(xpath="//*[@id=\\\"productListTable_length\\\"]/label/select\"")
	public static WebElement filter;
	
	@FindBy(xpath="//option[@value=\"3\"]")
	public static WebElement option;
	
	@FindBy(xpath="//*[@id=\"productListTable\"]/tbody/tr[2]/td[6]/a[2]")
	public static WebElement add;
	
	@FindBy(xpath="//*[@id=\"cart\"]/tfoot/tr[2]/td[1]/a")
	public static WebElement continueshop;
	
	@FindBy(xpath="//*[@id=\"productListTable\"]/tbody/tr[5]/td[6]/a[2]/span")
	public static WebElement add1;
   
	@FindBy(xpath="//*[@id=\"productListTable\"]/tbody/tr[8]/td[6]/a[2]/span")
	public static WebElement add2;
	
	@FindBy(xpath="//*[@id=\"cart\"]/tfoot/tr[2]/td[4]/a")
	public static WebElement checkout;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[4]/a")
	public static WebElement Register;
	
	@FindBy(xpath="//*[@id=\"dropdownMenu1\"]")
	public static WebElement logout1;

	@FindBy(xpath="//*[@id=\"logout\"]/a")
	public static WebElement logout2;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[2]/div/div/div[3]/div/a")
	public static WebElement Register1;

	@FindBy(xpath="/html/body/div/div[1]/div/div[2]/div/div/div[3]/div/a")
	public static WebElement Registerpage;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	public static WebElement Firstnmae;
	
	@FindBy(xpath="//*[@id=\"lastName\"]")
	public static WebElement Lastname;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public static WebElement Email1;
	
	@FindBy(xpath="//*[@id=\"contactNumber\"]")
	public static WebElement contacno;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	public static WebElement password1;
	
	@FindBy(xpath="//*[@id=\"confirmPassword\"]")
	public static WebElement confirmpass;
	
	@FindBy(xpath="//*[@id=\"registerForm\"]/div[8]/div/button")
	public static WebElement billig;
	
	@FindBy(xpath="//*[@id=\"addressLineOne\"]")
	public static WebElement addressline1;
	
	@FindBy(xpath="//*[@id=\"addressLineTwo\"]")
	public static WebElement addressline2;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	public static WebElement city1;
	
	@FindBy(xpath="//*[@id=\"postalCode\"]")
	public static WebElement code1;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	public static WebElement state;
	
	@FindBy(xpath="//*[@id=\"country\"]")
	public static WebElement country1;
	
	@FindBy(xpath="//*[@id=\"billingForm\"]/div[7]/div/button[2]")
	public static WebElement confirm1l;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/div/div/a")
	public static WebElement confirom2;
	
	
	
	
	
	
	
	
	
	
}
