package com.myehr.pojo.formmanage.question;

import java.math.BigDecimal;

public class Examination_Answer {
    private String Qtype;
    private BigDecimal QAmount;
    private BigDecimal Qscore;
	public String getQtype() {
		return Qtype;
	}
	public void setQtype(String qtype) {
		Qtype = qtype;
	}
	public BigDecimal getQscore() {
		return Qscore;
	}
	public void setQscore(BigDecimal qscore) {
		Qscore = qscore;
	}
	public BigDecimal getQAmount() {
		return QAmount;
	}
	public void setQAmount(BigDecimal qAmount) {
		QAmount = qAmount;
	}
    
}