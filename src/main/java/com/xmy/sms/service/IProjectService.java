package com.xmy.sms.service;

import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.po.Project;

import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
public interface IProjectService {

    public List<Project> list(Project project, PageInfo page) throws ServiceException;

    public Project add(Project agentInfo)throws ServiceException ;

    public Project update(Project project) throws ServiceException;

    public void delete(Project project) throws ServiceException;
}
