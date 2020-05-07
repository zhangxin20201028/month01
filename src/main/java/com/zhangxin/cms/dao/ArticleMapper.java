package com.zhangxin.cms.dao;

import java.util.List;

import com.zhangxin.cms.domain.Article;


/**
 * 
 * @ClassName: ArticleMapper 
 * @Description: 文章
 * @author: 28987
 * @date: 2020年5月6日 下午7:32:16
 */
public interface ArticleMapper { 
	/**
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
	 * @Description: 文章的列表查询
	 * @param articles
	 * @return
	 * @return: List<Article>
	 */
	List<Article> selects(Article articles);
}
