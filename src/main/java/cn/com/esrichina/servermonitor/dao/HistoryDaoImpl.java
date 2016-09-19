package cn.com.esrichina.servermonitor.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.com.esrichina.servermonitor.domain.History;
import cn.com.esrichina.servermonitor.domain.HistoryId;
import cn.com.esrichina.servermonitor.util.QueryHistoryOption;

@Repository("historyDao")
public class HistoryDaoImpl implements HistoryDao{

	@PersistenceContext
	private EntityManager em;
	

	@Transactional
	public List<History> search(QueryHistoryOption qHistoryOption) {
		//em.find(HistoryId.class,hid);
		List<History> lhis=em.createNamedQuery("History.conditionQuery").
				setParameter("id",new BigInteger(qHistoryOption.getItemId().toString())).
				setParameter("queryStart",qHistoryOption.getQueryStart()).
				setParameter("queryEnd", qHistoryOption.getQueryEnd()).
				getResultList();
		return lhis;
	}

	@Transactional
	@Override
	public List<History> searchLastestTime(QueryHistoryOption queryHistoryOption) {
		List<History> lhis=em.createNamedQuery("History.findLastestTime").
				setParameter("id",new BigInteger(queryHistoryOption.getItemId().toString())).
				setMaxResults(1).
				getResultList();
		return lhis;
	}

}
