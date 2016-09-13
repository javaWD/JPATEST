package cn.com.esrichina.product;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.esrichina.servermonitor.dao.HostsDao;
import cn.com.esrichina.servermonitor.domain.Host;

public class SimpleSpringJpaDemo {

	public static void main(String[] args) {

//		Product p = new Product();
//		p.setProductTitle("JPA555");
//		new ProductManagerImpl().save(p);
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/cn/com/esrichina/product/spring-jpa.xml");
//		ProductManager productDao = ctx.getBean("productManager", ProductManager.class);
//		Product p = new Product();
//		p.setProductTitle("JPAUnit0913222");
//		productDao.save(p);
		
//		ProductDao productDao = ctx.getBean("productDao", ProductDao.class);
//		//Product p = new Product();
//		//p.setProductTitle("JPAUnit0913222");
//		List<Product> lp= productDao.searchAll();
//		System.out.println(lp.size());
		
		HostsDao hostsDao = ctx.getBean("hostsDao", HostsDao.class);
		//Product p = new Product();
		//p.setProductTitle("JPAUnit0913222");
		List<Host> lp= hostsDao.searchAll();
		System.out.println(lp.size());
		

	}
}
