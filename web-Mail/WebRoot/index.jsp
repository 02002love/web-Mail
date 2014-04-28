<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>Mail-Zone</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">

		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		<script src="js/jquery-2.0.3.min.js"></script>
		<script src="js/bootstrap.min.js"></script>

	</head>
	<body style="background: url('images/bk.jpg') no-repeat;">
		<div align="center" style="margin-top: 150">
			<font color=#00ff00 size=20>欢迎来到Mail-Zone</font>
		</div>
		<div style="margin-top: 10; margin-left: 580">
			<button class="btn btn-default btn-lg" data-toggle="modal"
				data-target="#login">
				登录
			</button>
			<button class="btn btn-default btn-lg" data-toggle="modal"
				data-target="#register">
				注册
			</button>
		</div>
		<!-- 登录 -->
		<div class="modal fade" id="login" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<form role="form" action="1.jsp">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">
								&times;
							</button>
							<h4 class="modal-title">
								登录
							</h4>
						</div>
						<div class="modal-body">
							<input type="text" class="form-control"
								placeholder="Email address" required autofocus>
							<input type="password" class="form-control"
								placeholder="Password" required>
						</div>
						<div class="modal-footer">
							<button class="btn btn-lg btn-default" type="submit">
								提交
							</button>
							<button class="btn btn-lg btn-primary" type="reset">
								重置
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- 注册 -->
		<div id="register"></div>


	</body>
</html>
