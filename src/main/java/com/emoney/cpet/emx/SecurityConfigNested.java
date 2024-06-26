package com.emoney.cpet.emx;

import java.util.Map;

@SuppressWarnings("unused")
public class SecurityConfigNested extends Config{

	private String field1;
	private String field2;
	private String field3;
	private SecurityConfigNested securityNeConfig;
	
	private SystemConfig systemConfig;
	
	public SecurityConfigNested() {
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
   
	

	public SystemConfig getSystemConfig() {
		return systemConfig;
	}

	public void setSystemConfig(SystemConfig systemConfig) {
		this.systemConfig = systemConfig;
	}

}
