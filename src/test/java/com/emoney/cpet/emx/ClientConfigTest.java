package com.emoney.cpet.emx;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ClientConfigTest {

	@Test
	public void testObjectCreation() {
		
        //PROVE OBJECT CREATION and DEEP cloning of objects.  It proves Dependency Injection and Inversion of Control!
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ObjectFactory<K8sConfig> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();
		mapParam.put(K8sConfig.class.getName() + ".field1", "field1V");
		mapParam.put(K8sConfig.class.getName() + ".field2", "field2V");
		mapParam.put(K8sConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");

		K8sConfig clientConfig = configFactory.create(K8sConfig.class.getName(), mapParam);
		
		assertTrue("invalid value", clientConfig.getField1().equals("field1V"));
		assertTrue("invalid value", clientConfig.getSystemConfig().getField1().equals("field1V"));
		
		assertTrue("invalid value", clientConfig.getField2().equals("field2V"));
		assertTrue("invalid value", clientConfig.getSystemConfig().getField2().equals("field2V"));

		assertTrue("invalid value", clientConfig.getField3().equals("field3V"));
		assertTrue("invalid value", clientConfig.getSystemConfig().getField3().equals("field3V"));
		
		mapParam = new HashMap<String, Object>();
		
		mapParam = clientConfig.getState();
		
		assertTrue("invalid value", ((String)mapParam.get(K8sConfig.class.getName() + ".field1")).equals("field1V"));
		assertTrue("invalid value", ((String)mapParam.get(SystemConfig.class.getName() + ".field1")).equals("field1V"));
		
		assertTrue("invalid value", ((String)mapParam.get(K8sConfig.class.getName() + ".field2")).equals("field2V"));
		assertTrue("invalid value", ((String)mapParam.get(SystemConfig.class.getName() + ".field2")).equals("field2V"));
		
		assertTrue("invalid value", ((String)mapParam.get(SystemConfig.class.getName() + ".field3")).equals("field3V"));
		assertTrue("invalid value", ((String)mapParam.get(SystemConfig.class.getName() + ".field3")).equals("field3V"));

		assertTrue("invalid value", ((String)clientConfig.getSystemConfig().getField1()).equals("field1V"));
		assertTrue("invalid value", ((String)clientConfig.getSystemConfig().getField2()).equals("field2V"));
		assertTrue("invalid value", ((String)clientConfig.getSystemConfig().getField3()).equals("field3V"));
		
		
		
		return;
	}
}
