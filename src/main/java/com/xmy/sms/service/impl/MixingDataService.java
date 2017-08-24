package com.xmy.sms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.mapper.MixingDataMapper;
import com.xmy.sms.po.MixingData;
import com.xmy.sms.po.MixingDataExample;
import com.xmy.sms.service.IMixingDataService;
import com.xmy.sms.to.MixingDataTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.xmy.sms.constant.MixingDataTypeConstant;

/**
 * Created by yiwg on 2017/7/22.
 */
@Service
public class MixingDataService extends BaseService implements IMixingDataService {

    @Autowired
    private MixingDataMapper dataMapper;

    @Override
    public List<MixingDataTo> list(MixingDataTo dataTo, PageInfo page) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("MixingDataService.list()方法");
        }
        List<MixingDataTo> datas=null;
        try {
            //分页助手
            PageHelper.startPage(page.getPageNum(),page.getPageSize());
            MixingDataExample dataExample=new MixingDataExample();
            datas=dataMapper.queryByKey(dataTo);
            /*for(MixingDataTo data:datas){
                data.setTypeName(MixingDataTypeConstant.map.getDescByValue(Integer.parseInt(data.getType())).toString());
            }*/
            logger.info("拌合机数据获取成功，获取拌合机数据个数:"+datas.size());
        }
        catch(Exception e){
            logger.warn("拌合机数据获取成功",e);
            throw new ServiceException("拌合机数据列表获取异常");
        }
        return datas;
    }

    @Override
    public MixingData add(MixingData data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("MixingDataService.add()方法");
        }
        try {
            MixingDataExample ie=new MixingDataExample();
            /*ie.createCriteria().andNameEqualTo(data.getName());
            int count=dataMapper.countBy(ie);
            if(count>0){
                throw new ServiceException("拌合机数据名称已存在!");
            }*/
            dataMapper.insert(data);
            logger.info("拌合机数据添加成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("拌合机数据名称已存在!",e);
            throw new ServiceException("拌合机数据名称已存在!");
        }
        catch(Exception e){
            logger.warn("拌合机数据添加异常",e);
            throw new ServiceException("拌合机数据添加异常");
        }
        return data;
    }

    @Override
    public MixingData update(MixingData data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("MixingDataService.update()方法");
        }
        try {
            MixingDataExample ie=new MixingDataExample();
            //dataMapper.updateByPrimarySelective(data);
            logger.info("拌合机数据更新成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("拌合机数据名称已存在!",e);
            throw new ServiceException("拌合机数据名称已存在!");
        }
        catch(Exception e){
            logger.warn("拌合机数据更新异常",e);
            throw new ServiceException("拌合机数据更新异常");
        }
        return data;
    }

    @Override
    public void delete(MixingData data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("MixingDataService.delete()方法");
        }
        try {
            int count=dataMapper.deleteByPrimaryKey(data);
            if(count<=0){
                throw new ServiceException("拌合机数据不存在!");
            }
            logger.info("拌合机数据删除成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("拌合机数据不存在!",e);
            throw new ServiceException("拌合机数据不存在!");
        }
        catch(Exception e){
            logger.warn("删除异常",e);
            throw new ServiceException("拌合机数据删除异常");
        }
    }

    @Override
    public Map<String, List<Object>> getOptions(int id, int type) {
        if(logger.isDebugEnabled()){
            logger.debug("MixingDataService.getOptions()方法");
        }
        List<Object> option=null;
        List<Integer> ids=null;
        Map<String, List<Object>> result=new HashMap<>();
        try {
            option=new ArrayList<>();
            option=dataMapper.getproductionNames(id,type);
            result.put("productionName",option);
            option=new ArrayList<>();
            option=dataMapper.getConstructionPoints(id,type);
            result.put("constructionPoint",option);
        }
        catch(Exception e){
            logger.warn("Option获取成功",e);
            throw new ServiceException("Option获取异常");
        }
        return result;
    }

}
