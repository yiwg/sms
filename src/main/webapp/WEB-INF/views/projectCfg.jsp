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
	<link rel="stylesheet"
		  href="${pageContext.request.contextPath}/app/css/common.css" />

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
	<%--<script src="${pageContext.request.contextPath}/app/js/jquery.min.js"></script>--%>
	<script src="${pageContext.request.contextPath}/app/js/knockout-3.2.0.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/sammy.min.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/ks/ks-validation.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/ks/ks-dialog.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/ks/ks-drag.js"></script>
	<script src="${pageContext.request.contextPath}/app/js/service/project.js"></script>
</head>

<body>

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
				<!-- PAGE CONTENT BEGINS -->
		<div class="row" data-bind="visible: hash() == 'list'">
			<div class="ks-button-group" data-bind="click: gotoAdd">
				<span class="primary"><span class="glyphicon glyphicon-plus"></span></span>
				添加工程
			</div>

			<div class="col-xs-12">
				<div class="table-responsive">
					<table id="sample-table-1" class="table table-striped table-bordered table-hover ks-table">
						<thead>
						<tr>
							<%--<th class="center">
								<label>
									<input type="checkbox" class="ace" />
									<span class="lbl"></span>
								</label>
							</th>--%>
							<th>ID</th>
							<th>名称</th>
							<th class="hidden-480">备注</th>
							<th>操作</th>
						</tr>
						</thead>

						<tbody class="table-body-tr" data-bind="foreach:listPage">
						<tr >
							<%--<td class="center">
								<label>
									<input type="checkbox" class="ace" />
									<span class="lbl"></span>
								</label>
							</td>--%>

							<td>
								<a href="#" data-bind="text:id"></a>
							</td>
							<td data-bind="text:name"></td>
							<td data-bind="text:remark"></td>
							<td>
								<div class="visible-md visible-lg hidden-sm hidden-xs btn-group">

									<button class="btn btn-xs btn-info table-data-update" data-bind="click: $root.gotoUpdate">
										<i class="icon-edit bigger-120"></i>
									</button>

									<button class="btn btn-xs btn-danger table-data-delete" data-bind="click:  $root.deleteSkillGroup">
										<i class="icon-trash bigger-120"></i>
									</button>

								</div>

							</td>
						</tr>
						</tbody>
					</table>
					<div class="pull-right" data-bind="visible: list().length > 0">
						<form action="#list" data-bind="submit: setPage">
							<div class="ks-pager">
								跳转至 <input type="number"
										   data-bind="value: currentPageInput, attr:{min: 1, max: totalPage}" />
								页 <span data-bind="text: currentPage"></span>/<span
									data-bind="text: totalPage"></span>页
								<button class="ks-button" type="button"
										data-bind="click: prevPage, enable: prevPageEnabled, css: {'primary': prevPageEnabled}">&lt;</button>
								<button class="ks-button" type="button"
										data-bind="click: nextPage, enable: nextPageEnabled, css: {'primary': nextPageEnabled}">&gt;</button>
							</div>
						</form>
					</div>
				</div><!-- /.table-responsive -->
			</div><!-- /span -->

		</div><!-- /row -->
</div>
	<div style="display: none;"
		 data-bind="visible: hash() == 'add' || hash() == 'update'">
		<div class="ks-form">
			<div class="ks-form-header">
				<!-- ko if: hash() == 'add' -->
				添加工程
				<!-- /ko -->
				<!-- ko if: hash() == 'update' -->
				修改工程
				<!-- /ko -->
				<div class="pull-right" style="cursor: pointer;"
					 data-bind="click: gotoList">
					<span class="glyphicon glyphicon-remove"></span>
				</div>
			</div>
			<div class="ks-form-content">
				<form id="skillGroupFormId">
					<table class="ks-form-table" data-bind="with: tempProject">
						<tr>
							<td>名称：</td>
							<td>
								<!-- ko if: $root.hash() == 'add' -->
								<input type="text" class="ks-input" data-bind="value: name" validate="required: true" placeholder="请输入名称" />
								<!-- /ko --> <!-- ko if: $root.hash() == 'update' -->
								 <input type="text" class="ks-input" data-bind="value: name" text="value: name"></span>
								<!-- /ko -->
							</td>
							<td></td>
						</tr>
						<tr>
							<td>备注：</td>
							<td>
								<!-- ko if: $root.hash() == 'add'  -->
								<input type="text" class="ks-input" data-bind="value: remark" validate="required: true" placeholder="请输入备注" />
								<!-- /ko --> <!-- ko if: $root.hash() == 'update' -->
								<input type="text" class="ks-input" data-bind="value: remark" text="value: remark"></span>
								<!-- /ko -->
							</td>
							<td></td>
						</tr>

						<tr>
							<td>&nbsp;</td>
							<td>
								<!-- ko if: $root.hash() == 'add' -->
								<button class="ks-button primary" data-bind="click: $root.addSkillGroup, disable: $root.saving()">
									<i class="fa fa-check" data-bind="visible: !$root.saving()"></i>
									<i class="fa fa-refresh fa-spin" data-bind="visible: $root.saving()"></i>
									添加
								</button>
								<!-- /ko -->
								<!-- ko if: $root.hash() == 'update' -->
								<button class="ks-button primary" data-bind="click: $root.updateSkillGroup, disable: $root.saving()">
									<i class="fa fa-check" data-bind="visible: !$root.saving()"></i>
									<i class="fa fa-refresh fa-spin" data-bind="visible: $root.saving()"></i>
									保存
								</button>
								<!-- /ko -->
								&nbsp;
								<button class="ks-button slave"
										data-bind="click: $root.gotoList">取消</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
