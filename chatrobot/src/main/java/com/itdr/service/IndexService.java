package com.itdr.service;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/13 21:06
 */
public interface IndexService {
    String getDefaultReply();

    String getAutoReply();

    List<String> getReply(String keyword);

    PageInfo getAll(Integer pageNum, Integer pageSize);

    int addOne(ReplyContent replyContent);

    int deleteOne(Integer id);
}
