package pkgHelper;

public class getColumnTest {
	@Test
	
	public int[] getColumnTest(int iCol) {
		
		int[][] square = {{1,2,3}, {2,3,1}, {3,1,2}};
		int[][] square2 = {{1,2,5}, {2,7,1}, {3,3,2}};
		
		int[] result = new int[9];
		
		for (int i=0; i<9; i++) {
			result[i] = square[i][iCol];
		}
		
		return result;
		
	}
}
