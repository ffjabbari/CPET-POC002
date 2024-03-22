package com.emoney.cpet.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CicdServiceImplTest {

	@Test
	public void test() {
		

		@SuppressWarnings({ "rawtypes", "unchecked" })
		ObjectFactory<CicdServiceImpl> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();
		mapParam.put(CicdServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(CicdServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(CicdServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(CicdConfig.class.getName() + ".field1", "field1V");
		mapParam.put(CicdConfig.class.getName() + ".field2", "field2V");
		mapParam.put(CicdConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");
		
		CicdServiceImpl clientContext = configFactory.create(CicdServiceImpl.class.getName(), mapParam);
		
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
