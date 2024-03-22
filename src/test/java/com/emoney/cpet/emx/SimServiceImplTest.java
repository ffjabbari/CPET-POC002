package com.emoney.cpet.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SimServiceImplTest {

	@Test
	public void test() {
		

		@SuppressWarnings({ "rawtypes", "unchecked" })
		ObjectFactory<SimServiceImpl> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();
		mapParam.put(SimServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(SimServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(SimServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(DevenvConfig.class.getName() + ".field1", "field1V");
		mapParam.put(DevenvConfig.class.getName() + ".field2", "field2V");
		mapParam.put(DevenvConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");
		
		SimServiceImpl clientContext = configFactory.create(SimServiceImpl.class.getName(), mapParam);
		
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
