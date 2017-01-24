package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Usermapping;
import com.tup.model.UsermappingExample;
import com.tup.model.Usermapping;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface UsermappingMapper extends BaseMapper<Usermapping> {
  int countByExample(UsermappingExample example);

    int deleteByExample(UsermappingExample example);

    Integer insert(Usermapping record);

    int insertSelective(Usermapping record);

    List<Usermapping> selectByExample(UsermappingExample example);

    int updateByExampleSelective(@Param("record") Usermapping record, @Param("example") UsermappingExample example);

    int updateByExample(@Param("record") Usermapping record, @Param("example") UsermappingExample example);
}