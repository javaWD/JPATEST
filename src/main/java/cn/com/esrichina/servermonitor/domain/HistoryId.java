package cn.com.esrichina.servermonitor.domain;

import java.io.Serializable;
import java.math.BigInteger;

public class HistoryId implements Serializable{

//	private long itemid;
//	private int clock;
//	private double value;
//	private int ns;
	
	private int clock;

	private BigInteger itemid;

	private int ns;

	private double value;

	public HistoryId() {
	}

	public HistoryId(BigInteger itemid, int clock, double value, int ns) {
		this.itemid = itemid;
		this.clock = clock;
		this.value = value;
		this.ns = ns;
	}

	public BigInteger getItemid() {
		return this.itemid;
	}

	public void setItemid(BigInteger itemid) {
		this.itemid = itemid;
	}

	public int getClock() {
		return this.clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getNs() {
		return this.ns;
	}

	public void setNs(int ns) {
		this.ns = ns;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HistoryId))
			return false;
		HistoryId castOther = (HistoryId) other;

		return (this.getItemid() == castOther.getItemid())
				&& (this.getClock() == castOther.getClock())
				&& (this.getValue() == castOther.getValue())
				&& (this.getNs() == castOther.getNs());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getItemid().intValue();
		result = 37 * result + this.getClock();
		result = 37 * result + (int) this.getValue();
		result = 37 * result + this.getNs();
		return result;
	}
}
