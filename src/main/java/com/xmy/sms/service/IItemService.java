package com.xmy.sms.service;

import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.Item;
import com.xmy.sms.po.Project;
import com.xmy.sms.to.ItemTo;

import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
public interface IItemService {

    public List<ItemTo> list(ItemTo item, PageInfo page) throws ServiceException;

    public Item add(Item item)throws ServiceException ;

    public Item update(Item item) throws ServiceException;

    public void delete(Item item) throws ServiceException;

    List<ItemTo> list4menu(ItemTo itemTo);
}
