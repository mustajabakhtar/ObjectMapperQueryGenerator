/**
 * 
 */
package com.mustajab.object.mapper.util;

import java.sql.Connection;
import java.util.Map;

import com.mustajab.object.mapper.exception.ObjectMapperException;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public interface DatabaseConnector {

	/**
	 * @return
	 */
	Connection databasesConnection(Map<String,String> map) throws ObjectMapperException;
}
