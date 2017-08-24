package com.xmy.sms.service;

import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.MultiData;
import com.xmy.sms.to.MultiDataTo;

import java.util.List;
import java.util.Map;

/**
 * Created by yiwg on 2017/7/22.
 */
public interface IMultiDataService {

    public List<MultiDataTo> list(MultiDataTo data, PageInfo page) throws ServiceException;

    public MultiData add(MultiData data)throws ServiceException ;

    public MultiData update(MultiData data) throws ServiceException;

    public void delete(MultiData data) throws ServiceException;

    public Map<String,List<Object>> getOptions(int id, int type);
}
