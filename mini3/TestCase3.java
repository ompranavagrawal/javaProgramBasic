package mini3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
public class TestCase3 {
	   @Test
	   public void test1() {	
		
			Video v=new Video("The Matrix", 0, 0);
			assertEquals(0, v.beingCheckedOut());
			
		}
		@Test
		public void test2() {
			Video v=new Video("The Matrix", 0, 0);
			assertEquals(1, v.beingReturned());
		}
		@Test
		public void test3() {
			Video v=new Video("The Matrix", 1, 0);
			assertEquals(1, v.getCheckedOut());
		}
		@Test
		public void test4() {
			Video v=new Video("The Matrix", 0, 1);
			assertEquals(1, v.getRating());
		}
		@Test
		public void test5() {
			Video v=new Video("Godfather II", 0, 0);
			assertEquals("Godfather II", v.getTitle());
		}
		@Test
		public void test6() {
			VideoStore vs=new VideoStore();
			assertNotNull(vs);
		}
		@Test
		public void test7() {
			VideoStore vs=new VideoStore();
			assertNotNull(vs.toString());
		}
		


}


