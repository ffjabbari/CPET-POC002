package com.emoney.cpet.emx;

import java.util.Map;

public interface Contextable extends State {
	
	public void log(String message, Map<String, Object> mapParam);

}
