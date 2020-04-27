package com.zhangxin.cms.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangxin.cms.domain.Article;
import com.zhangxin.cms.service.ArticleService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class ArticleServiceImplTest {

	@Resource
	private ArticleService articleService;
	@Test
	public void testSelects() {
		List<Article> list = articleService.selects();
		System.out.println(list);
	}

}
