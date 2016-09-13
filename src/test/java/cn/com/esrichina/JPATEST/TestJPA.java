package cn.com.esrichina.JPATEST;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.esrichina.product.Product;
import cn.com.esrichina.product.ProductDao;
import cn.com.esrichina.product.ProductManager;
import cn.com.esrichina.servermonitor.dao.HostsDao;
import cn.com.esrichina.servermonitor.domain.Host;
import junit.framework.TestCase;

public class TestJPA extends TestCase{
//	@PersistenceContext(unitName="JPATESs")
//	private EntityManager entityManager;
	private ClassPathXmlApplicationContext ctx;

	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext("classpath:/cn/com/esrichina/product/spring-jpa.xml");
	}
	
	@After
	public void after(){
		
	}
	
	@Test
	public void testJPA(){
		ProductManager productDao = ctx.getBean("productManager", ProductManager.class);
		Product p = new Product();
		p.setProductTitle("JPAUnit0913222");
		productDao.save(p);
	}
	
	@Test
	public void testPersonNameQuery(){
		ProductDao productDao = ctx.getBean("productDao", ProductDao.class);
		List<Product> lp= productDao.searchAll();
		System.out.println(lp.size());
	}
	
	@Test
	public void testHostNameQuery(){
		HostsDao hostsDao = ctx.getBean("hostsDao", HostsDao.class);
		List<Host> lp= hostsDao.searchAll();
		System.out.println(lp.size());
	}
	
}
