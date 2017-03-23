/**
 * 
 */
package com.mustajab.object.mapper.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class ResourceReaderImpl implements ResourceReader {

	/**
	 * 
	 */
	private Splitter splitter;

	/**
	 * @param splitter
	 */
	public ResourceReaderImpl(Splitter splitter) {
		super();
		this.splitter = splitter;
	}

	@Override
	public Map<String, String> readFile(String fileName) {
		Map<String, String> map = null;
		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				map = splitter.split(scanner.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

}
