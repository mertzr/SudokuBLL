package pkgHelper;
public class doesElementExist {
	
	public boolean doesElementExist (int[] arr, int iValue) {
		for (int i=0; i<arr.length; i++)
			if (arr[i] == iValue)
				return true;
		return false;
	}
}
