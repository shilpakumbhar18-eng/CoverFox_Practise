package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {
	SoftAssert softAssert= new SoftAssert();
  @Test
  public void a() {
	  String url=null;
	  softAssert.assertNotNull(url);
	  String a="test";
	  String b="test1";
	  softAssert.assertEquals(a, b);
	  softAssert.assertAll();
	  
  }
}
