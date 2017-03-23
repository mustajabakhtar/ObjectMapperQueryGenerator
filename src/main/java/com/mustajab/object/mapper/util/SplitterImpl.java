/**
 * 
 */
package com.mustajab.object.mapper.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class SplitterImpl implements Splitter {

	private Map<String, String> splittedLine = new HashMap<String, String>();

	@Override
	public Map<String, String> split(String line) {

		String[] splitLine = line.split("=");
		splittedLine.put(splitLine[0], splitLine[1]);
		return splittedLine;
	}

}
