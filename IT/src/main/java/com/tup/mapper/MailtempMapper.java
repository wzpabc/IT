package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Mailtemp;
import com.tup.model.MailtempExample;
import com.tup.model.Mailtemp;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-05-27
 */
public interface MailtempMapper extends BaseMapper<Mailtemp> {
  int countByExample(MailtempExample example);

    int deleteByExample(MailtempExample example);

    Integer insert(Mailtemp record);

    int insertSelective(Mailtemp record);

    List<Mailtemp> selectByExample(MailtempExample example);

    int updateByExampleSelective(@Param("record") Mailtemp record, @Param("example") MailtempExample example);

    int updateByExample(@Param("record") Mailtemp record, @Param("example") MailtempExample example);
}