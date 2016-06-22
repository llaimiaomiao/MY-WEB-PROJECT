package cn.jbit.Buy.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.jbit.Buy.dao.impl.UserDaoimpl;
import cn.jbit.Buy.entity.User;

public class UserServlet {

	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		doPost(request,response);
	};
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		UserDaoimpl ud=new UserDaoimpl();
		String operater=request.getParameter("action");
		if(operater.equals("login"))
		{
			//处理登入
			String userName=request.getParameter("username");
			String password=request.getParameter("password");
			User user=new User();
			user.setBu_username("username");
			user.setBu_password("password");
			User u=ud.checkLogin(user);
			if(u==null){
				request.setAttribute("divName", "您输入的用户名或者密码有误！");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else{
				//登入成功
				HttpSession session=request.getSession();
				session.setMaxInactiveInterval(20*60);
				session.setAttribute("user", u);
				response.sendRedirect("MsgServlet?action=list");
			}
		}else if(operater.equals("register")){
			String userName=request.getParameter("username");
			//该用户已经注册
			if(ud.findUserIsExist(userName)){
				request.setAttribute("divName","该用户已经注册！");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}else{
				String password=request.getParameter("password");
			}
		}
		
	}
	
}
