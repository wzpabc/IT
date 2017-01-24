package com.tup.service;

import com.baomidou.mybatisplus.service.IService;
import com.tup.commons.utils.PageInfo;
import com.tup.model.SysLog;

/**
 *
 * SysLog 表数据服务层接口
 *
 */
public interface ISysLogService extends IService<SysLog> {

    void selectDataGrid(PageInfo pageInfo);

}