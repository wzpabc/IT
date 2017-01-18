package com.tup.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.RoleResource;

/**
 *
 * RoleResource 表数据库控制层接口
 *
 */
public interface RoleResourceMapper extends BaseMapper<RoleResource> {

    Long selectIdListByRoleId(@Param("id") Long id);

}