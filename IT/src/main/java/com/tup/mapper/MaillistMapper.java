package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Maillist;
import com.tup.model.MaillistExample;
import com.tup.model.Maillist;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-05-27
 */
public interface MaillistMapper extends BaseMapper<Maillist> {
  int countByExample(MaillistExample example);

    int deleteByExample(MaillistExample example);

    Integer insert(Maillist record);

    int insertSelective(Maillist record);

    List<Maillist> selectByExample(MaillistExample example);

    int updateByExampleSelective(@Param("record") Maillist record, @Param("example") MaillistExample example);

    int updateByExample(@Param("record") Maillist record, @Param("example") MaillistExample example);
}