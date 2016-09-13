package cn.com.esrichina.servermonitor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.com.esrichina.servermonitor.domain.Host;

@Repository("hostsDao")
public class HostsDaoImpl implements HostsDao{

	@PersistenceContext
	private EntityManager em;
	

	@Transactional
	public List<Host> searchAll() {
		Query query=em.createNamedQuery("Host.findAll");
		List<Host> listHost=query.getResultList();
		return listHost;
	}

}
