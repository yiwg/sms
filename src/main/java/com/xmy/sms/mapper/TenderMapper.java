package com.xmy.sms.mapper;

import com.xmy.sms.po.Tender;
import com.xmy.sms.po.TenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TenderMapper extends Mapper<Tender> {
    int countBy(TenderExample example);

    int deleteBy(TenderExample example);

    List<Tender> selectBy(TenderExample example);

    int updateBySelective(@Param("record") Tender record, @Param("example") TenderExample example);

    int updateBy(@Param("record") Tender record, @Param("example") TenderExample example);
}