<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="cn.jbit.Buy.entity.News" import="java.util.List" import="cn.jbit.Buy.entity.Bookscate"%>
<%@page import="cn.jbit.Buy.dao.impl.BookscateDaoimpl"%>
<%@page import="cn.jbit.Buy.dao.impl.NewsDaoimpl"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<title>左边菜单</title>
</head>
<body>
	 <div id="templatemo_content_left">
        	<div class="templatemo_content_left_section">
            	<h1>图书分类</h1>
                <ul>
                	<%
                		BookscateDaoimpl bd = new BookscateDaoimpl();
                		List<Bookscate> cate = bd.getAllBookscate();
                		for(Bookscate bs : cate){
                		%>
                			<li><a href="BookscateServlet"><%=bs.getBbc_name() %></a></li>
                			<%
                		}
                	 %>
            	</ul>
            </div>
			<div class="templatemo_content_left_section">
            	<h1>图书新闻</h1>
                <ul>
                	<%
                		NewsDaoimpl nd = new NewsDaoimpl();
                		List<News> news = nd.getAllNews();
                		for(News n : news){
                			%>
                			<li><a href="#"><%=n.getBn_title() %></a></li>
                			<%
                		}
                	 %>
            
                    
            	</ul>
            </div>
            </div>
</body>
</html>