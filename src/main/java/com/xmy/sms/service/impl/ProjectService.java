package com.xmy.sms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.constant.ResultConstant;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.mapper.ProjectMapper;
import com.xmy.sms.po.Project;
import com.xmy.sms.po.ProjectExample;
import com.xmy.sms.service.IProjectService;
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
            logger.info("工程获取成功，获取工程个数:"+projects.size());
        }
        catch(Exception e){
            logger.warn("工程获取成功",e);
            throw new ServiceException("工程列表获取异常");
        }
        return projects;
    }

    @Override
    public Project add(Project project) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ProjectService.add()方法");
        }
        Project pjt;
        try {
            ProjectExample pe=new ProjectExample();
            pe.createCriteria().andNameEqualTo(project.getName());
            int count=projectMapper.countBy(pe);
            if(count>0){
                throw new ServiceException("工程名称已存在!");
            }
            projectMapper.insert(project);
            logger.info("工程添加成功:【"+project+"】");
        }
        catch(ServiceException e){
            logger.warn("工程名称已存在!",e);
            throw new ServiceException("工程名称已存在!");
        }
        catch(Exception e){
            logger.warn("工程添加异常",e);
            throw new ServiceException("工程添加异常");
        }
        return project;
    }

    @Override
    public Project update(Project project) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ProjectService.update()方法");
        }
        Project pjt;
        try {

            pjt=projectMapper.selectByPrimaryKey(project);
            if(!pjt.getName().equals(project.getName())){
                ProjectExample pe=new ProjectExample();
                pe.createCriteria().andNameEqualTo(project.getName());
                int count=projectMapper.countBy(pe);
                if(count>0){
                    throw new ServiceException("工程名称已存在!");
                }
            }
            projectMapper.updateByPrimaryKey(project);
            logger.info("工程修改成功:【"+project+"】");
        }
        catch(ServiceException e){
            logger.warn("工程名称已存在!",e);
            throw new ServiceException("工程名称已存在!");
        }
        catch(Exception e){
            logger.warn("工程修改异常",e);
            throw new ServiceException("工程修改异常");
        }
        return project;
    }

    @Override
    public void delete(Project project) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ProjectService.delete()方法");
        }
        try {
            int count=projectMapper.deleteByPrimaryKey(project);
            if(count<=0){
                throw new ServiceException("工程不存在!");
            }
            logger.info("工程删除成功:【"+project+"】");
        }
        catch(ServiceException e){
            logger.warn("工程不存在!",e);
            throw new ServiceException("工程不存在!");
        }
        catch(Exception e){
            logger.warn("工程删除异常",e);
            throw new ServiceException("工程删除异常");
        }
    }
}
