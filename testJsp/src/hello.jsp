<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>결과 페이지</title>
</head>
<body>
    <h2>환영합니다,</h2>
    <%
        String username = request.getParameter("username");
        if (username != null && !username.isEmpty()) {
            out.println(username + "님!");
        } else {
            out.println("이름을 입력하지 않았습니다.");
        }
    %>
</body>
</html>
