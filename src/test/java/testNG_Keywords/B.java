package testNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
  @Test(dependsOnMethods= {"b"})
  public void a() {
	  Reporter.log(" a test",true);
  }
  @Test()
  public void b() {
	  Assert.fail();
	  Reporter.log(" b test",true);
  }
  @Test()
  public void c() {
	  Reporter.log(" c test",true);
  }
  
}
