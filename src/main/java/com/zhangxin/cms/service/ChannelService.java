package com.zhangxin.cms.service;

import java.util.List;

import com.zhangxin.cms.domain.Category;
import com.zhangxin.cms.domain.Channel;



public interface ChannelService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 查询所有栏目
	 * @return
	 * @return: List<Channel>
	 */
	List<Channel> selects();
	/**
	 * 
	 * @Title: selectCategorysByChannelId 
	 * @Description: 根据栏目查询分类
	 * @param channelId
	 * @return
	 * @return: List<Category>
	 */
	List<Category> selectCategorysByChannelId(Integer channelId);

}
