package pkgHelper;

import java.util.Arrays;

public class hasAllValues {

	public boolean hasAllValues1(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (arr1==arr2) {
			return true;
		}
		return false;
		
	}
}