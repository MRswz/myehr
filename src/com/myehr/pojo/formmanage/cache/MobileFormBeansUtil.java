package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.myehr.common.util.ChangeCode;
import com.myehr.pojo.formmanage.form.SysFormconfig;

public class MobileFormBeansUtil implements Serializable {
	
	public static StringBuffer[] getCardDataVue(SysFormconfigCache formCache) {
		StringBuffer[] vue = new StringBuffer[4];
		for(int i=0;i<4;i++){
			vue[i] = new StringBuffer();
		}
		/*
		 * 0.字段主体
		 * 1.按钮
		 * 2.数据主体
		 * 3.流程表单日期处理
		 */
		//分组
		List<SysFormGroupCache> groups = formCache.getGroups();//分组
		
		List<SysFormColumnCache> freeColumns = formCache.getFree();//未分组字段
		/*
		 * 组名
		 * [分组字段]
		 * 组名
		 * [分组字段]
		 * 其他
		 * [未分组字段]
		 * 文本
		 * <hr-text-box :title="dataColumn[0].columnName" @onValidChange="onValidChange" v-model="formData[dataColumn[0].columnId]"
               :readonly="dataColumn[0].formColumnShowType == 'readonly'?true:false" :placeholder="dataColumn[0].columnTypeDetail.textboxEmptytext"
               :is-type="getTextBolxCheck(0)" :required="dataColumn[0].formColumnRequired" ></hr-text-box>
         * 下拉
         * <hr-combo-box  :title="dataColumn[0].columnName" @onValidChange="onValidChange" v-model="formData[dataColumn[1].columnId]"
                     :disabled="dataColumn[0].formColumnShowType == 'readonly'?true:false" :placeholder="dataColumn[0].columnTypeDetail.textboxEmptytext"
                     :is-type="getTextBolxCheck(0)" :required="dataColumn[3].formColumnRequired" :data="dictValues['sql|61']"></hr-combo-box>
         * 单选
         * <hr-check-list :title="dataColumn[2].columnName" v-model="formData[dataColumn[2].columnId]" @onValidChange="onValidChange"
                     :dataList="checkListDatas" isMutiple="false" :readonly="dataColumn[2].formColumnShowType === 'readonly'?true:false"
                     :required="dataColumn[2].formColumnRequired" ></hr-check-list>
         * 日期
         * <hr-date-time :title="dataColumn[3].columnName"  @onValidChange="onValidChange"  v-model="formData[dataColumn[3].columnId]" :required="dataColumn[3].formColumnRequired"
      				 :format="dataColumn[3].columnTypeDetail.datepickerFormat"></hr-date-time>
         * 文本域
         * <hr-textarea :title="dataColumn[4].columnName" :placeholder="dataColumn[4].columnTypeDetail.textboxEmptytext" :required="dataColumn[3].formColumnRequired"
                   	 :readonly="dataColumn[2].formColumnShowType === 'readonly'?true:false"></hr-textarea>
         * vue[0].append("\n");
		 */
		int columnNum = 0;
		vue[2].append("        dataColumn: [\n");
		for (SysFormGroupCache sysFormGroupCache : groups) {
			String groupName = sysFormGroupCache.getPojo().getFormGroupName();
			String groupId = sysFormGroupCache.getPojo().getFormGroupId()+"";
			List<SysFormColumnCache> columns = sysFormGroupCache.getColumns();
			vue[0].append("    <group title=\""+groupName+"\">\n");
				for (SysFormColumnCache sysFormColumnCache : columns) {
					//控件类型
					String columnType = sysFormColumnCache.getFormColumnGuiType();
					//实体编码
					String entityName = sysFormColumnCache.getPojo().getFormEntityTablename().toUpperCase();
					//实体字段编码
					String fieldName = ChangeCode.getUniqueCode(entityName, sysFormColumnCache.getPojo().getFormFieldTablename()).toUpperCase();
					String columnName = sysFormColumnCache.getPojo().getFormColumnLable();
					//显示方式
					String isShowtype = sysFormColumnCache.getPojo().getFormColumnShowType();
					//是否必填
					String isRequired = sysFormColumnCache.getPojo().getFormColumnRequired();
					if (columnType!=null&&columnType.equals("1")) {//文本
						SysTextBoxCache textBox = (SysTextBoxCache) sysFormColumnCache.getFormColumGui();
						if (!isShowtype.equals("hide")) {
							if (textBox!=null) {
								//校验类型
								String checkType = textBox.getPojo().getTextboxCheckType();
								//初始值来源
								String dataFrom = textBox.getPojo().getTextboxDataFromType();
								//初始值
								String dataValue = textBox.getPojo().getTextboxDataFromValue();
								//空文本显示
								String nullText = textBox.getPojo().getTextboxEmptytext();
								vue[0].append("      <hr-text-box :title=\"dataColumn["+columnNum+"].columnName\" @onValidChange=\"onValidChange\" v-model=\"formData[dataColumn["+columnNum+"].columnId]\"\n");
								vue[0].append("               	  :readonly=\"dataColumn["+columnNum+"].formColumnShowType == 'readonly'?true:false\" :placeholder=\"dataColumn["+columnNum+"].columnTypeDetail.textboxEmptytext\"\n");
								vue[0].append("                   :is-type=\"getTextBolxCheck("+columnNum+")\" :required=\"dataColumn["+columnNum+"].formColumnRequired\" ></hr-text-box>\n");
								vue[2].append("                      {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '1', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: {textboxCheckType: '"+checkType+"', textboxDataFromType: '"+dataFrom+"', textboxDataFromValue: '"+dataValue+"', textboxEmptytext: '"+nullText+"'}},\n");
							}else{
								vue[0].append("      <hr-text-box :title=\"dataColumn["+columnNum+"].columnName\" @onValidChange=\"onValidChange\" v-model=\"formData[dataColumn["+columnNum+"].columnId]\"\n");
								vue[0].append("               	  :readonly=\"dataColumn["+columnNum+"].formColumnShowType == 'readonly'?true:false\" :placeholder=\"dataColumn["+columnNum+"].columnTypeDetail.textboxEmptytext\"\n");
								vue[0].append("                   :is-type=\"getTextBolxCheck("+columnNum+")\" :required=\"dataColumn["+columnNum+"].formColumnRequired\" ></hr-text-box>\n");
								vue[2].append("                      {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '1', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: {textboxCheckType: '', textboxDataFromType: '', textboxDataFromValue: '', textboxEmptytext: ''}},\n");
							}
							columnNum++;
						}
						
					}else if (columnType!=null&&columnType.equals("2")) {//下拉
						SysFormComboboxCache combobox =  (SysFormComboboxCache) sysFormColumnCache.getFormColumGui();
						if (combobox!=null) {
							String dictTypeCode = combobox.getComboboxGuiInitType()+"|"+combobox.getComboboxGuiInitValue();
							vue[0].append("      <hr-combo-box :title=\"dataColumn["+columnNum+"].columnName\" @onValidChange=\"onValidChange\" v-model=\"formData[dataColumn["+columnNum+"].columnId]\"\n");
							vue[0].append("                    :disabled=\"dataColumn["+columnNum+"].formColumnShowType == 'readonly'?true:false\" :placeholder=\"dataColumn["+columnNum+"].columnTypeDetail.textboxEmptytext\"\n");
							vue[0].append("                    :is-type=\"getTextBolxCheck("+columnNum+")\" :required=\"dataColumn["+columnNum+"].formColumnRequired\" v-if=\"dictValues!=null\" :data=\"dictValues[dataColumn["+columnNum+"].columnTypeDetail.dictTypeCode]\"></hr-combo-box>\n");
							vue[2].append("                      {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '2', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: {textboxCheckType: '',dictTypeCode:'"+dictTypeCode+"', textboxDataFromType: '', textboxDataFromValue: '', textboxEmptytext: ''}},\n");
						}
						columnNum++;
					}else if (columnType!=null&&columnType.equals("3")) {//单选
						SysFormRadiobuttonlistCache radios = (SysFormRadiobuttonlistCache) sysFormColumnCache.getFormColumGui();
						if (radios!=null) {
							vue[0].append("\n");
							vue[0].append("\n");
							vue[0].append("\n");
						}
						columnNum++;
					}else if (columnType!=null&&columnType.equals("6")) {//日期
						SysDatepickerCache datepick =  (SysDatepickerCache) sysFormColumnCache.getFormColumGui();
						//初始值来源
						String dataFrom = datepick.getPojo().getDatepickerDataFromType();
						//初始值
						String dataValue = datepick.getPojo().getDatepickerDataFromValue();
						//日期格式
						String dateFormat = datepick.getPojo().getDatepickerFormat();
						if (datepick!=null) {
							vue[0].append("      <hr-date-time :title=\"dataColumn["+columnNum+"].columnName\"  @onValidChange=\"onValidChange\"  v-model=\"formData[dataColumn["+columnNum+"].columnId]\" :required=\"dataColumn["+columnNum+"].formColumnRequired\"\n");
							vue[0].append("      			   :format=\"dataColumn["+columnNum+"].columnTypeDetail.datepickerFormat\"\n");
							vue[0].append("      				></hr-date-time>\n");
							vue[2].append("      				  {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '6', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: {datepickerFormat: '"+dateFormat+"', textboxDataFromType: '"+dataFrom+"', textboxDataFromValue: '"+dataValue+"', textboxEmptytext: ''}},\n");
						}
//						if (response.data.rows[0]['PERSONNEL_DATE_NEWDATE'] === 'null') {
//							this.formData.PERSONNEL_DATE = '1970-01-01'
//						}else {
//							this.formData.PERSONNEL_DATE = response.data.rows[0]['PERSONNEL_DATE_NEWDATE']
//						}
						vue[3].append("              if (response.data.rows[0]['"+fieldName+"_NEWDATE'] === 'null') {\n");
						vue[3].append("              	this.formData."+fieldName+" = '1970-01-01'\n");
						vue[3].append("              }else {\n");
						vue[3].append("              	this.formData."+fieldName+" = response.data.rows[0]['"+fieldName+"_NEWDATE']\n");
						vue[3].append("              }\n");
						columnNum++;
						
						
					}else if (columnType!=null&&columnType.equals("8")) {//多行文本
						SysTextBoxCache textarea = (SysTextBoxCache) sysFormColumnCache.getFormColumGui();
						//初始值来源
						String dataFrom = textarea.getTextboxDataFromType();
						//初始值
						String dataValue = textarea.getTextboxDataFromValue();
						//空文本显示
						String nullText = textarea.getTextboxEmptytext();
						if (textarea!=null) {
							vue[0].append("      <hr-textarea :title=\"dataColumn["+columnNum+"].columnName\" :placeholder=\"dataColumn["+columnNum+"].columnTypeDetail.textboxEmptytext\" :required=\"dataColumn["+columnNum+"].formColumnRequired\"\n");
							vue[0].append("                   :readonly=\"dataColumn["+columnNum+"].formColumnShowType === 'readonly'?true:false\"\n");
							vue[0].append("      			   ></hr-textarea>\n");
							vue[2].append("                      {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '8', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: { textboxDataFromType: '"+dataFrom+"', textboxDataFromValue: '"+dataValue+"', textboxEmptytext: '"+nullText+"'}},\n");
						}
						columnNum++;
					}
				}
			vue[0].append("    </group>\n");
		}
		String groupName = "其它";
		String groupId = "";
		vue[0].append("    <group title=\""+groupName+"\">\n");
			for (SysFormColumnCache sysFormColumnCache : freeColumns) {
				//控件类型
				String columnType = sysFormColumnCache.getFormColumnGuiType();
				//实体编码
				String entityName = sysFormColumnCache.getPojo().getFormEntityTablename().toUpperCase();
				//实体字段编码
				String fieldName = ChangeCode.getUniqueCode(entityName, sysFormColumnCache.getPojo().getFormFieldTablename()).toUpperCase();
				String columnName = sysFormColumnCache.getPojo().getFormColumnLable();
				//显示方式
				String isShowtype = sysFormColumnCache.getPojo().getFormColumnShowType();
				//是否必填
				String isRequired = sysFormColumnCache.getPojo().getFormColumnRequired();
				if (columnType!=null&&columnType.equals("1")) {//文本
					SysTextBoxCache textBox = (SysTextBoxCache) sysFormColumnCache.getFormColumGui();
					
					if (textBox!=null) {
						//校验类型
						String checkType = textBox.getPojo().getTextboxCheckType();
						//初始值来源
						String dataFrom = textBox.getPojo().getTextboxDataFromType();
						//初始值
						String dataValue = textBox.getPojo().getTextboxDataFromValue();
						//空文本显示
						String nullText = textBox.getPojo().getTextboxEmptytext();
						vue[0].append("      <hr-text-box :title=\"dataColumn["+columnNum+"].columnName\" @onValidChange=\"onValidChange\" v-model=\"formData[dataColumn["+columnNum+"].columnId]\"\n");
						vue[0].append("               	  :readonly=\"dataColumn["+columnNum+"].formColumnShowType == 'readonly'?true:false\" :placeholder=\"dataColumn["+columnNum+"].columnTypeDetail.textboxEmptytext\"\n");
						vue[0].append("                   :is-type=\"getTextBolxCheck("+columnNum+")\" :required=\"dataColumn["+columnNum+"].formColumnRequired\" ></hr-text-box>\n");
						vue[2].append("                      {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '1', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: {textboxCheckType: '"+checkType+"', textboxDataFromType: '"+dataFrom+"', textboxDataFromValue: '"+dataValue+"', textboxEmptytext: '"+nullText+"'}},\n");
					}else{
						vue[0].append("      <hr-text-box :title=\"dataColumn["+columnNum+"].columnName\" @onValidChange=\"onValidChange\" v-model=\"formData[dataColumn["+columnNum+"].columnId]\"\n");
						vue[0].append("               	  :readonly=\"dataColumn["+columnNum+"].formColumnShowType == 'readonly'?true:false\" :placeholder=\"dataColumn["+columnNum+"].columnTypeDetail.textboxEmptytext\"\n");
						vue[0].append("                   :is-type=\"getTextBolxCheck("+columnNum+")\" :required=\"dataColumn["+columnNum+"].formColumnRequired\" ></hr-text-box>\n");
						vue[2].append("                      {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '1', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: {textboxCheckType: '', textboxDataFromType: '', textboxDataFromValue: '', textboxEmptytext: ''}},\n");
					}
					
					columnNum++;
				}else if (columnType!=null&&columnType.equals("2")) {//下拉
					SysFormComboboxCache combobox =  (SysFormComboboxCache) sysFormColumnCache.getFormColumGui();
					if (combobox!=null) {
						String dictTypeCode = combobox.getComboboxGuiInitType()+"|"+combobox.getComboboxGuiInitValue();
						vue[0].append("      <hr-combo-box :title=\"dataColumn["+columnNum+"].columnName\" @onValidChange=\"onValidChange\" v-model=\"formData[dataColumn["+columnNum+"].columnId]\"\n");
						vue[0].append("                    :disabled=\"dataColumn["+columnNum+"].formColumnShowType == 'readonly'?true:false\" :placeholder=\"dataColumn["+columnNum+"].columnTypeDetail.textboxEmptytext\"\n");
						vue[0].append("                    :is-type=\"getTextBolxCheck("+columnNum+")\" :required=\"dataColumn["+columnNum+"].formColumnRequired\" :data=\"dictValues[dataColumn["+columnNum+"].columnTypeDetail.dictTypeCode]\"></hr-combo-box>\n");
						vue[2].append("                      {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '2', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: {textboxCheckType: '',dictTypeCode:'"+dictTypeCode+"', textboxDataFromType: '', textboxDataFromValue: '', textboxEmptytext: ''}},\n");
					}
					columnNum++;
				}else if (columnType!=null&&columnType.equals("3")) {//单选
					SysFormRadiobuttonlistCache radios = (SysFormRadiobuttonlistCache) sysFormColumnCache.getFormColumGui();
					if (radios!=null) {
						vue[0].append("\n");
						vue[0].append("\n");
						vue[0].append("\n");
					}
					columnNum++;
				}else if (columnType!=null&&columnType.equals("6")) {//日期
					SysDatepickerCache datepick =  (SysDatepickerCache) sysFormColumnCache.getFormColumGui();
					//初始值来源
					String dataFrom = datepick.getPojo().getDatepickerDataFromType();
					//初始值
					String dataValue = datepick.getPojo().getDatepickerDataFromValue();
					//日期格式
					String dateFormat = datepick.getPojo().getDatepickerFormat();
					if (datepick!=null) {
						vue[0].append("      <hr-date-time :title=\"dataColumn["+columnNum+"].columnName\"  @onValidChange=\"onValidChange\"  v-model=\"formData[dataColumn["+columnNum+"].columnId]\" :required=\"dataColumn["+columnNum+"].formColumnRequired\"\n");
						vue[0].append("      			   :format=\"dataColumn["+columnNum+"].columnTypeDetail.datepickerFormat\"\n");
						vue[0].append("      				></hr-date-time>\n");
						vue[2].append("      				  {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '6', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: {datepickerFormat: '"+dateFormat+"', textboxDataFromType: '"+dataFrom+"', textboxDataFromValue: '"+dataValue+"', textboxEmptytext: ''}},\n");
					}
					columnNum++;
				}else if (columnType!=null&&columnType.equals("8")) {//多行文本
					SysFormTextareaCache textarea = (SysFormTextareaCache) sysFormColumnCache.getFormColumGui();
					//初始值来源
					String dataFrom = textarea.getTextboxDataFromType();
					//初始值
					String dataValue = textarea.getTextboxDataFromValue();
					//空文本显示
					String nullText = textarea.getTextboxEmptytext();
					if (textarea!=null) {
						vue[0].append("      <hr-textarea :title=\"dataColumn["+columnNum+"].columnName\" :placeholder=\"dataColumn["+columnNum+"].columnTypeDetail.textboxEmptytext\" :required=\"dataColumn["+columnNum+"].formColumnRequired\"\n");
						vue[0].append("                   :readonly=\"dataColumn["+columnNum+"].formColumnShowType === 'readonly'?true:false\"\n");
						vue[0].append("      			   ></hr-textarea>\n");
						vue[2].append("                      {formGroupId: '"+groupId+"', entityId: '"+entityName+"', columnId: '"+fieldName+"', columnName: '"+columnName+"', columnType: '1', formColumnRequired: '"+isRequired+"', formColumnShowType: '"+isShowtype+"', columnTypeDetail: { textboxDataFromType: '"+dataFrom+"', textboxDataFromValue: '"+dataValue+"', textboxEmptytext: '"+nullText+"'}},\n");
					}
					columnNum++;
				}
			}
		vue[0].append("    </group>\n");
		
		if(columnNum>0){
			vue[2].deleteCharAt(vue[2].length() - 2);
		}
		vue[2].append("        ]\n");
		
		//按钮
		//      <x-button type="primary"   @click.native="submitForm">提交</x-button>
		List<SysFormButtonCache> buttonCaches = formCache.getButtons();
		for (SysFormButtonCache sysFormButtonCache : buttonCaches) {
			String buttonName = sysFormButtonCache.getPojo().getFormButtonName();
			vue[1].append("      <x-button type=\"primary\"   @click.native=\"submitForm\">"+buttonName+"</x-button>\n");
		}
		return vue;
	}
	
