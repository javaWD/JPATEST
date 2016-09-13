package cn.com.esrichina.servermonitor.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.com.esrichina.servermonitor.domain.HistoryId;

@Repository("historyDao")
public class HistoryDaoImpl implements HistoryDao{

	@PersistenceContext
	private EntityManager em;
	

	@Transactional
	public void search(HistoryId hid) {
		//em.find(HistoryId.class,hid);
		em.createQuery("");
	}

}
