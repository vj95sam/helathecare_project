package medicare_admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {
	
	@FindBy(xpath="//*[@id=\"login\"]/a")
	public static WebElement Login;

}
