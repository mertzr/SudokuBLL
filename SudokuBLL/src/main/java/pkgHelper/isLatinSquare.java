package pkgHelper;

public class isLatinSquare {
	public boolean isLatinSquare() {
		
		int firstRow = getRow(0);
		boolean noDuplicateBool = true;
		
		if (hasAllValues(firstRow)) {
			for (int counter = 1, aRow = getRow(counter); ((counter <= getRow(counter).length) || (noDuplicateBool == true)) ; counter ++) {
				if (hasDuplicates(firstRow, aRow)) {
					noDuplicateBool = false;
					return false;
				}
			}
		}
		else {
			return false;
		}
	}
}
