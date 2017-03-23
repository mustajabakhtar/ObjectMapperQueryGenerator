/**
 * 
 */
package com.mustajab.object.mapper.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

import com.mustajab.object.mapper.constants.Constants;
import com.mustajab.object.mapper.exception.ObjectMapperException;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class DatabaseConnectorImpl implements DatabaseConnector {

	@Override
	public Connection databasesConnection(Map<String,String> map) throws ObjectMapperException {
		try {
			Class.forName(map.get(Constants.DRIVER_NAME));
			Connection conn = DriverManager.getConnection(map.get(Constants.DATABASE_URL), map.get(Constants.USER_NAME), "");
			return conn;
		} catch (Exception ex) {
			System.out.println(ex);
			throw new ObjectMapperException("Exception occurred in establishing connection");
		}
	}

}
