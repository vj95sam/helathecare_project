package medicarepagetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import medicarepage.Homepage;
import medicarepage.Loginpage;

public class Loginpagetest {
	@Test
	public void loingpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/vigneshta95gmai/Downloads/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:9001/medicare/");
		
		PageFactory.initElements(driver, Homepage.class);
		Thread.sleep(2000);
		Homepage.Login.click();
		
		PageFactory.initElements(driver, Loginpage.class);
		
		Thread.sleep(3000);
		Loginpage.Email.sendKeys("kn@gmail.com");
		Loginpage.Password.sendKeys("12345");
		Loginpage.Login.click();
		
		Thread.sleep(3000);
        Loginpage.View_Product.click();
        Thread.sleep(1000);
        Loginpage.Paracetamol.click();
        Thread.sleep(2000);
        Loginpage.Checkout.click();
		
		
	}

		
	}


