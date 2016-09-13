package cn.com.esrichina.JPATEST;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestJPA extends TestCase{
//	@PersistenceContext(unitName="JPATESs")
//	private EntityManager entityManager;


	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testJPA(){
		
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPATEST");
		  EntityManager em=factory.createEntityManager();
		//EntityManager em=entityManager;
		  em.getTransaction().begin();
		  em.persist(new Person("ceshi333")); //进行持久化操作
		  em.getTransaction().commit();
		  em.close();
		  factory.close();
		System.out.println("mytest");
		
	}
	
}
