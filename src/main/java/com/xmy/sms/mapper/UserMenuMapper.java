package com.xmy.sms.mapper;

import com.xmy.sms.po.UserMenu;
import com.xmy.sms.po.UserMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMenuMapper extends Mapper<UserMenu> {
    int countBy(UserMenuExample example);

    int deleteBy(UserMenuExample example);

    List<UserMenu> selectBy(UserMenuExample example);

    int updateBySelective(@Param("record") UserMenu record, @Param("example") UserMenuExample example);

    int updateBy(@Param("record") UserMenu record, @Param("example") UserMenuExample example);
}