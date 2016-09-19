package cn.com.esrichina.servermonitor.util;

public class QueryException extends Exception{
	private QueryErrorType errorType;
	
	public QueryException(String message) {
		super(message);
	}
}
