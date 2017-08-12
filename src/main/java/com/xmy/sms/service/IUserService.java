package com.xmy.sms.service;

import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.User;
import com.xmy.sms.to.UserTo;

import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
public interface IUserService {

    public List<UserTo> list(UserTo user, PageInfo page) throws ServiceException;

    public User add(User user)throws ServiceException ;

    public User update(User user) throws ServiceException;

    public void delete(User user) throws ServiceException;
}
