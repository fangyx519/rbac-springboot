package com.rbac.entity;

import java.util.List;
import java.util.Map;

/**
 * @author fang.yixin
 * @description
 * @date 2020/6/19
 */
public class ResponseJson<T> {
    private int status;
    private int code;
    private String message;
    private int total;
    private List<T> data;
    private Map<String, List<T>> rows;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Map<String, List<T>> getRows() {
        return rows;
    }

    public void setRows(Map<String, List<T>> rows) {
        this.rows = rows;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
