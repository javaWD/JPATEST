package cn.com.esrichina.servermonitor.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the items database table.
 * 
 */
@Entity
@Table(name="items")
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String itemid;

	private int authtype;

	@Column(name="data_type")
	private int dataType;

	private int delay;

	@Column(name="delay_flex")
	private String delayFlex;

	private int delta;

	@Lob
	private String description;

	private String error;

	private int evaltype;

	private int flags;

	private String formula;

	private int history;

	private BigInteger interfaceid;

	@Column(name="inventory_link")
	private int inventoryLink;

	@Column(name="ipmi_sensor")
	private String ipmiSensor;

	@Column(name="key_")
	private String key;

	private BigInteger lastlogsize;

	private String lifetime;

	private String logtimefmt;

	private int mtime;

	private int multiplier;

	private String name;

	@Lob
	private String params;

	private String password;

	private String port;

	private String privatekey;

	private String publickey;

	@Column(name="snmp_community")
	private String snmpCommunity;

	@Column(name="snmp_oid")
	private String snmpOid;

	@Column(name="snmpv3_authpassphrase")
	private String snmpv3Authpassphrase;

	@Column(name="snmpv3_authprotocol")
	private int snmpv3Authprotocol;

	@Column(name="snmpv3_contextname")
	private String snmpv3Contextname;

	@Column(name="snmpv3_privpassphrase")
	private String snmpv3Privpassphrase;

	@Column(name="snmpv3_privprotocol")
	private int snmpv3Privprotocol;

	@Column(name="snmpv3_securitylevel")
	private int snmpv3Securitylevel;

	@Column(name="snmpv3_securityname")
	private String snmpv3Securityname;

	private int state;

	private int status;

	private BigInteger templateid;

	@Column(name="trapper_hosts")
	private String trapperHosts;

	private int trends;

	private int type;

	private String units;

	private String username;

	@Column(name="value_type")
	private int valueType;

	private BigInteger valuemapid;

	//bi-directional many-to-one association to Host
	@ManyToOne
	@JoinColumn(name="hostid")
	private Host host1;


	public Item() {
	}

	public String getItemid() {
		return this.itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public int getAuthtype() {
		return this.authtype;
	}

	public void setAuthtype(int authtype) {
		this.authtype = authtype;
	}

	public int getDataType() {
		return this.dataType;
	}

	public void setDataType(int dataType) {
		this.dataType = dataType;
	}

	public int getDelay() {
		return this.delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public String getDelayFlex() {
		return this.delayFlex;
	}

	public void setDelayFlex(String delayFlex) {
		this.delayFlex = delayFlex;
	}

	public int getDelta() {
		return this.delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getEvaltype() {
		return this.evaltype;
	}

	public void setEvaltype(int evaltype) {
		this.evaltype = evaltype;
	}

	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public int getHistory() {
		return this.history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public BigInteger getInterfaceid() {
		return this.interfaceid;
	}

	public void setInterfaceid(BigInteger interfaceid) {
		this.interfaceid = interfaceid;
	}

	public int getInventoryLink() {
		return this.inventoryLink;
	}

	public void setInventoryLink(int inventoryLink) {
		this.inventoryLink = inventoryLink;
	}

	public String getIpmiSensor() {
		return this.ipmiSensor;
	}

	public void setIpmiSensor(String ipmiSensor) {
		this.ipmiSensor = ipmiSensor;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public BigInteger getLastlogsize() {
		return this.lastlogsize;
	}

	public void setLastlogsize(BigInteger lastlogsize) {
		this.lastlogsize = lastlogsize;
	}

	public String getLifetime() {
		return this.lifetime;
	}

	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}

	public String getLogtimefmt() {
		return this.logtimefmt;
	}

	public void setLogtimefmt(String logtimefmt) {
		this.logtimefmt = logtimefmt;
	}

	public int getMtime() {
		return this.mtime;
	}

	public void setMtime(int mtime) {
		this.mtime = mtime;
	}

	public int getMultiplier() {
		return this.multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getPrivatekey() {
		return this.privatekey;
	}

	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}

	public String getPublickey() {
		return this.publickey;
	}

	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}

	public String getSnmpCommunity() {
		return this.snmpCommunity;
	}

	public void setSnmpCommunity(String snmpCommunity) {
		this.snmpCommunity = snmpCommunity;
	}

	public String getSnmpOid() {
		return this.snmpOid;
	}

	public void setSnmpOid(String snmpOid) {
		this.snmpOid = snmpOid;
	}

	public String getSnmpv3Authpassphrase() {
		return this.snmpv3Authpassphrase;
	}

	public void setSnmpv3Authpassphrase(String snmpv3Authpassphrase) {
		this.snmpv3Authpassphrase = snmpv3Authpassphrase;
	}

	public int getSnmpv3Authprotocol() {
		return this.snmpv3Authprotocol;
	}

	public void setSnmpv3Authprotocol(int snmpv3Authprotocol) {
		this.snmpv3Authprotocol = snmpv3Authprotocol;
	}

	public String getSnmpv3Contextname() {
		return this.snmpv3Contextname;
	}

	public void setSnmpv3Contextname(String snmpv3Contextname) {
		this.snmpv3Contextname = snmpv3Contextname;
	}

	public String getSnmpv3Privpassphrase() {
		return this.snmpv3Privpassphrase;
	}

	public void setSnmpv3Privpassphrase(String snmpv3Privpassphrase) {
		this.snmpv3Privpassphrase = snmpv3Privpassphrase;
	}

	public int getSnmpv3Privprotocol() {
		return this.snmpv3Privprotocol;
	}

	public void setSnmpv3Privprotocol(int snmpv3Privprotocol) {
		this.snmpv3Privprotocol = snmpv3Privprotocol;
	}

	public int getSnmpv3Securitylevel() {
		return this.snmpv3Securitylevel;
	}

	public void setSnmpv3Securitylevel(int snmpv3Securitylevel) {
		this.snmpv3Securitylevel = snmpv3Securitylevel;
	}

	public String getSnmpv3Securityname() {
		return this.snmpv3Securityname;
	}

	public void setSnmpv3Securityname(String snmpv3Securityname) {
		this.snmpv3Securityname = snmpv3Securityname;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public BigInteger getTemplateid() {
		return this.templateid;
	}

	public void setTemplateid(BigInteger templateid) {
		this.templateid = templateid;
	}

	public String getTrapperHosts() {
		return this.trapperHosts;
	}

	public void setTrapperHosts(String trapperHosts) {
		this.trapperHosts = trapperHosts;
	}

	public int getTrends() {
		return this.trends;
	}

	public void setTrends(int trends) {
		this.trends = trends;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUnits() {
		return this.units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getValueType() {
		return this.valueType;
	}

	public void setValueType(int valueType) {
		this.valueType = valueType;
	}

	public BigInteger getValuemapid() {
		return this.valuemapid;
	}

	public void setValuemapid(BigInteger valuemapid) {
		this.valuemapid = valuemapid;
	}

	public Host getHost1() {
		return this.host1;
	}

	public void setHost1(Host host1) {
		this.host1 = host1;
	}


}