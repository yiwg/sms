package com.xmy.sms.mapper;

import com.xmy.sms.po.PressureData;
import com.xmy.sms.po.PressureDataExample;
import java.util.List;

import com.xmy.sms.to.PressureDataTo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PressureDataMapper extends Mapper<PressureData> {
    int countByExample(PressureDataExample example);

    int deleteByExample(PressureDataExample example);

    List<PressureData> selectByExample(PressureDataExample example);

    int updateByExampleSelective(@Param("record") PressureData record, @Param("example") PressureDataExample example);

    int updateByExample(@Param("record") PressureData record, @Param("example") PressureDataExample example);

    List<PressureDataTo> queryByKey(@Param("dataTo") PressureDataTo dataTo);

    List<Object> getLabNames(@Param("id") int id,@Param("type") int type);

    List<Object> getDeviceNames(@Param("id") int id,@Param("type") int type);

    List<Object> getTestTypes(@Param("id") int id,@Param("type") int type);

    List<Object> getDeviceNums(@Param("id") int id,@Param("type") int type);

    List<Object> getAges(@Param("id") int id,@Param("type") int type);

    List<Object> getConstructionPoints(@Param("id") int id,@Param("type") int type);

    List<Object> getDesignStrengths(@Param("id") int id,@Param("type") int type);

}