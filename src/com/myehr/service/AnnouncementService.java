package com.myehr.service;

import java.util.List;

import com.myehr.pojo.formmanage.form.Announcement;



/**
 * 公告服务接口
 * @author Administrator
 *
 */
public interface AnnouncementService {

	/**
	 * 查询数据库内容
	 * @param id
	 * @return
	 */
	public Announcement getAnnouncementById(int id) ;
	
	/**
	 * 通过条件查询获取
	 * @param id
	 * @return
	 */
	public List<Announcement> queryAnnouncement(String title,String createUserName,String createOrgId,String startDate,String endDate) ;
	
	/**
	 * 通过id删除
	 */
	public int  deleteAnnouncementById(int id);
	
	/**
	 * 增加
	 */
	public void addAnnouncement(Announcement announcement);
	
	/**
	 * 修改
	 * 
	 */
	public void updateAnnouncement(Announcement announcement);
	/**
	 * 通过id查看记录
	 */
	public Announcement seeAnnouncementById(int id) ;
}
