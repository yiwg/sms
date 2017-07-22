<!DOCTYPE html>
<%@ page language="java"  contentType="text/html; charset=utf-8" %>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>施工质量安全信息化管控系统</title>
    <meta name="keywords" content="Bootstrap模版,Bootstrap模版下载,Bootstrap教程,Bootstrap中文" />
    <meta name="description" content="JS代码网提供Bootstrap模版,Bootstrap教程,Bootstrap中文翻译等相关Bootstrap插件下载" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- basic styles -->
    <link href="${pageContext.request.contextPath}/app/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/font-awesome.min.css" />

    <link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace-rtl.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/ace-skins.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/jquery-ui-1.10.3.full.min.css" />
</head>

<body>
<div class="navbar navbar-default" id="navbar">
    <script type="text/javascript">
        try{ace.settings.check('navbar' , 'fixed')}catch(e){}
    </script>

    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="#" class="navbar-brand">
                <small>
                    <i class="icon-leaf"></i>
                    施工质量安全信息化管控系统
                </small>
            </a><!-- /.brand -->
        </div><!-- /.navbar-header -->

        <div class="navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">
                <li class="grey">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="icon-tasks"></i>
                        <span class="badge badge-grey">4</span>
                    </a>
                </li>

                <li class="purple">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="icon-bell-alt icon-animated-bell"></i>
                        <span class="badge badge-important">8</span>
                    </a>

                    <ul class="pull-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close">
                        <li class="dropdown-header">
                            <i class="icon-warning-sign"></i>
                            8条通知
                        </li>

                        <li>
                            <a href="#">
                                <div class="clearfix">
											<span class="pull-left">
												<i class="btn btn-xs no-hover btn-pink icon-comment"></i>
												新闻评论
											</span>
                                    <span class="pull-right badge badge-info">+12</span>
                                </div>
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                <i class="btn btn-xs btn-primary icon-user"></i>
                                切换为编辑登录..
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                <div class="clearfix">
											<span class="pull-left">
												<i class="btn btn-xs no-hover btn-success icon-shopping-cart"></i>
												新订单
											</span>
                                    <span class="pull-right badge badge-success">+8</span>
                                </div>
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                <div class="clearfix">
											<span class="pull-left">
												<i class="btn btn-xs no-hover btn-info icon-twitter"></i>
												粉丝
											</span>
                                    <span class="pull-right badge badge-info">+11</span>
                                </div>
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                查看所有通知
                                <i class="icon-arrow-right"></i>
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="light-blue">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        <img class="nav-user-photo" src="${pageContext.request.contextPath}/app/avatars/user.jpg" alt="Photo" />
								<span class="user-info">
									<h4>${sessionScope.user.userName}</h4>
								</span>

                        <i class="icon-caret-down"></i>
                    </a>

                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="#" id="setting">
                                <i class="icon-cog"></i>
                                设置
                            </a>
                        </li>

                        <li>
                            <a href="#" id="profile">
                                <i class="icon-user"></i>
                                个人资料
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="${pageContext.request.contextPath}/user/loginout.do" target="_self">"
                                <i class="icon-off"></i>
                                退出
                            </a>
                        </li>
                    </ul>
                </li>
            </ul><!-- /.ace-nav -->
        </div><!-- /.navbar-header -->
    </div><!-- /.container -->
</div>

<div id="profile-confirm" class="hide">
    <div class="alert alert-info bigger-110">
        用户名:${sessionScope.user.userName} <br>
        密 码：${sessionScope.user.passWord} <br>
    </div>

    <div class="space-6"></div>
</div><!-- #dialog-confirm -->
<div id="setting-confirm" class="signup-box widget-box no-border hide"  >
    <div class="widget-body">
        <div class="widget-main">
            <div class="space-6"></div>
            <div>
                <fieldset>

                    <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="text" class="form-control" value=${sessionScope.user.userName} disabled/>
															<i class="icon-user"></i>
														</span>
                    </label>
                    <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="原密码" />
															<i class="icon-lock"></i>
														</span>
                    </label>

                    <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="新密码" />
															<i class="icon-lock"></i>
														</span>
                    </label>

                    <label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="password" class="form-control" placeholder="再次输入新密码" />
															<i class="icon-retweet"></i>
														</span>
                    </label>

                    <div class="space-24"></div>
                    <%--<button type="button" class="width-65 pull-right btn btn-sm btn-success">
                        确定
                    </button>
                    <div class="clearfix">
                        <button type="reset" class="width-30 pull-left btn btn-sm">
                            <i class="icon-refresh"></i>
                            取消
                        </button>
                    </div>--%>
                </fieldset>
            </div>
        </div>

    </div><!-- /widget-body -->
