package cn.com.esrichina.product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
	
	//@PersistenceContext(unitName="JPATEST")
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void save(Product p) {

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATEST");
//
//		EntityManager em = emf.createEntityManager();
//
//		em.getTransaction().begin();
//
//		em.persist(p);
//
//		em.getTransaction().commit();
//
//		emf.close();
		
		em.persist(p);

	}
	
	@Transactional
	public void search(){
		
	}

	@Override
	public List<Product> searchAll() {
		Query query=em.createNamedQuery("Product.findAll");
		List<Product> lp=query.getResultList();
		return lp;
	}
	
}
