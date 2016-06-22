package cn.jbit.Buy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.jbit.Buy.dao.BaseDao;
import cn.jbit.Buy.dao.UserDao;
import cn.jbit.Buy.entity.User;

public class UserDaoimpl extends BaseDao implements UserDao{
	//¼ì²éµÇÂ½
	public User checkLogin(User user) {
		User us=null;
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;	
		String sql="select bu_userID,bu_username,bu_password from buybook_user where bu_userID=? and bu_password=? ";
		connection=this.getConnection();
		try {
			pstmt=connection.prepareStatement(sql);
			pstmt.setObject(1, user.getBu_userID());
			pstmt.setObject(2,user.getBu_password());
			rs=pstmt.executeQuery();
			if(rs.next()){
				us=new User();
				us.setBu_userID(rs.getString("bu_userID"));
				us.setBu_username(rs.getString("bu_username"));
				us.setBu_password(rs.getString("bu_password"));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll(connection, pstmt, rs);		
		}
		return us;
	}

	public boolean findUserIsExist(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> findOtherUsers(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
