package com.nikhil.user.UserDetails;


/**
 * UserConstants is a constant class for maintaining all constant
 * @author nikhil
 * @since 28-11-2021
 *
 */
public class UserConstants {

	/**
	 * UserConstants() is a private constructor to hide the implicit public one
	 */
	private UserConstants() {
		throw new IllegalStateException();
	}
	
	public static final int START_INDEX= 1;
	
	public static final String DISPLAY_PATTERN= "*";

	public static final String NEW_LINE= "\n";
	
	public static final String UNICODE_FORMAT = "UTF-8";
	
	public static final String SUFFIX = ".html";
	
	public static final String PREFIX = "templates/";
	
	public static final String TEMPLATE_MODE = "HTML5";
	
}
