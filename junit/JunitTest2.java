package junit;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
public class JunitTest2 {
	Employee emp=new Employee();
	ArrayList<String> al=new ArrayList<String>();
	
	@Test
	public void test1() {
		al.add("Pranav");
		al.add("Ram");
		al.add("Shyam");
		al.add("Geeta");
		assertEquals("FOUND", emp.findName(al, "Ram"));
		assertEquals("FOUND", emp.findName(al, "Pranav"));
		assertEquals("NOT FOUND", emp.findName(al, "Riya"));
	}

}
