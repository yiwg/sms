package com.xmy.sms.mapper;

import com.xmy.sms.po.Overproof;
import com.xmy.sms.po.OverproofExample;
import java.util.List;

import com.xmy.sms.to.OverproofTo;
import com.xmy.sms.to.PressureDataTo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OverproofMapper extends Mapper<Overproof> {
    int countByExample(OverproofExample example);

    int deleteByExample(OverproofExample example);

    List<Overproof> selectByExample(OverproofExample example);

    int updateByExampleSelective(@Param("record") Overproof record, @Param("example") OverproofExample example);

    int updateByExample(@Param("record") Overproof record, @Param("example") OverproofExample example);

    List<OverproofTo> queryByKey(@Param("dataTo") OverproofTo dataTo);
}