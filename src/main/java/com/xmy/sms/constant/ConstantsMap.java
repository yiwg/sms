package com.xmy.sms.constant;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * <dl>
 * <dt>ConstantsMap</dt>
 * <dd>Description:常量类映射Map</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2016年12月25日</dd>
 * </dl>
 *
 * @author cy
 */
public class ConstantsMap {
    private LinkedHashMap<Object, Object> map = new LinkedHashMap();

    public ConstantsMap() {
    }

    public void putConstant(Object value, Object desc) {
        this.map.put(value, desc);
    }

    public Object getDescByValue(Object value) {
        return this.map.get(value);
    }

    public Set getValueSet() {
        return this.map.keySet();
    }

    public Collection getDescSet() {
        return this.map.values();
    }

    public Set getConstantsSet() {
        return this.map.entrySet();
    }
}