	public static StringBuffer[] getMobileCardVue(SysFormconfig form,StringBuffer[] LoadDataVue) {
		StringBuffer[] vue = new StringBuffer[9];
		for(int i=0;i<9;i++){
			vue[i] = new StringBuffer();
		}
		/*
		 * 0.表头
		 * 1.字段主体
		 * 2.待补充
		 * 3.按钮
		 * 4.表尾及引入文件
		 * 5.methods
		 * 6.created
		 * 7.data
		 * 8.结尾
		 */

		vue[0].append("<template>\n");
		vue[0].append("  <div class=\"templateHeight\">\n");
		vue[1].append(LoadDataVue[0]);
		vue[2].append("    <div v-transfer-dom>\n");
		vue[2].append("      <loading :show=\"show1\" :text=\"text1\"></loading>\n");
		vue[2].append("    </div>\n");
		vue[3].append("    <div class=\"bottomFixed\" style=\"margin-bottom:  50px ;width: 98%\">\n");
		vue[3].append(LoadDataVue[1]);
		vue[3].append("    </div>\n");
		vue[4].append("  </div>\n");
		vue[4].append("</template>\n");
		vue[4].append("<script>\n");
		vue[4].append("  import { getSessionData } from '@/libs/cookieUtil.js'\n");
		vue[4].append("  import { setDefaultValue, dateFormat } from '@/libs/formCommon.js'\n");
		vue[4].append("  import hrCheckList from '@/components/myerh_form/hrCheckList.vue'\n");
		vue[4].append("  import HrDateTime from '@/components/myerh_form/hrDateTime'\n");
		vue[4].append("  import HrTextarea from '@/components/myerh_form/hrTextarea.vue'\n");
		vue[4].append("  import HrFileUpload from '@/components/myerh_form/hrFileUpload.vue'\n");
		vue[4].append("  import HrTextBox from '@/components/myerh_form/hrTextBox.vue'\n");
		vue[4].append("  import HrComboBox from '@/components/myerh_form/hrComboBox.vue'\n");
		vue[4].append("  import Group from '@/components/group/index.vue'\n");
		vue[4].append("  import XButton from '@/components/x-button/index.vue'\n");
		vue[4].append("  import XInput from '@/components/x-input/index.vue'\n");
		
		
		vue[4].append("  export default {\n");
		vue[4].append("    name: 'testCardForm',\n");
		vue[4].append("    components: {\n");
		vue[4].append("      HrDateTime,\n");
		vue[4].append("      XInput,\n");
		vue[4].append("      Group,\n");
		vue[4].append("      hrCheckList,\n");
		vue[4].append("      HrTextarea,\n");
		vue[4].append("      HrFileUpload,\n");
		vue[4].append("      HrTextBox,\n");
		vue[4].append("      XButton,\n");
		vue[4].append("      HrComboBox\n");
		vue[4].append("    },\n");
		vue[4].append("    watch: {\n");
		vue[4].append("      checkval: function (n, o) {\n");
		vue[4].append("        console.log(n + '  外面值')\n");
		vue[4].append("      },\n");
		vue[4].append("      datevalue (n, o) {\n");
		vue[4].append("        console.log(n + '  外面值')\n");
		vue[4].append("      },\n");
		vue[4].append("      formData (o, n) {\n");
		vue[4].append("        console.log(o)\n");
		vue[4].append("      }\n");
		vue[4].append("    },\n");
		vue[5].append("    methods: {\n");
		vue[5].append("      submitForm () {\n");
		vue[5].append("      },\n");
		vue[5].append("      onValidChange: function (value) {\n");
		vue[5].append("        console.log('验证结果：' + value)\n");
		vue[5].append("        this.checkValue = value\n");
		vue[5].append("      },\n");
		vue[5].append("      initdata: function (columnId) {\n");
		vue[5].append("        return '初始化函数的值'\n");
		vue[5].append("      },\n");
		vue[5].append("      getTextBolxCheck (i) {\n");
		vue[5].append("        var tempColumn = this.dataColumn[i]\n");
		vue[5].append("        if (tempColumn.columnTypeDetail.textboxCheckType !== 'fun') {\n");
		vue[5].append("          return tempColumn.columnTypeDetail.textboxCheckType\n");
		vue[5].append("        } else {\n");
		vue[5].append("          return 'checkSelf' + i\n");
		vue[5].append("        }\n");
		vue[5].append("      },\n");
		vue[5].append("      setTextBoxDefaultValue (i) {\n");
		vue[5].append("        var formThis = this\n");
		vue[5].append("        setDefaultValue(i, formThis, null)\n");
		vue[5].append("      }\n");
		vue[5].append("    },\n");
		vue[6].append("    created () {\n");
		
		vue[6].append("	      this.$axios.get('/myehr/dict/getDictDatasAll.action?formId=677')\n");
		vue[6].append("	        .then(function (response) {\n");
		vue[6].append("	          if (response.data) {\n");
		vue[6].append("	            var datas = response.data\n");
		vue[6].append("	            var dictValues = {}//this.dictValues\n");
		vue[6].append("	            for(var i in datas) {\n");
		vue[6].append("	              var values = []//对象数组\n");
		vue[6].append("	              var datas1 = datas[i]//单个字典数据\n");
		vue[6].append("	              for(var k=0;k<datas1.length;k++){//循环字典项\n");
		vue[6].append("	                values[k] = {}\n");
		vue[6].append("	                values[k].name = datas1[k].name\n");
		vue[6].append("	                values[k].value = datas1[k].code\n");
		vue[6].append("	              }\n");
		vue[6].append("	              dictValues[i] = values\n");
		vue[6].append("	            }\n");
		vue[6].append("	            this.dictValues = dictValues\n");
		vue[6].append("	          }\n");
		vue[6].append("	        }.bind(this))\n");
		vue[6].append("	        .catch(function (error) {\n");
		vue[6].append("	          console.log(error)\n");
		vue[6].append("	        })\n");
		
		vue[6].append("      let tempData = {}\n");
		vue[6].append("      let isInit = this.paramData.isInit\n");
		vue[6].append("      isInit = true\n");
		vue[6].append("      if (isInit == true) {\n");
		vue[6].append("          // 需要初始化数据\n");
		vue[6].append("        this.$axios.post('/myehr/form/cardformInitData.action',\n");
		vue[6].append("            {formId: '3886', pkId: '', 'containerParam': {}, 'paramsMap': {}, 'requestParam': {'EMPEMPLOYEE_EMPID': '258'}}\n");
		vue[6].append("          )\n");
		vue[6].append("            .then(function (response) {\n");
		vue[6].append("              if (response.data) {\n");
		vue[6].append("                if (response.data.rows[0]) {\n");
		vue[6].append("                  this.formData = response.data.rows[0]\n");
		vue[6].append("                }\n");
		vue[6].append("              }\n");
		vue[6].append("              console.log(response)\n");
		vue[6].append("            }.bind(this))\n");
		vue[6].append("            .catch(function (error) {\n");
		vue[6].append("              console.log(error)\n");
		vue[6].append("            })\n");
		vue[6].append("      } else {\n");
		vue[6].append("        // 不需要初始化数据  此时需要取各字段默认值 以下代码需要后台生成  具体各种情况的代码如下\n");
		vue[6].append("          // 1 如果某个字段初始值时从上一个页面传入参数\n");
		vue[6].append("        for (var i = 0; i < this.dataColumn.length; i++) {\n");
		vue[6].append("              // 数据验证\n");
		vue[6].append("          this.setTextBoxDefaultValue(i)\n");
		vue[6].append("        }\n");
		vue[6].append("      }\n");
		vue[6].append("    },\n");
		vue[7].append("    data () {\n");
		vue[7].append("      return {\n");
		vue[7].append("      	dictValues:{},\n");
		
		vue[7].append("      	formData: null,\n");
		vue[7].append("      	paramData: this.$route.query, // 页面请求参数\n");
		vue[7].append("      	defaultDate: 'TODAY',\n");
		
		vue[7].append(LoadDataVue[2]);
		vue[7].append("      }\n");
		vue[7].append("    }\n");
		vue[8].append("  }\n");
		vue[8].append("</script>\n");
		vue[8].append("<style scoped>\n");
		vue[8].append("</style>\n");
		return vue;
	}
	
