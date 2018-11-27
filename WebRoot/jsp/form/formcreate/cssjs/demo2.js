var setting2 = {
        //勾选 checkbox 对于父子节点的关联关系
        check: {enable: true,chkboxType: {"Y":"ps", "N":"ps"}  },
        data: {
            key: {title: "title"},

            //使用简易数据模式，即id  pid,一定要注意大小写
            simpleData: {
                enable: true,
                idKey: "id",
                pIdKey: "pId",
                rootPId: 0 //根节点pid 
            }
        },
        callback: {onClick:onClick,onAsyncSuccess:onAsyncSuccess,onAsyncError: zTreeOnAsyncError},
        //这个async是插件封装的ajax
        async: {
            enable:false, // 需要异步加载
            autoParam:["id","level=lv"], //传递的参数 id lv（层级，最开始是0）
            dataFilter: filter
        },
        //双击节点时，是否自动展开父节点的标识
        view: { dblClickExpand: false,addDiyDom: addDiyDom}, 
    };
    //数据过滤  childNodes其实是ajax返回的数据
    function filter(treeId, parentNode, childNodes) {
            if (!childNodes) return null;
            for (var i=0, l=childNodes.length; i<l; i++) {
                childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
            }
            return childNodes;
    }
    function addDiyDom(treeId, treeNode) {
                var spaceWidth = 5;
                var switchObj = $("#" + treeNode.tId + "_switch"),
                icoObj = $('#' + treeNode.tId + '_ico');
                switchObj.remove();
                icoObj.before(switchObj);
                if (treeNode.level > 1) {
                    var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level)+ "px'></span>";
                    switchObj.before(spaceStr);
                }
        }
    function beforeClick(treeId, treeNode) {
            if (!treeNode.isParent) {
                alert("请选择父节点");
                return false;
            } else {
                return true;
            }
        }
//节点点击事件，加载2级数据
//同时还是用于捕获异步加载正常结束的事件回调函数
var maxLevel = 2;
function onAsyncSuccess(event, treeId, treeNode){
        if(treeNode && treeNode.level >= maxLevel - 1 ){
            return;
        }
        var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");
        var type = 'refresh';//清空后重新加载
        var silent = true;//不展开父节点，其他值或缺省状态都自动展开
        //加载根节点时，treeNode是不存在的null，所以一定要做处理
        var nodes = treeNode ? treeNode.children : zTree.getSelectedNodes();
        for (var i=0, l=nodes.length; i<l; i++) {
            if(nodes[i].isParent){
            //强行异步加载父节点的子节点,点击之后运行这个函数，只传父节点过去,注意设置属性isParent
                zTree.reAsyncChildNodes(nodes[i], type, silent);
                if (!silent) zTree.selectNode(nodes[i]);
            }
        }
        var selectedNode = zTree.getSelectedNodes();
        var nodes = zTree.getNodes();
        zTree.expandNode(nodes[0], true);
}
function onClick(event, treeId, treeNode){  
    if(treeNode && treeNode.level >= maxLevel - 1 ){
            return;
        }
    var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");
    var type = 'refresh';//清空后重新加载
    var silent = true;//不展开父节点，其他值或缺省状态都自动展开
    //加载根节点时，treeNode是不存在的null，所以一定要做处理
    var nodes = treeNode ? treeNode.children : zTree.getNodes();

    for (var i=0, l=nodes.length; i<l; i++) {
        if(nodes[i],isParent){
            //强行异步加载父节点的子节点,点击之后运行这个函数，只传父节点过去,注意设置属性isParent
            zTree.reAsyncChildNodes(nodes[i], type, silent);
            if (!silent) zTree.selectNode(nodes[i]);
        }
    }
}; 

//用于捕获异步加载出现异常错误的事件回调函数
function zTreeOnAsyncError(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown) {
    alert(XMLHttpRequest);
};

    

    $(document).ready(function(){
        //zTree 初始化方法
        // $.fn.zTree.init($("#paramTreeDemo"), setting);
        document.getElementById("key2").value = ""; //清空搜索框中的内容  
        //绑定事件  
        key = $("#key2");  
        key.bind("focus", focusKey)  
            .bind("blur", blurKey)  
            .bind("propertychange", searchNode) //property(属性)change(改变)的时候，触发事件  
            .bind("input", searchNode);  
    });


