package com.xmy.sms.mapper;

import com.xmy.sms.po.Ent;
import com.xmy.sms.po.EntExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface EntMapper extends Mapper<Ent> {
    int countBy(EntExample example);

    int deleteBy(EntExample example);

    List<Ent> selectBy(EntExample example);

    int updateBySelective(@Param("record") Ent record, @Param("example") EntExample example);

    int updateBy(@Param("record") Ent record, @Param("example") EntExample example);
}