package com.myehr.controller.actfree;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.mapper.formmanage.form.SysActfreeWayMapper;
import com.myehr.pojo.formmanage.form.ActFreeComent;
import com.myehr.pojo.formmanage.form.SysActfreeConduct;
import com.myehr.pojo.formmanage.form.SysActfreeHis;
import com.myehr.pojo.formmanage.form.SysActfreeTask;
import com.myehr.pojo.formmanage.form.SysActfreeWay;
import com.myehr.service.impl.formmanage.form.SysformconfigService;

@Service
public class ActFreeServiceImpl implements ActFreeService{
	@Autowired
	SysActfreeWayMapper sysactfreewaymapper;
    @Autowired
    private SysformconfigService sysformconfigService;
	@Override
	public void addActFreeway(SysActfreeWay actfreeway){
	  sysactfreewaymapper.insert(actfreeway);
    }
	@Override
	public ActFreeComent getComentsByTaskId(String taskId) {
		SysActfreeTask task = sysformconfigService.getActfreeTask(taskId);
		String status = task.getStatusa();
		ActFreeComent conment = new ActFreeComent();
		List<SysActfreeHis> his = sysformconfigService.getFreeActHisByTaskid(taskId);
		List<SysActfreeWay> ways = sysformconfigService.getFreeWaysByTaskId(taskId);
		conment.setWays(ways);
		conment.setHis(his);
		conment.setTitle(task.getTitle());
		if (status!=null&&status.equals("审批结束,流程完成")) {
			conment.setStatu("0");
		}else if (status!=null&&status.equals("审批中")) {
			conment.setStatu("1");
		}else if (status!=null&&status.equals("发起中")) {
			conment.setStatu("2");
		}
		return conment;
	}

}