var lastValue = "", nodeList = [], fontCss = {};  
//键盘释放：当输入框的键盘按键被松开时，把查询到的数据结果显示在标签中  
function callNumber(){  
    var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
  
    //如果结果有值，则显示比例；如果结果为0，则显示"[0/0]"；如果结果为空，则清空标签框；  
    if(nodeList.length){  
        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
        zTree.selectNode(nodeList[0],false );  
        document.getElementById("key2").focus();  
  
        clickCount=1; //防止重新输入的搜索信息的时候，没有清空上一次记录  
  
        //显示当前所在的是第一条  
        document.getElementById("number2").innerHTML="["+clickCount+"/"+nodeList.length+"]";  
  
    }else if(nodeList.length == 0){  
        document.getElementById("number2").innerHTML="[0/0]";  
        zTree.cancelSelectedNode(); //取消焦点  
    }  
  
    //如果输入框中没有搜索内容，则清空标签框  
    if(document.getElementById("key2").value ==""){  
        document.getElementById("number2").innerHTML="";  
        zTree.cancelSelectedNode();  
    }  
}  
function focusKey(e) {  
    if (key.hasClass("empty")) {  
        key.removeClass("empty");  
    }  
}  
function blurKey(e) {  
    if (key.get(0).value === "") {  
        key.addClass("empty");  
    }  
}  
//搜索节点  
function searchNode(e) {  
    var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
    var value = $.trim(key.get(0).value);  
    var keyType = "name";  
  
    if (key.hasClass("empty")) {  
        value = "";  
    }  
    if (lastValue === value) return;  
    lastValue = value;  
    if (value === ""){  
        updateNodes(false);  
        return;  
    };  
    nodeList = zTree.getNodesByParamFuzzy(keyType, value); //调用ztree的模糊查询功能，得到符合条件的节点 
    console.log(nodeList);
    updateNodes(true); //更新节点  
}   

//高亮显示被搜索到的节点  
function updateNodes(highlight) {  
    var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
    for( var i=0, l=nodeList.length; i<l; i++) {  
        nodeList[i].highlight = highlight; //高亮显示搜索到的节点(highlight是自己设置的一个属性)  
        zTree.expandNode(nodeList[i].getParentNode(), true, false, false); //将搜索到的节点的父节点展开  
        zTree.updateNode(nodeList[i]); //更新节点数据，主要用于该节点显示属性的更新  
    }  
} 

//设置颜色  
function getFontCss(treeId, treeNode) {  
    return (!!treeNode.highlight) ? {color:"#A60000", "font-weight":"bold"} : {color:"#333", "font-weight":"normal"};  
} 

//点击向上按钮时，将焦点移向上一条数据  
function clickUp(){  
    var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
    //如果焦点已经移动到了最后一条数据上，就返回第一条重新开始，否则继续移动到下一条  
    if(nodeList.length==0){  
        alert("没有搜索结果！");  
        return ;  
    }else if(clickCount==1) {  
        alert("您已位于第一条记录上！");  
        return;  
        //让结果集里边的下一个节点获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
        //zTree.selectNode(nodeList[clickCount], false)  
    }else{  
        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
        zTree.selectNode(nodeList[clickCount], false);  
        clickCount --;  
    }  
    document.getElementById("key2").focus();  
    //显示当前所在的是条数  
    document.getElementById("number2").innerHTML = "[" + clickCount + "/" + nodeList.length + "]";  
}  
//点击向上按钮时，将焦点移向下一条数据  
function clickDown(){  
    var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
    //如果焦点已经移动到了最后一条数据上，则提示用户（或者返回第一条重新开始），否则继续移动到下一条  
    if(nodeList.length==0){  
        alert("没有搜索结果！");  
        return ;  
    }else if(nodeList.length==clickCount)  
    {  
        alert("您已位于最后一条记录上！")  
        return;  
    }else{  
        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
        zTree.selectNode(nodeList[clickCount], false)  
        clickCount ++;  
    }  
    document.getElementById("key2").focus();  
    //显示当前所在的条数  
    document.getElementById("number2").innerHTML = "[" + clickCount + "/" + nodeList.length + "]";  
}  