package com.octo.tools.crud.utils;

import org.atteo.evo.inflector.English;

/**
 * Helper class for String operations
 * 
 * @author OCTO
 * 
 */
public class StringUtils {

	private StringUtils() {};
	
	/**
	 * @param o the object
	 * @return null if o is null, else o.toString()
	 */
	public static String toString(Object o) {
		return o== null ? null : o.toString();
	}
	
	
	
	/**
	 * @param name the name (singular form)
	 * @return the plural form of the name
	 */
	public static String plural(String name) {
		if(name == null || name.length() == 0) {
			return name;
		}
		return English.plural(name);
	}
	
}
