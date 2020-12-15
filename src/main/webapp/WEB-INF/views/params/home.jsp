<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Exmaple</title>
</head>
<body>

<!-- GET 파라미터 전송 테스트 -->
<h1>100+200=?</h1>
<a href='${pageContext.request.contextPath }/params/get.do?answer=100'>100</a>
<a href='${pageContext.request.contextPath }/params/get.do?answer=200'>200</a>
<a href='${pageContext.request.contextPath }/params/get.do?answer=300'>300</a>
<a href='${pageContext.request.contextPath }/params/get.do?answer=400'>400</a>
<a href='${pageContext.request.contextPath }/params/get.do?answer=500'>500</a>
<hr/>

<!-- POST 파라미터 전송 테스트 -->

<!-- PATH 파라미터 전송 테스트 -->

</body>
</html>