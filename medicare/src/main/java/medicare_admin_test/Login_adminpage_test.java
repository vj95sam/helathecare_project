package medicare_admin_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import medicare_admin.Login_admin_page;
import medicare_admin.Login_page;
import medicarepage.Loginpage;

public class Login_adminpage_test {
	@Test
	public void adminlogin() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/vigneshta95gmai/Downloads/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:9001/medicare/");
	
	PageFactory.initElements(driver, Login_page.class);
	Thread.sleep(3000);
	Login_page.Login.click();
	
	PageFactory.initElements(driver, Login_admin_page.class);

	Thread.sleep(3000);
	Login_admin_page.Email.sendKeys("vk@gmail.com");
	Login_admin_page.Password.sendKeys("admin");
	Login_admin_page.Login.click();
	
	Thread.sleep(2000);
	Login_admin_page.Manage_Product.click();
	}

}
