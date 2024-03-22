package com.emoney.cpet.emx;

import java.util.Map;

@SuppressWarnings("unused")
public class ConfigAll extends Config{

	private String field1;
	private String field2;
	private String field3;
	public SecurityConfig securityConfig;

    public InfraConfig infraConfig;
	
	public K8sConfig k8sConfig;
	
	public CicdConfig cicdConfig;
	
	public DatabaseConfig databaseConfig;
	
	public DevenvConfig devenvConfig;
	

	
	
	private SystemConfig systemConfig;
	
	public ConfigAll() {
		super();
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

    	


	public SecurityConfig getSecurityConfig() {
		return securityConfig;
	}

	public void setSecurityConfig(SecurityConfig securityConfig) {
		this.securityConfig = securityConfig;
	}

	public InfraConfig getInfraConfig() {
		return infraConfig;
	}

	public void setInfraConfig(InfraConfig infraConfig) {
		this.infraConfig = infraConfig;
	}

	public K8sConfig getK8sConfig() {
		return k8sConfig;
	}

	public void setK8sConfig(K8sConfig k8sConfig) {
		this.k8sConfig = k8sConfig;
	}

	public CicdConfig getCicdConfig() {
		return cicdConfig;
	}

	public void setCicdConfig(CicdConfig cicdConfig) {
		this.cicdConfig = cicdConfig;
	}

	public DatabaseConfig getDatabaseConfig() {
		return databaseConfig;
	}

	public void setDatabaseConfig(DatabaseConfig databaseConfig) {
		this.databaseConfig = databaseConfig;
	}

	public DevenvConfig getDevenvConfig() {
		return devenvConfig;
	}

	public void setDevenvConfig(DevenvConfig devenvConfig) {
		this.devenvConfig = devenvConfig;
	}

	public SystemConfig getSystemConfig() {
		return systemConfig;
	}

	public void setSystemConfig(SystemConfig systemConfig) {
		this.systemConfig = systemConfig;
	}

}
