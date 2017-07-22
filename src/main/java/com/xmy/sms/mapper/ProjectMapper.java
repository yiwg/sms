package com.xmy.sms.mapper;

import com.xmy.sms.po.Project;
import com.xmy.sms.po.ProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ProjectMapper extends Mapper<Project> {
    int countBy(ProjectExample example);

    int deleteBy(ProjectExample example);

    List<Project> selectBy(ProjectExample example);

    int updateBySelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateBy(@Param("record") Project record, @Param("example") ProjectExample example);
}