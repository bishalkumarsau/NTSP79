package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class WebContainer {
	public abstract RequestHandler getRequestHandler();
	
	public WebContainer() {
		System.out.println("WebContainer :: 0-param constructor");
	}
	
	public void  delegateRequest(String data){
		RequestHandler handler=null;
		System.out.println("WebContianer: request recived with "+data+" adn delegating to handler");
		//create IOC container
		//get Depedent Bean obj
		handler=getRequestHandler();
		handler.proessingRequest(data);
	}
	
}//class
