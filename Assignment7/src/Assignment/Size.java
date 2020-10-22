package Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
	WebDriver dr;
	String url="https://api.jquery.com/dbclick";


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

	@Test
	public void test() {
		Dimension dimension = new Dimension(700,400);
		dr.manage().window().setSize(dimension);
		
		
	}

}
