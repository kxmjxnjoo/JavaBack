<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
request.setCharacterEncoding("UTF-8");

Connection con = null;
PreparedStatement pstmt = null;
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String driver = "oracle.jdbc.driver.OracleDriver";

String id = request.getParameter("id");
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
String phone = request.getParameter("phone");
String sql = "update mem set name=?, pwd=?, phone=? where id=?";

response.sendRedirect("MemberMGR.jsp");
%>