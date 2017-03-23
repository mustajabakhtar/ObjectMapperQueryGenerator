/**
 * 
 */
package com.mustajab.object.mapper.util;

import java.util.Map;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public interface ResourceReader {
   
	/**
	 * @param fileName
	 * @return
	 */
	Map<String, String> readFile(String fileName);
}
