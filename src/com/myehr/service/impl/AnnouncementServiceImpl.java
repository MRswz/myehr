package com.myehr.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.myehr.mapper.formmanage.form.AnnouncementMapper;
import com.myehr.pojo.formmanage.form.Announcement;
import com.myehr.pojo.formmanage.form.AnnouncementExample;
import com.myehr.pojo.formmanage.form.AnnouncementExample.Criteria;
import com.myehr.service.AnnouncementService;

@Service
public  class AnnouncementServiceImpl implements AnnouncementService {
	private static Logger logger = LoggerFactory.getLogger(AnnouncementServiceImpl.class);
	@Autowired
	AnnouncementMapper announcementMapper;	
	
	@Override
	public Announcement getAnnouncementById(int id) {
		// TODO Auto-generated method stub
		try {
			AnnouncementExample example =  new AnnouncementExample();
			example.or().andIdEqualTo(id);
			List<Announcement> result =  announcementMapper.selectByExampleWithBLOBs(example);
			if(result!=null&&result.size()>=1){
				return result.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		return null;
	}

	@Override
	public List<Announcement> queryAnnouncement(String title,String createUserName,
			String createOrgId,String startDate,String endDate) {
		try {
			AnnouncementExample example =  new AnnouncementExample();
			Criteria c = example.or();
			if(title!=null&&!title.equals("")){
				 c.andTitleLike("%"+title+"%");
			}
			//c.andStateEqualTo("1");
			
			List<Announcement> result =  announcementMapper.selectByExample(example);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		return null;
	}

	@Override
	public int deleteAnnouncementById(int id) {
		
		AnnouncementExample example =  new AnnouncementExample();
	//	example.or().andIdEqualTo(id);
	
		//List<Announcement> wocaos = announcementMapper.deleteByExample(example);
	    return	announcementMapper.deleteByPrimaryKey(id);
	    	
	   
	}

	@Override
	public void addAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stubannouncementMapper
		announcementMapper.insert(announcement);
		
	}

	@Override
	public void updateAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stub
		announcementMapper.updateByPrimaryKeyWithBLOBs(announcement);
	}

	@Override
	public Announcement seeAnnouncementById(int id) {
		return announcementMapper.selectByPrimaryKey(id);
	}

}
