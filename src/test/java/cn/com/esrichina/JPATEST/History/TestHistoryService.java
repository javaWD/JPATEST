package cn.com.esrichina.JPATEST.History;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.esrichina.JPATEST.MonitorConstants;
import cn.com.esrichina.servermonitor.domain.History;
import cn.com.esrichina.servermonitor.service.HistoryService;
import cn.com.esrichina.servermonitor.util.QueryHistoryOption;
import junit.framework.TestCase;

public class TestHistoryService extends TestCase{
	
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
		HistoryService hisservice=ctx.getBean("historyService",HistoryService.class);
		QueryHistoryOption qho=new QueryHistoryOption();
		qho.setItemId(MonitorConstants.ItemsId);
		
		List<History> lhis=hisservice.search(qho);
		
		for(History h:lhis){
			System.out.println(h.toString());
		}
		System.out.println(lhis.size());
	}
	
	@Test
	public void testFindLastestTime(){
		HistoryService hisservice=ctx.getBean("historyService",HistoryService.class);
		QueryHistoryOption qho=new QueryHistoryOption();
		qho.setItemId(MonitorConstants.ItemsId);
		
		int lhis=hisservice.searchLastestTime(qho);
		System.out.println(lhis);
	}
}
