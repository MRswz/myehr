package com.myehr.pojo.formmanage.drag;

import java.math.BigDecimal;
import java.util.List;

public class DragconfigAndDragconfigColumns {
    private SysFormDragconfigWithBLOBs dragconfig;
    private List<SysFormDragconfigColumn> dragconfigColumns;
	public SysFormDragconfigWithBLOBs getDragconfig() {
		return dragconfig;
	}
	public void setDragconfig(SysFormDragconfigWithBLOBs dragconfig) {
		this.dragconfig = dragconfig;
	}
	public List<SysFormDragconfigColumn> getDragconfigColumns() {
		return dragconfigColumns;
	}
	public void setDragconfigColumns(List<SysFormDragconfigColumn> dragconfigColumns) {
		this.dragconfigColumns = dragconfigColumns;
	}
    
}