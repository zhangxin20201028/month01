<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	<div class="container-fluid">
		<!-- 头/行 -->
		<div class="row">
			<div class="col-md-12" style="background-color: purple;height: 55px">
				<img alt="" src="/resource/images/l2.jpg" width="50px" height="55px" class="rounded float-left">
				<font color="white">个人中心</font>
			</div>
		</div>
		<div class="row mt-2">
			<div class="col-md-2 bg-light" style="height: 300px">
				<div class="list-group">
  					<a href="#" data="/my/articles" class="list-group-item list-group-item-action active">
    				我的文章
  					</a>
  					<a href="#" data="/my/publish"class="list-group-item list-group-item-action">发布文章</a>
  					<a href="#" class="list-group-item list-group-item-action">我的收藏</a>
  					<a href="#" class="list-group-item list-group-item-action">我的评论</a>
 					<a href="#" class="list-group-item list-group-item-action disabled" tabindex="-1" aria-disabled="true">我的设置</a>
</div>
			</div>
			<div class="col-md-10" id="center">
				<div style="display:none">
					<jsp:include page="/resource/kindeditor/jsp/demo.jsp"></jsp:include>
				</div>				
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function(){
		
		$("#center").load("/my/articles");
		$("a").click(function(){
			var url=$(this).attr("data");
			
			$("a").removeClass("active");
			$(this).addClass("active");
			
			$("#center").load(url);
		})
	})
</script>

</html>