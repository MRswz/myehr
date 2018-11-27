package com.myehr.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.pojo.formmanage.cache.SysFormGeneralExecSqlCache;
import com.myehr.service.impl.formmanage.runtime.RuntimeUtil;
import com.myehr.service.primaryKey.PrimaryKeyService;

/**
 * @author chenjie
 * 
 * <h1>Excel工具类</h1><br>
 * <p>提供office Excel文件内容读取功能</p>
 */
public class ExcelUtil {
	private static Logger logger = LoggerFactory.getLogger(ExcelUtil.class);

	private static final String FILE_END_XLS = ".xls";
	private static final String FILE_END_XLSx = ".xlsx";

	/**
	 * 获取Excel2003格式的头标题
	 * @param filePath 文件路径
	 * @param startRow 头标题行
	 */
	public static Map<String, String> readExcelHeadFor2003(String filePath, int startRow) throws FileNotFoundException, IOException {
		Map<String, String> map = new HashMap<String, String>();
		FileInputStream in = new FileInputStream(filePath);
		HSSFWorkbook wb = new HSSFWorkbook(in);
		
		HSSFSheet sheet = wb.getSheetAt(0);
		if (startRow > 0) {
			startRow = startRow - 1;
		}
		
		int numberRows = sheet.getPhysicalNumberOfRows();
		if (numberRows > 0 && numberRows >= startRow) {
			HSSFRow sourceRow = sheet.getRow(startRow);
			for (int cellCount = 0; cellCount <= sourceRow.getLastCellNum(); cellCount++) {
				HSSFCell cell = sourceRow.getCell((short) cellCount);
				if(cell==null){
					continue;
				}
				map.put("cell" + (cellCount + 1), cell.getRichStringCellValue().toString());
			}
		}
		
		return map;
	}
	
	/*public static Map<String, String> writeExcelErrorFor2003(String filePath, int startRow, List<Map<String, Object>> importDatas, int columnCount, String clientFileName) throws FileNotFoundException, IOException, Throwable {
		FileInputStream in = new FileInputStream(filePath);
		HSSFWorkbook wb = new HSSFWorkbook(in);
		
		for (int sheetCount = 0; sheetCount < wb.getNumberOfSheets(); sheetCount++) {
			HSSFSheet sheet = wb.getSheetAt(sheetCount);
			if (startRow > 0) {
				startRow = startRow - 1;
			}
			
			int numberRows = sheet.getPhysicalNumberOfRows();
			for (int rowCount = startRow, record = 0; rowCount < numberRows; rowCount++) {
				HSSFRow sourceRow = sheet.getRow(rowCount);
				if (sourceRow == null) {
					sheet.shiftRows(rowCount + 1, rowCount + 1, -1);// 删除指定行
					
					rowCount--;
					continue;
				}
				
				String cellError = (String)importDatas.get(record).get("cellError");
				record++;
				if (cellError!=null && cellError!="") {
					HSSFCell cell = sourceRow.createCell((short) (columnCount + 1));
					HSSFRichTextString text = new HSSFRichTextString(cellError);
                	cell.setCellValue(text);
				} else {
					sheet.shiftRows(rowCount + 1, rowCount + 1, -1);// 删除指定行
					
					rowCount--;
					numberRows--;
					continue;
				}
			}
		}
		
		clientFileName = clientFileName.substring(0, clientFileName.length() - 4);
		
		return exportExcelFile2003(wb, clientFileName);
	}*/
	
