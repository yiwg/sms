package com.xmy.sms.constant;


/**
 * <dl>
 * <dt>ResultConstant</dt>
 * <dd>Description:</dd>
 * 企业相关：-1****   用户相关：-2****  角色相关：-3****  权限相关：-4****
 * 坐席相关：-5****   技能组相关：-6****  资源相关：-7**** 配置相关：-8****
 * 分机相关：-9****
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2016年12月25日</dd>
 * </dl>
 *
 * @author cy
 */
public class ResultConstant {
    public static final int SUCCESS = 0;

    public static final String SUCCESS_DESC = "成功";

    public static final int FAIL = 1;

    public static final String FAIL_DESC = "失败";

    public static final int Unauthorized = -2;

    public static final String Unauthorized_DESC = "未登录或已失效";


    /**************企业相关*******************/
    public static final String ENT_NOT_EXIST = "-10001";
    public static final String ENT_NOT_EXIST_DESC = "企业编号不存在";

    public static final String ENT_NAME_ERROR = "-10002";
    public static final String ENT_NAME_ERROR_DESC = "企业名称有误";
    public static final String ENT_ID_ILLEGAL = "-10003";
    public static final String ENT_ID_ILLEGAL_DESC = "企业编号含有非法字符";
    public static final String ENT_NO_AUTHORITY_ERROR = "-10004";
    public static final String ENT_NO_AUTHORITY_ERROR_DESC = "用户对该企业没有操作权限！";
    
    

    /**************用户相关*******************/
    public static String LOGIN_USER_EXIST = "-20001";
    public static String LOGIN_USER_EXIST_DESC = "登录账号已存在";
    public static String UM_EXIST_ERROR = "-20002";
    public static String UM_EXIST_ERROR_DESC = "UM已存在";

    /**************技能组相关*******************/
    public static String SKILL_QUEUE_TIME_OUTLEN_ERROR = "-60001";
    public static String SKILL_QUEUE_TIME_OUTLEN_ERROR_DESC = "排队策略排队超时不能为负数！";
    public static String SKILL_EXIST_ERROR = "-60002";
    public static String SKILL_EXIST_ERROR_DESC = "技能组已经存在！";

    public static String SKILL_NOT_EXIST_ERROR = "-60003";
    public static String SKILL_NOT_EXIST_ERROR_DESC = "技能组不存在！";
    public static String SKILL_GET_AGENT_ERROR = "-60004";
    public static String SKILL_GET_AGENT_ERROR_DESC = "根据技能组获取坐席信息异常！";
    public static String SKILL_NAME_ILLEGAL_ERROR = "-60005";
    public static String SKILL_NAME_ILLEGAL_ERROR_DESC = "技能组名称非法！";
    public static String SKILL_PREANALYSIS_ERROR = "-60006";
    public static String SKILL_PREANALYSIS_ERROR_DESC = "技能组导入预处理异常！";
    public static String SKILL_EXCELDATA_LOST_ERROR = "-60007";
    public static String SKILL_EXCELDATA_LOST_ERROR_DESC = "预处理数据丢失，请重新上传！";
    public static String SKILL_GENERATE_ERR_EXCEL_ERROR = "-60008";
    public static String SKILL_GENERATE_ERR_EXCEL_ERROR_DESC = "生成错误数据的excel异常！";
    public static String SKILL_DIALOUTNUM_ERROR = "-60009";
    public static String SKILL_DIALOUTNUM_ERROR_DESC = "外呼号码异常！";
    public static String SKILL_GETSKILLINFO_ERROR = "-60010";
    public static String SKILL_GETSKILLINFO_ERROR_DESC = "查询技能组信息异常！";
    public static String SKILL_UPDATE_ERROR = "-60011";
    public static String SKILL_UPDATE_ERROR_DESC = "更新技能组信息异常！";
    public static String SKILL_DEL_ERROR = "-60012";
    public static String SKILL_DEL_ERROR_DESC = "删除技能组异常！";
    public static String SKILL_CONFIRMIMPORT_ERROR = "-60013";
    public static String SKILL_CONFIRMIMPORT_ERROR_DESC = "技能组批量导入异常！";
    public static String SKILL_QUERYFORPAGE_ERROR = "-60014";
    public static String SKILL_QUERYFORPAGE_ERROR_DESC = "技能组翻页查询异常！";
    public static String SKILL_ADD_ERROR = "-60015";
    public static String SKILL_ADD_ERROR_DESC = "技能组新增异常！";
    public static String SKILL_DIALOUTNUM_NOTEXIST_ERROR = "-60016";
    public static String SKILL_DIALOUTNUM_NOTEXIST_ERROR_DESC = "外呼号码不存在！";
    public static String SKILL_GET_UNASSIGNED_AGENT_ERROR = "-60017";
    public static String SKILL_GET_UNASSIGNED_AGENT_ERROR_DESC = "获取未分配到该技能组的坐席信息异常！";
    public static String SKILL_GET_ASSIGNED_AGENT_ERROR = "-60018";
    public static String SKILL_GET_ASSIGNED_AGENT_ERROR_DESC = "获取分配到该技能组的坐席信息异常！";
    public static String SKILL_ASSIGN_AGENT_ERROR = "-60019";
    public static String SKILL_ASSIGN_AGENT_ERROR_DESC = "为技能组分配坐席异常！";
    

    /**************资源相关*******************/
    public static String RESOURCE_ASSIGN_SG_ERROR = "-70001";
    public static String RESOURCE_ASSIGN_SG_ERROR_DESC = "技能组迁移异常！";

