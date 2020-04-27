package com.zhangxin.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangxin.cms.dao.ArticleMapper;
import com.zhangxin.cms.domain.Article;
import com.zhangxin.cms.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleMapper mapper;
	@Override
	public List<Article> selects() {
		// TODO Auto-generated method stub
		return mapper.selects();
	}

}
