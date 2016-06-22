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
	//��ȡ����
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// ���ݿ������ַ���
		private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=BuyBook";// ����URL�ַ���
		private static String user = "sa"; // ���ݿ��û���
		private static String password = "accp"; // �û�����
		/**
		 * ��ȡ���ݿ����Ӷ���
		 */
		public Connection getConnection() {
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);			
			} catch (Exception e) {
				e.printStackTrace();// �쳣����
			}
			return con;// �������Ӷ���
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
 * ����ɾ���Ĳ���
 * @param sql sql���
 * @param prams ��������
 * @return ִ�н��
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
