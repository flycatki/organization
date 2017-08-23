var basepath = $("#basepath").val();
var json;
$(document).ready(function() {
	$.ajax({
		type: "GET",
		url: basepath + "/manage/organization/rest/init",
		dataType: "json",
		success: function(result) {
			var data = [
		       { "id" : "ajson1", "parent" : "#", "text" : "Simple root node" , "type" : "organization" },
		       { "id" : "ajson2", "parent" : "#", "text" : "Root node 2" ,"type" : "organization" ,'state':{'opened': 'true'} },
		       { "id" : "ajson3", "parent" : "ajson2", "text" : "Child 1" ,"type" : "work" },
		       { "id" : "ajson4", "parent" : "ajson2", "text" : "Child 2" ,"type" : "work" },
		    ];
			json = data;
			$('#jstree1').jstree({
				"core": {
					//激活删除节点功能
					'check_callback': true,
					//用于生成tree的数据
					"data": data
				},
				'plugins': ['types', 'dnd', 'contextmenu'],
				'types': {
					'organization': {
						'icon': 'fa fa-sitemap'
					},
					'work': {
						'icon': 'fa fa-user-circle-o'
					},
					'svg': {
						'icon': 'fa fa-file-picture-o'
					},
					'css': {
						'icon': 'fa fa-file-code-o'
					},
					'img': {
						'icon': 'fa fa-file-image-o'
					},
					'js': {
						'icon': 'fa fa-file-text-o'
					}

				},
				'contextmenu': {
					select_node: false,
					show_at_node: true,
					'items': {
						'create': {
							//Create这一项在分割线之前
							'separator_before': false,
							//Create这一项在分割线之后
							'separator_after': true,
							//false表示 create 这一项可以使用; true表示不能使用
							'_disabled': false,
							'label': '添加岗位',
							'icon': 'fa fa-plus',
							//点击Create这一项触发该方法,这理还是蛮有用的
							'action': function(data) {
								//增加组织机构div显示
								$("#ibox1").css("display", "");
								//提示div隐藏
								$("#ibox2").css("display", "none");
								//焦点移动至输入名称项
								$("#organizationName").focus();
								//获得当前节点,可以拿到当前节点所有属性
								var inst = $.jstree.reference(data.reference),
									obj = inst.get_node(data.reference);
								
								$("#parentUuid").val(obj.id);
								//新加节点,以下三行代码注释掉就不会添加节点
								/* inst.create_node(obj, {},"last",function(new_node) {
								    //新加节点后触发 重命名方法,即 创建节点完成后可以立即重命名节点
								    setTimeout(function() {inst.edit(new_node);},0);
								}); */

							}
						},
                        'createBm': {
                            //Create这一项在分割线之前
                            'separator_before': false,
                            //Create这一项在分割线之后
                            'separator_after': true,
                            //false表示 create 这一项可以使用; true表示不能使用
                            '_disabled': false,
                            'label': '添加部门',
                            //点击Create这一项触发该方法,这理还是蛮有用的
                            'action': function(data) {
                                //增加组织机构div显示
                                $("#ibox1").css("display", "");
                                //提示div隐藏
                                $("#ibox2").css("display", "none");
                                //焦点移动至输入名称项
                                $("#organizationName").focus();
                                //获得当前节点,可以拿到当前节点所有属性
                                var inst = $.jstree.reference(data.reference),
                                    obj = inst.get_node(data.reference);
                                //新加节点,以下三行代码注释掉就不会添加节点
                                /* inst.create_node(obj, {},"last",function(new_node) {
                                    //新加节点后触发 重命名方法,即 创建节点完成后可以立即重命名节点
                                    setTimeout(function() {inst.edit(new_node);},0);
                                }); */

                            }
                        },
						'rename': {
							//rename这一项在分割线之前
							'separator_before': false,
							//rename这一项在分割线之后
							'separator_after': true,
							//false表示 create 这一项可以使用; true表示不能使用
							'_disabled': false,
							'label': '重命名',
							//点击Create这一项触发该方法,这理还是蛮有用的
							'action': function(data) {
								//获得当前节点,可以拿到当前节点所有属性
								var inst = $.jstree.reference(data.reference),
									obj = inst.get_node(data.reference);
								inst.edit(obj);
							}
						},
						'delete': {
							//delete这一项在分割线之前
							'separator_before': false,
							//delete这一项在分割线之后
							'separator_after': true,
							//false表示 create 这一项可以使用; true表示不能使用
							'_disabled': false,
							'label': '刪除',
							//点击delete这一项触发该方法,这理还是蛮有用的
							'action': function(data) {
								//获得当前节点,可以拿到当前节点所有属性
								var inst = $.jstree.reference(data.reference),
									obj = inst.get_node(data.reference);
								if(inst.is_selected(obj)) {
									inst.delete_node(inst.get_selected());
								} else {
									inst.delete_node(obj);
								}
								$.ajax()
							}
						}
					}
				}
			});
		}
	});

	//按钮增加节点用
	/* 				$("#bumen").click(function(){
						 .bind("loaded.jstree", function () {
						 jQuery("#jstree1").jstree("open_all");
						 }).bind("create_node.jstree",function(event,data){
						 createCategory(event,data);
						 })
						 $('#jstree1').jstree("create");
						 }); */

});

function createSubmit() {
	$.ajax({
		type: 'post',
		url: basepath + '/manage/organization/rest/create',
		data: {
			organizationName: $("#organizationName").val(),
			parentUuid : $("#parentUuid").val()
		},
		beforeSend: function() {
			// todo check
		},
		success: function(result) {
			alert(result.message);
			refreshTree();
		},
		error: function(XMLHttpRequest, textStatus, errorThrown) {

		}
	});
}

function refreshTree(){
	var tree = $('#jstree1');  
	tree.jstree({'core':{data:null}});  

	var obj = { "id" : "ajson5", "parent" : "ajson2", "text" : "Child 3" }
	json.push(obj);
	var node = tree.jstree("get_node","ajson2");

	tree.jstree(true).settings.core.data = json;  
	tree.jstree(true).refresh(node.id); 
	
}	
		
 


$("#add").click(function() {
	createSubmit();
});