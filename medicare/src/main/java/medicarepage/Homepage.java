package medicarepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage{
	
	@FindBy(xpath="//*[@id=\"login\"]/a")
	public static WebElement Login;

}
