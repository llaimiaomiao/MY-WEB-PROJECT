package cn.jbit.Buy.dao;

import java.util.List;

import cn.jbit.Buy.entity.Books;

public interface BooksDao {
	//��ȡ����ͼ��
	List<Books> getAllBooks();
	//���ݷ���ID��ȡͼ����Ϣ
	List<Books> getBookBybbcID(int id);
}
