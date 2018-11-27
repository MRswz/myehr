package com.myehr.controller.actfree;


import com.myehr.pojo.formmanage.form.ActFreeComent;
import com.myehr.pojo.formmanage.form.Announcement;
import com.myehr.pojo.formmanage.form.SysActfreeWay;

/**
 * 自由流程接口
 * @author wy
 *
 */
public interface ActFreeService {
/**
 * 保存到审批路线
 */
	public void addActFreeway(SysActfreeWay actfreeway);

	public ActFreeComent getComentsByTaskId(String taskId);
	
}
