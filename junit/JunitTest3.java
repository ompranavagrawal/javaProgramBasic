package junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class JunitTest3 {
	MyUnit1 my1=new MyUnit1();
	@Test
	public void test1() {
		assertEquals(true, my1.palindromeCheck("madam"));//madam, mom, dad, malayalam
	}
	@Test
	public void test2() {
		assertEquals(true, my1.palindromeCheck("mom"));
	}
	@Test
	public void test3() {
		assertEquals(true, my1.palindromeCheck("dad"));
	}
	@Test
	public void test4() {
		assertEquals(true, my1.palindromeCheck("malayalam"));
	}

}
