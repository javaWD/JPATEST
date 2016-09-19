package cn.com.esrichina.servermonitor.service;

import java.util.List;

import cn.com.esrichina.servermonitor.domain.History;
import cn.com.esrichina.servermonitor.util.QueryHistoryOption;

public interface HistoryService {
	public List<History> search(QueryHistoryOption queryHistoryOption);
	
	public int searchLastestTime(QueryHistoryOption queryHistoryOption);
}
