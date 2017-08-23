package com.xmy.sms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.mapper.OverproofMapper;
import com.xmy.sms.po.Overproof;
import com.xmy.sms.po.OverproofExample;
import com.xmy.sms.service.IOverproofService;
import com.xmy.sms.to.OverproofTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.xmy.sms.constant.OverproofTypeConstant;

/**
 * Created by yiwg on 2017/7/22.
 */
@Service
public class OverproofService extends BaseService implements IOverproofService {

    @Autowired
    private OverproofMapper dataMapper;

    @Override
    public List<OverproofTo> list(OverproofTo dataTo, PageInfo page) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("OverproofService.list()方法");
        }
        List<OverproofTo> datas=null;

        try {
            //分页助手
            PageHelper.startPage(page.getPageNum(),page.getPageSize());
            OverproofExample dataExample=new OverproofExample();
            datas=dataMapper.queryByKey(dataTo);
            /*for(OverproofTo data:datas){
                data.setTypeName(OverproofTypeConstant.map.getDescByValue(Integer.parseInt(data.getType())).toString());
            }*/
            logger.info("超标数据获取成功，获取超标数据个数:"+datas.size());
        }
        catch(Exception e){
            logger.warn("超标数据获取成功",e);
            throw new ServiceException("超标数据列表获取异常");
        }
        return datas;
    }

    @Override
    public Overproof add(Overproof data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("OverproofService.add()方法");
        }
        try {
            OverproofExample ie=new OverproofExample();
            /*ie.createCriteria().andNameEqualTo(data.getName());
            int count=dataMapper.countBy(ie);
            if(count>0){
                throw new ServiceException("超标数据名称已存在!");
            }*/
            dataMapper.insert(data);
            logger.info("超标数据添加成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("超标数据名称已存在!",e);
            throw new ServiceException("超标数据名称已存在!");
        }
        catch(Exception e){
            logger.warn("超标数据添加异常",e);
            throw new ServiceException("超标数据添加异常");
        }
        return data;
    }

    @Override
    public Overproof update(Overproof data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("OverproofService.update()方法");
        }
        try {
            OverproofExample ie=new OverproofExample();
            //dataMapper.updateByPrimarySelective(data);
            logger.info("超标数据更新成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("超标数据名称已存在!",e);
            throw new ServiceException("超标数据名称已存在!");
        }
        catch(Exception e){
            logger.warn("超标数据更新异常",e);
            throw new ServiceException("超标数据更新异常");
        }
        return data;
    }

    @Override
    public void delete(Overproof data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("OverproofService.delete()方法");
        }
        try {
            int count=dataMapper.deleteByPrimaryKey(data);
            if(count<=0){
                throw new ServiceException("超标数据不存在!");
            }
            logger.info("超标数据删除成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("超标数据不存在!",e);
            throw new ServiceException("超标数据不存在!");
        }
        catch(Exception e){
            logger.warn("删除异常",e);
            throw new ServiceException("超标数据删除异常");
        }
    }

}
