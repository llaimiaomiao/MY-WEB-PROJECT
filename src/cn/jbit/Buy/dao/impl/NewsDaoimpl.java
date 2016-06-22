package cn.jbit.Buy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import cn.jbit.Buy.dao.BaseDao;
import cn.jbit.Buy.dao.NewsDao;
import cn.jbit.Buy.entity.News;

public class NewsDaoimpl extends BaseDao implements NewsDao{
	//获取所有新闻
	public List<News> getAllNews() {
		List<News> news=new ArrayList<News>();
		Connection connection=null;
		PreparedStatement pstmt=null;		
		ResultSet rs=null;
		String sql="select bn_ID,bn_title,bn_content,bn_creteDate from buybook_news";
		try{
			connection=this.getConnection();
			pstmt=connection.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				News u=new News();
				u.setBn_ID(rs.getInt("bn_ID"));
				u.setBn_title(rs.getString("bn_title"));
				u.setBn_content(rs.getString("bn_content"));
				u.setBn_creteDate(rs.getDate("bn_creteDate"));
				news.add(u);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			this.closeAll(connection, pstmt, rs);
		}
		return news;
	}

}
