package com.xmy.sms.service;

import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.PressureData;
import com.xmy.sms.to.PressureDataTo;

import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
public interface IPressureDataService {

    public List<PressureDataTo> list(PressureDataTo data, PageInfo page) throws ServiceException;

    public PressureData add(PressureData data)throws ServiceException ;

    public PressureData update(PressureData data) throws ServiceException;

    public void delete(PressureData data) throws ServiceException;
}
