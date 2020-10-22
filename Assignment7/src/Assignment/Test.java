package Assignment;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	WebDriver dr;
	String url="https://mail.google.com/mail";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		dr.quit();
	}

	@org.junit.Test
	public void test() {
		JavascriptExecutor java = (JavascriptExecutor)dr;
		java.executeScript("document.getElementByld('email').val=shreyajoshi427@gmail.com");
		
		java.executeScript("document.getElementByld('password').val='shreya@123'");
	}

}
