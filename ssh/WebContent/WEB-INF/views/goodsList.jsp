<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!-- 万能前缀 -->
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>商品管理列表</title>
</head>
<body>
<div class="newspaper">
		<div class="newspaperTitle">
		    <h2>商品列表</h2>
		</div>
	   <div id="list">
	    <table border="1">
	        <tr>
	           <th>商品ID</th>
	           <th>商品名称</th>
	           <th>商品生产日期</th>
	           <th>生产地</th>
	           <th>价格</th>
	           <th>备注</th>
	        </tr>
	        <s:iterator value="#goodsList" status="gl">
	         <tr>
	            <td><s:property value="id"/></td>
	            <td><s:property value="pname"/></td>
	            <td><s:property value="pdate"/></td>
	            <td><s:property value="pcity"/></td>
	            <td><s:property value="price"/></td>
	            <td><s:property value="mark"/></td>
	             <td><a href="<%=basePath%>del.action?id=<s:property value="id"/>">删除</a></td>
	            <td><a href="<%=basePath%>toupdate.action?id=<s:property value="id"/>">更新</a></td>
	         </tr>
	       </s:iterator>
	    </table>
	    </div>
    </div>
     <style>
        .newspaper{
            width: 80%;
        }
        .newspaperTitle h2{
            background: #eeeeee;
            padding: 5px;
        }
        .settingBtn:after{
            content: "";
            display: block;
            clear: both;
        }
        .settingBtn{
            margin-bottom: 20px;
        }
        .settingBtn>div{
            border:1px solid #eeeeee;
            float:left;
            border-radius: 3px;
            padding: 5px 15px;
            margin-right: 20px;
        }
        #newspaperForm {
            border-collapse:collapse;
        }
        #newspaperForm thead tr th{
            border:1px solid #eeeeee;
            padding: 10px 20px;
        }
        #newspaperForm tbody tr td{
            border:1px solid #eeeeee;
            padding: 10px 20px;
        }
        .tableSquare{
            padding: 5px;
            border:1px solid #eeeeee;
        }
    </style>
</body>
</html>