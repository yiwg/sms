package com.xmy.sms.service;

import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.MixingData;
import com.xmy.sms.to.MixingDataTo;

import java.util.List;
import java.util.Map;

/**
 * Created by yiwg on 2017/7/22.
 */
public interface IMixingDataService {


    public List<MixingDataTo> list(MixingDataTo data, PageInfo page) throws ServiceException;

    public MixingData add(MixingData data)throws ServiceException ;

    public MixingData update(MixingData data) throws ServiceException;

    public void delete(MixingData data) throws ServiceException;

    public Map<String,List<Object>> getOptions(int id, int type);


}
