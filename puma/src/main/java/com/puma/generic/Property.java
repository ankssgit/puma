package com.puma.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
public String property(String key) throws Exception{
	
	FileInputStream filepath=new FileInputStream("C:/Users/TYSS/Desktop/Puma/puma/config.properties");
	Properties p=new Properties();
	p.load(filepath);
	String url=p.getProperty(key);
	return url;
	
}
}
