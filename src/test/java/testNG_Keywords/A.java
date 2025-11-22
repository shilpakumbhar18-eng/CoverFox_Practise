package testNG_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
 /* @Test(invocationCount=5)
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.coverfox.com/");
  }*/
  @Test(enabled=false)
  public void signIn()
  {
	  Reporter.log("sign in",true);
	  
  }
  @Test(timeOut=2000)
  public void logIn() throws InterruptedException
  {
	  Thread.sleep(3000);
	  Reporter.log("log in",true);
  }
}
