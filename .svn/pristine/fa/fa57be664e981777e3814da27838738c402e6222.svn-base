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
		  left: 123px;
		  height: 100%;
      }
	  
      ul.timeline li {
          position: relative;
          padding-bottom: 20px;
      }
      ul.timeline li .time {
          position: absolute;
          width: 90px;
          text-align: right;
          left: 0;
          top: 10px;
          color: #999;
      }
      ul.timeline li .version {
          position: absolute;
          width: 290px;
          text-align: right;
          left: -200px;
          top: 30px;
          font-size: 40px;
          line-height: 50px;
          color: #3594cb;
          overflow: hidden;
      }
      ul.timeline li .number {
          position: absolute;
          background: url("http://localhost:9999/ww.jpeg") no-repeat scroll 0 0 transparent;
          width: 56px;
          height: 56px;
          left: 97px;
          line-height: 56px;
          text-align: center;
          color: #fff;
          font-size: 18px;
		  z-index:100;
      }
      ul.timeline li .content {
          margin-left: 180px;
          
      }
      ul.timeline li .content pre {
          background-color: #3594cb;
          padding: 20px;
          color: #fff;
          font-size: 13px;
          line-height: 20px;
      }
      ul.timeline li.alt .content pre {
          background-color: #43B1F1;
      }
  </style>
  <ul class="timeline">
      <li>
          <div class="time">2013-07-29</div>
          <div class="version">v3.3.1</div>
          <div class="number"></div>
		  <div class="line"></div>
          <div class="content">
              <pre>
              King Athamus of northern Greece had two children， Phrixus and Helle．
			  After he left his first wife and mar ried Ino，a wicked woman，the two children received all the cruel 
			  treatment that a stepmother coulddevise ，At one timethe kingdom was ruined by a famine． 
              </pre>
          </div>
      </li>
	  <li>
          <div class="time">2013-07-29</div>
          <div class="version">v3.3.1</div>
          <div class="number"></div>
		  <div class="line"></div>
          <div class="content">
              <pre>
              Ino persuaded her credulous husband intobelievingthat his son，
			  Phrixus，was the actual cause of the disaster，and should be sacrificed to Zeus to endit．
			  The poor boy was then placed on the altar and was about tobe knifed when a ram with goldenfleecewas 
			  sent down by thegods and carried off the two children on its back．       
              </pre>
          </div>
      </li>
	  <li>
          <div class="time">2013-07-29</div>
          <div class="version">v3.3.1</div>
          <div class="number"></div>
		  <div class="line"></div>
          <div class="content">
              <pre>
              As they flew over the strait that divides Asia from Europe，
			  Helle，faint at the vast expanse of waterbelow ，fell into the sea and was drowned．
			  Thus the sea of Helle，Hellespont，became the ancient name of the strip of water．
			  Her brother kept on and arrived in Colchis on the eastern shore of the Black Sea．
			  There he sacrificed the ram to Zeus and gave its golden fleece to King Aeetes，
			  who nailed it on a sacred tree and put a sleepless dragon incharge ．      
              </pre>
          </div>
      </li>
	  <li>
          <div class="time">2013-07-29</div>
          <div class="version">v3.3.1</div>
          <div class="number"></div>
		  <div class="line"></div>
          <div class="content">
              <pre>
              -将工具YUICompressor替换为Microsoft Ajax Minifier（需要指定-evals:immediate）。
              ...        
              </pre>
          </div>
      </li>
	  <li>
          <div class="time">2013-07-29</div>
          <div class="version">v3.3.1</div>
          <div class="number"></div>
		  <div class="line"></div>
          <div class="content">
              <pre>
              -将工具YUICompressor替换为Microsoft Ajax Minifier（需要指定-evals:immediate）。
              ...        
              </pre>
          </div>
      </li>
  </ul>
  
<script>
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
     
});
 </script>