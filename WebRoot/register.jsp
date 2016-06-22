<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<title>注册</title>
</head>
<body>
<div id="templatemo_container">
	<jsp:include page="head.jsp" />
    <div id="templatemo_content">

<div class="cleaner_with_height">&nbsp;
  <form id="myform" name="loginform" method="post" action="">
  <div id="register">
    <table width="935" height="789" border="0">
      <tr>
        <td width="121" height="98" rowspan="2">&nbsp;</td>
        <td width="229" height="98"><div align="right"><span class="STYLE2">用户名：</span></div></td>
        <td colspan="2"><label>
          <input type="text" name="username" />
        </label></td>
        <td width="206" rowspan="4">&nbsp;</td>
      </tr>
      <tr>
        <td height="68"><div align="right">真实姓名:</div></td>
        <td colspan="2"><input type="text" name="name" /></td>
      </tr>
      <tr>
        <td height="110" rowspan="2">&nbsp;</td>
        <td height="110"><div align="right"><span class="STYLE2">密&nbsp;码：</span></div></td>
        <td colspan="2"><label>
          <input type="text" name="password" />
        </label></td>
        </tr>
      <tr>
        <td height="73"><div align="right">在输入一次密码：</div></td>
        <td colspan="2"><label>
          <input type="text" name="repwd" />
        </label></td>
      </tr>
      <tr>
        <td height="112" rowspan="6">&nbsp;</td>
        <td height="112"><div align="right">出生年月：</div></td>
        <td width="360" valign="middle"><label></label>
          <input type="text" name="birthday" /></td><td colspan="2" rowspan="6"><label><br />
          </label></td>
        </tr>
      <tr>
        <td height="73"><div align="right">身份证号：</div></td>
        <td width="360" valign="middle"><input type="text" name="IDCard" /></td>
      </tr>
      <tr>
        <td height="72"><div align="right">性别：</div></td>
        <td width="360" valign="middle"><p>
          <label>
            <input type="radio" name="man" id="RadioGroup1_0" checked="checked"/>
            男 </label>
          <label>
            <input type="radio" name="woman" id="RadioGroup1_1" />
            女 </label>
        </p></td>
      </tr>
      <tr>
        <td height="65"><div align="right">手机号码：</div></td>
        <td width="360" valign="middle"><input type="text" name="phone" /></td>
      </tr>
      <tr>
        <td height="72"><div align="right">Email：</div></td>
        <td width="360" valign="middle"><input type="text" name="Email" /></td>
      </tr>
      <tr>
        <td height="76"><div align="right">住址：</div></td>
        <td width="360"><input type="text" name="address" /></td>
      </tr>
      <tr>
        <td height="83">&nbsp;</td>
        <td colspan="4"><table width="428" height="35" border="0">
          <tr>
            <td width="318" height="31"><div align="center"><span class="STYLE3"></span>
              <label></label>
              <label>
                <input type="image" name="提交" src="images/templatemo_btn21_02.jpg" />
                </label>
              </div></td>
            <td width="100"><div align="center">
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