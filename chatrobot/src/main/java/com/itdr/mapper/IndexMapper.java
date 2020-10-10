package com.itdr.mapper;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/13 21:05
 */
public class IndexMapper {
    // 遵循四个原则
//1.接口中的方法名和映射文件中 id 名相同
//2.接口中传参类型与映射文件中传参类型要一致
//3.接口中返回值类型与映射文件中返回值类型要一致
//4.映射文件中命名空间与绑定接口绑定

    String getDefaultReply();

    String getAutoReply();

    List<String> getReplyByKeyWord(String keyword);

    List<String> getReplyByWords(String wordss);

    List<ReplyContent> getAll();

    int addOne(ReplyContent replyContent);

    int deleteOne(Integer id);
}