	/**
	 * 读取2003版本的excel内容，
	 * 
	 * @author chenjie
	 * @param filePath
	 *            文件路径
	 * @param startRow
	 *            开始读取行
	 * @return 以List<Map<String,
	 *         Object>>方式返回，每个map中包含一行数据，从前往后依次读取的列为cell1,cell2,cell3...celln
	 * @throws FileNotFoundException 文件没有找到
	 * @throws IOException IO读写异常
	 */
	@SuppressWarnings("deprecation")
	public static List<Map<String, Object>> readExcelFor2003(String filePath,
			int startRow) throws FileNotFoundException, IOException {
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		FileInputStream in = new FileInputStream(filePath);
		HSSFWorkbook wb = new HSSFWorkbook(in);
		for (int sheetCount = 0; sheetCount < wb.getNumberOfSheets(); sheetCount++) {
			HSSFSheet sheet = wb.getSheetAt(sheetCount);
			if (startRow > 0) {
				startRow = startRow - 1;
			}
			int numberRows = sheet.getPhysicalNumberOfRows();
			for (int rowCount = startRow; rowCount < numberRows; rowCount++) {
				HSSFRow sourceRow = sheet.getRow(rowCount);
				if (sourceRow == null) {
					numberRows += 1;
					continue;
				}
				Map<String, Object> values = new HashMap<String, Object>();
				// 以下构造导入的实体对象，并根据Excel单元格的内容填充实体属性值
				boolean allnull =false;
				for (int cellCount = 0; cellCount <= sourceRow.getLastCellNum(); cellCount++) {
					HSSFCell cell = sourceRow.getCell((short) cellCount);
					String value = "";
					if (cell == null) {
						continue;
					}

					switch (cell.getCellType()) {
					case HSSFCell.CELL_TYPE_STRING:
						value = cell.getStringCellValue();
						break;
						
					case HSSFCell.CELL_TYPE_NUMERIC:
						
						
						if (HSSFDateUtil.isCellDateFormatted(cell)) {
							Date d = cell.getDateCellValue();
							DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
							value = formater.format(d);
							if (value.substring(0, 2).equals("18")) {
								DateFormat formater1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								value = formater1.format(d);
								value = value.substring(11, 19);
							}
							
						}else {
//						value = new DecimalFormat("0.00000").format(cell.getNumericCellValue());
							double a = cell.getNumericCellValue();
							value = a+"";
							String str = value.substring(value.length()-2,value.length());
							
							if(String.valueOf(a).toUpperCase().indexOf('E') > -1 ){	 
								value = String.valueOf(new DecimalFormat("#.########").format(a));
							}
							if(str.indexOf(".")>-1){
								if(str.equals(".0")==true){
									value = value.substring(0,value.length()-2);
								}else{
									if(value.substring(value.length()-1,value.length()).equals("0")==true && value.substring(value.length()-2,value.length()-1).equals("0")==false){
										value = value.substring(0,value.length()-1);
									}
								}
							}
						}
						
						break;

					case HSSFCell.CELL_TYPE_FORMULA:
						// 导入时如果为公式生成的数据则无值
						if (!cell.getDateCellValue().equals("")) {
							value = cell.getDateCellValue()+"";
						} else {
							value = cell.getDateCellValue() + "";
						}
						break;

					case HSSFCell.CELL_TYPE_BLANK:
						break;
					case HSSFCell.CELL_TYPE_ERROR:
						value = "";
						break;
					case HSSFCell.CELL_TYPE_BOOLEAN:
						value = (cell.getBooleanCellValue() == true ? "Y" : "N");
						break;
					default:
						value = "";
					}
					if(value!=null&&!"".equals(value)){
						allnull = true;
					}
					values.put("cell" + (cellCount + 1), value);
				}
				if (values != null && !values.isEmpty()&&allnull) {
					resultList.add(values);
				}
			}
		}
		//logger.info(resultList.toString());
		return resultList;
	}

	/**
	 * 获取Excel2007格式的头标题
	 * @param filePath 文件路径
	 * @param startRow 头标题行
	 */
	public static Map<String, String> readExcelHeadFor2007(String filePath, int startRow) throws FileNotFoundException, IOException {
		Map<String, String> map = new HashMap<String, String>();
		FileInputStream in = new FileInputStream(filePath);
		Workbook wb = new XSSFWorkbook(in); // 支持2007
		
		Sheet sheet = wb.getSheetAt(0);
		if (startRow > 0) {
			startRow = startRow - 1;
		}
		
		int numberRows = sheet.getPhysicalNumberOfRows();
		if (numberRows > 0 && numberRows >= startRow) {
			Row sourceRow = sheet.getRow(startRow);
			for (int cellCount = 0; cellCount < sourceRow.getLastCellNum(); cellCount++) {
				Cell cell = sourceRow.getCell(cellCount);
				
				map.put("cell" + (cellCount + 1), cell.getRichStringCellValue().toString());
			}
		}
		
		return map;
	}
	
