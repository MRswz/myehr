package com.myehr.controller.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.mapper.formmanage.drag.SysFormDragconfigMapper;
import com.myehr.pojo.TreeModel;
import com.myehr.pojo.formmanage.drag.SysFormDragconfig;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigExample;


@Controller
@RequestMapping("/formdragconfigtree")
public class FormDragconfigTreeController {
	@Autowired
	private SysFormDragconfigMapper sysformdragconfigmapper;


@SuppressWarnings("unchecked")
@RequestMapping("/dragconfigTree")
public @ResponseBody List<Map>  dragconfigTree(HttpServletRequest request) throws Throwable {
	List<TreeModel> tList =new ArrayList<TreeModel>();
	TreeModel test1 = new TreeModel();
	test1.setId("root");
	test1.setIsParent(true);
	test1.setName("管理桌面");
	test1.setOpen(false);
	test1.setPid("");
	
	SysFormDragconfigExample example=new SysFormDragconfigExample();
	example.or().andDragconfigPidEqualTo(new BigDecimal(0));
	List<SysFormDragconfig> dragconfigs=sysformdragconfigmapper.selectByExample(example);
	if(dragconfigs.size()>0){
		tList.add(test1);
		for(SysFormDragconfig sysformdragconfigexpand : dragconfigs){
			TreeModel test2 = new TreeModel();
			test2.setId(sysformdragconfigexpand.getDragconfigId()+"");
			test2.setName(sysformdragconfigexpand.getDragconfigCname());
			test2.setOpen(false);
			test2.setPid("root");
			SysFormDragconfigExample example1=new SysFormDragconfigExample();
			example1.or().andDragconfigPidEqualTo(sysformdragconfigexpand.getDragconfigId()).andDeleteMarkEqualTo("N");
			List<SysFormDragconfig> dragconfigs1=sysformdragconfigmapper.selectByExample(example1);
			if(dragconfigs1.size()>0){
				tList.add(test2);
				SysFormDragconfigExample example2=new SysFormDragconfigExample();
				example2.or().andDragconfigPidEqualTo(sysformdragconfigexpand.getDragconfigId());
				List<SysFormDragconfig> dragconfigs2=sysformdragconfigmapper.selectByExample(example2);
				for(SysFormDragconfig sysformdragconfigexpand1 : dragconfigs2){
					TreeModel test3 = new TreeModel();
					test3.setId(sysformdragconfigexpand1.getDragconfigId()+"");
					test3.setIsParent(false);
					test3.setName(sysformdragconfigexpand1.getDragconfigCname());
					test3.setOpen(true);
					test3.setPid(sysformdragconfigexpand.getDragconfigId()+"");
					tList.add(test3);
				}
			}else{
				test2.setIsParent(false);
				tList.add(test2);
			}
		}
	}else{
		test1.setIsParent(false);
		tList.add(test1);
	}
	
	JSONArray jsonArray=JSONArray.fromObject(tList);
	String str=jsonArray.toString();
	String newStr = str.replaceAll("pid","pId");
	JSONArray json = JSONArray.fromObject(newStr);
	return json;
	
   }

}