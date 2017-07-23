package com.xmy.sms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.constant.ResultConstant;
import com.xmy.sms.mapper.ProjectMapper;
import com.xmy.sms.po.Project;
import com.xmy.sms.po.ProjectExample;
import com.xmy.sms.service.IProjectService;
import exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
@Service
public class ProjectService extends BaseService implements IProjectService{

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> list(Project project, PageInfo page) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ProjectService.list()方法");
        }

        List<Project> projects;
        try {
            //分页助手
            PageHelper.startPage(page.getPageNum(),page.getPageSize());
            ProjectExample projectExample=new ProjectExample();
            projects=projectMapper.selectBy(projectExample);
            logger.info("坐席获取成功，获取坐席个数:"+projects.size());
        }
        catch(Exception e){
            logger.warn("坐席查询异常",e);
            throw new ServiceException(ResultConstant.AGENT_QUERY_ERROR,ResultConstant.AGENT_QUERY_ERROR_DESC);
        }
        return projects;
    }

    @Override
    public Project add(Project agentInfo) throws ServiceException {
        return null;
    }

    @Override
    public Project update(Project project) throws ServiceException {
        return null;
    }

    @Override
    public void delete(Project project) throws ServiceException {

    }
}
