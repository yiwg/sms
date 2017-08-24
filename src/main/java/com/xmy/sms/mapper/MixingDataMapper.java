package com.xmy.sms.mapper;

import com.xmy.sms.po.MixingData;
import com.xmy.sms.po.MixingDataExample;
import java.util.List;

import com.xmy.sms.to.MixingDataTo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MixingDataMapper extends Mapper<MixingData> {
    int countBy(MixingDataExample example);

    int deleteBy(MixingDataExample example);

    List<MixingData> selectBy(MixingDataExample example);

    int updateBySelective(@Param("record") MixingData record, @Param("example") MixingDataExample example);

    int updateBy(@Param("record") MixingData record, @Param("example") MixingDataExample example);
    
    List<MixingDataTo> queryByKey(@Param("dataTo") MixingDataTo dataTo);

    List<Object> getproductionNames(@Param("id") int id,@Param("type") int type);

    List<Object> getConstructionPoints(@Param("id") int id,@Param("type") int type);
}