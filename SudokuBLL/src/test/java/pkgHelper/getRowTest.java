package pkgHelper;

import static org.junit.Assert.*;
import org.junit.Test;

public class getRowTest {
	@Test
	public void getRowTest() {
		
		int[][] square1 = {{1,2,3}, {2,3,1}, {3,1,2}};
		int[][] square2 = {{1,7,3}, {2,2,1}, {3,8,2}};
		
		int[] result1 = square1[1];
		int[] result2 = square2()[0];
		
		int[] r1 = {2,3,1};
		int[] r2 = {1,7,3};
		
		assertTrue("getRow works", (result1 == r1));
		assertTrue("getRow works", (result2 == r2));
		
		
	}
}

