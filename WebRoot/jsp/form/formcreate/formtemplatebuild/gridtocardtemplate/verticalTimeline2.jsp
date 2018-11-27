<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
    ul.timeline {
          list-style-type: none;
          margin: 50px 100px;
          padding: 0;
      }
   
	  ul.timeline li .line {
			border-left: 5px solid #3594cb;
			position: absolute;
			left: 20px;
			top: 50px;
			height: 100%;
			width:100%;
			padding-left: 50px;
      }
	  
      ul.timeline li {
          position: relative;
          padding-bottom: 20px;
      }
      ul.timeline li .time {
				position: absolute;
				width: 100%;
				height:100%;
				text-align: right;
				left: 0;
				top: 10px;
				color: #999;
      }
      ul.timeline li .version {
				position: absolute;
				width: 100%;
				text-align: right;
				height:100%;
				top: 30px;
				font-size: 40px;
				line-height: 50px;
				color: #3594cb;
      } 
	  
	  ul.timeline li .number{
			position: absolute;
			width:100%;
			top: -30px;
			left: 109px;
			height: 100%;
	  }
	  
	  .allContent-right{	
							position: relative;
							min-height: 150px;
							width:40%;
						}
						
	 ul.timeline li .content{
							height: 100%;
							width:100%;
							position: absolute;
							top: -50px;
						}
	ul.timeline li .content pre {
          background-color: #43B1F1;
		  width:100%;
		  min-height:100px;
      }
</style>
  <ul class="timeline">
      <li class="li-right">
		<div class="allContent-right">
          <div class="time">
			<p style="float:left">2013-07-29</p>
			<div class="version">
				<p style="float:left">v3.3.1</p>
				<div class="number">
					<img  src="http://localhost:9999/ww.jpeg" style="width:50px;height:50px;float:left" alt="上海鲜花港 - 郁金香" />
					<div class="line">
						<div class="content">
						  <pre>King Athamus of northern Greece had two children， Phrixus and Helle．
						  After he left his first wife and mar ried Ino，a wicked woman，the two children received all the cruel 
						  treatment that a stepmother coulddevise ，At one timethe kingdom was ruined by a famine． 
						  </pre>
						</div>
					</div>
				</div>
			</div>
		  </div>
		</div>
      </li>
	  <li class="li-right">
		<div class="allContent-right">
          <div class="time">
			<p style="float:left">2013-07-29</p>
			<div class="version">
				<p style="float:left">v3.3.1</p>
				<div class="number">
					<img  src="http://localhost:9999/ww.jpeg" style="width:50px;height:50px;float:left" alt="上海鲜花港 - 郁金香" />
					<div class="line">
						<div class="content">
						  <pre>King Athamus of northern Greece had two children， Phrixus and Helle．
						  After he left his first wife and mar ried Ino，a wicked woman，the two children received all the cruel 
						  treatment that a stepmother coulddevise ，At one timethe kingdom was ruined by a famine． 
						  </pre>
						</div>
					</div>
				</div>
			</div>
		  </div>
		</div>
      </li>
	  <li class="li-right">
		<div class="allContent-right">
          <div class="time">
			<p style="float:left">2013-07-29</p>
			<div class="version">
				<p style="float:left">v3.3.1</p>
				<div class="number">
					<img  src="http://localhost:9999/ww.jpeg" style="width:50px;height:50px;float:left" alt="上海鲜花港 - 郁金香" />
					<div class="line">
						<div class="content">
						  <pre>King Athamus of northern Greece had two children， Phrixus and Helle．
						  After he left his first wife and mar ried Ino，a wicked woman，the two children received all the cruel 
						  treatment that a stepmother coulddevise ，At one timethe kingdom was ruined by a famine． 
						  </pre>
						</div>
					</div>
				</div>
			</div>
		  </div>
		</div>
      </li>
  </ul>
  
<script>
/*
  $(function() {
    var nextDataNumber = 5;
    var ajaxLoading = false;
    var docNode = $(document);
     
    var ulNode = $('ul.timeline');
     
    function initLiNodes() {
        var liNodes = ulNode.find('li'), count = liNodes.length, i, liNode, leftCount = nextDataNumber * 20;
        for(i=0; i<count; i++) {
            liNode = $(liNodes.get(i));
            if(i % 2 !== 0) {
                liNode.addClass('alt');
            } else {
                liNode.removeClass('alt');
            }
            liNode.find('.number').text(leftCount + count - i);
        }
    }
    $('#fetchNextData').click(function() {
        var $this = $(this);
        $this.addClass('disabled').text('正在加载后二十条数据...');
        ajaxLoading = true;
        $.get('./version_data_' + nextDataNumber +'.txt', function(data) {
            ajaxLoading = false;
            ulNode.append(data);
            $this.removeClass('disabled').text('后二十条数据');
            nextDataNumber--;
            if(nextDataNumber === 0) {
                $this.hide();
            }
            initLiNodes();
        });
         
    });
 
    initLiNodes();
    docNode.scroll(function() {
        if(docNode.height() - $(window).height() - docNode.scrollTop() < 10) {
            if(!ajaxLoading) {
                $('#fetchNextData').click();
            }  
        }
         
    });
     
});*/
 </script>