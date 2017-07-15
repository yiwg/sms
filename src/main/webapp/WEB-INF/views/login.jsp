<!DOCTYPE html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>施工质量安全信息化管控系统</title>
		<meta name="keywords" content="Bootstrapģ��,Bootstrapģ������,Bootstrap�̳�,Bootstrap����" />
		<meta name="description" content="JS�������ṩBootstrapģ��,Bootstrap�̳�,Bootstrap���ķ�������Bootstrap�������" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!-- basic styles -->

		<link href="${pageContext.request.contextPath}/app/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<!-- fonts -->



		<!-- ace styles -->

		<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/login.css" />
		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="${pageContext.request.contextPath}/app/js/html5shiv.js"></script>
		<script src="${pageContext.request.contextPath}/app/js/respond.min.js"></script>

		<![endif]-->
		<script>
			function login() {
				console.log("用户登录");
				if($.trim($("#userInput").val()).length == 0||$.trim($("#pwdInput").val()).length == 0){
					console.log("请输入用户名或密码")
                    $("#msgTag").html("请输入用户名或密码")
					return false;
				}
				$.ajax({
					url : "${pageContext.request.contextPath}/user/login.do",
					type : "post",
					dataType : "json",
					cache : false,
					data : {
						userName : $("#userInput").val(),
						passWord : $("#pwdInput").val()
					},
					success : function(data) {
						if (data.success) {
							location.href = "${pageContext.request.contextPath}/index/index.do";
						} else {
							//$errorTip.text(data.msg);
						}
					},
					error : function() {
						//$errorTip.text("登录失败！系统错误");
					}
				});
			}
		</script>
	</head>

	<body class="login-layout bg" >
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
						<div class="login-container">
							<div class="center">
								<h1>
									<i class="icon-leaf green"></i>
									<span class="red">新隽</span>
									<span class="white">施工质量安全信息化管控系统</span>
								</h1>
								<h4 class="blue">&copy; 宁夏新隽网络科技有限公司</h4>
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="login-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												<i class="icon-coffee green"></i>
												请输入用户名和密码
											</h4>

											<div class="space-6"></div>

											<form>
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" placeholder="Username" id="userInput" />
															<i class="icon-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="Password" id="pwdInput"/>
															<i class="icon-lock"></i>
														</span>
													</label>

													<div class="space"></div>

													<div class="clearfix">
														<label class="inline">
															<input type="checkbox" class="ace" />
															<span class="lbl"> 记住密码</span>
														</label>

														<button type="button" class="width-35 pull-right btn btn-sm btn-primary" id="loginBtn" onclick="login()">
															<i class="icon-key"></i>
															登录
														</button>
													</div>

													<div class="space-4"></div>
												</fieldset>
											</form>
											<div class="social-or-login center">
												<span class="bigger-110" id="msgTag"></span>
											</div>

										</div><!-- /widget-main -->

										<div class="toolbar clearfix">
											<div>
												<a href="#" onclick="show_box('forgot-box'); return false;" class="forgot-password-link">
													忘记密码
												</a>
											</div>

										</div>
									</div><!-- /widget-body -->
								</div><!-- /login-box -->
							</div><!-- /position-relative -->
						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->

		<script src="${pageContext.request.contextPath}/app/js/jquery.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='${pageContext.request.contextPath}/app/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='${pageContext.request.contextPath}/app/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='${pageContext.request.contextPath}/app/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>

		<!-- inline scripts related to this page -->

		<script type="text/javascript">
			function show_box(id) {
			 jQuery('.widget-box.visible').removeClass('visible');
			 jQuery('#'+id).addClass('visible');
			}
		</script>
	</body>
</html>
