package com.ai.yc.common.service.atom.idustry.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.yc.common.dao.mapper.bo.GnIndustry;
import com.ai.yc.common.dao.mapper.bo.GnIndustryCriteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.service.atom.idustry.IIdustryAtomSV;

@Component
public class IndustryAtomSVImpl implements IIdustryAtomSV {

    @Override
    public List<GnIndustry> selectByExample(GnIndustryCriteria example) {
        return MapperFactory.getGnIndustryMapper().selectByExample(example);
    }

    @Override
    public GnIndustry selectByPrimaryKey(String industryCode) {
        return MapperFactory.getGnIndustryMapper().selectByPrimaryKey(industryCode);
    }

}
