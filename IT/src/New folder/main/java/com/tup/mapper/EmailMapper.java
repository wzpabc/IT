package com.tup.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Email;
import com.tup.model.EmailExample;

public interface EmailMapper extends  BaseMapper<Email> {
    int countByExample(EmailExample example);

    int deleteByExample(EmailExample example);

    Integer insert(Email record);

    int insertSelective(Email record);

    List<Email> selectByExample(EmailExample example);

    int updateByExampleSelective(@Param("record") Email record, @Param("example") EmailExample example);

    int updateByExample(@Param("record") Email record, @Param("example") EmailExample example);
}