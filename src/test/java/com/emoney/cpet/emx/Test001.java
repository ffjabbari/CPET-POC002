package com.emoney.cpet.emx;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Test001 {

	@Test
	public void test() {
		

		@SuppressWarnings({ "rawtypes", "unchecked" })
		ObjectFactory<SomeConfig> transactionFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();
		mapParam.put(K8sConfig.class.getName() + ".field1", "field1V");
		mapParam.put(K8sConfig.class.getName() + ".field2", "field2V");
		mapParam.put(K8sConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");

		mapParam.put(FactServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(FactServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(FactServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(SimServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(SimServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(SimServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(CicdServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(CicdServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(CicdServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(DatabasServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(DatabasServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(DatabasServiceImpl.class.getName() + ".field3", "field3V");


		mapParam.put(SecurirtyServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(SecurirtyServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(SecurirtyServiceImpl.class.getName() + ".field3", "field3V");

	
	
	
		mapParam.put(SomeConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SomeConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SomeConfig.class.getName() + ".field3", "field3V");
		mapParam.put(SomeConfig.class.getName() + ".balance", "77");
		mapParam.put(SomeConfig.class.getName() + ".accountNumber", "1112223333");
		
		@SuppressWarnings("unused")
		SomeConfig balanceTransferTran = transactionFactory.create(SomeConfig.class.getName(), mapParam);
	
		
		
		return;
	}
}
