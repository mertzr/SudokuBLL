package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgTest.LatinSquare;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.hasDuplicates(arr));

		int[] arr2 = { 1, 1, 3, 4, 5 };
		LatinSquare lq = new LatinSquare();

		assertTrue(lq.hasDuplicates(arr));

		int[] arr3 = { 1, 1, 3, 4, 1 };
		LatinSquare lq = new LatinSquare();

		assertTrue(lq.hasDuplicates(arr));

		int[] arr4 = null;
		LatinSquare lq = new LatinSquare();

		assertFalse(lq.hasDuplicates(arr));
	}

	@Test
	public void ContainsZeroTest1() {
		int[][] myArray = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };

		LatinSquare ls = new LatinSquare(myArray);

		// System.out.println(ls.ContainsZero());

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

	@Test
	public void hasAllValues1() {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 1, 3, 5, 7, 9 };
		LatinSquare lq = new LatinSquare();

		assertTrue(lq.hasAllValues(arr1, arr2));
	}

	@Test
	public void hasAllValues2() {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 1, 3, 5, 8, 9 };
		LatinSquare lq = new LatinSquare();

		assertTrue(lq.hasAllValues(arr1, arr2));
	}

	@Test
	public int[] getColumnTest(int iCol) {

		int[][] square = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		int[][] square2 = { { 1, 2, 5 }, { 2, 7, 1 }, { 3, 3, 2 } };

		int[] result = new int[9];

		for (int i = 0; i < 9; i++) {
			result[i] = square[i][iCol];
		}

		return result;
	}

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
