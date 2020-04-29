package com.zhangxin.cms.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhangxin.cms.domain.Article;

public interface ArticleService {

	//查询文章
		PageInfo<Article> selects(Article article,Integer pageNum,Integer pageSize);
		//文章详情
		Article select(Integer id);
		//添加
		int insert(Article article);
}
