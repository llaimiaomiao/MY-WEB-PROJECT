package cn.jbit.Buy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.jbit.Buy.dao.BaseDao;
import cn.jbit.Buy.dao.BookscateDao;
import cn.jbit.Buy.entity.Bookscate;


public class BookscateDaoimpl extends BaseDao implements BookscateDao{
	//获取所有图书分类
	public List<Bookscate> getAllBookscate() {
		List<Bookscate> btypes = null;
		String sql="select * from buybook_bookscate";
		try {
			con= this.getConnection();
			ps=con.prepareStatement(sql);
			btypes = new ArrayList<Bookscate>();
			rs= ps.executeQuery();
			while(rs.next()){
				Bookscate btype= new Bookscate();
				btype.setBbc_ID(rs.getInt(1));
				btype.setBbc_name(rs.getString(2));
				btypes.add(btype);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.closeAll(con,ps,rs);
		}
		return btypes;
	}

}
