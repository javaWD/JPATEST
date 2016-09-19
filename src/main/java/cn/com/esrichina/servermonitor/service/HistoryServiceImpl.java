package cn.com.esrichina.servermonitor.service;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.QueryException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.esrichina.servermonitor.dao.HistoryDao;
import cn.com.esrichina.servermonitor.domain.History;
import cn.com.esrichina.servermonitor.util.QueryHistoryOption;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService{

	@Resource
	private HistoryDao historyDao;
	
	@Transactional
	@Override
	public List<History> search(QueryHistoryOption queryHistoryOption) {
		if(queryHistoryOption.getItemId()==null){
			throw new QueryException("ItemId is required.");
		}
		if((queryHistoryOption.getQueryEnd()==0)&&(queryHistoryOption.getQueryEnd()==0)){
			queryHistoryOption.setQueryEnd(searchLastestTime(queryHistoryOption));
			queryHistoryOption.setQueryStart(queryHistoryOption.getQueryEnd()-6000);
		}
		return historyDao.search(queryHistoryOption);
	}
	
	@Transactional
	public int searchLastestTime(QueryHistoryOption queryHistoryOption){
		if(queryHistoryOption.getItemId()==null){
			throw new QueryException("ItemId is required.");
		}
		List<History> lhis=historyDao.searchLastestTime(queryHistoryOption);
		
		return lhis.get(0).getClock();
	}

}
