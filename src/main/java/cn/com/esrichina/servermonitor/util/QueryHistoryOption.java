package cn.com.esrichina.servermonitor.util;

import javax.persistence.Query;

public class QueryHistoryOption {
	private int queryStart;
	private int queryEnd;
	private String itemId;
	
	/***
	 * 查询时需添加起止时间，
	 * 初始化，查询items参数选项.
	 * 不添加则默认：
	 * 起：十分钟前
	 * 止：当前
	 * @param itemId
	 */
	public QueryHistoryOption(){
		
	}
	
//	/***
//	 * 查询时需添加起止时间，
//	 * 初始化，查询items参数选项.
//	 * 不添加则默认：
//	 * 起：十分钟前
//	 * 止：当前
//	 * @param itemId
//	 */
//	public QueryHistoryOption(String itemId) {
//		this.itemId=itemId;
//		this.queryEnd=(int) (System.currentTimeMillis()/1000);
//		this.queryStart=this.queryEnd-6000;
//	}
//	
//	/***
//	 * 初始化，查询items参数选项.
//	 * @param itemId
//	 * @param queryStart
//	 * @param queryEnd
//	 */
//	public QueryHistoryOption(String itemId,int queryStart,int queryEnd){
//		  this.itemId=itemId;
//		this.queryStart=queryStart;
//		this.queryEnd=queryEnd;
//	}
	
	public QueryHistoryOption(String itemId,int queryStart){
		this.itemId=itemId;
		this.queryStart=queryStart;
		this.queryEnd=(int) (System.currentTimeMillis()/1000);
	}

	public int getQueryStart() {
		return queryStart;
	}

	public void setQueryStart(int queryStart) {
		this.queryStart = queryStart;
	}

	public int getQueryEnd() {
		return queryEnd;
	}

	public void setQueryEnd(int queryEnd) {
		this.queryEnd = queryEnd;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
}
