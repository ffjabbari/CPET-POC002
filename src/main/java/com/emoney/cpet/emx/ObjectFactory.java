package com.emoney.cpet.emx;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class ObjectFactory<T>  implements Factory<T>{

	public ObjectFactory(){
		
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public T create(String clazz, Map<String, Object> mapParam) {
		
		
		@SuppressWarnings("unused")
		State state = null;
		@SuppressWarnings("unused")
		Method methodGetState = null;
		@SuppressWarnings("unused")
		Method methodSetState = null;
		@SuppressWarnings("unused")
		Method methodCheckState = null;
		@SuppressWarnings({ "unused", "rawtypes" })
		Class noparams[] = {};
		@SuppressWarnings("rawtypes")
		Class classx = null;
		State obj = null;

			try {
				classx = Class.forName(clazz);
				obj = (State)classx.newInstance();
				
				//methodGetState = classx.getDeclaredMethod("getState", noparams);
				//Map<String, Object> mapParamx = (Map<String, Object>)methodGetState.invoke(obj, null);
				
				obj.setState(mapParam);
				
				//methodCheckState = classx.getDeclaredMethod("checkState", Map.class);
				//methodCheckState.invoke(obj, mapParam);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			return (T)obj;

	}
	
	
	
	@SuppressWarnings("unused")
	private String getClazz(String serializedParam) {
		String clazz = null;
		
		int index = serializedParam.indexOf("#@#");
		clazz = serializedParam.substring(0, index);
		
		return clazz;
	}

	

	
	@SuppressWarnings("unchecked")
	@Override
	public T create(byte[] aryMapParam) {
		
		
		String clazz = null;
		Map<String, Object> mapParam = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new ByteArrayInputStream(aryMapParam));
			mapParam = (HashMap<String, Object>)is.readObject();
			
			clazz = (String)mapParam.get("Main");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  create(clazz, mapParam);
		
		
	}
	@SuppressWarnings({ "unused", "unchecked" })
	private Map<String, Object> deserialize(byte[] aryMapParam) {
		
		
		HashMap<String, Object> newMap = null;
		try {
			

			//Read:
			ObjectInputStream is = new ObjectInputStream(new ByteArrayInputStream(aryMapParam));
			newMap = (HashMap<String, Object>)is.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return newMap;
	}

	public static void main(String[] args) {
		
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

		mapParam.put(SomeConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SomeConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SomeConfig.class.getName() + ".field3", "field3V");
		mapParam.put(SomeConfig.class.getName() + ".balance", "222221");
		
		
		SomeConfig balanceTransferTran = transactionFactory.create(SomeConfig.class.getName(), mapParam);
		
		assertTrue("invalid value", balanceTransferTran.getField1().equals("field1V"));
			
		assertTrue("invalid value", balanceTransferTran.getField2().equals("field2V"));
		
		assertTrue("invalid value", balanceTransferTran.getField3().equals("field3V"));
		
		return;

	}

}
