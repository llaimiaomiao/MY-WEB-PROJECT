<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.jbit.Buy.dao.impl.*" %>
<%@ page import="cn.jbit.Buy.entity.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link type="text/css" rel="stylesheet" href="css/sms.css" />
<script type="text/javascript" src="script/jquery-1.8.3.js"></script>
	<script type="text/javascript">
		function check()
		{
		alert("进入方法");
			var $username=$("#username");
			var $divname=$("divName");
			$divname.html("");
			if($username.val()==""){
				alert("进入if");
				$divname.html("嘻嘻嘻嘻嘻嘻嘻嘻");
				return false;
			}
			return true;
		}
		$(function(){
			//绑定失去焦点事件
			$("#username").blur(check);
				//提交表单，调用验证函数
				$("#myform").submit(function(){
					var flag=true;
					if(!check()) {flag=false;}
					return flag;
				});
			});	
	</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<div id="templatemo_container">
	<jsp:include page="head.jsp" />
    <div id="templatemo_content">
      <!-- end of content left -->
      <!-- end of content right -->
<div class="cleaner_with_height">&nbsp;
  <form id="myform" name="loginform" method="post" action="">
  <div id="login">
    <table width="574" height="409" border="0">
      <tr>
        <td width="110" height="98">
        	<div align="right"><span class="STYLE2" >用户名：</span>
        	</div>
        </td>
        <td colspan="2">
        	<input type="text" name="username" id="username"/>
        	<div class="red" id="divName"></div>
        </td>
        <td colspan="4">
        	<div class="red" id="divName"></div>
        </td>
        </tr>
      <tr>
        <td height="92">
        	<div align="right"><span class="STYLE2">密&nbsp;码：</span>
        	</div>
        </td>
        <td colspan="2"><input type="password" name="password"/></td>
        <td colspan="4">&nbsp;</td>
        </tr>
      <tr>
        <td height="90"><div align="right"><span class="STYLE2">验证码：</span></div></td>
        <td width="80" align="center" valign="middle"><a href="#">
          <input type="text" name="yanzhengma" width="80"/>
        </a></td>
        <td width="148" align="center" valign="middle"><a href="#">看不清，换一张</a></td>
        <td width="218"><label>
          <input type="image" name="kan" src="images/templatemo_btn_01.jpg" />
          <br />
          </label></td>
      </tr>
      <tr>
        <td height="119" colspan="4"><table width="428" height="35" border="0">
          <tr>
            <td width="207" height="31"><div align="center"><span class="STYLE3"></span>
              <label></label>
              <label>
                <input type="image" name="提交" src="images/templatemo_btn21_02.jpg" />
                </label>
              </div></td>
            <td width="211"><div align="center">
              <label></label>
              <label>
                <input type="image" name="取消" src="images/templatemo_btn12_02.jpg" />
                </label>
              </div></td>
            </tr>
          </table></td>
      </tr>
      </table>
     
	</div>
    </form>
  </div>
  </div> <!-- end of content -->
  <jsp:include page="foot.jsp" />
</div> 
</body>
</html>