	/*public static Map<String, String> writeExcelErrorFor2007(String filePath, int startRow, List<Map<String, Object>> importDatas, int columnCount, String clientFileName) throws FileNotFoundException, IOException, Throwable {
		FileInputStream in = new FileInputStream(filePath);
		Workbook wb = new XSSFWorkbook(in); // 支持2007
		
		for (int sheetCount = 0; sheetCount < wb.getNumberOfSheets(); sheetCount++) {
			Sheet sheet = wb.getSheetAt(sheetCount);
			if (startRow > 0) {
				startRow = startRow - 1;
			}
			
			int numberRows = sheet.getPhysicalNumberOfRows();
			for (int rowCount = startRow, record = 0; rowCount < numberRows; rowCount++) {
				Row sourceRow = sheet.getRow(rowCount);
				if (sourceRow == null) {
					sheet.shiftRows(rowCount + 1, rowCount + 1, -1);// 删除指定行
					
					rowCount--;
					continue;
				}
				
				String cellError = (String)importDatas.get(record).get("cellError");
				record++;
				if (cellError!=null && cellError!="") {
					Cell cell = sourceRow.createCell((short) (columnCount + 1));
                	cell.setCellValue(cellError);
				} else {
					sheet.shiftRows(rowCount + 1, rowCount + 1, -1);// 删除指定行
					
					rowCount--;
					numberRows--;
					continue;
				}
			}
		}
		
		clientFileName = clientFileName.substring(0, clientFileName.length() - 4);
		
		return exportExcelFile2007(wb, clientFileName);
	}*/
	

	
	/**
	 * 读取2007版本的excel内容，
	 * 
	 * @author chenjie
	 * @param filePath
	 *            文件路径
	 * @param startRow
	 *            开始读取行
	 * @return 以List<Map<String,
	 *         Object>>方式返回，每个map中包含一行数据，从前往后依次读取的列为cell1,cell2,cell3...celln
	 * @throws FileNotFoundException 文件没有找到
	 * @throws IOException IO读写异常
	 */
	public static List<Map<String, Object>> readExcelFor2007(String filePath,
			int startRow) throws FileNotFoundException, IOException {
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		FileInputStream in = new FileInputStream(filePath);
		Workbook wb = new XSSFWorkbook(in); // 支持2007
		for (int sheetCount = 0; sheetCount < wb.getNumberOfSheets(); sheetCount++) {
			Sheet sheet = wb.getSheetAt(sheetCount);
			if (startRow > 0) {
				startRow = startRow - 1;
			}
			int numberRows = sheet.getPhysicalNumberOfRows();
			for (int rowCount = startRow; rowCount < numberRows; rowCount++) {
				Row sourceRow = sheet.getRow(rowCount);
				if (sourceRow == null) {
					numberRows +=1;
					continue;
				}
				Map<String, Object> values = new HashMap<String, Object>();
				// 以下构造导入的实体对象，并根据Excel单元格的内容填充实体属性值
				for (int cellCount = 0; cellCount < sourceRow.getLastCellNum(); cellCount++) {
					Cell cell = sourceRow.getCell(cellCount);
					if (cell == null) {
						continue;
					}
					String value = "";
					switch (cell.getCellType()) {
					case XSSFCell.CELL_TYPE_STRING:
						value = cell.getStringCellValue();
						break;
					case XSSFCell.CELL_TYPE_NUMERIC:
						if ("@".equals(cell.getCellStyle().getDataFormatString())) {
							value = new DecimalFormat("0").format(cell.getNumericCellValue());

						//} else if ("General".equals(cell.getCellStyle().getDataFormatString())) {
						} else {
							if (XSSFDateUtil.isCellDateFormatted(cell)) {
								Date d = cell.getDateCellValue();
								DateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								value = formater.format(d);
								if (value.substring(0, 2).equals("18")) {
									DateFormat formater1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
									value = formater1.format(d);
									value = value.substring(11, 19);
								}
								
							}else {
								//value = new DecimalFormat("0.00000").format(cell.getNumericCellValue());
								double a = cell.getNumericCellValue();
								value = a+"";
								String str = value.substring(value.length()-2,value.length());
								
								if(String.valueOf(a).toUpperCase().indexOf('E') > -1 ){	 
									value = String.valueOf(new DecimalFormat("#.##########").format(a));
								}
								if(str.indexOf(".")>-1){
									if(str.equals(".0")==true){
										value = value.substring(0,value.length()-2);
									}else{
										logger.info(value.substring(value.length()-1,value.length()));
										logger.info(value.substring(value.length()-2,value.length()-1));
										if(value.substring(value.length()-1,value.length()).equals("0")==true && value.substring(value.length()-2,value.length()-1).equals("0")==false){
											value = value.substring(0,value.length()-1);
										}
									}
								}
								//value = new DecimalFormat("0").format(cell.getNumericCellValue());
							}
						} 
						break;
					case XSSFCell.CELL_TYPE_BOOLEAN:
						value = String.valueOf(cell.getBooleanCellValue());
						break;
					case XSSFCell.CELL_TYPE_BLANK:
						value = "";
						break;
					default:
						value = cell.toString();
					}

					values.put("cell" + (cellCount + 1), value);
				}
				if (values != null && !values.isEmpty()) {
					resultList.add(values);
				}
			}
		}
		//logger.info(resultList.toString());
		return resultList;
	}

