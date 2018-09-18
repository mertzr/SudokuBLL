package pkgHelper;

public class LatinSquare {

	private int[][] myLatinSquare;

	public LatinSquare(int[][] twoDimArray)
	{
		this.myLatinSquare = twoDimArray;
	}
	
	public int[][] getLatinSquare(){
		return this.LatinSquare;
	}
	
	public boolean doesElementExist (int[] arr, int iValue) {
		
		if (arr == null) {
			return false;
		}
		for (int i=0; i<arr.length; i++)
			if (arr[i] == iValue)
				return true;
		return false;
		
	}
	
	public boolean ContainsZero()
	{
		
		for (int iCol = 0; iCol < myLatinSquare.length; iCol++)
		{
			for (int iRow = 0; iRow < myLatinSquare[iCol].length; iRow++)
			{
				if (myLatinSquare[iCol][iRow] == 0)
				return true;
			}
		}
		return false;
	}
	
	public boolean hasAllValues1(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (arr1==arr2) {
			return true;
		}
		return false;
		
	}
	
	public boolean doesElementExist(int[] arr, int iValue)
	{
		for (int i : arr)
		{
			if (i == iValue)
				return true;
		}
		return false;
	}
	
	public int[] getRow(int iRow) {
		return getLatinSquare()[iRow];
	}
	
	public int[] getColumn(int iCol) {
		
		int[][] square = getLatinSquare();
		int[] result = new int[9];
		
		for (int i=0; i<9; i++) {
			result[i] = square[i][iCol];
		}
		
		return result;
		
	}
	
	public boolean hasDuplicates1(int [] arr) {
		
		boolean hasDuplicates = false; 
		
		if (arr==null){
			return false;
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i<arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				hasDuplicates = true;
				break;
			}
		}
		return hasDuplicates;
	}
}