	public static StringBuffer[] getMobileFormVue(SysFormconfig form,StringBuffer[] LoadDataVue) {
		StringBuffer[] vue = new StringBuffer[13];
		for(int i=0;i<13;i++){
			vue[i] = new StringBuffer();
		}
		vue[0].append("<template>\n");
		vue[0].append("  <div>\n");
		vue[1].append("     <list1-component v-bind:rows=\"this.rows\"   v-bind:standDataColumn=\"standDataColumn\" v-bind:pager=\"pager\" v-bind:showRowDataColumn=\"showRowColumn\" v-bind:right_buttons=\"right_buttons\" v-bind:bottom_buttons=\"bottom_buttons\" v-bind:slid_buttons=\"slid_buttons\" @onRowClick=\"onRowClick\" @onRowButtonClick=\"onRowButtonClick\"  @onScrollBottom=\"onScrollBottom\" @onBlurQuery=\"onBlurQuery\" :orderByColumn=\"orderByColumn\" :isHowTopQuery=\"isHowTopQuery\"  :filterColumnDatas=\"filterColumnDatas\">\n");
		vue[1].append("     </list1-component>\n");
		vue[2].append("  </div>\n");
		vue[2].append("</template>\n");
		vue[2].append("<script>\n");
		vue[3].append("  import List1Component from '@/components/myehr_list1/list1Component.vue'\n");
		vue[4].append("    export default {\n");
		vue[4].append("      components: {\n");
		vue[4].append("        List1Component\n");
		vue[4].append("      },created() {\n");
		vue[4].append("        this.loadData(null,null,null,null);\n");
		vue[4].append("      },\n");
		vue[4].append("      watch: {\n");
		vue[4].append("        screenWidth (val) {\n");
		vue[4].append("          this.screenWidth = val\n");
		vue[4].append("        },\n");
		vue[4].append("        rows(){\n");
		vue[4].append("          this.$nextTick(function(){\n");
		vue[4].append("            /*现在数据已经渲染完毕*/\n");
		vue[4].append("             const that = this\n");
		vue[4].append("              window.onresize = () => {\n");
		vue[4].append("                return (() => {\n");
		vue[4].append("                  window.screenWidth = document.body.clientWidth\n");
		vue[4].append("                  that.screenWidth = window.screenWidth\n");
		vue[4].append("                })()\n");
		vue[4].append("              }\n");
		vue[4].append("            window.screenWidth = document.body.clientWidth\n");
		vue[4].append("            that.screenWidth = window.screenWidth\n");
		vue[4].append("          })\n");
		vue[4].append("        }\n");
		vue[4].append("      },\n");
		vue[4].append("      mounted : function() {\n");
		vue[4].append("      },\n");
		vue[4].append("      name: \"testList1Config\",\n");
		vue[4].append("      methods :{\n");
		vue[4].append("        onScrollBottom(prows,pager,filterParam,orderByParam){\n");
		vue[4].append("          //分页回调\n");
		vue[4].append("          this.loadData(prows,pager,filterParam,orderByParam);\n");
		vue[4].append("        },\n");
		vue[7].append("        onRowButtonClick(buttonId,row){\n");
		vue[7].append("        },\n");
		vue[7].append("        onRowClick(row){\n");
		vue[7].append("        },\n");
		vue[7].append("        onLoadData(){\n");//this.$route.query
		vue[7].append("        		var params = this.$route.query;\n");
		vue[7].append("        },\n");
		vue[7].append("        onBlurQuery (value) {\n");
		vue[7].append("        	if (value == null) {\n");
		vue[7].append("          	value = ''\n");
		vue[7].append("        	}\n");
		vue[7].append("        	this.blurQueryValue = value\n");
		vue[7].append("        	var old = this.filterParams\n");
		vue[7].append(LoadDataVue[1]);
		vue[7].append("        	this.loadData(null, null, old, this.orderByParam)\n");
		vue[7].append("        },\n");
		vue[7].append("        loadData(initRows,pager,filterParams,orderByParam){\n");
		vue[7].append("        if (filterParams == null) {\n");
		vue[7].append("        	filterParams = {}\n");
		vue[7].append("        }\n");
		vue[7].append(LoadDataVue[2]);
        vue[7].append("        console.log(filterParams)\n");
    	vue[7].append("        this.filterParams = filterParams\n");
		vue[7].append("          var offset =0;\n");
		vue[7].append("          var limit = 10;\n");
		vue[7].append("          var startFlag =0;\n");
		vue[7].append("          if(pager != null) {\n");
		vue[7].append("            startFlag = 1;\n");
		vue[7].append("            offset = pager.offset;\n");
		vue[7].append("            limit = pager.limit;\n");
		vue[7].append("            this.pager = pager;\n");
		vue[7].append("          }\n");
		vue[8].append("  		 this.$axios.post('/myehr/form/cardformInitData.action',\n");
		vue[8].append("    			{\"order\":\"asc\",\"offset\":0,\"limit\":10,\"containerParam\":{},\"paramsMap\":{},\"requestParam\":{USERID: \"18971\"},\"filter\":filterParams==null?{}:filterParams,\"formId\":\""+form.getFormDefId()+"\",\"isView\":null,\"heightGrade\":[]}\n");
		vue[8].append("  		 )\n");
		vue[8].append("          .then(function (response) {\n");
		vue[8].append("            console.log(response)\n");
		vue[8].append("            if(initRows == null||startFlag == 0) {\n");
		vue[8].append("              this.rows = response.data.rows;\n");
		vue[8].append("              this.totalData = response.data.total;\n");
		vue[8].append("            }else {\n");
		vue[8].append("              this.rows = initRows.concat(response.data.rows);\n");
		vue[8].append("            }\n");
		vue[8].append("          }.bind(this))\n");
		vue[8].append("          .catch(function (error) {\n");
		vue[8].append("            console.log(error);\n");
		vue[8].append("          });\n");
		vue[8].append("      }\n");
		vue[8].append("    },\n");
		vue[9].append("    data () {\n");
		vue[9].append("      return {\n");
		vue[10].append(LoadDataVue[0]);
		vue[10].append(LoadDataVue[3]);
		vue[10].append(LoadDataVue[4]);
		vue[10].append(LoadDataVue[5]);
		vue[10].append(LoadDataVue[6]);
		vue[10].append(LoadDataVue[7]);
		vue[10].append(LoadDataVue[8]);
		vue[10].append(LoadDataVue[9]);
		vue[10].append(LoadDataVue[10]);
		vue[10].append(LoadDataVue[11]);
		vue[10].append(LoadDataVue[12]);
		vue[10].append(LoadDataVue[13]);
		vue[10].append(LoadDataVue[14]);
		vue[10].append(LoadDataVue[15]);
		vue[11].append("      }\n");
		vue[11].append("    }\n");
		vue[11].append("  }\n");
		vue[12].append("</script>\n");
		
		return vue;
	}