</div>

<div class="main-container" id="main-container">
    <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
    </script>

    <div class="main-container-inner">
        <a class="menu-toggler" id="menu-toggler" href="#">
            <span class="menu-text"></span>
        </a>

        <div class="sidebar" id="sidebar">
            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
            </script>

            <div class="sidebar-shortcuts" id="sidebar-shortcuts">
                <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
                    <button class="btn btn-success">
                        <i class="icon-signal"></i>
                    </button>

                    <button class="btn btn-info">
                        <i class="icon-pencil"></i>
                    </button>

                    <button class="btn btn-warning">
                        <i class="icon-group"></i>
                    </button>

                    <button class="btn btn-danger">
                        <i class="icon-cogs"></i>
                    </button>
                </div>

                <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
                    <span class="btn btn-success"></span>

                    <span class="btn btn-info"></span>

                    <span class="btn btn-warning"></span>

                    <span class="btn btn-danger"></span>
                </div>
            </div><!-- #sidebar-shortcuts -->

            <ul class="nav nav-list">
                <li class="active">
                    <a href="${pageContext.request.contextPath}/index/index.do">
                        <i class="icon-dashboard"></i>
                        <span class="menu-text"> 导航 </span>
                    </a>
                </li>
                <li>
                    <a href="#" class="dropdown-toggle">
                        <i class="icon-list"></i>
                        <span class="menu-text"> 试验室数据采集 </span>

                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">
                        <li>
                            <a href="${pageContext.request.contextPath}/index/pressRecord.do" target="_blank">
                                <%--<a href="/sms/WEB-INF/views/pressRecord.jsp">--%>
                                <i class="icon-double-angle-right"></i>
                                压力机实时数据查看
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/index/universalRecord.do" target="_blank">
                                <i class="icon-double-angle-right"></i>
                                万能机实时数据查看
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/index/pressOver.do" target="_blank">
                                <i class="icon-double-angle-right"></i>
                                压力机超标处理
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/index/pressOver.do">
                                <i class="icon-double-angle-right"></i>
                                万能机机超标处理
                            </a>
                        </li>
                        <li>
                            <a href="pressRecord.jsp">
                                <i class="icon-double-angle-right"></i>
                                沥青针入度
                            </a>
                        </li>
                        <li>
                            <a href="pressRecord.jsp">
                                <i class="icon-double-angle-right"></i>
                                沥青软换点
                            </a>
                        </li>
                        <li>
                            <a href="pressRecord.jsp">
                                <i class="icon-double-angle-right"></i>
                                马歇尔稳定度
                            </a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a href="#" class="dropdown-toggle">
                        <i class="icon-list"></i>
                        <span class="menu-text"> 混泥土拌合站查询 </span>

                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">
                        <li>
                            <a href="#" target="_blank">
                                <%--<a href="/sms/WEB-INF/views/pressRecord.jsp">--%>
                                <i class="icon-double-angle-right"></i>
                                    拌合机用量查询
                            </a>
                        </li>
                        <li>
                            <a href="#" target="_blank">
                                <i class="icon-double-angle-right"></i>
                                超标数据处理
                            </a>
                        </li>
                        <li>
                            <a href="#" target="_blank">
                                <i class="icon-double-angle-right"></i>
                                配合比查询
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="icon-double-angle-right"></i>
                                产量统计
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" class="dropdown-toggle">
                        <i class="icon-list"></i>
                        <span class="menu-text"> 混凝土拌合站统分 </span>

                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">

                        <li>
                            <a href="#" target="_blank">
                                <i class="icon-double-angle-right"></i>
                                产能分析
                            </a>
                        </li>
                        <li>
                            <a href="#" target="_blank">
                                <i class="icon-double-angle-right"></i>
                                误差分析走势图
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="icon-double-angle-right"></i>
                                生产量核算
                            </a>
                        </li>
                        <li>
                            <a href="#" target="_blank">
                                <%--<a href="/sms/WEB-INF/views/pressRecord.jsp">--%>
                                <i class="icon-double-angle-right"></i>
                                    材料成本核算
                            </a>
                        </li>
                    </ul>
                </li>
            </ul><!-- /.nav-list -->

            <div class="sidebar-collapse" id="sidebar-collapse">
                <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
            </div>

            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
            </script>
        </div>

        <div class="ace-settings-container" id="ace-settings-container">
            <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
                <i class="icon-cog bigger-150"></i>
            </div>

            <div class="ace-settings-box" id="ace-settings-box">
                <div>
                    <div class="pull-left">
                        <select id="skin-colorpicker" class="hide">
                            <option data-skin="default" value="#438EB9">#438EB9</option>
                            <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                            <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                            <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                        </select>
                    </div>
                    <span>&nbsp; 选择皮肤</span>
                </div>

                <div>
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
                    <label class="lbl" for="ace-settings-navbar"> 固定导航条</label>
                </div>

                <div>
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
                    <label class="lbl" for="ace-settings-sidebar"> 固定滑动条</label>
                </div>

                <div>
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
                    <label class="lbl" for="ace-settings-breadcrumbs">固定面包屑</label>
                </div>

                <div>
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
                    <label class="lbl" for="ace-settings-rtl">切换到左边</label>
                </div>

                <div>
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
                    <label class="lbl" for="ace-settings-add-container">
                        切换窄屏
                        <b></b>
                    </label>
                </div>
            </div>
        </div><!-- /#ace-settings-container -->
    </div><!-- /.main-container-inner -->

    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
        <i class="icon-double-angle-up icon-only bigger-110"></i>
    </a>
