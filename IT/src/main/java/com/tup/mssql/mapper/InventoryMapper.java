package com.tup.mssql.mapper;

import com.tup.mssql.model.Inventory;
import com.tup.mssql.model.InventoryKey;

public interface InventoryMapper {
    int deleteByPrimaryKey(InventoryKey key);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(InventoryKey key);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}