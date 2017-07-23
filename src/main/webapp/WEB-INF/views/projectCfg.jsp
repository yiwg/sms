<!DOCTYPE html>
<%@ page language="java"  contentType="text/html; charset=utf-8" %>
<html lang="en">
<head>
	<%@include file="./public.jsp" %>

</head>

<body>
<div class="main-content">
	<div class="breadcrumbs" id="breadcrumbs">
		<script type="text/javascript">
			try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
		</script>

		<ul class="breadcrumb">
			<li>
				<i class="icon-home home-icon"></i>
				<a href="#">系统配置</a>
			</li>
			<li class="active">工程配置</li>
		</ul><!-- .breadcrumb -->

	</div>

	<div class="page-content">
		<div class="row">
			<div class="col-xs-12">
				<!-- PAGE CONTENT BEGINS -->

				<div class="row">
					<div class="col-xs-12">
						<!-- PAGE CONTENT BEGINS -->

						<div class="row">
							<div class="col-xs-12">
								<div class="table-responsive">
									<table id="sample-table-1" class="table table-striped table-bordered table-hover">
										<thead>
										<tr>
											<th class="center">
												<label>
													<input type="checkbox" class="ace" />
													<span class="lbl"></span>
												</label>
											</th>
											<th>ID</th>
											<th>名称</th>
											<th class="hidden-480">备注</th>
											<th>操作</th>
										</tr>
										</thead>

										<tbody class="table-body-tr" hidden="hidden">
										<tr class="table-data-tr">
											<td class="center">
												<label>
													<input type="checkbox" class="ace" />
													<span class="lbl"></span>
												</label>
											</td>

											<td>
												<a href="#" class="table-data-id">ace.com</a>
											</td>
											<td class="table-data-name">$45</td>
											<td class="hidden-480 table-data-remark">3,330</td>
											<td>
												<div class="visible-md visible-lg hidden-sm hidden-xs btn-group">

													<button class="btn btn-xs btn-info table-data-update">
														<i class="icon-edit bigger-120"></i>
													</button>

													<button class="btn btn-xs btn-danger table-data-delete">
														<i class="icon-trash bigger-120"></i>
													</button>

												</div>

											</td>
										</tr>
										</tbody>
									</table>
								</div><!-- /.table-responsive -->
							</div><!-- /span -->
						</div><!-- /row -->
					</div><!-- /.col -->
				</div><!-- /.row -->

				<div id="modal-table" class="modal fade" tabindex="-1">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header no-padding">
								<div class="table-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
										<span class="white">&times;</span>
									</button>
									Results for "Latest Registered Domains
								</div>
							</div>

							<div class="modal-body no-padding">
								<table class="table table-striped table-bordered table-hover no-margin-bottom no-border-top">
									<thead>
									<tr>
										<th>Domain</th>
										<th>Price</th>
										<th>Clicks</th>

										<th>
											<i class="icon-time bigger-110"></i>
											Update
										</th>
									</tr>
									</thead>

									<tbody>
									<tr>
										<td>
											<a href="#">ace.com</a>
										</td>
										<td>$45</td>
										<td>3,330</td>
										<td>Feb 12</td>
									</tr>

									<tr>
										<td>
											<a href="#">base.com</a>
										</td>
										<td>$35</td>
										<td>2,595</td>
										<td>Feb 18</td>
									</tr>

									<tr>
										<td>
											<a href="#">max.com</a>
										</td>
										<td>$60</td>
										<td>4,400</td>
										<td>Mar 11</td>
									</tr>

									<tr>
										<td>
											<a href="#">best.com</a>
										</td>
										<td>$75</td>
										<td>6,500</td>
										<td>Apr 03</td>
									</tr>

									<tr>
										<td>
											<a href="#">pro.com</a>
										</td>
										<td>$55</td>
										<td>4,250</td>
										<td>Jan 21</td>
									</tr>
									</tbody>
								</table>
							</div>

							<div class="modal-footer no-margin-top">
								<button class="btn btn-sm btn-danger pull-left" data-dismiss="modal">
									<i class="icon-remove"></i>
									Close
								</button>

								<ul class="pagination pull-right no-margin">
									<li class="prev disabled">
										<a href="#">
											<i class="icon-double-angle-left"></i>
										</a>
									</li>

									<li class="active">
										<a href="#">1</a>
									</li>

									<li>
										<a href="#">2</a>
									</li>

									<li>
										<a href="#">3</a>
									</li>

									<li class="next">
										<a href="#">
											<i class="icon-double-angle-right"></i>
										</a>
									</li>
								</ul>
							</div>
						</div><!-- /.modal-content -->
					</div><!-- /.modal-dialog -->
				</div><!-- PAGE CONTENT ENDS -->
			</div><!-- /.col -->
		</div><!-- /.row -->
	</div><!-- /.page-content -->
	<%@include file="./copyright.jsp" %>
</div>
<script src="${pageContext.request.contextPath}/app/js/service/project.js"></script>
<script>
	console.log("页面加载完成");
	var APP={};
	APP.ctx="/sms";
	APP.urls = {
		list : "/project/list",
		add : "/project/add",
		update : "/project/update",
		delete: "/project/delete",
	};

	APP.pageSize=10;

	$.ajax({
		url : APP.ctx + APP.urls.list,
		type : "get",
		dataType : "json",
		cache : false,
		data : {
				pageNum:1,
				pageSize:APP.pageSize
		},
		async : false, // 同步加载
		success : function(data) {
			if (data.success) {
				var list = data.obj;
				for (var i = 0, len = list.length; i < len; i++) {
					var item = list[i];
					self.skillGroupList.push({
						id : item.id,
						name : item.skillGroupName,
						priorityType : item.priorityType,
						queueType : item.queueType
					});
				}
			} else {
				// TODO 查询失败
				alert("查询工程失败！");
			}
		},
		error : function() {
			// TODO 查询失败
			alert("查询工程失败！");
		}
	});
</script>
</body>
</html>
