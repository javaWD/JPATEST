package cn.com.esrichina.servermonitor.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hosts database table.
 * 
 */
@Entity
@Table(name="hosts")
@NamedQuery(name="Host.findAll", query="SELECT h FROM Host h")
public class Host implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String hostid;

	private int available;

	@Lob
	private String description;

	@Column(name="disable_until")
	private int disableUntil;

	private String error;

	@Column(name="errors_from")
	private int errorsFrom;

	private int flags;

	private String host;

	@Column(name="ipmi_authtype")
	private int ipmiAuthtype;

	@Column(name="ipmi_available")
	private int ipmiAvailable;

	@Column(name="ipmi_disable_until")
	private int ipmiDisableUntil;

	@Column(name="ipmi_error")
	private String ipmiError;

	@Column(name="ipmi_errors_from")
	private int ipmiErrorsFrom;

	@Column(name="ipmi_password")
	private String ipmiPassword;

	@Column(name="ipmi_privilege")
	private int ipmiPrivilege;

	@Column(name="ipmi_username")
	private String ipmiUsername;

	@Column(name="jmx_available")
	private int jmxAvailable;

	@Column(name="jmx_disable_until")
	private int jmxDisableUntil;

	@Column(name="jmx_error")
	private String jmxError;

	@Column(name="jmx_errors_from")
	private int jmxErrorsFrom;

	private int lastaccess;

	@Column(name="maintenance_from")
	private int maintenanceFrom;

	@Column(name="maintenance_status")
	private int maintenanceStatus;

	@Column(name="maintenance_type")
	private int maintenanceType;

	private java.math.BigInteger maintenanceid;

	private String name;

	@Column(name="proxy_hostid")
	private java.math.BigInteger proxyHostid;

	@Column(name="snmp_available")
	private int snmpAvailable;

	@Column(name="snmp_disable_until")
	private int snmpDisableUntil;

	@Column(name="snmp_error")
	private String snmpError;

	@Column(name="snmp_errors_from")
	private int snmpErrorsFrom;

	private int status;

	private java.math.BigInteger templateid;

	@Column(name="tls_accept")
	private int tlsAccept;

	@Column(name="tls_connect")
	private int tlsConnect;

	@Column(name="tls_issuer")
	private String tlsIssuer;

	@Column(name="tls_psk")
	private String tlsPsk;

	@Column(name="tls_psk_identity")
	private String tlsPskIdentity;

	@Column(name="tls_subject")
	private String tlsSubject;



	public Host() {
	}

	public String getHostid() {
		return this.hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public int getAvailable() {
		return this.available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDisableUntil() {
		return this.disableUntil;
	}

	public void setDisableUntil(int disableUntil) {
		this.disableUntil = disableUntil;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getErrorsFrom() {
		return this.errorsFrom;
	}

	public void setErrorsFrom(int errorsFrom) {
		this.errorsFrom = errorsFrom;
	}

	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getIpmiAuthtype() {
		return this.ipmiAuthtype;
	}

	public void setIpmiAuthtype(int ipmiAuthtype) {
		this.ipmiAuthtype = ipmiAuthtype;
	}

	public int getIpmiAvailable() {
		return this.ipmiAvailable;
	}

	public void setIpmiAvailable(int ipmiAvailable) {
		this.ipmiAvailable = ipmiAvailable;
	}

	public int getIpmiDisableUntil() {
		return this.ipmiDisableUntil;
	}

	public void setIpmiDisableUntil(int ipmiDisableUntil) {
		this.ipmiDisableUntil = ipmiDisableUntil;
	}

	public String getIpmiError() {
		return this.ipmiError;
	}

	public void setIpmiError(String ipmiError) {
		this.ipmiError = ipmiError;
	}

	public int getIpmiErrorsFrom() {
		return this.ipmiErrorsFrom;
	}

	public void setIpmiErrorsFrom(int ipmiErrorsFrom) {
		this.ipmiErrorsFrom = ipmiErrorsFrom;
	}

	public String getIpmiPassword() {
		return this.ipmiPassword;
	}

	public void setIpmiPassword(String ipmiPassword) {
		this.ipmiPassword = ipmiPassword;
	}

	public int getIpmiPrivilege() {
		return this.ipmiPrivilege;
	}

	public void setIpmiPrivilege(int ipmiPrivilege) {
		this.ipmiPrivilege = ipmiPrivilege;
	}

	public String getIpmiUsername() {
		return this.ipmiUsername;
	}

	public void setIpmiUsername(String ipmiUsername) {
		this.ipmiUsername = ipmiUsername;
	}

	public int getJmxAvailable() {
		return this.jmxAvailable;
	}

	public void setJmxAvailable(int jmxAvailable) {
		this.jmxAvailable = jmxAvailable;
	}

	public int getJmxDisableUntil() {
		return this.jmxDisableUntil;
	}

	public void setJmxDisableUntil(int jmxDisableUntil) {
		this.jmxDisableUntil = jmxDisableUntil;
	}

	public String getJmxError() {
		return this.jmxError;
	}

	public void setJmxError(String jmxError) {
		this.jmxError = jmxError;
	}

	public int getJmxErrorsFrom() {
		return this.jmxErrorsFrom;
	}

	public void setJmxErrorsFrom(int jmxErrorsFrom) {
		this.jmxErrorsFrom = jmxErrorsFrom;
	}

	public int getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(int lastaccess) {
		this.lastaccess = lastaccess;
	}

	public int getMaintenanceFrom() {
		return this.maintenanceFrom;
	}

	public void setMaintenanceFrom(int maintenanceFrom) {
		this.maintenanceFrom = maintenanceFrom;
	}

	public int getMaintenanceStatus() {
		return this.maintenanceStatus;
	}

	public void setMaintenanceStatus(int maintenanceStatus) {
		this.maintenanceStatus = maintenanceStatus;
	}

	public int getMaintenanceType() {
		return this.maintenanceType;
	}

	public void setMaintenanceType(int maintenanceType) {
		this.maintenanceType = maintenanceType;
	}

	public java.math.BigInteger getMaintenanceid() {
		return this.maintenanceid;
	}

	public void setMaintenanceid(java.math.BigInteger maintenanceid) {
		this.maintenanceid = maintenanceid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.math.BigInteger getProxyHostid() {
		return this.proxyHostid;
	}

	public void setProxyHostid(java.math.BigInteger proxyHostid) {
		this.proxyHostid = proxyHostid;
	}

	public int getSnmpAvailable() {
		return this.snmpAvailable;
	}

	public void setSnmpAvailable(int snmpAvailable) {
		this.snmpAvailable = snmpAvailable;
	}

	public int getSnmpDisableUntil() {
		return this.snmpDisableUntil;
	}

	public void setSnmpDisableUntil(int snmpDisableUntil) {
		this.snmpDisableUntil = snmpDisableUntil;
	}

	public String getSnmpError() {
		return this.snmpError;
	}

	public void setSnmpError(String snmpError) {
		this.snmpError = snmpError;
	}

	public int getSnmpErrorsFrom() {
		return this.snmpErrorsFrom;
	}

	public void setSnmpErrorsFrom(int snmpErrorsFrom) {
		this.snmpErrorsFrom = snmpErrorsFrom;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public java.math.BigInteger getTemplateid() {
		return this.templateid;
	}

	public void setTemplateid(java.math.BigInteger templateid) {
		this.templateid = templateid;
	}

	public int getTlsAccept() {
		return this.tlsAccept;
	}

	public void setTlsAccept(int tlsAccept) {
		this.tlsAccept = tlsAccept;
	}

	public int getTlsConnect() {
		return this.tlsConnect;
	}

	public void setTlsConnect(int tlsConnect) {
		this.tlsConnect = tlsConnect;
	}

	public String getTlsIssuer() {
		return this.tlsIssuer;
	}

	public void setTlsIssuer(String tlsIssuer) {
		this.tlsIssuer = tlsIssuer;
	}

	public String getTlsPsk() {
		return this.tlsPsk;
	}

	public void setTlsPsk(String tlsPsk) {
		this.tlsPsk = tlsPsk;
	}

	public String getTlsPskIdentity() {
		return this.tlsPskIdentity;
	}

	public void setTlsPskIdentity(String tlsPskIdentity) {
		this.tlsPskIdentity = tlsPskIdentity;
	}

	public String getTlsSubject() {
		return this.tlsSubject;
	}

	public void setTlsSubject(String tlsSubject) {
		this.tlsSubject = tlsSubject;
	}



}