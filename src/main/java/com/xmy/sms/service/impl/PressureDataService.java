package com.xmy.sms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
//import com.xmy.sms.constant.PressureDataTypeConstant;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.mapper.PressureDataMapper;
import com.xmy.sms.po.PressureData;
import com.xmy.sms.po.PressureDataExample;
import com.xmy.sms.service.IPressureDataService;
import com.xmy.sms.to.PressureDataTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yiwg on 2017/7/22.
 */
@Service
public class PressureDataService extends BaseService implements IPressureDataService {

    @Autowired
    private PressureDataMapper dataMapper;

    @Override
    public List<PressureDataTo> list(PressureDataTo dataTo, PageInfo page) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("PressureDataService.list()方法");
        }
        List<PressureDataTo> datas=null;
        try {
            //分页助手
            PageHelper.startPage(page.getPageNum(),page.getPageSize());
            PressureDataExample dataExample=new PressureDataExample();
            datas=dataMapper.queryByKey(dataTo);
            /*for(PressureDataTo data:datas){
                data.setTypeName(PressureDataTypeConstant.map.getDescByValue(Integer.parseInt(data.getType())).toString());
            }*/
            logger.info("压力数据获取成功，获取压力数据个数:"+datas.size());
        }
        catch(Exception e){
            logger.warn("压力数据获取成功",e);
            throw new ServiceException("压力数据列表获取异常");
        }
        return datas;
    }

    @Override
    public PressureData add(PressureData data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("PressureDataService.add()方法");
        }
        try {
            PressureDataExample ie=new PressureDataExample();
            /*ie.createCriteria().andNameEqualTo(data.getName());
            int count=dataMapper.countBy(ie);
            if(count>0){
                throw new ServiceException("压力数据名称已存在!");
            }*/
            dataMapper.insert(data);
            logger.info("压力数据添加成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("压力数据名称已存在!",e);
            throw new ServiceException("压力数据名称已存在!");
        }
        catch(Exception e){
            logger.warn("压力数据添加异常",e);
            throw new ServiceException("压力数据添加异常");
        }
        return data;
    }

    @Override
    public PressureData update(PressureData data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("PressureDataService.update()方法");
        }
        try {
            PressureDataExample ie=new PressureDataExample();
            //dataMapper.updateByPrimarySelective(data);
            logger.info("压力数据更新成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("压力数据名称已存在!",e);
            throw new ServiceException("压力数据名称已存在!");
        }
        catch(Exception e){
            logger.warn("压力数据更新异常",e);
            throw new ServiceException("压力数据更新异常");
        }
        return data;
    }

    @Override
    public void delete(PressureData data) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("PressureDataService.delete()方法");
        }
        try {
            int count=dataMapper.deleteByPrimaryKey(data);
            if(count<=0){
                throw new ServiceException("压力数据不存在!");
            }
            logger.info("压力数据删除成功:【"+data+"】");
        }
        catch(ServiceException e){
            logger.warn("压力数据不存在!",e);
            throw new ServiceException("压力数据不存在!");
        }
        catch(Exception e){
            logger.warn("删除异常",e);
            throw new ServiceException("压力数据删除异常");
        }
    }

    @Override
    public Map<String, List<Object>> getOptions(int id, int type) {
        if(logger.isDebugEnabled()){
            logger.debug("PressureDataService.getOptions()方法");
        }
        List<Object> option=null;
        List<Integer> ids=null;
        Map<String, List<Object>> result=new HashMap<>();
        try {
            option=new ArrayList<>();
            option=dataMapper.getLabNames(id,type);
            result.put("labName",option);
            option=new ArrayList<>();
            option=dataMapper.getDeviceNames(id,type);
            result.put("deviceName",option);
            option=new ArrayList<>();
            option=dataMapper.getTestTypes(id,type);
            result.put("testType",option);
            option=new ArrayList<>();
            option=dataMapper.getDeviceNums(id,type);
            result.put("deviceNum",option);
            option=new ArrayList<>();
            option=dataMapper.getAges(id,type);
            result.put("age",option);
            option=new ArrayList<>();
            option=dataMapper.getConstructionPoints(id,type);
            result.put("constructionPoint",option);
            option=new ArrayList<>();
            option=dataMapper.getDesignStrengths(id,type);
            result.put("designStrength",option);
        }
        catch(Exception e){
            logger.warn("Option获取成功",e);
            throw new ServiceException("Option获取异常");
        }
        return result;
    }

}
