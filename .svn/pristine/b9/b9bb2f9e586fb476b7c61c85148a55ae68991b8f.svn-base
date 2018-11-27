package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.form.SysFormconfigMstTabDetailMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMstTabMapper;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetail;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetailExample;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabExample;
import com.myehr.service.formmanage.form.IMstTabFormService;


/**
 * 主从表单处理类，tab页类型
 * @author Administrator
 *
 */
public class MstTabFormServiceImpl implements IMstTabFormService {

	@Autowired SysFormconfigMstTabMapper sMapper;
	@Autowired SysFormconfigMstTabDetailMapper sDetailMapper;
	
	@Override
	public void saveFormMstTab(Map mstTab) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String saveFormTabDetal(Map detail, String formDefId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysFormconfigMstTabDetail> queryFormTabDetailListNoPage(String mstTabId) {
		// TODO Auto-generated method stub
		SysFormconfigMstTabDetailExample example = new SysFormconfigMstTabDetailExample();
		example.or().andMstTabIdEqualTo(new BigDecimal(mstTabId));
		example.setOrderByClause("TAB_DETAIL_SORT");
		List<SysFormconfigMstTabDetail> sDetails = sDetailMapper.selectByExample(example);
		return sDetails;
	}

	@Override
	public void removeFormTabList(List<Map> details) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String queryMainFormByMstTabFormId(String mstTabFormId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysFormconfigMstTab queryMainTabByFormId(String formId) {
		// TODO Auto-generated method stub
//		SysFormButtonSaveExample example = new SysFormButtonSaveExample();
//		example.or().andButtonSaveButtonIdEqualTo(new BigDecimal(buttonId));
//		List<SysFormButtonSave> list = saveBtnMapper.selectByExample(example);
//		if (list != null && list.size() > 0) {
//			return list.get(0);
//		}
		SysFormconfigMstTabExample example = new SysFormconfigMstTabExample();
		example.or().andMstTabFormIdEqualTo(new BigDecimal(formId));
		SysFormconfigMstTab sCache = sMapper.selectByExample(example).get(0);
		return sCache;
	}
//	private static final Logger log = DcfUtil.getLogger(MstTabFormServiceImpl.class);
	
	
}
