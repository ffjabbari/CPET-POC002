package com.emoney.cpet.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class K8sConfigAllTest {

	@Test
	public void test() {
		

		@SuppressWarnings({ "rawtypes", "unchecked" })
		ObjectFactory<K8sConfig> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(K8sConfig.class.getName() + ".field1", "field1V");
		mapParam.put(K8sConfig.class.getName() + ".field2", "field2V");
		mapParam.put(K8sConfig.class.getName() + ".field3", "field3V");


		mapParam.put(K8sConfig.class.getName() + ".field1", "field1V");
		mapParam.put(K8sConfig.class.getName() + ".field2", "field2V");
		mapParam.put(K8sConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		K8sConfig clientContext = configFactory.create(K8sConfig.class.getName(), mapParam);
		
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
