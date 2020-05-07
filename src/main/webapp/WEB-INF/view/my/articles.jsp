<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<c:forEach items="${info.list}" var="s">
			<div class="media">
				<img src="/pic/${s.picture }" class="mr-3 rounded" alt="..."
					height="56px" width="50px">
				<div class="media-body">
					<h5 class="mt-0">${s.title}</h5>
					<p>
						<fmt:formatDate value="${s.created}" pattern="yyyy-MM-dd HH:mm:ss"/>
					</p>
					<div class="float-right">
					<!-- Button trigger modal -->
					<button type="button" class="btn btn-link" data-toggle="modal"
					
						data-target="#exampleModalLong" onclick="detail(${s.id})">详情</button>
					</div>
				</div>
			</div>
			<hr>
		</c:forEach>
		<hr>
		<jsp:include page="/WEB-INF/view/common/pages.jsp"></jsp:include>
	</div>



	<!-- Modal -->
	<div class="modal fade " id="exampleModalLong" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLongTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle"><span id="title"></span></h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body" id="centent"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	function goPage(pageNum) {
		$("#center").load("/my/articles?pageNum="+pageNum);
	}
	//文章详情
	function detail(id) {
		$.get("/my/article",{id:id},function(article){
			$("#title").text(article.title);
			$("#centent").html(article.content);
		})
	}
</script>
</html>