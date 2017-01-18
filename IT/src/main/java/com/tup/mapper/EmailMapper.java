package com.tup.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Email;
import com.tup.service.IEmailService;

public interface EmailMapper extends BaseMapper<Email> {
    int countByExample(IEmailService example);

    int deleteByExample(IEmailService example);

    //int insert(Email record);

    int insertSelective(Email record);

    List<Email> selectByExample(IEmailService example);

    int updateByExampleSelective(@Param("record") Email record, @Param("example") IEmailService example);

    int updateByExample(@Param("record") Email record, @Param("example") IEmailService example);
}