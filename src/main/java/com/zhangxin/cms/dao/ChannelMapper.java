package com.zhangxin.cms.dao;

import java.util.List;

import com.zhangxin.cms.domain.Category;
import com.zhangxin.cms.domain.Channel;



/**
 * 
 * @ClassName: ChannelMapper 
 * @Description: 栏目
 * @author: 28987
 * @date: 2020年5月6日 下午7:43:00
 */
public interface ChannelMapper {
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
