package cn.com.esrichina.servermonitor.dao;

import java.util.List;

import cn.com.esrichina.servermonitor.domain.History;
import cn.com.esrichina.servermonitor.util.QueryHistoryOption;

public interface HistoryDao {
	public List<History>  search(QueryHistoryOption queryHistoryOption);
	
	public List<History>  searchLastestTime(QueryHistoryOption queryHistoryOption);
}
