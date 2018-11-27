package com.myehr.controller.form;

import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.mapper.formmanage.form.SysCommentMapper;
import com.myehr.pojo.formmanage.form.SysComment;

@Controller
@RequestMapping("/comment")
public class commentController {
	@Autowired
	private SysCommentMapper sysCommentMapper;
	
	@RequestMapping("/saveComment")
	public @ResponseBody Object saveComment(HttpServletRequest request,@RequestBody SysComment comment){
		String userId = (String)request.getSession().getAttribute("userid").toString();
		comment.setName(userId);
		comment.setKeyid(new BigDecimal("1"));
		comment.setFormid(new BigDecimal("1"));
		comment.setDatetime(new Date());
		try{
			int reCode=sysCommentMapper.insert(comment);
			if(reCode==1){
				return reCode;
			}else{
				return 0;
			}
		}catch(Exception e){
			return false;
		}
		
	}
}
