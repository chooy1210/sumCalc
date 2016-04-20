package sumcal;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void test() {
		
		Hello h = new Hello();
		h.sum(5);
		assertEquals(15,h.getResult());
		
	}

}
