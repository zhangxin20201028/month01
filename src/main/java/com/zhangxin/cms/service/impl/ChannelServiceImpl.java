package com.zhangxin.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangxin.cms.dao.ChannelMapper;
import com.zhangxin.cms.domain.Category;
import com.zhangxin.cms.domain.Channel;
import com.zhangxin.cms.service.ChannelService;



@Service
public class ChannelServiceImpl implements ChannelService {
	@Resource
	ChannelMapper channelMapper;

	@Override
	public List<Channel> selects() {
		// TODO Auto-generated method stub
		return channelMapper.selects();
	}

	@Override
	public List<Category> selectCategorysByChannelId(Integer channelId) {
		// TODO Auto-generated method stub
		return channelMapper.selectCategorysByChannelId(channelId);
	}

}
