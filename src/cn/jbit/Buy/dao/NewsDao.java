package cn.jbit.Buy.dao;

import java.util.List;

import cn.jbit.Buy.entity.News;

public interface NewsDao {
	List<News> getAllNews();//获取新闻
}
