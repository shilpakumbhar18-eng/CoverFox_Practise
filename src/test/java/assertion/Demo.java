package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void a() {
	  String a="Test1";
	  String b="Test";
	  Assert.assertEquals(a, b,"a and b are not equal TC failed");
  }
  @Test
  public void b()
  {
	  String a="Test1";
      String b="Test";
      Assert.assertNotEquals(a, b, " a and b are equal TC failed");
	  
  }
  
  @Test
  public void c()
  {
	  boolean result=true;
	  Assert.assertTrue(result,"result is false TC failed");
	  
  }
  @Test
  public void d()
  {
	  boolean result=false;
	  Assert.assertFalse(result,"result is true TC failed");
	  
  }
  @Test
  public void e()
  {
	  String url= null;
	  Assert.assertNull(url,"url is not null TC failed");
	  
  }
  @Test
  public void f()
  {
	  String url= null;
	  Assert.assertNotNull(url,"url is null TC failed");
	  
  }
  @Test
  public void g()
  {
	  Assert.fail();
	  
  }
  @Test
  public void h()
  {
	String url=null;
	Assert.assertNotNull(url,"url is null TC failes");
	String a="Test";
	String b="Test";
	Assert.assertEquals(a, b, " a and b are different TC failed");
	  
  }
  
 
  
  
}
