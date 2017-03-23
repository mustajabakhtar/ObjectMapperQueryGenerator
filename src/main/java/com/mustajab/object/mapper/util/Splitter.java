/**
 * 
 */
package com.mustajab.object.mapper.util;

import java.util.Map;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public interface Splitter {

	/**
	 * @param line
	 * @return
	 */
	Map<String, String> split(String line);
}
