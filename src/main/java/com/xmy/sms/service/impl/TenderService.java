package com.xmy.sms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.mapper.ItemMapper;
import com.xmy.sms.mapper.TenderMapper;
import com.xmy.sms.po.Item;
import com.xmy.sms.po.Tender;
import com.xmy.sms.po.TenderExample;
import com.xmy.sms.service.ITenderService;
import com.xmy.sms.to.TenderTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
@Service
public class TenderService extends BaseService implements ITenderService {

    @Autowired
    private TenderMapper tenderMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<TenderTo> list(TenderTo tenderTo, PageInfo page) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("TenderService.list()方法");
        }

        List<TenderTo> tenders=null;
        try {
            //分页助手
            PageHelper.startPage(page.getPageNum(),page.getPageSize());
            TenderExample tenderExample=new TenderExample();
            tenders=tenderMapper.queryByKey(tenderTo);
           // logger.info("标段获取成功，获取标段个数:"+tenders.size());
        }
        catch(Exception e){
            logger.warn("标段获取成功",e);
            throw new ServiceException("标段列表获取异常");
        }
        return tenders;
    }

    @Override
    public Tender add(Tender tender) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("TenderService.add()方法");
        }
        try {
            TenderExample ie=new TenderExample();
            ie.createCriteria().andNameEqualTo(tender.getName())
                    .andItemIdEqualTo(tender.getItemId());
            int count=tenderMapper.countBy(ie);
            if(count>0){
                throw new ServiceException("标段名称已存在!");
            }
            Item item=itemMapper.selectByPrimaryKey(tender.getItemId());
            tender.setProjectId(item.getProjectId());
            tenderMapper.insert(tender);
            logger.info("标段添加成功:【"+tender+"】");
        }
        catch(ServiceException e){
            logger.warn("标段名称已存在!",e);
            throw new ServiceException("标段名称已存在!");
        }
        catch(Exception e){
            logger.warn("标段添加异常",e);
            throw new ServiceException("标段添加异常");
        }
        return tender;
    }

    @Override
    public Tender update(Tender tender) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("TenderService.update()方法");
        }
        try {
            TenderExample ie=new TenderExample();
            ie.createCriteria().andNameEqualTo(tender.getName())
                    .andItemIdEqualTo(tender.getItemId());
            int count=tenderMapper.countBy(ie);
            if(count>0){
                throw new ServiceException("标段名称已存在!");
            }
            Item item=itemMapper.selectByPrimaryKey(tender.getItemId());
            tender.setProjectId(item.getProjectId());
            tenderMapper.updateByPrimaryKey(tender);
            logger.info("标段更新成功:【"+tender+"】");
        }
        catch(ServiceException e){
            logger.warn("标段名称已存在!",e);
            throw new ServiceException("标段名称已存在!");
        }
        catch(Exception e){
            logger.warn("标段更新异常",e);
            throw new ServiceException("标段更新异常");
        }
        return tender;
    }

    @Override
    public void delete(Tender tender) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("TenderService.delete()方法");
        }
        try {
            int count=tenderMapper.deleteByPrimaryKey(tender);
            if(count<=0){
                throw new ServiceException("标段不存在!");
            }
            logger.info("标段删除成功:【"+tender+"】");
        }
        catch(ServiceException e){
            logger.warn("标段不存在!",e);
            throw new ServiceException("标段不存在!");
        }
        catch(Exception e){
            logger.warn("删除异常",e);
            throw new ServiceException("标段删除异常");
        }
    }

}
