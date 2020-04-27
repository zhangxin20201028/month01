package com.zhangxin.cms.dao;

import java.util.List;

import com.zhangxin.cms.domain.Article;

public interface ArticleMapper {
	//查询文章
	List<Article> selects();
}
