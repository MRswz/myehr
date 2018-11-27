package com.myehr.service.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormconfigTree;

public interface ITreeService {
	
	SysFormconfigTree queryFormTree(String fromId,String fromPartition);

}
