package medicare_admin_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import medicare_admin.Login_page;


public class Login_page_test {

	@Test
	public void Loginpage() {
		System.setProperty("webdriver.chrome.driver", "/home/vigneshta95gmai/Downloads/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:9001/medicare/");
		
		PageFactory.initElements(driver, Login_page.class);
		
		Login_page.Login.click();
	}
}
