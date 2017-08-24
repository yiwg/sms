package com.xmy.sms.mapper;

import com.xmy.sms.po.MultiData;
import com.xmy.sms.po.MultiDataExample;
import java.util.List;

import com.xmy.sms.to.MultiDataTo;
import com.xmy.sms.to.PressureDataTo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MultiDataMapper extends Mapper<MultiData> {
    int countBy(MultiDataExample example);

    int deleteBy(MultiDataExample example);

    List<MultiData> selectBy(MultiDataExample example);

    int updateBySelective(@Param("record") MultiData record, @Param("example") MultiDataExample example);

    int updateBy(@Param("record") MultiData record, @Param("example") MultiDataExample example);

    List<MultiDataTo> queryByKey(@Param("dataTo") MultiDataTo dataTo);

    List<Object> getLabNames(@Param("id") int id,@Param("type") int type);

    List<Object> getDeviceNames(@Param("id") int id,@Param("type") int type);

    List<Object> getTestTypes(@Param("id") int id,@Param("type") int type);

    List<Object> getDeviceNums(@Param("id") int id,@Param("type") int type);

    //List<Object> getAges(@Param("id") int id,@Param("type") int type);

    List<Object> getConstructionPoints(@Param("id") int id,@Param("type") int type);

    //List<Object> getDesignStrengths(@Param("id") int id,@Param("type") int type);
}