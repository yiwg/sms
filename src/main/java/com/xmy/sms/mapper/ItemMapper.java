package com.xmy.sms.mapper;

import com.xmy.sms.po.Item;
import com.xmy.sms.po.ItemExample;
import java.util.List;

import com.xmy.sms.to.ItemTo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ItemMapper extends Mapper<Item> {
    int countBy(ItemExample example);

    int deleteBy(ItemExample example);

    List<ItemTo> selectBy(ItemExample example);

    List<ItemTo> queryByKey(@Param("itemTo") ItemTo itemTo);

    int updateBySelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateBy(@Param("record") Item record, @Param("example") ItemExample example);
}