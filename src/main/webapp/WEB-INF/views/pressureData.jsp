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
	<script src="${pageContext.request.contextPath}/app/js/service/pressureData.js"></script>
</head>

<body>

	<div class="breadcrumbs" id="breadcrumbs">
		<script type="text/javascript">
			try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
		</script>

		<ul class="breadcrumb">
			<li>
				<i class="icon-home home-icon"></i>
				<a href="#">试验室数据采集</a>
			</li>
			<li class="active">压力机数据</li>
		</ul><!-- .breadcrumb -->
	</div>

	<div class="page-content">
				<!-- PAGE CONTENT BEGINS -->
		<div class="row" data-bind="visible: hash() == 'list'">
			<div class="ks-button-group" data-bind="click: gotoAdd">
				<span class="primary"><span class="glyphicon glyphicon-plus"></span></span>
				添加压力机数据
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
							<th>序号</th>
							<th>试验室名称</th>
							<th>设备名称</th>
							<th>试验类型</th>
							<th>设计强度</th>
							<th>试件编号</th>
							<th>施工部位</th>
							<th>龄期</th>
							<th>试件尺寸</th>
							<th>设计强度</th>
							<th>荷载(kN)</th>
							<th>强度单值</th>
							<th>查看曲线</th>
							<th>强度代表值</th>
							<th>是否合格</th>
						</tr>
						</thead>

						<tbody class="table-body-tr" data-bind="foreach:listPage">
						<tr >

							<td>
								<a href="#" data-bind="text:id"></a>
							</td>
							<td data-bind="text:labName"></td>
							<td data-bind="text:deviceName"></td>
							<td data-bind="text:testType"></td>
							<td data-bind="text:deviceNum"></td>
							<td data-bind="text:constructionPoint"></td>
							<td data-bind="text:testDate"></td>
							<td data-bind="text:age"></td>
							<td data-bind="text:deviceSize"></td>
							<td data-bind="text:designStrength"></td>
							<td>
								<tr data-bind="text:loadOne">
								</tr>
								<tr data-bind="text:loadTwo">
								</tr>
								<tr data-bind="text:loadThree">
								</tr>
							</td>
							<td ></td>
							<td></td>
							<td></td>
							<%--<td>
								<div class="visible-md visible-lg hidden-sm hidden-xs btn-group">

									<button class="btn btn-xs btn-info table-data-update" data-bind="click: $root.gotoUpdate">
										<i class="icon-edit bigger-120"></i>
									</button>

									<button class="btn btn-xs btn-danger table-data-delete" data-bind="click:  $root.deleteUser">
										<i class="icon-trash bigger-120"></i>
									</button>

								</div>

							</td>--%>
						</td>
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
					<table class="ks-form-table" data-bind="with: tempUser">
						<tr>
							<td>压力机数据名称：</td>
							<!-- ko if: $root.hash() == 'add' -->
							<td>
								<input type="text" class="ks-input" data-bind="value: name"
									validate="required: true" placeholder="请输入压力机数据名" />
							</td>
							<!-- /ko -->
							<!-- ko if: $root.hash() == 'update' -->
							<td>
								<input type="text" class="ks-input" data-bind="value: name"
									   validate="required: true" disabled="disabled" />
							</td>
							<!-- /ko -->

							<td></td>
						</tr>
						<tr>
							<td>所属项目：</td>
							<!-- ko if: $root.hash() == 'add' -->
							<td><select class="ks-input" style="height: 35px"
										data-bind="value:itemId,options: $root.itemTypeList, optionsValue: 'itemId', optionsText: 'itemName'">
							</select></td>
							<!-- /ko -->
							<!-- ko if: $root.hash() == 'update' -->
							<td><select class="ks-input ks-disable" style="height: 35px"
										data-bind="value:itemId,options: $root.itemTypeList, optionsValue: 'itemId', optionsText: 'itemName'"
										disabled="disabled">
							</select></td>
							<!-- /ko -->
						</tr>
						<tr>
							<td>类型：</td>
							<!-- ko if: $root.hash() == 'add' -->
							<td><select class="ks-input " style="height: 35px"
										data-bind="value:type,options: $root.typeList, optionsValue: 'type', optionsText: 'typeName'">
							</select></td>
							<!-- /ko -->
							<!-- ko if: $root.hash() == 'update' -->
							<td><select class="ks-input ks-disable" style="height: 35px"
										data-bind="value:type,options: $root.typeList, optionsValue: 'type', optionsText: 'typeName'"
										disabled="disabled">
							</select></td>
							<!-- /ko -->
						</tr>
						<tr>
							<td>压力机数据密码：</td>
							<td>
								<input type="text" class="ks-input" data-bind="value: passWord"
									   validate="required: true" placeholder="请输入密码" />
							</td>

							<td></td>
						</tr>
						<tr>
							<td>手机号码：</td>
							<td>
								<input type="text" class="ks-input" data-bind="value: phoneNum"
									   validate="required: true" placeholder="手机号码" />
							</td>

							<td></td>
						</tr>
						<tr>
							<td>E_mail：</td>
							<td>
								<input type="text" class="ks-input" data-bind="value: email"
									   validate="required: true" placeholder="请输入电子邮箱" />
							</td>

							<td></td>
						</tr>

						<tr>
							<td>&nbsp;</td>
							<td>
								<!-- ko if: $root.hash() == 'add' -->
								<button class="ks-button primary" data-bind="click:$root.addUser">
									<i class="fa fa-check" data-bind="visible: !$root.saving()"></i>
									<i class="fa fa-refresh fa-spin" data-bind="visible: $root.saving()"></i>
									添加
								</button>
								<!-- /ko -->
								<!-- ko if: $root.hash() == 'update' -->
								<button class="ks-button primary" data-bind="click: $root.updateUser">
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