    /**************分机相关*******************/
    public static String DN_EXTENSION_EXIST="-90001";
    public static String DN_EXTENSION_EXIST_DESC="设备分机已存在";
    public static String DN_FORMAL_ERROR="-90002";
    public static String DN_FORMAL_ERROR_DESC="设备分机含有非法字符";
    public static String DN_TYPE_ERROR="-90003";
    public static String DN_TYPE_ERROR_DESC="设备分机类型有误";
    public static String DN_QUERY_ERROR="-90004";
    public static String DN_QUERY_ERROR_DESC="设备分机查询异常";
    public static String DN_STATTUS_CODE_ERROR="-90005";
    public static String DN_STATTUS_CODE_ERROR_DESC="设备分机状态值错误";
    public static String DN_EXTENSION_NOT_EXIST="-90006";
    public static String DN_EXTENSION_NOT_EXIST_DESC="设备分机不存在";
    public static String DN_STATUS_UPDATE_ERROR="-90007";
    public static String DN_STATUS_UPDATE_ERROR_DESC="设备分机状态更新异常";
    public static String DN_RECORD_SAVE_ERROR="-90008";
    public static String DN_RECORD_SAVE_ERROR_DESC="向录音注册表保存号码异常";
    public static String DN_SAVE_ERROR="-90009";
    public static String DN_SAVE_ERROR_DESC="设备分机保存异常";
    public static String DN_DELETE_ERROR="-90010";
    public static String DN_DELETE_ERROR_DESC="设备分机删除异常";
    public static String DN__RECORD_DELETE_ERROR="-90011";
    public static String DN__RECORD_DELETE_ERROR_DESC="录音注册表删除异常";
    public static String DN__STATUS_ENABLE="-90012";
    public static String DN__STATUS_ENABLE_DESC="设备分机目前为启用状态";

    public static String DN__STATUS_DISABLE="-90014";
    public static String DN__STATUS_DISABLE_DESC="设备分机目前为停用状态";
    //批量导入预处理错误结果
    public static String DN__EXTENSION_ILLEGAL="-90015";
    public static String DN__EXTENSION_ILLEGAL_DESC="设备分机号格式错误";



    /**********************坐席相关***************************/
    public static String AGENT_ID_EXIST="-50001";
    public static String AGENT_ID_EXIST_DESC="坐席已存在";
    public static String AGENT_ID_NOT_EXIST="-50002";
    public static String AGENT_ID_NOT_EXIST_DESC="坐席不存在";
    public static String AGENT_EDIT_ERROR="-50003";
    public static String AGENT_EDIT_ERROR_DESC="坐席更新异常";
    public static String AGENT_UPDATE_STATUS_ERROR="-50004";
    public static String AGENT_UPDATE_STATUS_ERROR_DESC="坐席状态更新异常";
    public static String AGENT_GET_STATUS_ERROR="-50005";
    public static String AGENT_GET_STATUS_ERROR_DESC="坐席状态获取异常";
    public static String AGENT_STATUS_USING="-50006";
    public static String AGENT_STATUS_USING_DESC="坐席目前为启用状态";

    public static String AGENT_QUERY_ERROR="-50007";
    public static String AGENT_QUERY_ERROR_DESC="坐席查询异常";

    public static String AGENT_SAVE_ERROR="-50008";
    public static String AGENT_SAVE_ERROR_DESC="坐席保存异常";
    public static String AGENT_DELETE_ERROR="-50009";
    public static String AGENT_DELETE_ERROR_DESC="坐席删除异常";

    public static String AGENT_EXISE_IN_SG="-50010";
    public static String AGENT_EXISE_IN_SG_DESC="坐席已分配到技能组，无法删除";

    public static String AGENT_ID_ILLEGAL="-50011";
    public static String AGENT_ID_ILLEGAL_DESC="坐席编号非法";

    public static String AGENT_ROLE_ILLEGAL="-50012";
    public static String AGENT_ROLE_ILLEGAL_DESC="坐席角色非法";

    public static String AGENT_PWD_ILLEGAL="-50013";
    public static String AGENT_PWD_ILLEGAL_DESC="坐席密码非法";

    public static String AGENT_NAME_ILLEGAL="-50014";
    public static String AGENT_NAME_ILLEGAL_DESC="坐席名称非法";

    public static String AGENT_UM_ILLEGAL="-50015";
    public static String AGENT_UM_ILLEGAL_DESC="坐席UM号非法";

    public static String AGENT_UM_EXIST="-50016";
    public static String AGENT_UM_EXIST_DESC="坐席UM号已存在";

    public static String AGENT_STATUS_UN_USING="-50017";
    public static String AGENT_STATUS_UN_USING_DESC="坐席目前为停用状态";

    public static String AGENT_PLACEID_ILLEGAL="-50018";
    public static String AGENT_PLACEID_ILLEGAL_DESC="坐席位置编号非法";

    public static String AGENT_ID_DUPLICATE="-50019";
    public static String AGENT_ID_DUPLICATE_DESC="坐席编号冲突";

    public static String AGENT_NAME_ERROR="-50020";
    public static String AGENT_NAME_ERROR_DESC="坐席姓名不匹配";


    /******************其他异常***************************/
    public static String FILE__UPLOAD_FAIL="-91000";
    public static String FILE__UPLOAD_FAIL_DESC="文件上传失败";
    public static String FILE__READ_FAIL="-91001";
    public static String FILE__READ_FAIL_DESC="文件读取失败";
    public static String SHEET_NAME_ERROR="-90013";
    public static String SHEET_NAME_ERROR_DESC="模板类型与操作类型不一致";

}