</div><!-- /.main-container -->

<!-- basic scripts -->

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

<script type="text/javascript">
    $("#profile" ).on('click', function(e) {
        e.preventDefault();

        $( "#profile-confirm" ).removeClass('hide').dialog({
            resizable: false,
            modal: true,
            title: "个人资料",
            title_html: true,
            buttons: [
                {
                    html: "<i class='icon-ok-sign bigger-110'></i>&nbsp; 确定",
                    "class" : "btn btn-danger btn-xs",
                    click: function() {
                        $( this ).dialog( "close" );
                    }
                }
                ,
                {
                    html: "<i class='icon-remove bigger-110'></i>&nbsp; 取消",
                    "class" : "btn btn-xs",
                    click: function() {
                        $( this ).dialog( "close" );
                    }
                }
            ]
        });
    });

    $("#setting" ).on('click', function(e) {
        e.preventDefault();
        console.log("进入设置页面")
        $( "#setting-confirm" ).removeClass('hide').dialog({
            resizable: false,
            modal: true,
            title: "设置",
            title_html: false,
            buttons: [
                {
                    html: "<i class='icon-ok-sign bigger-110'></i>&nbsp; 确定",
                    "class" : "btn btn-danger btn-xs",
                    click: function() {
                        $( this ).dialog( "close" );
                    }
                }
                ,
                {
                    html: "<i class='icon-remove bigger-110'></i>&nbsp; 取消",
                    "class" : "btn btn-xs",
                    click: function() {
                        $( this ).dialog( "close" );
                    }
                }
            ]
        });
    });

    jQuery(function($) {
        $('.easy-pie-chart.percentage').each(function(){
            var $box = $(this).closest('.infobox');
            var barColor = $(this).data('color') || (!$box.hasClass('infobox-dark') ? $box.css('color') : 'rgba(255,255,255,0.95)');
            var trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)' : '#E2E2E2';
            var size = parseInt($(this).data('size')) || 50;
            $(this).easyPieChart({
                barColor: barColor,
                trackColor: trackColor,
                scaleColor: false,
                lineCap: 'butt',
                lineWidth: parseInt(size/10),
                animate: /msie\s*(8|7|6)/.test(navigator.userAgent.toLowerCase()) ? false : 1000,
                size: size
            });
        })

        $('.sparkline').each(function(){
            var $box = $(this).closest('.infobox');
            var barColor = !$box.hasClass('infobox-dark') ? $box.css('color') : '#FFF';
            $(this).sparkline('html', {tagValuesAttribute:'data-values', type: 'bar', barColor: barColor , chartRangeMin:$(this).data('min') || 0} );
        });




        var placeholder = $('#piechart-placeholder').css({'width':'90%' , 'min-height':'150px'});
        var data = [
            { label: "social networks",  data: 38.7, color: "#68BC31"},
            { label: "search engines",  data: 24.5, color: "#2091CF"},
            { label: "ad campaigns",  data: 8.2, color: "#AF4E96"},
            { label: "direct traffic",  data: 18.6, color: "#DA5430"},
            { label: "other",  data: 10, color: "#FEE074"}
        ]
        function drawPieChart(placeholder, data, position) {
            $.plot(placeholder, data, {
                series: {
                    pie: {
                        show: true,
                        tilt:0.8,
                        highlight: {
                            opacity: 0.25
                        },
                        stroke: {
                            color: '#fff',
                            width: 2
                        },
                        startAngle: 2
                    }
                },
                legend: {
                    show: true,
                    position: position || "ne",
                    labelBoxBorderColor: null,
                    margin:[-30,15]
                }
                ,
                grid: {
                    hoverable: true,
                    clickable: true
                }
            })
        }
        drawPieChart(placeholder, data);

        /**
         we saved the drawing function and the data to redraw with different position later when switching to RTL mode dynamically
         so that's not needed actually.
         */
        placeholder.data('chart', data);
        placeholder.data('draw', drawPieChart);



        var $tooltip = $("<div class='tooltip top in'><div class='tooltip-inner'></div></div>").hide().appendTo('body');
        var previousPoint = null;

        placeholder.on('plothover', function (event, pos, item) {
            if(item) {
                if (previousPoint != item.seriesIndex) {
                    previousPoint = item.seriesIndex;
                    var tip = item.series['label'] + " : " + item.series['percent']+'%';
                    $tooltip.show().children(0).text(tip);
                }
                $tooltip.css({top:pos.pageY + 10, left:pos.pageX + 10});
            } else {
                $tooltip.hide();
                previousPoint = null;
            }

        });






        var d1 = [];
        for (var i = 0; i < Math.PI * 2; i += 0.5) {
            d1.push([i, Math.sin(i)]);
        }

        var d2 = [];
        for (var i = 0; i < Math.PI * 2; i += 0.5) {
            d2.push([i, Math.cos(i)]);
        }

        var d3 = [];
        for (var i = 0; i < Math.PI * 2; i += 0.2) {
            d3.push([i, Math.tan(i)]);
        }


        var sales_charts = $('#sales-charts').css({'width':'100%' , 'height':'220px'});
        $.plot("#sales-charts", [
            { label: "Domains", data: d1 },
            { label: "Hosting", data: d2 },
            { label: "Services", data: d3 }
        ], {
            hoverable: true,
            shadowSize: 0,
            series: {
                lines: { show: true },
                points: { show: true }
            },
            xaxis: {
                tickLength: 0
            },
            yaxis: {
                ticks: 10,
                min: -2,
                max: 2,
                tickDecimals: 3
            },
            grid: {
                backgroundColor: { colors: [ "#fff", "#fff" ] },
                borderWidth: 1,
                borderColor:'#555'
            }
        });


        $('#recent-box [data-rel="tooltip"]').tooltip({placement: tooltip_placement});
        function tooltip_placement(context, source) {
            var $source = $(source);
            var $parent = $source.closest('.tab-content')
            var off1 = $parent.offset();
            var w1 = $parent.width();

            var off2 = $source.offset();
            var w2 = $source.width();

            if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
            return 'left';
        }


        $('.dialogs,.comments').slimScroll({
            height: '300px'
        });


        //Android's default browser somehow is confused when tapping on label which will lead to dragging the task
        //so disable dragging when clicking on label
        var agent = navigator.userAgent.toLowerCase();
        if("ontouchstart" in document && /applewebkit/.test(agent) && /android/.test(agent))
            $('#tasks').on('touchstart', function(e){
                var li = $(e.target).closest('#tasks li');
                if(li.length == 0)return;
                var label = li.find('label.inline').get(0);
                if(label == e.target || $.contains(label, e.target)) e.stopImmediatePropagation() ;
            });

        $('#tasks').sortable({
                    opacity:0.8,
                    revert:true,
                    forceHelperSize:true,
                    placeholder: 'draggable-placeholder',
                    forcePlaceholderSize:true,
                    tolerance:'pointer',
                    stop: function( event, ui ) {//just for Chrome!!!! so that dropdowns on items don't appear below other items after being moved
                        $(ui.item).css('z-index', 'auto');
                    }
                }
        );
        $('#tasks').disableSelection();
        $('#tasks input:checkbox').removeAttr('checked').on('click', function(){
            if(this.checked) $(this).closest('li').addClass('selected');
            else $(this).closest('li').removeClass('selected');
        });
    })

</script>

</body>
</html>

