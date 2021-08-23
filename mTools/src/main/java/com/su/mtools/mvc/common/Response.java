package com.su.mtools.mvc.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author v-xiameng
 */
public class Response<T> {
    /**
     * 是否请求成功 ture 请求成功  false 请求失败
     */
    private boolean success;
    /**
     * 请求返回信息
     */
    private String message;
    /**
     * 请求返回代码 200 成功 400 失败
     */
    private Integer code;
    /**
     * 请求返回结果
     */
    private T result;
    /**
     * 时间戳
     */
    private String timestamp;

    public Response(boolean success, String message, int code, T result) {
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new Date()为获取当前系统时间，也可使用当前时间戳
        String date = df.format(new Date());
        this.timestamp = date;
        this.success = success;
        this.message = message;
        this.code = code;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", code=" + code +
                ", result=" + result +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}