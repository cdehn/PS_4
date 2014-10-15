import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage1.calculateFV;


public class ps4Junit {

	@Test
	public void testcalculateFV() {
		calculateFV tester = new calculateFV(1000, 5, 7);
		assertEquals(tester.getFutureValue(), 1402.5517307, 0.1);
	}

}
