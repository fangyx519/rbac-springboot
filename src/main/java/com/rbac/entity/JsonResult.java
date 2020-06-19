package com.rbac.entity;

/**
 * @author fang.yixin
 * @description 返回页面的结果
 * @date 2020/6/18
 */
public class JsonResult {
    private String data;

    public JsonResult() {
    }

    public JsonResult(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