	/*
	 * LoadDataVue
	 * 0.附表页面代码(简)
	 * 1.主从引用表单1
	 * 2.主从引用表单2
	 * 3.附表展开触发
	 * 4.主从中所用参数
	 * 5.传入参数
	 */
	public static StringBuffer[] getMobileFormCCYVue_0(SysFormconfig form,StringBuffer[] LoadDataVue) {
		StringBuffer[] vue = new StringBuffer[1];
		for(int i=0;i<1;i++){
			vue[i] = new StringBuffer();
		}
		vue[0].append("<template>\n");
		vue[0].append("    <div>\n");
		vue[0].append(LoadDataVue[0]);
		vue[0].append("    	<div style=\"margin-bottom:50px\">\n");
		vue[0].append("    		<cell\n");
		vue[0].append("    			title=\"审批记录\" \n");
		vue[0].append("    			is-link \n");
		vue[0].append("    			:border-intent=\"false\" \n");
		vue[0].append("    			:arrow-direction=\"isShow ? 'up' : 'down'\" \n");
		vue[0].append("    			@click.native=\"isShow = !isShow\"></cell> \n");
		vue[0].append("    		<comentLists  :contentHeight=\"contentHeight\" :initParams=\"componentParams\" ></comentLists> \n");
		vue[0].append("    	</div>\n");
		vue[0].append("    </div>\n");
		vue[0].append("</template>\n");
		vue[0].append("<script>\n");
		vue[0].append(LoadDataVue[1]);
		vue[0].append("  import Group from '@/components/group/index.vue'\n");
		vue[0].append("  import comentLists from '@/myehrpath/common/comentLists.vue'\n");
		vue[0].append("  export default {\n");
		vue[0].append("        name: \""+form.getFormDefCode()+"\",\n");
		vue[0].append("        components: {"+LoadDataVue[2]+"Group,comentLists},\n");
		vue[0].append("        created(){\n");
		vue[0].append("          this.inParams = this.$route.query;\n");
		vue[0].append("          this.cardParams = this.inParams;\n");
		vue[0].append("          this.componentParams = this.inParams;\n");
		vue[0].append(LoadDataVue[5]);
		vue[0].append("        },\n");
		vue[0].append("        watch:{\n");
		vue[0].append("          formData(n,o){\n");
		vue[0].append("            this.listParams1 = {}\n");
		vue[0].append("          },\n");
		
		vue[0].append("          isShow(n,o){\n");
		vue[0].append("            if(n === true) {\n");
		vue[0].append("              this.contentHeight = \"300px\";\n");
		vue[0].append("            }else {\n");
		vue[0].append("              this.contentHeight = \"0px\";\n");
		vue[0].append("            }\n");
		vue[0].append("          },\n");
		
		vue[0].append(LoadDataVue[3]);
		vue[0].append("        },\n");
		vue[0].append("        data(){\n");
		vue[0].append("            return {\n");
		vue[0].append("              isShow:true,\n");
		vue[0].append("              contentHeight:'300px',\n");
		vue[0].append(LoadDataVue[4]);
		vue[0].append("            }\n");
		vue[0].append("        }\n");
		vue[0].append("    }\n");
		vue[0].append("</script>\n");
		vue[0].append("<style scoped>\n");
		vue[0].append("</style>\n");
		return vue;
	}

	/*
	 * 卡卡附表
	 * 
	 */
	public static StringBuffer[] getMobileFormCCYVue_2(SysFormconfigCache form,StringBuffer[] LoadDataVue) {
		StringBuffer[] vue = new StringBuffer[1];
		for(int i=0;i<1;i++){
			vue[i] = new StringBuffer();
		}
		String path11 = form.getFormTreePath();
		String code = form.getFormDefCode().toLowerCase();
		vue[0].append("<template>\n");
		vue[0].append("  <div >\n");
		vue[0].append("     <list1-component v-bind:rows=\"this.rows\"   v-bind:standDataColumn=\"standDataColumn\" v-bind:pager=\"pager\" v-bind:showRowDataColumn=\"showRowColumn\" v-bind:right_buttons=\"right_buttons\"\n");
		vue[0].append("                      @onRowClick=\"onRowClick\" @onRowButtonClick=\"onRowButtonClick\"  @onScrollBottom=\"onScrollBottom\" @onBlurQuery=\"onBlurQuery\"\n");
		vue[0].append("                      :orderByColumn=\"orderByColumn\" :isHowTopQuery=\"isHowTopQuery\"  :filterColumnDatas=\"filterColumnDatas\"\n");
		vue[0].append("                      :winHeight=\"contentHeight\">\n");
		vue[0].append("     </list1-component>\n");
		vue[0].append("  </div>\n");
		vue[0].append("</template>\n");
		vue[0].append("<script>\n");
		vue[0].append("	 import List1Component from '@/components/myehr_list1/list1Component.vue'\n");
		vue[0].append("    export default {\n");
		vue[0].append("      components: {\n");
		vue[0].append("        List1Component\n");
		vue[0].append("      },created() {\n");
		vue[0].append("        this.requestParam = {"+LoadDataVue[16]+"};\n");
		vue[0].append("        this.loadData(null,null,null,null);\n");
		vue[0].append("      },props:{\n");
		vue[0].append("        initParams:{}\n");
		vue[0].append("      },\n");
		vue[0].append("      watch: {\n");
		vue[0].append("        screenWidth (val) {\n");
		vue[0].append("          this.screenWidth = val\n");
		vue[0].append("        },\n");
		vue[0].append("        rows(){\n");
		vue[0].append("          this.$nextTick(function(){\n");
		vue[0].append("            /*现在数据已经渲染完毕*/\n");
		vue[0].append("             const that = this\n");
		vue[0].append("              window.onresize = () => {\n");
		vue[0].append("                return (() => {\n");
		vue[0].append("                  window.screenWidth = document.body.clientWidth\n");
		vue[0].append("                  that.screenWidth = window.screenWidth\n");
		vue[0].append("                })()\n");
		vue[0].append("              }\n");
		vue[0].append("            window.screenWidth = document.body.clientWidth\n");
		vue[0].append("            that.screenWidth = window.screenWidth\n");
		vue[0].append("            console.log(window.onresize())\n");
		vue[0].append("          })\n");
		vue[0].append("        }\n");
		vue[0].append("      },\n");
		vue[0].append("      mounted : function() {\n");
		vue[0].append("        console.log('111111111111111111')\n");
		vue[0].append("      },props:{\n");
		vue[0].append("        contentHeight:{},\n");
		vue[0].append("        initParams:{}\n");
		vue[0].append("      },\n");
		vue[0].append("      name: \""+code+"_Edit\",\n");
		vue[0].append("      methods :{\n");
		vue[0].append("        onScrollBottom(prows,pager,filterParam,orderByParam){\n");
		vue[0].append("          //分页回调\n");
		vue[0].append("          this.loadData(prows,pager,filterParam,orderByParam);\n");
		vue[0].append("        },\n");
		vue[0].append("        onRowButtonClick(buttonId,row){\n");
		vue[0].append("        },\n");
		vue[0].append("        onRowClick(row){\n");
		vue[0].append("          //点击每个按钮具体实现转交上层组件实现\n");
		vue[0].append("          this.gotoMyehrPath('/myehrpath/form/"+path11+code+"_Edit',{isInit:true,row:row},'编辑');\n");
		vue[0].append("          //  this.onRowClick(row);\n");
		vue[0].append("        },\n");
		vue[0].append("        onLoadData(){\n");
		vue[0].append("          //重新加载数据 带入条件 排序字段\n");
		vue[0].append("        },\n");
		vue[0].append("        onBlurQuery(value){\n");
		vue[0].append("          var old = this.filterParams ;\n");
		vue[0].append("          old[rtyuiop] = value;\n");
		vue[0].append(LoadDataVue[1]);
		vue[0].append("          loadData(null,null,old,this.orderByParam);\n");
		vue[0].append("        },\n");
		vue[0].append("        loadData(initRows,pager,filterParams,orderByParam){\n");
		vue[0].append("        if (filterParams == null) {\n");
		vue[0].append("        	filterParams = {}\n");
		vue[0].append("        }\n");
		vue[0].append(LoadDataVue[2]);
        vue[0].append("        console.log(filterParams)\n");
    	vue[0].append("        this.filterParams = filterParams\n");
		vue[0].append("          var offset =0;\n");
		vue[0].append("          var limit = 10;\n");
		vue[0].append("          var startFlag =0;\n");
		vue[0].append("          if(pager != null) {\n");
		vue[0].append("            startFlag = 1;\n");
		vue[0].append("            offset = pager.offset;\n");
		vue[0].append("            limit = pager.limit;\n");
		vue[0].append("            this.pager = pager;\n");
		vue[0].append("          }\n");
		vue[0].append("          if(this.totalData != -1 && this.rows.length >= this.totalData) {\n");
		vue[0].append("            return ;\n");
		vue[0].append("          }\n");
		vue[0].append("          this.$axios.post('/myehr/form/cardformInitData.action',\n");
		vue[0].append("            {\"order\":\"asc\",\"offset\":0,\"limit\":10,\"containerParam\":{},\"paramsMap\":{},\"requestParam\":this.requestParam,\"filter\":{\"EMPVEMPLOYEE_EMPSTATUS\":\"\",\"EMPVEMPLOYEE_EMPCODE\":\"\",\"EMPVEMPLOYEE_CNAME\":\"\"},\"userIds\":null,\"formId\":this.formId,\"isView\":null,\"heightGrade\":[]}\n");
		vue[0].append("            )\n");
		vue[0].append("            .then(function (response) {\n");
		vue[0].append("              console.log(response)\n");
		vue[0].append("              if(initRows == null||startFlag == 0) {\n");
		vue[0].append("                this.rows = response.data.rows;\n");
		vue[0].append("                this.totalData = response.data.total;\n");
		vue[0].append("              }else {\n");
		vue[0].append("                this.rows = initRows.concat(response.data.rows);\n");
		vue[0].append("              }\n");
		vue[0].append("            }.bind(this))\n");
		vue[0].append("            .catch(function (error) {\n");
		vue[0].append("              console.log(error);\n");
		vue[0].append("            });\n");
		vue[0].append("        }\n");
		vue[0].append("      },\n");
		vue[0].append("      data () {\n");
		vue[0].append("        return {\n");
		vue[0].append(LoadDataVue[17]);
		vue[0].append("          requestParam:{},\n");
		vue[0].append(LoadDataVue[0]);
		vue[0].append(LoadDataVue[3]);
		vue[0].append(LoadDataVue[4]);
		vue[0].append(LoadDataVue[5]);
		vue[0].append(LoadDataVue[7]);
		vue[0].append(LoadDataVue[8]);
		vue[0].append(LoadDataVue[9]);
		vue[0].append(LoadDataVue[10]);
		vue[0].append(LoadDataVue[11]);
		vue[0].append(LoadDataVue[13]);
		vue[0].append(LoadDataVue[14]);
		vue[0].append(LoadDataVue[15]);
		vue[0].append("          }\n");
		vue[0].append("        }\n");
		vue[0].append("    }\n");
		vue[0].append("</script>\n");
		vue[0].append("<style scoped>\n");
		vue[0].append("  .container {\n");
		vue[0].append("   /* margin-bottom: 0px;\n");
		vue[0].append("    width: 100%;\n");
		vue[0].append("    overflow: scroll;*/\n");
		vue[0].append("    -webkit-overflow-scrolling: touch;\n");
		vue[0].append("  }\n");
		vue[0].append("</style>\n");

		
		
		return vue;
	}
	
