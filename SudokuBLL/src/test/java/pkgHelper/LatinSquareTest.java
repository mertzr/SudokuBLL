package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void ContainsZeroTest() {
		int[][] myArray = {{1,2,3}, {2,3,1}, {3,1,2}};
		
		LatinSquare ls = new LatinSquare(myArray);
		
		/* System.out.println(ls.ContainsZero());
		
		assertFalse(ls.ContainsZero());
		
		myArray[0][1] = 0;
		
		assertTrue(ls.ContainsZero()); */
		
		int[] myIntArray = {1,2,3,4,5};
		int iValue = 4;
		
		assertTrue(ls.doesElementExist(myIntArray,  iValue));
		
		iValue = 9;
		assertFalse(ls.doesElementExist(myIntArray,  iValue));
	}
	public void hasDuplicates_test1() {
		
		int [] arr= {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
	}
	public void hasAllValues_test1() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5};
		
		assertTrue(hasAllValues(arr1,arr2));
	}
}
