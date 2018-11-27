package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.Testcalendar;
import java.util.List;
import java.util.Map;

public interface TestcalendarMapperExpand {
  

    List<Testcalendar> getAllTCalendar(Map<String,Object> map);

}