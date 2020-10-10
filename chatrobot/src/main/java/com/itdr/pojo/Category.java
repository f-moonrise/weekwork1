package com.itdr.pojo;

import java.util.Date;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/13 19:02
 */
public class Category {
    private Integer id;
    private String cname;
    private Integer fid;
    private Date create_time;
    private Date update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Category(Integer id, String cname, Integer fid, Date create_time, Date update_time) {
        this.id = id;
        this.cname = cname;
        this.fid = fid;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Category() {   }
}
