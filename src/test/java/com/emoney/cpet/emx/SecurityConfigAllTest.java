package com.emoney.cpet.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SecurityConfigAllTest {

	@Test
	public void test() {
		

		@SuppressWarnings({ "rawtypes", "unchecked" })
		ObjectFactory<SecurityConfig> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(SecurityConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SecurityConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SecurityConfig.class.getName() + ".field3", "field3V");


		mapParam.put(SecurityConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SecurityConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SecurityConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		SecurityConfig clientContext = configFactory.create(SecurityConfig.class.getName(), mapParam);
		
		assertTrue("invalid value", clientContext.getField1().equals("field1V"));
		assertTrue("invalid value", clientContext.getField1().equals("field1V"));
		assertTrue("invalid value", clientContext.getSystemConfig().getField1().equals("field1V"));
		
		assertTrue("invalid value", clientContext.getField2().equals("field2V"));
		assertTrue("invalid value", clientContext.getField1().equals("field1V"));
		assertTrue("invalid value", clientContext.getSystemConfig().getField2().equals("field2V"));

		assertTrue("invalid value", clientContext.getField3().equals("field3V"));
		assertTrue("invalid value", clientContext.getField1().equals("field1V"));
		assertTrue("invalid value", clientContext.getSystemConfig().getField3().equals("field3V"));
		
		return;
	}
}
