
  ;$(document).on('click','#myTab > li',function(e){
    var oldTab = $("#myTab li.active").removeClass("active").find("a[data-toggle='tab']");
    $(oldTab.attr("href")).removeClass("active");
    var newTab = $(this).addClass("active").find("a[data-toggle='tab']");
    $(newTab.attr("href")).addClass("active");

    refreshTabHistory(false/*isDelete*/,$(this).attr('id').substring(4));
  })
  $.fn.tab = function(action){
    if(action == "show"){
      $(this).parent().click();
    }
  }

  var currentTabId = '';//当前焦点Tab
  var pageCounter = 0;
  /*
  id:       tab页签的html标签ID属性格式为"tab-"+id，内容容器的html标签ID格式为"tab-content-"+id
  text:     tab页签的显示文本
  url:      打开的iframe的url
  innerTab: 是否是内部弹出页（打开的tab页触发添加新的tab页），默认为undefined/false
  */
  function addTab(id,text,url,innerTab) {
    if($('#myTab #tab-'+id).length > 0){
      $('#myTab  #tab-' + id + ' a').tab('show');
    }else{
      var tab_id = "tab-" + id,
      tab_content_id = "tab-content-"+id;
      
      $("#myTab > li").removeClass("active");
      $("#myTab").append("<li id='" + tab_id + "' class='active'><a data-toggle='tab' href='#"
        + tab_content_id + "'>" + text + "</a>"
        + ("<i class='fa fa-times' onclick='deleteTab(\"" + id + "\")'></i>") + "</li>");
      
      $(".tab-content > div").removeClass("active");
      $(".tab-content").append("<div id='"+ tab_content_id +"' class='active'>"
        + "<iframe id='iframepage" + (pageCounter++) + "' name='iframepage" + (pageCounter++) 
        + "' width='100%' frameborder='0' scrolling='no'  src='" + url + "'></iframe></div>");      
    }
    refreshTabHistory(false/*isDelete*/,id);
    refreshWidth();
  }
  //参数id为tab的标志，但是并不是tab页的id属性，真正的id属性值是"tab-"+id
  function deleteTab(id){
    var tabJQ = $("#tab-"+id),
    tabContentJQ = $("#tab-content-" + id);    
    
    if(!tabJQ.hasClass("active")){
      tabJQ.remove();
      tabContentJQ.remove();
      refreshTabHistory(true/*isDelete*/,id);
    }else{    
      tabJQ.remove();
      tabContentJQ.remove();
      refreshTabHistory(true/*isDelete*/,id);
      $('#tab-' + currentTabId + ' > a').tab('show').click();
    }
    refreshWidth();
  }
  function closeCurrentTab(){
    deleteTab(currentTabId);
  }

  function refreshTabHistory(isdelete,curTabId){
    if(!refreshTabHistory.histoty){
      //用来记录用户点击tab的历史
      refreshTabHistory.histoty = [];
    }
    var index = 0,
    leng = refreshTabHistory.histoty.length;
    for(; index < leng; index++){
      if(refreshTabHistory.histoty[index] == curTabId){
        break;
      }
    }

    if(isdelete){
      refreshTabHistory.histoty.splice(index,1);
    }else{
      if(index < leng) {
        refreshTabHistory.histoty.splice(index,1);
      }
      refreshTabHistory.histoty.push(curTabId);
    }
    currentTabId = refreshTabHistory.histoty[refreshTabHistory.histoty.length - 1];
  }

  //刷新重置tab页签的宽度
  function refreshWidth(){
    var panelWidth = $('#myTab').width() - 20,
    tabs = $('#myTab > li'),
    tabContentAverageWidth = 0,
    minTabAverageWidth = 25,
    zeroContentTabWidth = 35,
    aPaddingLeft = 10;
    
    averageWidth = parseInt(panelWidth/(tabs.length),10);// 
    if(averageWidth >= zeroContentTabWidth){
      tabContentAverageWidth = averageWidth - zeroContentTabWidth;
      

    }else if(averageWidth >= minTabAverageWidth){
      tabContentAverageWidth = 0;
      aPaddingLeft = averageWidth - minTabAverageWidth;
      

    }else{
      tabContentAverageWidth = 0;
      aPaddingLeft = 0;
    }

    tabs.find('>a').css({'width':(tabContentAverageWidth + aPaddingLeft),'padding-left':aPaddingLeft});
  }