package com.itdr.pojo;

import java.util.Date;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/13 19:02
 */
public class RelyContent {
    private Integer id;
    private String keyword;
    private String words;
    private String reply;
    private Integer cid;
    private Date create_time;
    private Date update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    public RelyContent() { }

    public RelyContent(Integer id, String keyword, String words, String reply, Integer cid, Date create_time, Date update_time) {
        this.id = id;
        this.keyword = keyword;
        this.words = words;
        this.reply = reply;
        this.cid = cid;
        this.create_time = create_time;
        this.update_time = update_time;
    }
}