	/*
	 * 卡卡主表
	 * 
	 */
	public static StringBuffer[] getMobileFormCCYVue_1(SysFormconfigCache form,StringBuffer[] LoadDataVue) {
		StringBuffer[] vue = new StringBuffer[1];
		for(int i=0;i<1;i++){
			vue[i] = new StringBuffer();
		}
		String formId = form.getFormDefId()+"";
		String mainFormId = form.getMstTab().getMainFrom().getFormDefId()+"";
		vue[0].append("<template>\n");
		vue[0].append("  <div >\n");
		vue[0].append(LoadDataVue[0]);
		vue[0].append("    <div class=\"bottomFixed\" style=\"margin-bottom:  50px ;width: 98% ; text-align: right\">\n");
		vue[0].append("      <x-button mini plain type=\"primary\" @click.native=\"approveAct('6764')\">通过</x-button>\n");
		vue[0].append("      <x-button mini plain type=\"warn\" @click.native=\"showPopupPicker = true\">驳回</x-button>\n");
		vue[0].append("      <x-button mini plain  @click.native=\"saveForm('6914')\">暂存</x-button>\n");
		vue[0].append("    </div>	\n");
		vue[0].append("    <group>\n");
		vue[0].append("      <popup-picker :show.sync=\"showPopupPicker\" :show-cell=\"false\" title=\"TEST\" :data=\"backPerson\" v-model=\"value5\" @on-change=\"ggg()\"></popup-picker>\n");
		vue[0].append("    </group>\n");
		vue[0].append("    <group title=\"审批意见\">\n");
		vue[0].append("      <hr-textarea :rows=\"3\" :cols=\"3\" :placeholder=\"请输入\" v-model=\"approveRemark\"></hr-textarea>\n");
		vue[0].append("    </group>	\n");
		vue[0].append("    <div v-transfer-dom>\n");
		vue[0].append("      <loading :show=\"show1\" :text=\"text1\"></loading>\n");
		vue[0].append("    </div>\n");
		vue[0].append("  </div>\n");
		vue[0].append("</template>\n");
		vue[0].append("<script>\n");
		vue[0].append("  import { getSessionData } from '@/libs/cookieUtil.js'\n");
		vue[0].append("  import { setDefaultValue, dateFormat, getInitFilterParam} from '@/libs/formCommon.js'\n");
		vue[0].append("  import hrCheckList from '@/components/myerh_form/hrCheckList.vue'\n");
		vue[0].append("  import HrDateTime from '@/components/myerh_form/hrDateTime'\n");
		vue[0].append("  import HrTextarea from '@/components/myerh_form/hrTextarea.vue'\n");
		vue[0].append("  import HrFileUpload from '@/components/myerh_form/hrFileUpload.vue'\n");
		vue[0].append("  import HrTextBox from '@/components/myerh_form/hrTextBox.vue'\n");
		vue[0].append("  import HrComboBox from '@/components/myerh_form/hrComboBox.vue'\n");
		vue[0].append("  import PopupPicker from '@/components/popup-picker/index.vue'\n");
		vue[0].append("  import md5 from '@/tools/md5/index.js'\n");
		vue[0].append("  import Group from '@/components/group/index.vue'\n");
		vue[0].append("  import XButton from '@/components/x-button/index.vue'\n");
		vue[0].append("  import XInput from '@/components/x-input/index.vue'\n");
		vue[0].append("  export default {\n");
		vue[0].append("    name: 'testCardForm2',\n");
		vue[0].append("    components: {\n");
		vue[0].append("      HrDateTime,\n");
		vue[0].append("      XInput,\n");
		vue[0].append("      Group,\n");
		vue[0].append("      hrCheckList,\n");
		vue[0].append("      HrTextarea,\n");
		vue[0].append("      HrFileUpload,\n");
		vue[0].append("      HrTextBox,\n");
		vue[0].append("      XButton,\n");
		vue[0].append("      PopupPicker,\n");
		vue[0].append("      HrComboBox\n");
		vue[0].append("    },\n");
		vue[0].append("    props: {\n");
		vue[0].append("      value: {},\n");
		vue[0].append("      compParams: {}\n");
		vue[0].append("    },\n");
		vue[0].append("    watch: {\n");
		vue[0].append("      checkval: function (n, o) {\n");
		vue[0].append("        console.log(n + '  外面值')\n");
		vue[0].append("      },\n");
		vue[0].append("      datevalue (n, o) {\n");
		vue[0].append("        console.log(n + '  外面值')\n");
		vue[0].append("      },\n");
		vue[0].append("      formData (o, n) {\n");
		vue[0].append("        this.$emit('input', n)\n");
		vue[0].append("      }\n");
		vue[0].append("    },\n");
		vue[0].append("    methods: {\n");
		vue[0].append("      saveForm (buttonId) {\n");
		vue[0].append("        console.log(buttonId)\n");
		vue[0].append("        var signstr = JSON.stringify({'buttonId': buttonId, 'formId': this.mainFormId, 'param': this.formData, 'paramsMap': {}})\n");
		vue[0].append("        var rule = '\"'\n");
		vue[0].append("        var regS = new RegExp(rule, 'g')\n");
		vue[0].append("        signstr = signstr.replace(regS, '')\n");
		vue[0].append("        var rule2 = ':'\n");
		vue[0].append("        var regS2 = new RegExp(rule2, 'g')\n");
		vue[0].append("        signstr = signstr.replace(regS2, '=')\n");
		vue[0].append("        var sign = md5(signstr)\n");
		vue[0].append("        console.log(signstr)\n");
		vue[0].append("        console.log(sign)\n");
		vue[0].append("        this.$axios.post('/myehr/form/saveButtonSave.action?sign=' + sign,\n");
		vue[0].append("          {'formId': this.mainFormId, 'buttonId': buttonId, 'paramsMap': {}, 'param': this.formData}\n");
		vue[0].append("        ).then(function (response) {\n");
		vue[0].append("          if (response.data) {\n");
		vue[0].append("            console.log(response.data)\n");
		vue[0].append("          }\n");
		vue[0].append("        })\n");
		vue[0].append("          .catch(function (error) {\n");
		vue[0].append("            alert(error)\n");
		vue[0].append("          })\n");
		vue[0].append("      },\n");
		vue[0].append("      ggg(){\n");
		vue[0].append("        alert(this.value5)\n");
		vue[0].append("        console.log(this.value5)\n");
		vue[0].append("        this.backAct()\n");
		vue[0].append("      },\n");
		vue[0].append("      submitAct () { // 提交\n");
		vue[0].append("        this.saveForm()\n");
		vue[0].append("      },\n");
		vue[0].append("      approveAct (buttonId) { // 通过\n");
		vue[0].append("        // this.saveForm(buttonId)\n");
		vue[0].append("        // this.$route.query.id\n");
		vue[0].append("        var actFlowParams = {}\n");
		vue[0].append("        console.log(buttonId)\n");
		vue[0].append("        var signstr = JSON.stringify({'buttonId': buttonId, 'formId': this.mainFormId, 'param': this.formData, 'paramsMap': {}})\n");
		vue[0].append("        var rule = '\"'\n");
		vue[0].append("        var regS = new RegExp(rule, 'g')\n");
		vue[0].append("        signstr = signstr.replace(regS, '')\n");
		vue[0].append("        var rule2 = ':'\n");
		vue[0].append("        var regS2 = new RegExp(rule2, 'g')\n");
		vue[0].append("        signstr = signstr.replace(regS2, '=')\n");
		vue[0].append("        var sign = md5(signstr)\n");
		vue[0].append("        this.$axios.post('/myehr/form/saveButtonSave.action?sign=' + sign,\n");
		vue[0].append("          {'formId': this.mainFormId, 'buttonId': buttonId, 'paramsMap': {}, 'param': this.formData}\n");
		vue[0].append("        ).then(function (response) {\n");
		vue[0].append("          if (response.data[0] === '000000') {\n");
		vue[0].append("            actFlowParams.taskId = this.$route.query.taskId\n");
		vue[0].append("            actFlowParams.procInsId = this.$route.query.procInsId\n");
		vue[0].append("            actFlowParams.buttonType = '通过'\n");
		vue[0].append("            actFlowParams.approveRemark = this.approveRemark\n");
		vue[0].append("            actFlowParams.rejectType = ''\n");
		vue[0].append("            console.log(actFlowParams)\n");
		vue[0].append("            this.$axios.post('/myehr/act/task/complete.action',\n");
		vue[0].append("              {'formId': this.mainFormId, 'buttonId': buttonId, 'paramsMap': {}, 'param': this.formData, 'actFlowParams': actFlowParams}\n");
		vue[0].append("            ).then(function (response) {\n");
		vue[0].append("              console.log(response.data)\n");
		vue[0].append("            })\n");
		vue[0].append("              .catch(function (error) {\n");
		vue[0].append("                alert(error)\n");
		vue[0].append("              })\n");
		vue[0].append("          }\n");
		vue[0].append("        }.bind(this)).catch(function (error) {\n");
		vue[0].append("          alert(error)\n");
		vue[0].append("        })\n");
		vue[0].append("      },\n");
		vue[0].append("      backAct () { // 驳回\n");
		vue[0].append("        var buttonId = this.backButtonId\n");
		vue[0].append("        var actFlowParams = {}\n");
		vue[0].append("        var signstr = JSON.stringify({'buttonId': buttonId, 'formId': this.mainFormId, 'param': this.formData, 'paramsMap': {}})\n");
		vue[0].append("        var rule = '\"'\n");
		vue[0].append("        var regS = new RegExp(rule, 'g')\n");
		vue[0].append("        signstr = signstr.replace(regS, '')\n");
		vue[0].append("        var rule2 = ':'\n");
		vue[0].append("        var regS2 = new RegExp(rule2, 'g')\n");
		vue[0].append("        signstr = signstr.replace(regS2, '=')\n");
		vue[0].append("        var sign = md5(signstr)\n");
		vue[0].append("        console.log(signstr)\n");
		vue[0].append("        console.log(sign)\n");
		vue[0].append("        this.$axios.post('/myehr/form/saveButtonSave.action?sign=' + sign,\n");
		vue[0].append("          {'formId': this.mainFormId, 'buttonId': buttonId, 'paramsMap': {}, 'param': this.formData}\n");
		vue[0].append("        ).then(function (response) {\n");
		vue[0].append("          if (response.data[0] === '000000') {\n");
		vue[0].append("            actFlowParams.taskId = this.$route.query.taskId\n");
		vue[0].append("            actFlowParams.procInsId = this.$route.query.procInsId\n");
		vue[0].append("            actFlowParams.buttonType = '驳回'\n");
		vue[0].append("            actFlowParams.approveRemark = this.approveRemark\n");
		vue[0].append("            actFlowParams.rejectType = this.value5[0]\n");
		vue[0].append("            console.log(actFlowParams)\n");
		vue[0].append("            this.$axios.post('/myehr/act/task/complete.action',\n");
		vue[0].append("              {'formId': this.mainFormId, 'buttonId': buttonId, 'paramsMap': {}, 'param': this.formData, 'actFlowParams': actFlowParams}\n");
		vue[0].append("            ).then(function (response) {\n");
		vue[0].append("              console.log(response.data)\n");
		vue[0].append("            })\n");
		vue[0].append("              .catch(function (error) {\n");
		vue[0].append("                alert(error)\n");
		vue[0].append("              })\n");
		vue[0].append("          }\n");
		vue[0].append("        }.bind(this)).catch(function (error) {\n");
		vue[0].append("          alert(error)\n");
		vue[0].append("        })\n");
		vue[0].append("      },\n");
		vue[0].append("      savePropert (buttonId) { // 暂存\n");
		vue[0].append("        this.saveForm()\n");
		vue[0].append("      },\n");
		vue[0].append("      onValidChange: function (value) {\n");
		vue[0].append("        console.log('验证结果：' + value)\n");
		vue[0].append("        this.checkValue = value\n");
		vue[0].append("      },\n");
		vue[0].append("      initdata: function (columnId) {\n");
		vue[0].append("        return '初始化函数的值'\n");
		vue[0].append("      },\n");
		vue[0].append("      getTextBolxCheck (i) {\n");
		vue[0].append("        var tempColumn = this.dataColumn[i]\n");
		vue[0].append("        if (tempColumn.columnTypeDetail.textboxCheckType !== 'fun') {\n");
		vue[0].append("          return tempColumn.columnTypeDetail.textboxCheckType\n");
		vue[0].append("        } else {\n");
		vue[0].append("          return 'checkSelf' + i\n");
		vue[0].append("        }\n");
		vue[0].append("      },\n");
		vue[0].append("      setTextBoxDefaultValue (i) {\n");
		vue[0].append("        var formThis = this\n");
		vue[0].append("        setDefaultValue(i, formThis, null)\n");
		vue[0].append("      },\n");
		vue[0].append("      loadData () {\n");
		vue[0].append("        // 需要初始化数据\n");
		vue[0].append("        var result = getInitFilterParam(this.paramData, this.compParams, this.filterConfig)\n");
		vue[0].append("        this.$axios.post('/myehr/form/cardformInitData.action',\n");
		vue[0].append("          {formId: this.mainFormId, pkId: '', 'containerParam': {}, 'paramsMap': {}, 'requestParam': result}\n");
		vue[0].append("        ).then(function (response) {\n");
		vue[0].append("          if (response.data) {\n");
		vue[0].append("            if (response.data.rows[0]) {\n");
		vue[0].append("              this.formData = response.data.rows[0]\n");
		vue[0].append(LoadDataVue[3]);
		vue[0].append("            }\n");
		vue[0].append("          }\n");
		vue[0].append("          console.log(response)\n");
		vue[0].append("        }.bind(this))\n");
		vue[0].append("          .catch(function (error) {\n");
		vue[0].append("            console.log(error)\n");
		vue[0].append("          })\n");
		vue[0].append("      }\n");
		vue[0].append("    },\n");
		vue[0].append("    created () {\n");
		vue[0].append("      this.$axios.get('/myehr/dict/getDictDatasAll.action?formId=' + this.mainFormId)\n");
		vue[0].append("        .then(function (response) {\n");
		vue[0].append("          if (response.data) {\n");
		vue[0].append("            var datas = response.data\n");
		vue[0].append("            var dictValues = {}// this.dictValues\n");
		vue[0].append("            for (var i in datas) {\n");
		vue[0].append("              var values = []// 对象数组\n");
		vue[0].append("              var datas1 = datas[i]// 单个字典数据\n");
		vue[0].append("              for (var k = 0; k < datas1.length; k++) { // 循环字典项\n");
		vue[0].append("                values[k] = {}\n");
		vue[0].append("                values[k].name = datas1[k].name\n");
		vue[0].append("                values[k].value = datas1[k].code\n");
		vue[0].append("              }\n");
		vue[0].append("              dictValues[i] = values\n");
		vue[0].append("            }\n");
		vue[0].append("            this.dictValues = dictValues\n");
		vue[0].append("            console.log(dictValues)\n");
		vue[0].append("          }\n");
		vue[0].append("        }.bind(this))\n");
		vue[0].append("        .catch(function (error) {\n");
		vue[0].append("          console.log(error)\n");
		vue[0].append("        })\n");
		vue[0].append("      let tempData = {}\n");
		vue[0].append("      let isInit = this.paramData.isInit\n");
		vue[0].append("      isInit = true\n");
		vue[0].append("      if (isInit == true) {\n");
		vue[0].append("        this.loadData()\n");
		vue[0].append("      } else {\n");
		vue[0].append("          // 不需要初始化数据  此时需要取各字段默认值 以下代码需要后台生成  具体各种情况的代码如下\n");
		vue[0].append("          // 1 如果某个字段初始值时从上一个页面传入参数\n");
		vue[0].append("        for (var i = 0; i < this.dataColumn.length; i++) {\n");
		vue[0].append("              // 数据验证\n");
		vue[0].append("          this.setTextBoxDefaultValue(i)\n");
		vue[0].append("        }\n");
		vue[0].append("      }\n");
		vue[0].append("    },\n");
		vue[0].append("    data () {\n");
		vue[0].append("      return {\n");
		vue[0].append(LoadDataVue[2]);
		vue[0].append("        ,be2333: function (value) {\n");
		vue[0].append("          return {\n");
		vue[0].append("            valid: value === '2333',\n");
		vue[0].append("            msg: 'Must be 2333'\n");
		vue[0].append("          }\n");
		vue[0].append("        },\n");
		vue[0].append("        filterConfig: [{paramType: 'parameter', paramValue: 'businessId', paramName: 'BUSINESSID'}], // 过滤配置\n");
		vue[0].append("        formId: "+formId+", // 当前页面表单ID\n");
		vue[0].append("        mainFormId: "+mainFormId+",\n");
		vue[0].append("        formData: null,\n");
		vue[0].append("        checkValue: true,\n");
		vue[0].append("        approveRemark: '',\n");
		vue[0].append("        defaultCheckValue: true,\n");
		vue[0].append("        paramData: this.$route.query, // 页面请求参数\n");
		vue[0].append("        defaultDate: 'TODAY',\n");
		vue[0].append("        checkListDatas: [],\n");
		vue[0].append("        radioValue: '中国',\n");
		vue[0].append("        dictValues: null,\n");
		vue[0].append("        checkval: '',\n");
		vue[0].append("        datevalue: '',\n");
		vue[0].append("        showPopupPicker: false,\n");
		vue[0].append("        backButtonId:6765,\n");
		vue[0].append("        backPerson:[[{value:'00001',name:'赵一'}, {value:'00002',name:'钱二'}, {value:'00003',name:'孙三'}, {value:'00004',name:'李四'}, {value:'00005',name:'王五'}]],\n");
		vue[0].append("        value5: []\n");
		vue[0].append("      }\n");
		vue[0].append("    }\n");
		vue[0].append("  }\n");
		vue[0].append("</script>\n");
		vue[0].append("<style scoped>\n");
		vue[0].append("  .bottomFixed{\n");
		vue[0].append("    position: relative;\n");
		//vue[0].append("    z-index: 1000;\n");
		vue[0].append("    left:0px; bottom:0px; width:100%;\n");
		vue[0].append("    margin: 0 auto;\n");
		vue[0].append("  }\n");
		vue[0].append("</style>\n");

		return vue;
	}
	
