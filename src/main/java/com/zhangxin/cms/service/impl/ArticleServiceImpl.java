package com.zhangxin.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangxin.cms.dao.ArticleMapper;
import com.zhangxin.cms.domain.Article;
import com.zhangxin.cms.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleMapper mapper;

	@Override
	public PageInfo<Article> selects(Article article, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Article> list = mapper.selects(article);
		return new PageInfo<Article>(list);
	}

	@Override
	public Article select(Integer id) {
		// TODO Auto-generated method stub
		return mapper.select(id);
	}

	@Override
	public int insert(Article article) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
