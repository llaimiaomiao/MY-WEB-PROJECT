package cn.jbit.Buy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.jbit.Buy.dao.BaseDao;
import cn.jbit.Buy.dao.BooksDao;
import cn.jbit.Buy.entity.Books;
import cn.jbit.Buy.entity.News;

public class BooksDaoimpl extends BaseDao implements BooksDao{
	//获取所有图书
	public List<Books> getAllBooks() {
		List<Books> book=new ArrayList<Books>();
		Connection connection=null;
		PreparedStatement pstmt=null;		
		ResultSet rs=null;
		String sql="select bb_ID,bb_name,bb_author,bb_description,bb_price,bb_stock,bbc_ID,bb_filename from buybook_books";
		try{
			connection=this.getConnection();
			pstmt=connection.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Books b=new Books();
				b.setBb_ID(rs.getInt("bb_ID"));
				b.setBb_name(rs.getString("bb_name"));
				b.setBb_author(rs.getString("bb_author"));
				b.setBb_description(rs.getString("bb_description"));
				b.setBb_price(rs.getInt("bb_price"));
				b.setBb_stock(rs.getInt("bb_stock"));
				b.setBbc_ID(rs.getInt("bbc_ID"));
				b.setBb_filename(rs.getString("bb_filename"));
				book.add(b);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.closeAll(connection, pstmt, rs);
		}
		return book;
	}

	//根据分类ID获取图书信息
	public List<Books> getBookBybbcID(int id) {
		List<Books> book=new ArrayList<Books>();
		Connection connection=null;
		PreparedStatement pstmt=null;		
		ResultSet rs=null;
		String sql="select bb_ID,bb_name,bb_author,bb_description,bb_price,bb_stock,bbc_ID,bb_filename from buybook_books where bbc_ID=?";
		try{
			connection=this.getConnection();
			pstmt=connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Books b=new Books();
				b.setBb_ID(rs.getInt("bb_ID"));
				b.setBb_name(rs.getString("bb_name"));
				b.setBb_author(rs.getString("bb_author"));
				b.setBb_description(rs.getString("bb_description"));
				b.setBb_price(rs.getInt("bb_price"));
				b.setBb_stock(rs.getInt("bb_stock"));
				b.setBbc_ID(rs.getInt("bbc_ID"));
				b.setBb_filename(rs.getString("bb_filename"));
				book.add(b);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.closeAll(connection, pstmt, rs);
		}
		return book;
	}

}
