package pkgHelper;

import java.util.Arrays;

public class hasDuplicates {
	public boolean hasDuplicates(int [] arr) {
		
		boolean hasDuplicates = false; 
		
		if (arr==null);{
			return false;
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i<arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				hasDuplicates = true;
				break;
			}
		return hasDuplicates;
	}
}
}
