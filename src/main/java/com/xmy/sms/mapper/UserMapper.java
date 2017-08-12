package com.xmy.sms.mapper;

import com.xmy.sms.po.User;
import com.xmy.sms.po.UserExample;
import java.util.List;

import com.xmy.sms.to.UserTo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    int countBy(UserExample example);

    int deleteBy(UserExample example);

    List<User> selectBy(UserExample example);

    int updateBySelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimarySelective(User user);

    int updateBy(@Param("record") User record, @Param("example") UserExample example);

    List<UserTo> queryByKey(@Param("userTo") UserTo userTo);
}