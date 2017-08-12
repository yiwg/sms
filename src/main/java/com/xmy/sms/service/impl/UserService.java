package com.xmy.sms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.constant.UserTypeConstant;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.mapper.UserMapper;
import com.xmy.sms.po.User;
import com.xmy.sms.po.UserExample;
import com.xmy.sms.service.IUserService;
import com.xmy.sms.to.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
@Service
public class UserService extends BaseService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserTo> list(UserTo userTo, PageInfo page) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("UserService.list()方法");
        }

        List<UserTo> users=null;
        try {
            //分页助手
            PageHelper.startPage(page.getPageNum(),page.getPageSize());
            UserExample userExample=new UserExample();
            users=userMapper.queryByKey(userTo);
            for(UserTo user:users){
                user.setTypeName(UserTypeConstant.map.getDescByValue(Integer.parseInt(user.getType())).toString());
            }
            logger.info("用户获取成功，获取用户个数:"+users.size());
        }
        catch(Exception e){
            logger.warn("用户获取成功",e);
            throw new ServiceException("用户列表获取异常");
        }
        return users;
    }

    @Override
    public User add(User user) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("UserService.add()方法");
        }
        try {
            UserExample ie=new UserExample();
            ie.createCriteria().andNameEqualTo(user.getName());
            int count=userMapper.countBy(ie);
            if(count>0){
                throw new ServiceException("用户名称已存在!");
            }
            userMapper.insert(user);
            logger.info("用户添加成功:【"+user+"】");
        }
        catch(ServiceException e){
            logger.warn("用户名称已存在!",e);
            throw new ServiceException("用户名称已存在!");
        }
        catch(Exception e){
            logger.warn("用户添加异常",e);
            throw new ServiceException("用户添加异常");
        }
        return user;
    }

    @Override
    public User update(User user) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("UserService.update()方法");
        }
        try {
            UserExample ie=new UserExample();
            userMapper.updateByPrimarySelective(user);
            logger.info("用户更新成功:【"+user+"】");
        }
        catch(ServiceException e){
            logger.warn("用户名称已存在!",e);
            throw new ServiceException("用户名称已存在!");
        }
        catch(Exception e){
            logger.warn("用户更新异常",e);
            throw new ServiceException("用户更新异常");
        }
        return user;
    }

    @Override
    public void delete(User user) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("UserService.delete()方法");
        }
        try {
            int count=userMapper.deleteByPrimaryKey(user);
            if(count<=0){
                throw new ServiceException("用户不存在!");
            }
            logger.info("用户删除成功:【"+user+"】");
        }
        catch(ServiceException e){
            logger.warn("用户不存在!",e);
            throw new ServiceException("用户不存在!");
        }
        catch(Exception e){
            logger.warn("删除异常",e);
            throw new ServiceException("用户删除异常");
        }
    }

}
