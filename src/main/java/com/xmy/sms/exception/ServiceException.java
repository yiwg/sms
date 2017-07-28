package com.xmy.sms.exception;

/**
 * <dl>
 * <dt>ServiceException</dt>
 * <dd>Description:Service异常</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2016年12月25日</dd>
 * </dl>
 *
 * @author cy
 */
public class ServiceException extends RuntimeException
{

    public ServiceException()
    {
        super();
    }

    private String code;

    public ServiceException(String message)
    {
        super(message);
    }

    public ServiceException(String message, Throwable cause)
    {
        super(message, cause);
    }
    public ServiceException(String code, String message, Throwable cause)
    {
        super(message, cause);
        this.code = code;
    }

    public ServiceException(Throwable cause)
    {
        super(cause);
    }

    public ServiceException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}