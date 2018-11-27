package com.myehr.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.pojo.task.SysTimer;
 
public class TimerUtil {
	private static Logger logger = LoggerFactory.getLogger(TimerUtil.class);
	public static void main(String[] args) {
		timer2("select 1",2000,2000,"11111");
		//timer2();
		//timer3();
		//timer4();
	}
 
	// 第一种方法：设定指定任务task在指定时间time执行 schedule(TimerTask task, Date time)
	public static void timer1(final String sql,int time,String timerName) {
		Timer timer = new Timer(timerName);
		timer.schedule(new TimerTask() {
			public void run() {
				logger.info("-------设定要指定任务--------");
				logger.info(sql);
				try {
					MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}
		}, time);// 设定指定的时间time,此处为2000毫秒
	}
 
	// 第二种方法：设定指定任务task在指定延迟delay后进行固定延迟peroid的执行
	// schedule(TimerTask task, long delay, long period)
	public static void timer2(final String sql,int delayedTime,int peroidTime,String timerName) {
		Timer timer = new Timer(timerName);
		
		timer.schedule(new TimerTask() {
			public void run() {
				logger.info("-------设定要指定任务--------");
				logger.info(sql);
				try {
					MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}
		}, delayedTime, peroidTime);
	}
 
	// 第三种方法：设定指定任务task在指定延迟delay后进行固定频率peroid的执行。
	// scheduleAtFixedRate(TimerTask task, long delay, long period)
	public static void timer3() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				logger.info("-------设定要指定任务--------");
			}
		}, 1000, 2000);
	}
   
	// 第四种方法：安排指定的任务task在指定的时间firstTime开始进行重复的固定速率period执行．
	// Timer.scheduleAtFixedRate(TimerTask task,Date firstTime,long period)
	public static void timer4(final String sql,Date startDate,final Date endDate,int time,final String timerName) {
		final Timer timer = new Timer(timerName);
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				logger.info("-------设定要指定任务--------");
				if (endDate!=null) {
					long time = endDate.getTime();
					long time1 = new Date().getTime();
					if (time1>time) {
						timer.cancel();
						String sql1 = "update sys_timer set sys_timer_status = 0 where sys_timer_name = '"+timerName+"'";
						try {
							MybatisUtil.queryList("runtime.selectSql", sql1);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();logger.error(e.getMessage(),e);
						}
					}
				}
				try {
					MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}
		}, startDate, time);// 这里设定将延时每天固定执行
	}
	
	// 第五种方法：安排指定的任务task在指定的时间firstTime开始进行．
	public static void timer5(final String sql,Date startDate,Date endDate,String timerName) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				logger.info("-------设定要指定任务--------");
				try {
					MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}
		}, startDate);
	}
	
	public static String startTimer(SysTimer sysTimer) {
		String sysTimerId  = sysTimer.getSysTimerId()+"";
		String sysTimerExecType = sysTimer.getSysTimerExecType();
		String sysTimerIsRepeat = sysTimer.getSysTimerIsRepeat();
		String sysTimerRepeatType = sysTimer.getSysTimerRepeatType();
		String sysTimerRepeatValue = sysTimer.getSysTimerRepeatValue()+"";
		String sysTimerDelayedType = sysTimer.getSysTimerDelayedType();
		String sysTimerDelayedValue = sysTimer.getSysTimerDelayedValue()+"";
		Date sysTimerStartTime = sysTimer.getSysTimerStartTime();
		Date sysTimerEndTime = sysTimer.getSysTimerEndTime();
		String sysTimerName = sysTimer.getSysTimerName();
		
		String sql1 = "select * from SYS_EXEC_SQL where EXEC_SQL_RELAID = "+sysTimerId+" and EXEC_SQL_TYPE='timerSql'";
		List<Map> execSqls = null;
		try {
			execSqls = MybatisUtil.queryList("runtime.selectSql", sql1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		int time = 0;
		int time1 = 0;
		if (sysTimerRepeatType.equals("6")) {
			time = 1000;
		}
		if (sysTimerRepeatType.equals("5")) {
			time = 1000*60;
		}
		if (sysTimerRepeatType.equals("4")) {
			time = 1000*60*60;
		}
		if (sysTimerRepeatType.equals("3")) {
			time = 1000*60*60*24;
		}
		if (sysTimerDelayedType.equals("6")) {
			time1 = 1000;
		}
		if (sysTimerDelayedType.equals("5")) {
			time1 = 1000*60;
		}
		if (sysTimerDelayedType.equals("4")) {
			time1 = 1000*60*60;
		}
		if (sysTimerDelayedType.equals("3")) {
			time1 = 1000*60*60*24;
		}
		if (sysTimerExecType.equals("1")) {
			if (sysTimerEndTime.getTime()<new Date().getTime()) {
				return "2";
			}else{
				if (sysTimerIsRepeat.equals("Y")) {
					TimerUtil.timer4(execSqls.get(0).get("EXEC_SQL")+"",sysTimerStartTime,sysTimerEndTime,Integer.parseInt(sysTimerRepeatValue)*time,sysTimerName);
					return "3";
				}else{
					TimerUtil.timer5(execSqls.get(0).get("EXEC_SQL")+"",sysTimerStartTime,sysTimerEndTime,sysTimerName);
					return "4";
				}
			}
		}else {
			if (sysTimerIsRepeat.equals("Y")) {
				TimerUtil.timer2(execSqls.get(0).get("EXEC_SQL")+"",Integer.parseInt(sysTimerDelayedValue)*time,Integer.parseInt(sysTimerRepeatValue)*time1,sysTimerName);
				return "5";
			}else{
				TimerUtil.timer1(execSqls.get(0).get("EXEC_SQL")+"",Integer.parseInt(sysTimerDelayedValue)*time,sysTimerName);
				return "6";
			}
		}
	}
	
}
