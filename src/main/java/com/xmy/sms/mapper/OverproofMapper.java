package com.xmy.sms.mapper;

import com.xmy.sms.po.Overproof;
import com.xmy.sms.po.OverproofExample;
import java.util.List;

import com.xmy.sms.to.OverproofTo;
import com.xmy.sms.to.PressureDataTo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OverproofMapper extends Mapper<Overproof> {
    int countBy(OverproofExample example);

    int deleteBy(OverproofExample example);

    List<Overproof> selectBy(OverproofExample example);

    int updateBySelective(@Param("record") Overproof record, @Param("example") OverproofExample example);

    int updateBy(@Param("record") Overproof record, @Param("example") OverproofExample example);

    List<OverproofTo> queryByKey(@Param("dataTo") OverproofTo dataTo);
}