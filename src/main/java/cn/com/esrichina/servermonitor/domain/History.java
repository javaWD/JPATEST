package cn.com.esrichina.servermonitor.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigInteger;


/**
 * The persistent class for the history database table.
 * 
 */
@Entity
@Table(name="history")
@IdClass(HistoryId.class)
@NamedQueries({
@NamedQuery(name="History.findAll", query="SELECT h FROM History h"),
@NamedQuery(name="History.conditionQuery",query="SELECT h FROM History h WHERE h.itemid=:id and h.clock>=:queryStart and  h.clock<=:queryEnd"),
@NamedQuery(name="History.findLastestTime",query="SELECT h FROM History h WHERE h.itemid=:id ORDER BY h.clock DESC")
})
public class History implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int clock;
	@Id
	private BigInteger itemid;
	@Id
	private int ns;
	@Id
	private double value;

	public History() {
	}

	public int getClock() {
		return this.clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	public BigInteger getItemid() {
		return this.itemid;
	}

	public void setItemid(BigInteger itemid) {
		this.itemid = itemid;
	}

	public int getNs() {
		return this.ns;
	}

	public void setNs(int ns) {
		this.ns = ns;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "itemid:"+itemid+";clock:"+clock+";value:"+value;
	}

}