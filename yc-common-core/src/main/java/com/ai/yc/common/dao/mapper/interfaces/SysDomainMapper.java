package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.SysDomain;
import com.ai.yc.common.dao.mapper.bo.SysDomainCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDomainMapper {
    int countByExample(SysDomainCriteria example);

    int deleteByExample(SysDomainCriteria example);

    int deleteByPrimaryKey(String domainId);

    int insert(SysDomain record);

    int insertSelective(SysDomain record);

    List<SysDomain> selectByExample(SysDomainCriteria example);

    SysDomain selectByPrimaryKey(String domainId);

    int updateByExampleSelective(@Param("record") SysDomain record, @Param("example") SysDomainCriteria example);

    int updateByExample(@Param("record") SysDomain record, @Param("example") SysDomainCriteria example);

    int updateByPrimaryKeySelective(SysDomain record);

    int updateByPrimaryKey(SysDomain record);
}