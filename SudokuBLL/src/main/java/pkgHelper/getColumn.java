package pkgHelper;

public class getColumn {

	public int[] getColumn(int iCol) {
		
		int[][] square = getLatinSquare();
		int[] result = new int[9];
		
		for (int i=0; i<9; i++) {
			result[i] = square[i][iCol];
		}
		
		return result;
		
	}
}
