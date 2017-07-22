package com.xmy.sms.mapper;

import com.xmy.sms.po.Menu;
import com.xmy.sms.po.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MenuMapper extends Mapper<Menu> {
    int countBy(MenuExample example);

    int deleteBy(MenuExample example);

    List<Menu> selectBy(MenuExample example);

    int updateBySelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateBy(@Param("record") Menu record, @Param("example") MenuExample example);
}