	/*
	 * 卡卡主表
	 * 
	 */
	public static StringBuffer[] getMobileFormCCYCARDVue_2(SysFormconfigCache form,StringBuffer[] LoadDataVue) {
		StringBuffer[] vue = new StringBuffer[9];
		for(int i=0;i<9;i++){
			vue[i] = new StringBuffer();
		}
		/*
		 * 0.表头
		 * 1.字段主体
		 * 2.待补充
		 * 3.按钮
		 * 4.表尾及引入文件
		 * 5.methods
		 * 6.created
		 * 7.data
		 * 8.结尾
		 */

		vue[0].append("<template>\n");
		vue[0].append("  <div class=\"templateHeight\">\n");
		vue[1].append(LoadDataVue[0]);
		vue[2].append("    <div v-transfer-dom>\n");
		vue[2].append("      <loading :show=\"show1\" :text=\"text1\"></loading>\n");
		vue[2].append("    </div>\n");
		vue[3].append("    <div class=\"bottomFixed\" style=\"margin-bottom:  50px ;width: 98%\">\n");
		vue[3].append(LoadDataVue[1]);
		vue[3].append("    </div>\n");
		vue[4].append("  </div>\n");
		vue[4].append("</template>\n");
		vue[4].append("<script>\n");
		vue[4].append("  import { getSessionData } from '@/libs/cookieUtil.js'\n");
		vue[4].append("  import { setDefaultValue, dateFormat } from '@/libs/formCommon.js'\n");
		vue[4].append("  import hrCheckList from '@/components/myerh_form/hrCheckList.vue'\n");
		vue[4].append("  import HrDateTime from '@/components/myerh_form/hrDateTime'\n");
		vue[4].append("  import HrTextarea from '@/components/myerh_form/hrTextarea.vue'\n");
		vue[4].append("  import HrFileUpload from '@/components/myerh_form/hrFileUpload.vue'\n");
		vue[4].append("  import HrTextBox from '@/components/myerh_form/hrTextBox.vue'\n");
		vue[4].append("  import HrComboBox from '@/components/myerh_form/hrComboBox.vue'\n");
		vue[4].append("  import Group from '@/components/group/index.vue'\n");
		vue[4].append("  import XButton from '@/components/x-button/index.vue'\n");
		vue[4].append("  import XInput from '@/components/x-input/index.vue'\n");
		
		
		vue[4].append("  export default {\n");
		vue[4].append("    name: 'testCardForm',\n");
		vue[4].append("    components: {\n");
		vue[4].append("      HrDateTime,\n");
		vue[4].append("      XInput,\n");
		vue[4].append("      Group,\n");
		vue[4].append("      hrCheckList,\n");
		vue[4].append("      HrTextarea,\n");
		vue[4].append("      HrFileUpload,\n");
		vue[4].append("      HrTextBox,\n");
		vue[4].append("      XButton,\n");
		vue[4].append("      HrComboBox\n");
		vue[4].append("    },\n");
		vue[4].append("    watch: {\n");
		vue[4].append("      checkval: function (n, o) {\n");
		vue[4].append("        console.log(n + '  外面值')\n");
		vue[4].append("      },\n");
		vue[4].append("      datevalue (n, o) {\n");
		vue[4].append("        console.log(n + '  外面值')\n");
		vue[4].append("      },\n");
		vue[4].append("      formData (o, n) {\n");
		vue[4].append("        console.log(o)\n");
		vue[4].append("      }\n");
		vue[4].append("    },\n");
		vue[5].append("    methods: {\n");
		vue[5].append("      submitForm () {\n");
		vue[5].append("      },\n");
		vue[5].append("      onValidChange: function (value) {\n");
		vue[5].append("        console.log('验证结果：' + value)\n");
		vue[5].append("        this.checkValue = value\n");
		vue[5].append("      },\n");
		vue[5].append("      initdata: function (columnId) {\n");
		vue[5].append("        return '初始化函数的值'\n");
		vue[5].append("      },\n");
		vue[5].append("      getTextBolxCheck (i) {\n");
		vue[5].append("        var tempColumn = this.dataColumn[i]\n");
		vue[5].append("        if (tempColumn.columnTypeDetail.textboxCheckType !== 'fun') {\n");
		vue[5].append("          return tempColumn.columnTypeDetail.textboxCheckType\n");
		vue[5].append("        } else {\n");
		vue[5].append("          return 'checkSelf' + i\n");
		vue[5].append("        }\n");
		vue[5].append("      },\n");
		vue[5].append("      setTextBoxDefaultValue (i) {\n");
		vue[5].append("        var formThis = this\n");
		vue[5].append("        setDefaultValue(i, formThis, null)\n");
		vue[5].append("      }\n");
		vue[5].append("    },\n");
		vue[6].append("    created () {\n");
		
		vue[6].append("	      this.$axios.get('/myehr/dict/getDictDatasAll.action?formId=677')\n");
		vue[6].append("	        .then(function (response) {\n");
		vue[6].append("	          if (response.data) {\n");
		vue[6].append("	            var datas = response.data\n");
		vue[6].append("	            var dictValues = {}//this.dictValues\n");
		vue[6].append("	            for(var i in datas) {\n");
		vue[6].append("	              var values = []//对象数组\n");
		vue[6].append("	              var datas1 = datas[i]//单个字典数据\n");
		vue[6].append("	              for(var k=0;k<datas1.length;k++){//循环字典项\n");
		vue[6].append("	                values[k] = {}\n");
		vue[6].append("	                values[k].name = datas1[k].name\n");
		vue[6].append("	                values[k].value = datas1[k].code\n");
		vue[6].append("	              }\n");
		vue[6].append("	              dictValues[i] = values\n");
		vue[6].append("	            }\n");
		vue[6].append("	            this.dictValues = dictValues\n");
		vue[6].append("	          }\n");
		vue[6].append("	        }.bind(this))\n");
		vue[6].append("	        .catch(function (error) {\n");
		vue[6].append("	          console.log(error)\n");
		vue[6].append("	        })\n");
		
		vue[6].append("      let tempData = {}\n");
		vue[6].append("      let isInit = this.paramData.isInit\n");
		vue[6].append("      isInit = true\n");
		vue[6].append("      if (isInit == true) {\n");
		vue[6].append("          // 需要初始化数据\n");
		vue[6].append("        this.$axios.post('/myehr/form/cardformInitData.action',\n");
		vue[6].append("            {formId: '3886', pkId: '', 'containerParam': {}, 'paramsMap': {}, 'requestParam': {'EMPEMPLOYEE_EMPID': '258'}}\n");
		vue[6].append("          )\n");
		vue[6].append("            .then(function (response) {\n");
		vue[6].append("              if (response.data) {\n");
		vue[6].append("                if (response.data.rows[0]) {\n");
		vue[6].append("                  this.formData = response.data.rows[0]\n");
		vue[6].append("                }\n");
		vue[6].append("              }\n");
		vue[6].append("              console.log(response)\n");
		vue[6].append("            }.bind(this))\n");
		vue[6].append("            .catch(function (error) {\n");
		vue[6].append("              console.log(error)\n");
		vue[6].append("            })\n");
		vue[6].append("      } else {\n");
		vue[6].append("        // 不需要初始化数据  此时需要取各字段默认值 以下代码需要后台生成  具体各种情况的代码如下\n");
		vue[6].append("          // 1 如果某个字段初始值时从上一个页面传入参数\n");
		vue[6].append("        for (var i = 0; i < this.dataColumn.length; i++) {\n");
		vue[6].append("              // 数据验证\n");
		vue[6].append("          this.setTextBoxDefaultValue(i)\n");
		vue[6].append("        }\n");
		vue[6].append("      }\n");
		vue[6].append("    },\n");
		vue[7].append("    data () {\n");
		vue[7].append("      return {\n");
		vue[7].append("      	dictValues:{},\n");
		
		vue[7].append("      	formData: null,\n");
		vue[7].append("      	paramData: this.$route.query, // 页面请求参数\n");
		vue[7].append("      	defaultDate: 'TODAY',\n");
		
		vue[7].append(LoadDataVue[2]);
		vue[7].append("      }\n");
		vue[7].append("    }\n");
		vue[8].append("  }\n");
		vue[8].append("</script>\n");
		vue[8].append("<style scoped>\n");
		vue[8].append("</style>\n");

		return vue;
	}
	
