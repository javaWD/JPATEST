package cn.com.esrichina.servermonitor.dao;

import java.util.List;

import cn.com.esrichina.servermonitor.domain.Host;


public interface HostsDao {
	public List<Host> searchAll();
}
