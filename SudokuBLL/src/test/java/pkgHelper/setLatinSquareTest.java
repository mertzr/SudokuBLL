
package pkgHelper;

public class setLatinSquareTest {
	@Test
	public void setLatinSquare(int[][] latinSquare) {
		myLatinSquare = latinSquare; 
		
		assertTrue("setLatinSquare works", (myLatinSquare == latinSquare));
	}
}
