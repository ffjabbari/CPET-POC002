package com.emoney.cpet.emx;

import java.util.Map;

public interface Configable extends State {
	
	public void log(String message, Map<String, Object> mapParam);

}
