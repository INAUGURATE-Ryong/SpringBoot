<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Spring JPA 게시판</title>
<style type="text/css">
.tooltip {
	position: absolute;
	z-index: 3;
	background: #E8E8E8;
	border: 1px solid #434343;
	padding: 3px;
}
</style>
</head>
<body>
	<div style="width: 500px;">
		<div style="float: center;">
			<H3 align="center">
				Spring Data JPA 게시판<br>(글리스트보기)
			</H3>
			<h5>총 ${page.totalElements}건</h5>
			<table width="600" border="1" align="left">
				<tr align="left">
					<td width="7%" align="center">순번</td>
					<td width="7%" align="center">글번호</td>
					<td width="41%" align="center">제목</td>
					<td width="15%" align="center">글쓴이</td>
					<td width="20%" align="center">등록일</td>
					<td width="10%" align="center">조회수</td>
				</tr>
				<c:forEach var="board" items="${page.content}" varStatus="loop">
					<tr>
						<td align="center">${loop.index + 1}</td>
						<td align="center"><a href="view?id=${board.id }">${board.id }</a></td>
						<td align="left"><c:forEach var="i" begin="1" end="${board.replylevel}" step="1">
								<!-- 레벨의 수만큼 글을 뒤로 민다 -->
				                 &nbsp;&nbsp;
				                </c:forEach> <a href="view?id=${board.id}">${board.title }</a></td>
						<td align="center">${board.name}</td>
						<td align="center">
						   <fmt:formatDate	value="${board.regdate}" type="date" dateStyle="default" />
						</td>
						<td align="center">${board.readcount}</td>
					</tr>
				</c:forEach>				
			</table>
			<div>
				    <c:if test="${!page.first}">
							<a href="/board/list/${page.number-1}">Previous</a>
						</c:if>
						<c:if test="${!page.last}">
							<a href="/board/list/${page.number+1}">Next</a>
						</c:if>
						<br><br>
                        <input type="button" value="글쓰기" onclick="location.href='/write'"></td>
			</div>
		</div>
	</div>
</body>
</html>