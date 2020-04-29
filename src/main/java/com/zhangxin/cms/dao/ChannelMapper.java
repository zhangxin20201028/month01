package com.zhangxin.cms.dao;

import java.util.List;

import com.zhangxin.cms.domain.Category;
import com.zhangxin.cms.domain.Channel;

public interface ChannelMapper {
	//查询所有栏目
	List<Channel> selects();
	
	//根据栏目查询分类
	List<Category> selectCategorysByChannelId(Integer channelId);
}
