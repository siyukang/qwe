package com.si.pojo;

import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
public class PageHandler<T> {
    private Integer total;
    private List<T> pageList;

    @Override
    public String toString() {
        return "PageHandler{" +
                "total=" + total +
                ", pageList=" + pageList +
                '}';
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }
}
