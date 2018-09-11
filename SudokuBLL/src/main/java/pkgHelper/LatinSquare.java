package pkgHelper;

public class LatinSquare {

	private int[][] myLatinSquare;

	public LatinSquare(int[][] twoDimArray)
	{
		this.myLatinSquare = twoDimArray;
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
	
	public boolean doesElementExist(int[] arr, int iValue)
	{
		for (int i : arr)
		{
			if (i == iValue)
				return true;
		}
		return false;
	}
	
	
	public void setLatinSquare(int[][] latinSquare) {
		myLatinSquare = latinSquare; 
	}
	
}
