package cn.jbit.Buy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class BaseDao {
	protected Connection con = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	//获取连接
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// 数据库驱动字符串
		private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=BuyBook";// 连接URL字符串
		private static String user = "sa"; // 数据库用户名
		private static String password = "accp"; // 用户密码
		/**
		 * 获取数据库连接对象。
		 */
		public Connection getConnection() {
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);			
			} catch (Exception e) {
				e.printStackTrace();// 异常处理
			}
			return con;// 返回连接对象
		}
	//protected Connection openConnection(){
			//try {
				//Context ctx = new InitialContext();
				//DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/BuyBook");
				//con = ds.getConnection();
			//} catch (NamingException e) {
				//e.printStackTrace();
			//} catch (SQLException e) {
				//e.printStackTrace();
			//}
			//return con;
	//}
	public void closeAll(Connection conn,Statement stmt,ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
/**
 * 增、删、改操作
 * @param sql sql语句
 * @param prams 参数数组
 * @return 执行结果
 */
public int exceuteUpdate(Connection conn,String sql,Object[] params){
	int result=0;
	PreparedStatement pstmt=null;
	try {
		pstmt=conn.prepareStatement(sql);
		for(int i=0;i<params.length;i++){
			pstmt.setObject(i+1, params[i]);	
		}
		result=pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		closeAll(conn, pstmt, null);
	}
	return result;
}


	
}
