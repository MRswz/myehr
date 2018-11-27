package com.myehr.service.formmanage.form;

import com.myehr.pojo.formmanage.widget.SysFileupload;
import com.myehr.pojo.formmanage.widget.SysFormFileupload;

public interface IFileUploadService {
	SysFileupload selectByPrimaryKey(String fileId);
}