	/**
	 * 根据excel后缀判断excel文件格式读取文件内容
	 * @author chenjie
	 * @param filePath 文件路径
	 * @param startRow 开始读取行
	 * @return 以List<Map<String, Object>>方式返回，每个map中包含一行数据，从前往后依次读取的列为cell1,cell2,cell3...celln
	 * @throws FileNotFoundException 文件没有找到
	 * @throws IOException  IO读写异常
	 */
	public static List<Map<String, Object>> readExcel(String filePath,
			int startRow) throws FileNotFoundException, IOException {
		if (filePath.endsWith(FILE_END_XLS)) {
			return readExcelFor2003(filePath, startRow);
		} else if (filePath.endsWith(FILE_END_XLSx)) {
			return readExcelFor2007(filePath, startRow);
		} else {
			return null;
		}
	}
	
	/*//导出excle操作
	public static Map<String, String> exportExcel(ExcelHead[] headers, DataObject[] obj, String fileName, DASTemplate template) throws Throwable {
		Map<String, String> excelConfig = DcfUtil.getExportExcelConfig();
		String exportExcelSuffix = excelConfig.get("exportExcelSuffix");
		if (exportExcelSuffix.endsWith(".xls")) {
			// 2003操作
			return exportExcel2003(headers, obj, fileName, template);
		} else {
			// 2007操作
			return exportExcel2007(headers, obj, fileName, template);
		}
	}
	
	*//**
	 * 导出excel(2003)
	 * @param headers 表头信息
	 * @param obj 数据集
	 * @param fileName 文件名称
	 *//*
	public static Map<String, String> exportExcel2003(ExcelHead[] headers, List<Map> obj, String fileName, DASTemplate template) throws Throwable {
		// 声明一个工作薄  
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 生成一个表格  
        HSSFSheet sheet = workbook.createSheet(fileName);
        // 设置表格默认列宽度为15个字节  
        sheet.setDefaultColumnWidth((short) 15);
        
        // 产生表格标题行
        if (headers != null && headers.length > 0) {
        	HSSFCellStyle headStyle = getCellStyle(workbook, HSSFColor.GREY_40_PERCENT.index, HSSFCellStyle.ALIGN_CENTER, (short) 11);
        	
        	HSSFRow row = sheet.createRow(0);
            for (short i = 0; i < headers.length; i++) {
            	//sheet.setColumnWidth((short)(i + 1), headers[i].getColumnWidth());// 设置列宽
            	
            	HSSFCell cell = row.createCell(i);
                cell.setCellStyle(headStyle);// 设置表头单元格的样式
                
                HSSFRichTextString text = new HSSFRichTextString(headers[i].getHeadname());
                cell.setCellValue(text);
                
            }

            if (obj != null && obj.length > 0) {
            	 HSSFCellStyle valueStyle = workbook.createCellStyle();
                // 设置这些样式
            	 valueStyle.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
            	 //valueStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
            	 valueStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            	 valueStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            	 valueStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
            	 valueStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
            	 //valueStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            	
            	for (int k = 0; k < obj.length; k++) {
        			row = sheet.createRow(k + 1);
        			for (short i = 0; i < headers.length; i++) {
        				valueStyle = getCellStyle(workbook, HSSFColor.WHITE.index, headers[i].getColumnAlign(), (short) 10);// 设置单元格样式
        				
        				HSSFCell cell = row.createCell(i);
        				
        				String cellValue = obj[k].getString(headers[i].getHeadCode());// 获取单元格的值
        				if (StringUtil.isNullOrBlank(cellValue)) {
        					cellValue = null;
        				} else {
        					if (StringUtil.isNotNullAndBlank(headers[i].getDictTypeId())) {
        						cellValue = DcfUtil.getDictEntryName(headers[i].getDictTypeId(), cellValue);// 根据字典项ID获取字典项名称
        					}else if(headers[i].getBackSql()!=null){
        						SysFormGeneralExecSqlCache gsql = headers[i].getBackSql();
    							Map<String,Object> p = new HashMap<String,Object>();
    							
    							for(String[] param : gsql.getParams()){
    								if("c".equals(param[0])){
    									String str = param[1].substring(param[1].indexOf("_")+1);
    									String str3 ="c_" + str;
    									p.put(str3, cellValue);
    								} 
    							}
    							//SysFormGeneralExecSqlCache buttonExecSql,PrimaryKeyService pkService,Map<String, Object> p,HttpSession session
    							PrimaryKeyService pkService;
    							HttpSession session;
    							List<Map> objs = RuntimeUtil.execsql(gsql, pkService, p,session);
    							if (objs != null && objs.size() > 0) {
    								cellValue = objs.get(i).get(0);
    							} else {
    								cellValue = null;
    							}
        					}
        					
        				}
        				
        				String columnDataType = headers[i].getColumnDataType();
        				HSSFDataFormat format = workbook.createDataFormat();
        				
        				try {
        					//logger.info(columnDataType + "         " + cellValue);
        					if ("Boolean".equals(columnDataType)) {
                            	if (StringUtil.isNotNullAndBlank(cellValue)) {
                            		Boolean value = Boolean.valueOf(cellValue);
                                	cell.setCellValue(value);
                            	}
                            } else if ("Int".equals(columnDataType) || "BigInteger".equals(columnDataType) || "Long".equals(columnDataType) || "Short".equals(columnDataType)) {
                            	if (StringUtil.isNotNullAndBlank(cellValue)) {
                            		Double value = Double.valueOf(cellValue);
                            		cell.setCellValue(value);
                            	}
                            	
                            	valueStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0"));
                            } else if ("double".equals(columnDataType) || "float".equals(columnDataType) || "Decimal".equals(columnDataType)) {
                            	if (StringUtil.isNotNullAndBlank(cellValue)) {
                            		Double value = Double.valueOf(cellValue);
                            		cell.setCellValue(value);
                            	}
                            	
                            	//HSSFDataFormat format = workbook.createDataFormat();
                            	//valueStyle.setDataFormat(format.getFormat("0.00"));
                            } else if ("Date".equals(columnDataType)) {
                            	Date value = DateUtil.stringToDate(cellValue, "yyyy-MM-dd");
                            	if (value != null) {
                            		HSSFRichTextString text = new HSSFRichTextString(DateUtil.dateToString(value, "yyyy-MM-dd"));
                                	cell.setCellValue(text);
                                	valueStyle.setDataFormat(format.getFormat("@"));
                            	}
                            } else if ("TimeStamp".equals(columnDataType)) {
                            	Date value = DateUtil.stringToDate(cellValue, "yyyy-MM-dd HH:mm:ss");
                            	
                            	if (value != null) {
                            		HSSFRichTextString text = new HSSFRichTextString(DateUtil.dateToString(value, "yyyy-MM-dd HH:mm:ss"));
                                	cell.setCellValue(text);
                                	valueStyle.setDataFormat(format.getFormat("@"));
                            	}
                            } else if ("Time".equals(columnDataType)) {
                            	Date value = DateUtil.stringToDate(cellValue, "HH:mm:ss");
                            	
                            	if (value != null) {
                            		HSSFRichTextString text = new HSSFRichTextString(DateUtil.dateToString(value, "HH:mm:ss"));
                                	cell.setCellValue(text);
                                	valueStyle.setDataFormat(format.getFormat("@"));
                            	}
                            } else {
                            	if (StringUtil.isNotNullAndBlank(cellValue)) {
                            		HSSFRichTextString text = new HSSFRichTextString(cellValue);
                                	cell.setCellValue(text);
                                	valueStyle.setDataFormat(format.getFormat("@"));
                            	}
                            }
        				} catch (NumberFormatException nf) {
        					if (StringUtil.isNotNullAndBlank(cellValue)) {
                        		HSSFRichTextString text = new HSSFRichTextString(cellValue);
                            	cell.setCellValue(text);
                            	valueStyle.setDataFormat(format.getFormat("@"));
                        	}
        				}
        				
        				cell.setCellStyle(valueStyle);
        			}
        		}
            }
        }
        
        Map<String, String> map = exportExcelFile2003(workbook, fileName);// 导出Excel
        
        return map;
	}
	
	*//**
	 * 导出excel(2007)
	 * @param headers 表头信息
	 * @param obj 数据集
	 * @param fileName 文件名称
	 *//*
	public static Map<String, String> exportExcel2007(ExcelHead[] headers, DataObject[] obj, String fileName, DASTemplate template) throws Throwable {
		// 声明一个工作薄  
		XSSFWorkbook workbook = new XSSFWorkbook();
        // 生成一个表格
		XSSFSheet sheet = workbook.createSheet(fileName);
        // 设置表格默认列宽度为15个字节  
        sheet.setDefaultColumnWidth((short) 15);
        
        // 产生表格标题行
        if (headers != null && headers.length > 0) {
        	
        	XSSFCellStyle headStyle = getCellStyle(workbook, HSSFColor.GREY_40_PERCENT.index, HSSFCellStyle.ALIGN_CENTER, (short) 11);
        	
        	XSSFRow row = sheet.createRow(0);
            for (short i = 0; i < headers.length; i++) {
            	//sheet.setColumnWidth((short)(i + 1), headers[i].getColumnWidth());// 设置列宽
            	
            	XSSFCell cell = row.createCell(i);
                cell.setCellStyle(headStyle);// 设置表头单元格的样式
                
                XSSFRichTextString text = new XSSFRichTextString(headers[i].getHeadname());
                cell.setCellValue(text);
                
            }

            if (obj != null && obj.length > 0) {
            	XSSFCellStyle valueStyle = workbook.createCellStyle();
                // 设置这些样式
            	 valueStyle.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
            	 //valueStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
            	 valueStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            	 valueStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            	 valueStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
            	 valueStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
            	 //valueStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            	
            	for (int k = 0; k < obj.length; k++) {
        			row = sheet.createRow(k + 1);
        			for (short i = 0; i < headers.length; i++) {
        				valueStyle = getCellStyle(workbook, HSSFColor.WHITE.index, headers[i].getColumnAlign(), (short) 10);// 设置单元格样式
        				
        				XSSFCell cell = row.createCell(i);
        				
        				String cellValue = obj[k].getString(headers[i].getHeadCode());// 获取单元格的值
        				if (StringUtil.isNullOrBlank(cellValue)) {
        					cellValue = null;
        				} else {
        					if (StringUtil.isNotNullAndBlank(headers[i].getDictTypeId())) {
        						cellValue = DcfUtil.getDictEntryName(headers[i].getDictTypeId(), cellValue);// 根据字典项ID获取字典项名称
        					}else if(headers[i].getBackSql()!=null){
        						SysFormGeneralExecSqlCache gsql = headers[i].getBackSql();
    							Map<String,Object> p = new HashMap<String,Object>();
    							
    							for(String[] param : gsql.getParams()){
    								if("c".equals(param[0])){
    									String str = param[1].substring(param[1].indexOf("_")+1);
    									String str3 ="c_" + str;
    									p.put(str3, cellValue);
    								} 
    							}
    							DataObject[] objs = RuntimeUtil.execsql(gsql, template, p);
    							if (objs != null && objs.length > 0) {
    								cellValue = objs[0].getString(0);
    							} else {
    								cellValue = null;
    							}
        					}
        					
        				}
        				
        				String columnDataType = headers[i].getColumnDataType();
        				DataFormat format = workbook.createDataFormat();
        				
        				try {
        					//logger.info(columnDataType + "         " + cellValue);
        					if ("Boolean".equals(columnDataType)) {
                            	if (StringUtil.isNotNullAndBlank(cellValue)) {
                            		Boolean value = Boolean.valueOf(cellValue);
                                	cell.setCellValue(value);
                            	}
                            } else if ("Int".equals(columnDataType) || "BigInteger".equals(columnDataType) || "Long".equals(columnDataType) || "Short".equals(columnDataType)) {
                            	if (StringUtil.isNotNullAndBlank(cellValue)) {
                            		Double value = Double.valueOf(cellValue);
                            		cell.setCellValue(value);
                            	}
                            	
                            	valueStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0"));
                            } else if ("double".equals(columnDataType) || "float".equals(columnDataType) || "Decimal".equals(columnDataType)) {
                            	if (StringUtil.isNotNullAndBlank(cellValue)) {
                            		Double value = Double.valueOf(cellValue);
                            		cell.setCellValue(value);
                            	}
                            	
                            	//HSSFDataFormat format = workbook.createDataFormat();
                            	//valueStyle.setDataFormat(format.getFormat("0.00"));
                            } else if ("Date".equals(columnDataType)) {
                            	Date value = DateUtil.stringToDate(cellValue, "yyyy-MM-dd");
                            	if (value != null) {
                            		XSSFRichTextString text = new XSSFRichTextString(DateUtil.dateToString(value, "yyyy-MM-dd"));
                                	cell.setCellValue(text);
                                	valueStyle.setDataFormat(format.getFormat("@"));
                            	}
                            } else if ("TimeStamp".equals(columnDataType)) {
                            	Date value = DateUtil.stringToDate(cellValue, "yyyy-MM-dd HH:mm:ss");
                            	
                            	if (value != null) {
                            		XSSFRichTextString text = new XSSFRichTextString(DateUtil.dateToString(value, "yyyy-MM-dd HH:mm:ss"));
                                	cell.setCellValue(text);
                                	valueStyle.setDataFormat(format.getFormat("@"));
                            	}
                            } else if ("Time".equals(columnDataType)) {
                            	Date value = DateUtil.stringToDate(cellValue, "HH:mm:ss");
                            	
                            	if (value != null) {
                            		XSSFRichTextString text = new XSSFRichTextString(DateUtil.dateToString(value, "HH:mm:ss"));
                                	cell.setCellValue(text);
                                	valueStyle.setDataFormat(format.getFormat("@"));
                            	}
                            } else {
                            	if (StringUtil.isNotNullAndBlank(cellValue)) {
                            		XSSFRichTextString text = new XSSFRichTextString(cellValue);
                                	cell.setCellValue(text);
                            		valueStyle.setDataFormat(format.getFormat("@"));
                            	}
                            }
        				} catch (NumberFormatException nf) {
        					if (StringUtil.isNotNullAndBlank(cellValue)) {
        						XSSFRichTextString text = new XSSFRichTextString(cellValue);
                            	cell.setCellValue(text);
                            	valueStyle.setDataFormat(format.getFormat("@"));
                        	}
        				}
        				
        				cell.setCellStyle(valueStyle);
        			}
        		}
            }
        }
        
        Map<String, String> map = exportExcelFile2007(workbook, fileName);// 导出Excel
        
        return map;
	}
	
	private static XSSFCellStyle getCellStyle(XSSFWorkbook workbook, short groundColor, short Alignment, short fontBig) {
		// 生成一个样式  
		XSSFCellStyle style = workbook.createCellStyle();  
        // 设置这些样式  
        style.setFillForegroundColor(groundColor);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style.setAlignment(Alignment);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        
        // 生成一个字体  
        XSSFFont font = workbook.createFont();
        font.setFontHeightInPoints(fontBig);
        // 把字体应用到当前的样式
        style.setFont(font);
        
        return style;
	}
	
	private static HSSFCellStyle getCellStyle(HSSFWorkbook workbook, short groundColor, short Alignment, short fontBig) {
		// 生成一个样式  
        HSSFCellStyle style = workbook.createCellStyle();  
        // 设置这些样式  
        style.setFillForegroundColor(groundColor);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style.setAlignment(Alignment);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        
        // 生成一个字体  
        HSSFFont font = workbook.createFont();
        font.setFontHeightInPoints(fontBig);
        // 把字体应用到当前的样式
        style.setFont(font);
        
        return style;
	}
	
	*//**
	 * 保存Excel到指定文件
	 *//*
	private static Map<String, String> exportExcelFile2003(HSSFWorkbook workbook, String fileName) throws Throwable {
		Map<String, String> map = new HashMap<String, String>();
		
		FileOutputStream fileOut = null;
		try {
			Map<String, String> excelConfig = DcfUtil.getExportExcelConfig();
			String clientFileName = fileName + ".xls";
			fileName = fileName + new Date().getTime() + ".xls";
			String filePath = excelConfig.get("exportExcelPath");
			File targetFilePath = new File(filePath);
			if (!targetFilePath.exists()) {
				targetFilePath.mkdirs();
			}
			
			fileOut = new FileOutputStream(filePath + "/" + fileName);
			workbook.write(fileOut);
			
			map.put("clientFileName", clientFileName);
			map.put("filePath", filePath + "/" + fileName);
			map.put("contentType", "application/x-xls");
		} catch (Exception e) {
			throw e;
		} finally{  
            if(fileOut != null){
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();logger.error(e.getMessage(),e);
                }
            }
        }
		return map;
	}
	
	*//**
	 * 保存Excel到指定文件
	 *//*
	private static Map<String, String> exportExcelFile2007(Workbook workbook, String fileName) throws Throwable {
		Map<String, String> map = new HashMap<String, String>();
		
		FileOutputStream fileOut = null;
		try {
			Map<String, String> excelConfig = DcfUtil.getExportExcelConfig();
			String clientFileName = fileName + ".xlsx";
			fileName = fileName + new Date().getTime() + ".xlsx";
			String filePath = excelConfig.get("exportExcelPath");
			File targetFilePath = new File(filePath);
			if (!targetFilePath.exists()) {
				targetFilePath.mkdirs();
			}
			
			fileOut = new FileOutputStream(filePath + "/" + fileName);
			workbook.write(fileOut);
			
			map.put("clientFileName", clientFileName);
			map.put("filePath", filePath + "/" + fileName);
			map.put("contentType", "application/octet-stream");
		} catch (Exception e) {
			throw e;
		} finally{  
            if(fileOut != null){
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();logger.error(e.getMessage(),e);
                }
            }
        }
		return map;
	}
	
	public static void main(String[] args) {
		//exportExcel("测试", new String[]{"111", "222"}, null);
	}
	
	*//**
	 * @author 模板方式导出
	 * 
	 *//*
	public static String export(DataObject[] dictdata,DataObject exportInfo,String templateFilename) throws Exception{
//		String templateFilename = "CardTemplate";
		return dictExport(dictdata,exportInfo, templateFilename);     
   }
	
	*//**
	 * @author 
	 * 
	 *//*
	public static String dictExport(DataObject[] dictdata,DataObject exportInfo,String templateFilename) throws Exception{
			ExcelTemplate2 template=getTemplateFile(templateFilename,generateOutputExcelFileName(templateFilename));
	        template.initialize();
	        if(template.getStartRow()==-1)
	        	return null ;
	        
	        //先填充标题
	        	//template.generateTitleDatas(exportInfo);
	        //生成数据内容
	            template.generateDictDatas(Arrays.asList(dictdata));
	            template.writeToFile();
			return template.getOutputFile();
		
	}
	
	*//**
	 * 生成EXCEL输出文件，默认带时间戳
	 * @param templateFilename 文件名
	 * @return
	 *//*
	private static String generateOutputExcelFileName(String templateFilename){
		String filename=templateFilename;
		if(templateFilename.endsWith(".xls")){
			filename=templateFilename.substring(0,templateFilename.length()-4);
		}

		SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
		String datetimeString=format.format(new Date());

		filename=filename+"_"+datetimeString+".xls";
		return filename;
	}
	
	*//**
	 * 生成模板
	 * @param templateName
	 * @param inoutfile
	 * @return
	 * @throws Exception
	 *//*
	private static ExcelTemplate2 getTemplateFile(String templateName,String inoutfile) throws Exception {
		if(templateName.indexOf(".xls")==-1){
			templateName+=".xls";
		}

		//临时路径是服务器当前war下面的excel-config目录
		
		String templateDir=ConfigurationUtil.getUserConfigSingleValue("UserDefine", "Excel", Constants.EXCEL_TEMPLATE_PATH);
		
		if(!templateDir.endsWith("/")){
			templateDir+="/";
		}
		String rootpath = ApplicationContext.getInstance().getWarRealPath();
		String tempDir=rootpath+ templateDir.substring(1,templateDir.length())+"temp/";
		File file=new File(tempDir);
		if(!file.exists()){
			//创建临时目录
			com.eos.foundation.common.io.FileUtil.mkDir(tempDir);
			//file.createNewFile();
		}
		String templateFile=templateDir+templateName;
		//if(StringUtil.isNullOrBlank(inoutfile)){
		    inoutfile=tempDir+generateOutputExcelFileName(templateName);
		//}
		return new ExcelTemplate2(templateFile,inoutfile);
	}*/
	
}