	public static StringBuffer[] getCCYDataVue(SysFormconfigCache formCache,String path) {
		StringBuffer[] vue = new StringBuffer[6];
		for(int i=0;i<6;i++){
			vue[i] = new StringBuffer();
		}
		SysFormconfigMstTabCache mstCache = formCache.getMstTab();
		SysFormconfigCache mainForm = mstCache.getMainFrom();
		List<SysFormconfigMstTabDetailCache> details = mstCache.getDetails();
		
		//附表页面代码(简)
		String mainFormCode = mainForm.getFormDefCode().toLowerCase();
		vue[0].append("      <"+mainFormCode+" v-model=\"formData\" :params=\"cardParams\"></"+mainFormCode+">\n");
		vue[1].append("  import "+mainFormCode+" from '@/myehrpath/form/"+path+mainForm.getFormDefCode()+".vue'\n");
		vue[2].append(mainFormCode+",");
		for (int i = 0; i < details.size(); i++) {
			SysFormconfigMstTabDetailCache detail = details.get(i);
			SysFormconfigCache detailForm = detail.getForm();
			String dFormCode = detailForm.getFormDefCode().toLowerCase();
			vue[0].append("      <div>\n");
			vue[0].append("        <cell\n");
			vue[0].append("          title=\""+detailForm.getFormDefName()+"\"\n");
			vue[0].append("          is-link\n");
			vue[0].append("          :border-intent=\"false\"\n");
			vue[0].append("          :arrow-direction=\"isShow"+i+" ? 'up' : 'down'\"\n");
			vue[0].append("          @click.native=\"isShow"+i+" = !isShow"+i+"\"></cell>	  \n");
			vue[0].append("        <"+dFormCode+"  :contentHeight=\"contentHeight"+i+"\" :initParams=\"listParams"+i+"\" ></"+dFormCode+">\n");
			vue[0].append("      </div>\n");
			vue[1].append("  import "+dFormCode+" from '@/myehrpath/form/"+path+detailForm.getFormDefCode()+".vue'\n");
			vue[2].append(dFormCode+",");
			vue[3].append("          isShow"+i+"(n,o){\n");
			vue[3].append("            if(n === true) {\n");
			vue[3].append("                this.contentHeight"+i+" = \"300px\";\n");
			vue[3].append("            }else {\n");
			vue[3].append("              this.contentHeight"+i+" = \"0px\";\n");
			vue[3].append("            }\n");
			vue[3].append("          },\n");
			if (i==0) {
				
				vue[4].append("              isShow"+i+":false,\n");
				vue[4].append("              contentHeight"+i+":'0px',\n");
			} else {
				
				vue[4].append("              isShow"+i+":false,\n");
				vue[4].append("              contentHeight"+i+":'0px',\n");
			}
			vue[4].append("              listParams"+i+":null,\n");
			vue[5].append("          	 this.listParams"+i+" = this.inParams\n");
		}
		vue[4].append("              //卡片参数\n");
		vue[4].append("              cardParams:null,\n");
		vue[4].append("              inParams:null,\n");
		vue[4].append("              formData:null\n");
		
		return vue;
	}
	
	
	public static StringBuffer[] getGridDataVue(SysFormconfigCache formCache) {
		StringBuffer[] vue = new StringBuffer[18];
		for(int i=0;i<18;i++){
			vue[i] = new StringBuffer();
		}
		vue[17].append("          formId:"+formCache.getFormDefId()+",\n");
		vue[0].append("        orderByColumn:[],\n");
		vue[0].append("        filterColumnDatas:[],\n");
		vue[1].append("        Object.assign(old,{");
		vue[2].append("		   Object.assign(filterParams,{");
		vue[7].append("		   filterColumnDatas: [");
		List<SysFormWhereCache> whereCaches = formCache.getWheres();
		List<SysGridFilterColumnCache> filters = formCache.getFilter().getMobileFilterColumns();
		List<SysFormColumnCache> columns = formCache.getMobildeColumns();
		List<SysFormColumnCache> sortColumns = formCache.getSortCs();
		SysFormColumnCache defaultColumn = formCache.getDefaultSortC();
		List<SysFormButtonCache> rightButtons = formCache.getRightButtons();
		List<SysFormButtonCache> bottomButtons = formCache.getBottomButtons();
		List<SysFormButtonCache> slidButtons = formCache.getSlidButtons();
		int num = 0;
		boolean haveWhere = false;
		boolean haveWherex = false;
		for (SysGridFilterColumnCache sysFormWhereCache : filters) {
			SysFormColumnCache columnCache = sysFormWhereCache.getColumn();
			String columnCode = ChangeCode.getUniqueCode(columnCache.getFormEntityTablename(), columnCache.getFormFiledTablename()).toUpperCase();
			haveWhere = true;
			if (columnCache.getFormColumnGuiType().equals("1")) {//文本
				vue[1].append(columnCode+":value,");
				vue[2].append(columnCode+": this.blurQueryValue,");
				haveWherex = true;
			}else if (columnCache.getFormColumnGuiType().equals("2")) {
				num++;
				SysFormComboboxCache comboboxCache = (SysFormComboboxCache)columnCache.getFormColumGui();
				if (comboboxCache.getComboboxMultiselect().equals("Y")) {//下拉多选
					vue[7].append("{name: '"+columnCode+"', lableName: '"+columnCache.getFormColumnLable()+"', type: 'checkbox', dictId: '"+comboboxCache.getComboboxGuiInitType()+"|"+comboboxCache.getComboboxGuiInitValue()+"', defaultValue: '' },");
				}else{//下拉单选
					vue[7].append("{name: '"+columnCode+"', lableName: '"+columnCache.getFormColumnLable()+"', type: 'radio', dictId: '"+comboboxCache.getComboboxGuiInitType()+"|"+comboboxCache.getComboboxGuiInitValue()+"', defaultValue: '' },");
				}
			}else if (columnCache.getFormColumnGuiType().equals("6")) {
				num++;
				SysDatepickerCache datepickerCache = (SysDatepickerCache)columnCache.getFormColumGui();
				if(sysFormWhereCache.getPojo().getGridColumnIsIntervais().equals("Y")){//区间查询日期
					vue[7].append("{ name:'"+columnCode+"', lableName:'"+columnCache.getFormColumnLable()+"', type:'daterange',format:'"+datepickerCache.getDatepickerFormat()+"', defaultValue:'' },");
				}else{//非区间查询
					vue[7].append("{ name:'"+columnCode+"', lableName:'"+columnCache.getFormColumnLable()+"', type:'datetime',format:'"+datepickerCache.getDatepickerFormat()+"', defaultValue:'' },");
				}
			}
		}
		
		//过滤
		for (int i = 0; i < whereCaches.size(); i++) {
			SysFormWhereCache whereCache = whereCaches.get(i);
			SysFormColumnCache columnCache = whereCache.getColumn();
			String columnCode = columnCache.getFormFiledTablename().toUpperCase();
			if (i==0) {
				vue[16].append(columnCode+":this.initParams."+whereCache.getFormWhereValue());
			} else {
				vue[16].append(","+columnCode+":this.initParams."+whereCache.getFormWhereValue());
			}
		}
		
		vue[3].append("        blurQueryValue: null,\n");
		vue[4].append("        orderByParam: {},\n");
		vue[5].append("        filterParams: {},\n");
		String defaultSortCode = "";
		String defaultSortName = "";
		if (defaultColumn.getPojo()!=null) {
			defaultSortCode = ChangeCode.getUniqueCode(defaultColumn.getFormEntityTablename(),defaultColumn.getFormFiledTablename()).toUpperCase();
			defaultSortName = defaultColumn.getFormColumnLable();
		}else {
			defaultSortCode = "";
			defaultSortName = "";
		}
		vue[6].append("        orderByColumn: [{name: '"+defaultSortCode+"', type: 'default', lableName: '"+defaultSortName+"', defaultOrderBy: 'asc', checked: false},\n");
		for (int i = 0; i < sortColumns.size(); i++) {
			String columnCode = ChangeCode.getUniqueCode(sortColumns.get(i).getFormEntityTablename(),sortColumns.get(i).getFormFiledTablename()).toUpperCase();
			vue[6].append("                        {name: '"+columnCode+"', type: 'list', lableName: '"+sortColumns.get(i).getFormColumnLable()+"', defaultOrderBy: 'asc', checked: false},\n");
		}
		
		
		vue[8].append("        screenWidth: document.body.clientWidth,\n");
		vue[9].append("        standDataColumn: {title: '', imgUrl: null},\n");
		vue[10].append("        showRowColumn: [\n");
		
		boolean haveColumns = false;
		for (int i = 0; i < columns.size(); i++) {
			String columnCode = ChangeCode.getUniqueCode(columns.get(i).getFormEntityTablename(),columns.get(i).getFormFiledTablename()).toUpperCase();
			if (!columns.get(i).getFormColumnShowType().equals("hide")) {//未隐藏字段
				haveColumns = true;
				if (columns.get(i).getFormColumnGuiType().equals("1")||columns.get(i).getFormColumnGuiType().equals("8")) {//文本
					vue[10].append("                        {columnId: '"+columnCode+"', columnName: '"+columns.get(i).getFormColumnLable()+"'},\n");
				} else if (columns.get(i).getFormColumnGuiType().equals("2")){//下拉
					vue[10].append("                        {columnId: '"+columnCode+"_DICTNAME', columnName: '"+columns.get(i).getFormColumnLable()+"'},\n");
				} else if (columns.get(i).getFormColumnGuiType().equals("6")){//日期
					vue[10].append("                        {columnId: '"+columnCode+"_NEWDATE', columnName: '"+columns.get(i).getFormColumnLable()+"'},\n");
				}
			}
		}
		
		vue[11].append("        pager: {offset: 0, limit: 10},\n");
		
		
		vue[12].append("        right_buttons: [\n");
		if (rightButtons.size()>0) {
			for (SysFormButtonCache sysFormButtonCache : rightButtons) {
				vue[12].append("                    {buttonName: '"+sysFormButtonCache.getFormButtonName()+"', icon: 'fas fa-edit', buttonId: "+sysFormButtonCache.getFormButtonId()+"},\n");
			}
			vue[12].deleteCharAt(vue[12].length() - 2);
		}
		
		vue[12].append("                        ],\n");
		vue[12].append("        bottom_buttons: [\n");
		
		if(bottomButtons.size()>0){
			for (SysFormButtonCache sysFormButtonCache : bottomButtons) {
				vue[12].append("                    {buttonName: '"+sysFormButtonCache.getFormButtonName()+"', icon: 'fas fa-edit', buttonId: "+sysFormButtonCache.getFormButtonId()+"},\n");
			}
			vue[12].deleteCharAt(vue[12].length() - 2);
		}
		
		vue[12].append("                        ],\n");
		vue[12].append("        slid_buttons: [\n");

		if(slidButtons.size()>0){
			for (SysFormButtonCache sysFormButtonCache : slidButtons) {
				vue[12].append("                    {buttonName: '"+sysFormButtonCache.getFormButtonName()+"', icon: 'fas fa-edit', buttonId: "+sysFormButtonCache.getFormButtonId()+"},\n");
			}
			vue[12].deleteCharAt(vue[12].length() - 2);
		}
		
		vue[13].append("        rows: [],\n");
		vue[14].append("        totalData: -1,\n");
		vue[15].append("        isHowTopQuery: true\n");
		if (haveWhere) {
			vue[1].deleteCharAt(vue[1].length() - 1);
		}
		if (haveWherex) {
			vue[2].deleteCharAt(vue[2].length() - 1);
		}
		if(num>0){
			vue[7].deleteCharAt(vue[7].length() - 1);
		}
		if (haveColumns) {
			vue[10].deleteCharAt(vue[10].length() - 2);
		}
		vue[6].deleteCharAt(vue[6].length() - 2);
		vue[1].append("})\n");
		vue[2].append("})\n");
		vue[7].append("],\n");
		vue[10].append("                        ],\n");
		vue[12].append("                        ],\n");
		vue[6].append("                        ],\n");
		return vue;
	}

}
