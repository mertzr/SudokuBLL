package pkgHelper;
public class doesElementExist {
	
	public boolean doesElementExist (int[] arr, int iValue) {
		
		if (arr == null) {
			return false;
		}
		for (int i=0; i<arr.length; i++)
			if (arr[i] == iValue)
				return true;
		return false;
		
	}
}
