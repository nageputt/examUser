package com.nikhil.user.UserDetails;

import com.nikhil.user.UserDetails.UserConstants;

/**
 * InvertedTriangularPattern class is a used to print the inverted triangle pattern
 * @author nikhil
 * @since 28-11-2021
 *
 */
public class InvertedTriangularPattern {

	StringBuilder pattern = new StringBuilder();

	/**
	 * printPatternRecur method is a recursive method to print inverted triangle
	 * @param range
	 * @param index
	 * @return
	 */
	String printPatternRecur(int range, int index) {
		if(range < UserConstants.START_INDEX) {
			return String.valueOf(pattern);
		}
		if(index <= range ) {
			System.out.print(UserConstants.DISPLAY_PATTERN);
			pattern.append(UserConstants.DISPLAY_PATTERN);
			printPatternRecur(range , index+UserConstants.START_INDEX);
		}else {
			System.out.print(UserConstants.NEW_LINE);
			pattern.append(UserConstants.NEW_LINE);
			printPatternRecur(range-UserConstants.START_INDEX, UserConstants.START_INDEX);
		}
		return String.valueOf(pattern);
		
	}

}
