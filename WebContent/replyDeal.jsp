<%@ page language="java" import="java.util.*,java.sql.*,com.jc.bbs.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
request.setCharacterEncoding("utf-8");

int pid = Integer.parseInt(request.getParameter("pid"));
int rootId = Integer.parseInt(request.getParameter("rootId"));

String title = request.getParameter("title");
System.out.println(title);
String cont = request.getParameter("cont");
System.out.println(cont);
Connection conn = DB.getConn();
String sql = "insert into article values(null,?,?,?,?,now(),?)";
PreparedStatement pstmt = DB.prepareStmt(conn,sql);
pstmt.setInt(1,pid);
pstmt.setInt(2,rootId);
pstmt.setString(3,title);
pstmt.setString(4,cont);
pstmt.setInt(5,0);
pstmt.executeUpdate();
DB.close(pstmt);
DB.close(conn);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>回复成功</title>
</head>
<body>
	恭喜你，回复成功！<br>
</body>
</html>