<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<title>首页</title>
</head>
<body>
<div id="templatemo_container">
	<jsp:include page="head.jsp" />
    
    <div id="templatemo_content">
       <jsp:include page="left.jsp" />
      
        <!-- end of content left -->
      <div id="templatemo_content_right">
        	<div class="templatemo_product_box">
            	<h1>世界名著<span>(hot)</span></h1>
   	      <img src="images/image01.jpg" alt="image"/>
                <div class="product_info">
                	<p class="ss">假如给我三天光明</p>
                  	<h3>￥300</h3>
                    <div class="buy_now_button"><a href="subpage.html">购买</a></div>
                    <div class="detail_button"><a href="BooksDetail.jsp">详细信息</a></div>
                </div>
                <div class="cleaner">&nbsp;</div>
            </div>
            
            <div class="cleaner_with_width">&nbsp;</div>
            
            <div class="templatemo_product_box">
            	<h1>历史军事<span>(hot)</span></h1>
       	    <img src="images/image07.jpg" alt="image" />
                <div class="product_info">
                	<p class="ss">孙子兵法</p>
                    <h3>￥405</h3>
                    <div class="buy_now_button"><a href="subpage.html">购买</a></div>
                    <div class="detail_button"><a href="BooksDetail.jsp">详细信息</a></div>
                </div>
                <div class="cleaner">&nbsp;</div>
            </div>
            
            <div class="cleaner_with_height">&nbsp;</div>
            
            <div class="templatemo_product_box">
            	<h1>玄幻修真<span>(hot)</span></h1>
   	      <img src="images/image23.jpg" alt="image" />
                <div class="product_info">
                	<p class="ss">天道皇座</p>
                    <h3>￥100</h3>
                    <div class="buy_now_button"><a href="subpage.html">购买</a></div>
                    <div class="detail_button"><a href="BooksDetail.jsp">详细信息</a></div>
                </div>
                <div class="cleaner">&nbsp;</div>
            </div>
            
            <div class="cleaner_with_width">&nbsp;</div>
            
            <div class="templatemo_product_box">
            	<h1>恐怖灵异<span>(hot)</span></h1>
            	<img src="images/image18.jpg" alt="image" />
                <div class="product_info">
                	<p class="ss">殡仪馆的临时工</p>
                    <h3>￥100</h3>
                    <div class="buy_now_button"><a href="subpage.html">购买</a></div>
                    <div class="detail_button"><a href="BooksDetail.jsp">详细信息</a></div>
                </div>
                <div class="cleaner">&nbsp;</div>
            </div>
            
            <div class="cleaner_with_height">&nbsp;</div>
            <div id="fenye">
            	<ul class="clearfix">					
					<li><a href="#">首页</a></li>	
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">...</a></li>
					<li><a href="#">尾页 </a></li>
				</ul>
            </div>
          </div> 
          </div>
        <!-- end of content right -->
    
    	<div class="cleaner_with_height"></div>
    	<jsp:include page="foot.jsp" />
    </div> 
    
</body>
</html>