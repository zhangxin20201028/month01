package com.zhangxin.cms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhangxin.cms.domain.Article;
import com.zhangxin.cms.service.ArticleService;

/**
 * 
 * @ClassName: MyController 
 * @Description: 个人中心
 * @author: 28987
 * @date: 2020年4月28日 下午6:45:01
 */
@Controller
public class MyController {
	
	@Resource
	private ArticleService articleService;
	
	/**
	 * 
	 * @Title: index 
	 * @Description:个人中心主页面 
	 * @return
	 * @return: String
	 */
	@RequestMapping("index")
	public String index() {
		return "my/index";
	}
	/**
	 * 
	 * @Title: articles 
	 * @Description: 我的文章
	 * @param model
	 * @param article
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @return: String
	 */
	@RequestMapping("articles")
	public String articles(Model model,Article article,@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "6")Integer pageSize){
		
		PageInfo<Article> info = articleService.selects(article, pageNum, pageSize);
		model.addAttribute("info", info);
		return "my/articles";
	
	}
	
}
