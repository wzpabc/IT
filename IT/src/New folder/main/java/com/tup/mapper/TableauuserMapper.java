package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Tableauuser;
import com.tup.model.TableauuserExample;
import com.tup.model.Tableauuser;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface TableauuserMapper extends BaseMapper<Tableauuser> {
  int countByExample(TableauuserExample example);

    int deleteByExample(TableauuserExample example);

    Integer insert(Tableauuser record);

    int insertSelective(Tableauuser record);

    List<Tableauuser> selectByExample(TableauuserExample example);

    int updateByExampleSelective(@Param("record") Tableauuser record, @Param("example") TableauuserExample example);

    int updateByExample(@Param("record") Tableauuser record, @Param("example") TableauuserExample example);
}