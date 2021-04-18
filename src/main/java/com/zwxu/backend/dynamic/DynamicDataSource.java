package com.zwxu.backend.dynamic;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 * @author   zyli5 
 */
public class DynamicDataSource  extends AbstractRoutingDataSource {

	@Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
