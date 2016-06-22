package cn.jbit.Buy.dao;

import java.util.List;

import cn.jbit.Buy.entity.Books;

public interface BooksDao {
	//获取所有图书
	List<Books> getAllBooks();
	//根据分类ID获取图书信息
	List<Books> getBookBybbcID(int id);
}
