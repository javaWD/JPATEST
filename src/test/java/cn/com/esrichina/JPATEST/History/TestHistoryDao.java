package cn.com.esrichina.JPATEST.History;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.esrichina.JPATEST.MonitorConstants;
import cn.com.esrichina.servermonitor.dao.HistoryDao;
import cn.com.esrichina.servermonitor.domain.History;
import cn.com.esrichina.servermonitor.service.HistoryService;
import cn.com.esrichina.servermonitor.util.QueryHistoryOption;
import junit.framework.TestCase;

public class TestHistoryDao extends TestCase{
	private ClassPathXmlApplicationContext ctx;

	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext("classpath:/cn/com/esrichina/product/spring-jpa.xml");
	}
	
	@After
	public void after(){
		
	}
	
	@Test
	public void testGetHistoryById(){
		//dao层没设置start、end，则不输出
		HistoryDao hisdao=ctx.getBean("historyDao",HistoryDao.class);
		QueryHistoryOption qho=new QueryHistoryOption();
		qho.setItemId(MonitorConstants.ItemsId);
		qho.setQueryEnd(MonitorConstants.End);
		qho.setQueryStart(MonitorConstants.Start);
		
		List<History> lhis=hisdao.search(qho);
		
		for(History h:lhis){
			System.out.println(h.toString());
		}
		System.out.println(lhis.size());
	}
	

	
	@Test
	public void testFindLastestTime(){
		HistoryDao hisdao=ctx.getBean("historyDao",HistoryDao.class);
		QueryHistoryOption qho=new QueryHistoryOption();
		qho.setItemId(MonitorConstants.ItemsId);
		
		List<History> lhis=hisdao.searchLastestTime(qho);
		System.out.println(lhis.size());
	}
	
}
