package com.xmy.sms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xmy.sms.exception.ServiceException;
import com.xmy.sms.mapper.ItemMapper;
import com.xmy.sms.mapper.ProjectMapper;
import com.xmy.sms.mapper.TenderMapper;
import com.xmy.sms.po.*;
import com.xmy.sms.service.IItemService;
import com.xmy.sms.service.IProjectService;
import com.xmy.sms.to.ItemTo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiwg on 2017/7/22.
 */
@Service
public class ItemService extends BaseService implements IItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private TenderMapper tenderMapper;

    @Override
    public List<ItemTo> list(ItemTo itemTo, PageInfo page) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ItemService.list()方法");
        }

        List<ItemTo> items;
        try {
            //分页助手
            PageHelper.startPage(page.getPageNum(),page.getPageSize());
            ItemExample itemExample=new ItemExample();
            items=itemMapper.queryByKey(itemTo);
            logger.info("项目获取成功，获取项目个数:"+items.size());
        }
        catch(Exception e){
            logger.warn("项目获取成功",e);
            throw new ServiceException("项目列表获取异常");
        }
        return items;
    }

    @Override
    public Item add(Item item) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ItemService.add()方法");
        }
        try {
            ItemExample ie=new ItemExample();
            ie.createCriteria().andNameEqualTo(item.getName())
                    .andProjectIdEqualTo(item.getProjectId());
            int count=itemMapper.countBy(ie);
            if(count>0){
                throw new ServiceException("项目名称已存在!");
            }
            itemMapper.insert(item);
            logger.info("项目添加成功:【"+item+"】");
        }
        catch(ServiceException e){
            logger.warn("项目名称已存在!",e);
            throw new ServiceException("项目名称已存在!");
        }
        catch(Exception e){
            logger.warn("项目添加异常",e);
            throw new ServiceException("项目添加异常");
        }
        return item;
    }

    @Override
    public Item update(Item item) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ItemService.update()方法");
        }
        try {
            ItemExample ie=new ItemExample();
            ie.createCriteria().andNameEqualTo(item.getName())
                    .andProjectIdEqualTo(item.getProjectId());
            int count=itemMapper.countBy(ie);
            if(count>0){
                throw new ServiceException("项目名称已存在!");
            }
            itemMapper.updateByPrimaryKey(item);
            logger.info("项目更新成功:【"+item+"】");
        }
        catch(ServiceException e){
            logger.warn("项目名称已存在!",e);
            throw new ServiceException("项目名称已存在!");
        }
        catch(Exception e){
            logger.warn("项目更新异常",e);
            throw new ServiceException("项目更新异常");
        }
        return item;
    }

    @Override
    public void delete(Item item) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ItemService.delete()方法");
        }
        try {
            int count=itemMapper.deleteByPrimaryKey(item);
            if(count<=0){
                throw new ServiceException("项目不存在!");
            }
            logger.info("项目删除成功:【"+item+"】");
        }
        catch(ServiceException e){
            logger.warn("项目不存在!",e);
            throw new ServiceException("项目不存在!");
        }
        catch(Exception e){
            logger.warn("删除异常",e);
            throw new ServiceException("项目删除异常");
        }
    }

    @Override
    public List<ItemTo> list4menu(ItemTo itemTo) throws ServiceException {
        if(logger.isDebugEnabled()){
            logger.debug("ItemService.list()方法");
        }
        List<Item> items;
        List<Tender> tenders;
        List<ItemTo>  results=new ArrayList<>();
        try {
            items=itemMapper.selectAll();
            for(Item item:items){
                ItemTo itemTemp=new ItemTo();
                itemTemp.setId(item.getId());
                itemTemp.setName(item.getName());
                itemTemp.setMenuType(0);//menuType->0 项目   menuType->1 标段
                results.add(itemTemp);
                TenderExample te=new TenderExample();
                te.createCriteria().andItemIdEqualTo(item.getId());
                tenders=tenderMapper.selectBy(te);
                for(Tender t:tenders){
                    itemTemp=new ItemTo();
                    itemTemp.setId(t.getId());
                    itemTemp.setName(t.getName());
                    itemTemp.setMenuType(1);//menuType->0 项目   menuType->1 标段
                    results.add(itemTemp);
                }
            }
            logger.info("项目获取成功，获取项目个数:"+items.size());
        }
        catch(Exception e){
            logger.warn("项目获取成功",e);
            throw new ServiceException("项目列表获取异常");
        }
        return results;
    }

}
