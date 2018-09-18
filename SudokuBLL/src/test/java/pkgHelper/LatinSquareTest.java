package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		int[] arr = { 1, 2, 3, 4, 5 };
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.hasDuplicates(arr));
		
		arr = { 1, 1, 3, 4, 5 };

		assertTrue(lq.hasDuplicates(arr));
		
		arr = { 1, 1, 3, 4, 1 };

		assertTrue(lq.hasDuplicates(arr));
		
		arr = null;

		assertFalse(lq.hasDuplicates(arr));

	}

	@Test
	public void ContainsZeroTest1() {
		int[][] myArray = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };

		LatinSquare ls = new LatinSquare(myArray);

		//System.out.println(ls.ContainsZero());

		assertFalse(ls.ContainsZero());
		
		myArray[0][1] = 0;

		assertTrue(ls.ContainsZero());
	}

	@Test
	public void doesElementExistTest() {

		int[] myIntArray = { 1, 2, 3, 4, 5 };
		int iValue = 4;
		
		LatinSquare lq = new LatinSquare(myIntArray);

		assertTrue(lq.doesElementExist(myIntArray, iValue));

		iValue = 9;
		assertFalse(lq.doesElementExist(myIntArray, iValue));
		
		myIntArray = null;

		assertFalse(lq.doesElementExist(myIntArray, iValue));

	}

	@Test
	public void isLatinSquare() {
		int[][] myArray1 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };

		LatinSquare lq = new LatinSquare(myArray1);

		assertTrue(lq.isLatinSquare());
		
		int[][] myArray2 = { { 2, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };

		LatinSquare lq = new LatinSquare(myArray2);

		assertFalse(lq.isLatinSquare());
		
		int[][] myArray3 = { { 1, 2, 3 }, { 2, 3, 1 }, { 2, 1, 2 } };

		LatinSquare lq = new LatinSquare(myArray3);

		assertFalse(lq.isLatinSquare());
		
		int[][] myArray4 = { { 1, 2, 3 }, { 3, 2, 1 }, { 3, 1, 2 } };

		LatinSquare lq = new LatinSquare(myArray4);

		assertTrue(lq.isLatinSquare());
	}
}
