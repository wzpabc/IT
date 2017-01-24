package com.tup.commons.base;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DbcontextHolder extends AbstractRoutingDataSource {

	public static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	public static final String DATA_SOURCE_SQLSERVER = "sqlServerDataSource";
	public static final String DATA_SOURCE_DEFAULT_MYSQL = "mySqlDataSource";

	/**
	 * 设置当前数据源
	 * 
	 * @param dbType
	 */
	public static void setDbType(String dbType) {
		contextHolder.set(dbType);
	}

	/**
	 * 获得当前数据源
	 * 
	 * @return
	 */

	public static String getDbType() {
		String str = (String) contextHolder.get();
		if (null == str || "".equals(str))
			str = "1";
		return str;
	}

	/**
	 * 清除上下文
	 *
	 */ 
    public static void clearDbType()  
    {  
        contextHolder.remove();  
    } 
	@Override
	protected Object determineCurrentLookupKey() {
		return DbcontextHolder.getDbType();
	}
}
