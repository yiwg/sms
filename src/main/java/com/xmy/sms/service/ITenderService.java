package com.xmy.sms.service;

import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.Tender;
import com.xmy.sms.to.TenderTo;

import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
public interface ITenderService {

    public List<TenderTo> list(TenderTo tender, PageInfo page) throws ServiceException;

    public Tender add(Tender tender)throws ServiceException ;

    public Tender update(Tender tender) throws ServiceException;

    public void delete(Tender tender) throws ServiceException;
}
