package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JunitTest1 {
	MyUnit my=new MyUnit();

	@Test
	   public void test1() {	  
	      assertEquals("ABCXYZ",my.stringConcat("ABC","XYZ"));
	   }

}
