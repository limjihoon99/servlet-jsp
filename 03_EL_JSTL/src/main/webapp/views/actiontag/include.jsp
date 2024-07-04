<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>jsp:include 액션 태그</h2>

    <p>
        include 액션 태그는 다른 페이지를 포함시킬 때 사용하는 액션 태그이다.
    </p>

    <h3>1. include 지시어</h3>

    <p>
        다른 페이지를 포한하는 JSP 파일이 컴파일되지 전에 페이지가 삽입된다.
    </p>

    <%-- 
    <%@ include file="includePage.jsp" %>

    include.jsp 페이지의 year 변수값은 <%= year %>입니다.

    <%
        // 현재 페이지와 포함된 페이지의 변수명일 중복되어 에러가 발생한다.
        String year = "2025;"
    %>
    --%>

    <h3>2. include 액션 태그</h3>

    <jsp:include page="includePage.jsp">
    	<jsp:param value="아이폰12" name="pName"/>
    </jsp:include>
    
    <%
    	// 중복되는 변수명으로 선언해도 에러가 발생하지 않는다.
    	String year = "2025";
    %>




</body>
</html>