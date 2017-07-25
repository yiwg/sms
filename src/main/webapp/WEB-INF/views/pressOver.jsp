<!DOCTYPE html>
<%@ page language="java"  contentType="text/html; charset=utf-8" %>
<html lang="en">
<head>
	<link href="${pageContext.request.contextPath}/app/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/font-awesome.min.css" />

	<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace-rtl.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace-skins.min.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/jquery-ui-1.10.3.full.min.css" />

	<script src="${pageContext.request.contextPath}/app/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/jquery-ui-1.10.3.full.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/jquery.ui.touch-punch.min.js"></script>

	<script src="${pageContext.request.contextPath}/app/js/ace-extra.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/typeahead-bs2.min.js"></script>


	<script src="${pageContext.request.contextPath}/app/js/ace-elements.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/ace.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/jquery.slimscroll.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/jquery.easy-pie-chart.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/jquery.sparkline.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/flot/jquery.flot.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/flot/jquery.flot.pie.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/flot/jquery.flot.resize.min.js"></script>
	<script type="text/javascript">
		window.jQuery || document.write("<script src='${pageContext.request.contextPath}/app/js/jquery-2.0.3.min.js'>"+"<"+"script>");
	</script>
	<script type="text/javascript">
		if("ontouchend" in document) document.write("<script src='${pageContext.request.contextPath}/app/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
	</script>
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
				<a href="#">试验室数据采集</a>
			</li>
			<li class="active">压力机超标处理</li>
		</ul><!-- .breadcrumb -->

	</div>

	<div class="page-content">
		<div class="row">
			<div class="col-xs-12">
				<!-- PAGE CONTENT BEGINS -->

				<div class="row">
					<div class="col-xs-12">
						<div class="table-header">
							压力机超标处理
						</div>

						<div class="table-responsive">
							<table id="sample-table-2" class="table table-striped table-bordered table-hover">
								<div class="col-xs-12">
									<div class="row">
										<div class="col-xs-2 column">
											<div class="row">
												<div class="col-xs-4 column">
													<label for="form-field-select-1">部门名称</label>
												</div>
												<div class="col-xs-8 column">
													<select class="form-control"  id="form-field-select-1">
														<option value="">工程部</option>
														<option value="AL">实施部</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-xs-2 column">
											<div class="row">
												<div class="col-xs-4 column">
													<label for="form-field-select-1">处理结果</label>
												</div>
												<div class="col-xs-8 column">
													<select class="form-control"  id="form-field-select-2">
														<option value="">工程部</option>
														<option value="AL">实施部</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-xs-2 column">
											<div class="row">
												<div class="col-xs-4 column">
													<label for="form-field-select-1">实验时间</label>
												</div>
												<div class="col-xs-8 column">
													<select class="form-control"  id="form-field-select-3">
														<option value="">工程部</option>
														<option value="AL">实施部</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-xs-2 column">
											<div class="row">
												<div class="col-xs-4 column">
													<label for="form-field-select-1">结束时间</label>
												</div>
												<div class="col-xs-8 column">
													<select class="form-control"  id="form-field-select-4">
														<option value="">工程部</option>
														<option value="AL">实施部</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-xs-2 column">
											<button class="btn btn-sm btn-success">
												<i class="icon-ok"></i>
												查询
											</button>
											<button class="btn btn-sm btn-info">
												<i class="glyphicon glyphicon-repeat"></i>
												重置
											</button>
										</div>
										<div class="col-xs-2 column">

										</div>
									</div>
									</div>

								<thead>
								<tr>
									<%--<th class="center">
										<label>
											<input type="checkbox" class="ace" />
											<span class="lbl"></span>
										</label>
									</th>--%>
									<th class="hidden-480">序号</th>
									<th class="hidden-480">操作</th>
									<th class="hidden-480">超标类型</th>
									<th class="hidden-480">试验时间</th>
									<th class="hidden-480">施工部位</th>
									<th class="hidden-480">试验类型</th>
									<th class="hidden-480">试验编号</th>
									<th class="hidden-480">处理时间</th>
									<th class="hidden-480">超标处理人</th>
									<th class="hidden-480">施工单位负责人</th>
									<th class="hidden-480">中试审批人</th>
									<th class="hidden-480">监理审批人</th>
									<th class="hidden-480">信息编号</th>
									<th></th>
								</tr>
								</thead>

								<tbody>
								<tr>
									<td class="center">
										<label>
											<input type="checkbox" class="ace" />
											<span class="lbl"></span>
										</label>
									</td>

									<td>
										<a href="#">app.com</a>
									</td>
									<td>$45</td>
									<td class="hidden-480">3,330</td>
									<td>Feb 12</td>

									<td class="hidden-480">
										<span class="label label-sm label-warning">Expiring</span>
									</td>

									<td>
										<div class="visible-md visible-lg hidden-sm hidden-xs action-buttons">
											<a class="blue" href="#">
												<i class="icon-zoom-in bigger-130"></i>
											</a>

											<a class="green" href="#">
												<i class="icon-pencil bigger-130"></i>
											</a>

											<a class="red" href="#">
												<i class="icon-trash bigger-130"></i>
											</a>
										</div>

										<div class="visible-xs visible-sm hidden-md hidden-lg">
											<div class="inline position-relative">
												<button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown">
													<i class="icon-caret-down icon-only bigger-120"></i>
												</button>

												<ul class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close">
													<li>
														<a href="#" class="tooltip-info" data-rel="tooltip" title="View">
																				<span class="blue">
																					<i class="icon-zoom-in bigger-120"></i>
																				</span>
														</a>
													</li>

													<li>
														<a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
																				<span class="green">
																					<i class="icon-edit bigger-120"></i>
																				</span>
														</a>
													</li>

													<li>
														<a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
																				<span class="red">
																					<i class="icon-trash bigger-120"></i>
																				</span>
														</a>
													</li>
												</ul>
											</div>
										</div>
									</td>
								</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>

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
	<%--<%@include file="./copyright.jsp" %>--%>
</div>
<script src="${pageContext.request.contextPath}/app/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/app/js/jquery.dataTables.bootstrap.js"></script>
<script type="text/javascript">

		console.log("init")
		var oTable1 = $('#sample-table-2').dataTable( {
			"bLengthChange": false, //改变每页显示数据数量
			"bFilter": false, //过滤功能
			"bSort": false, //排序功能
			"aoColumns": [
				{ "bSortable": false },
				null, null,null, null, null,
				{ "bSortable": false }
			] } );


		$('table th input:checkbox').on('click' , function(){
			var that = this;
			$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});

		});


		$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
		function tooltip_placement(context, source) {
			var $source = $(source);
			var $parent = $source.closest('table')
			var off1 = $parent.offset();
			var w1 = $parent.width();

			var off2 = $source.offset();
			var w2 = $source.width();

			if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
			return 'left';
		}
</script>
</body>
</html>
