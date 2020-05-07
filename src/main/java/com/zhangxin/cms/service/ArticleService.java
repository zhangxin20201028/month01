package com.zhangxin.cms.service;


import com.github.pagehelper.PageInfo;
import com.zhangxin.cms.domain.Article;

/**
 * 
 * @ClassName: ArticleService 
 * @Description: 文章
 * @author: 28987
 * @date: 2020年5月6日 下午7:34:50
 */
public interface ArticleService {
	/*
	 * 
	 * @Title: update 
	 * @Description: 更新文章
	 * @param article
	 * @return
	 * @return: int
	 */
	int update(Article article);
	
	/**
	 * 
	 * @Title: insert 
	 * @Description: 增加文章
	 * @param article
	 * @return
	 * @return: int
	 */
	int insert(Article article);
	
	/**
	 * 
	 * @Title: select 
	 * @Description: 文章详情
	 * @param id
	 * @return
	 * @return: Article
	 */
	Article select(Integer id);
	/**
	 * 
	 * @Title: selects 
	 * @Description: 文章列表
	 * @param articles
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: PageInfo<Article>
	 */
	PageInfo<Article> selects(Article articles,Integer pageNum,Integer pageSize);
}
