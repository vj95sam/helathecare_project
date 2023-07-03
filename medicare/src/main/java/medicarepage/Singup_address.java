package medicarepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Singup_address {
	
	@FindBy(xpath="//*[@id=\"addressLineOne\"]")
	public static WebElement Address_line_one;
	
	@FindBy(xpath="//*[@id=\"addressLineTwo\"]")
	public static WebElement Address_Line_Two;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	public static WebElement City;

	@FindBy(xpath="//*[@id=\"postalCode\"]")
	public static WebElement Postal_Code;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	public static WebElement State; 
	
	@FindBy(xpath="//*[@id=\"country\"]")
	public static WebElement Country;
	
	@FindBy(xpath="//*[@id=\"billingForm\"]/div[7]/div/button")
	public static WebElement Address;
}
