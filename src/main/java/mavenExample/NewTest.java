package mavenExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void fTest() {
	  
	  System. setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  System.out.println("Opening chrome...............|");
	  driver.get("https://www.google.com/");
  }
}
