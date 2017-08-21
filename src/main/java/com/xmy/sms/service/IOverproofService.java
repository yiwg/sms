package com.xmy.sms.service;

import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.Overproof;
import com.xmy.sms.to.OverproofTo;

import java.util.List;
import java.util.Map;

/**
 * Created by yiwg on 2017/7/22.
 */
public interface IOverproofService {

    public List<OverproofTo> list(OverproofTo data, PageInfo page) throws ServiceException;

    public Overproof add(Overproof data)throws ServiceException ;

    public Overproof update(Overproof data) throws ServiceException;

    public void delete(Overproof data) throws ServiceException;

}
