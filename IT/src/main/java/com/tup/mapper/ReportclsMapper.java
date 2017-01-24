package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Reportcls;
import com.tup.model.ReportclsExample;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface ReportclsMapper extends BaseMapper<Reportcls> {
  int countByExample(ReportclsExample example);

    int deleteByExample(ReportclsExample example);

    Integer insert(Reportcls record);

    int insertSelective(Reportcls record);

    List<Reportcls> selectByExample(ReportclsExample example);

    int updateByExampleSelective(@Param("record") Reportcls record, @Param("example") ReportclsExample example);

    int updateByExample(@Param("record") Reportcls record, @Param("example") ReportclsExample example);
}