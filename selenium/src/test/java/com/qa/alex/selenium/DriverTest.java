package com.qa.alex.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverTest {
	//WebDriver driver;
	
	
    /*@Before
    public void setup() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\AUTOMATED_TESTING_WEEK_10\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    }
    
    @After
    public void tearDown() {
    	driver.quit();
    }
    
    @Test
    public void methodTest() {
    	driver.manage().window().maximize();
    	driver.get("https://en.wikipedia.org/wiki/Mohamed_Salah");
    }
    
    WebElement checkElement = driver.findElement(By.xpath
    		("//*[@id="rso"]/div[2]/div/div/div[2]/div[1]/a/h3"));
    assertEquals("Selenium", checkElement.getText());
    */
	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\AUTOMATED_TESTING_WEEK_10\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.katalon.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  /*@Test
	  public void testGoogleSalahTestCase() throws Exception {
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
	    driver.findElement(By.name("q")).clear();
	    driver.findElement(By.name("q")).sendKeys("mohamed salah");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web results'])[1]/following::h3[1]")).click();
	    driver.findElement(By.id("firstHeading")).click();
	    assertEquals("Mohamed Salah", driver.findElement(By.id("firstHeading")).getText());
	    assertEquals("Mohamed Salah - Wikipedia", driver.getTitle());
	    driver.findElement(By.id("content")).click();
	  }*/
	  
	  /*@Test
	  public void testTheDemoSiteTestCase() throws Exception {
	    driver.get("http://www.thedemosite.co.uk/");
	    
	    driver.findElement(By.linkText("3. Add a User")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("UrDaSellsAvon");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("alex");
	    driver.findElement(By.name("FormsButton2")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='PHP'])[1]/following::b[1]")).click();
	    driver.findElement(By.linkText("4. Login")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("UrDaSellsAvon");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("alex");
	    driver.findElement(By.name("FormsButton2")).click();
	    Thread.sleep(6000);
	  }*/
	  
	  @Test
	  public void testShoppingSiteTestCase() throws Exception {
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Summer Dresses'])[1]/following::a[1]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$30.51'])[2]/following::span[2]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$28.98'])[6]/following::span[1]")).click();
		driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("dodgy@hotmail.com");
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).clear();
	    driver.findElement(By.id("passwd")).sendKeys("hello");
	  }
		
		
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
