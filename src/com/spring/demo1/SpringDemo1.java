package com.spring.demo1;

import javax.security.auth.login.AppConfigurationEntry;

import org.eclipse.jdt.internal.compiler.lookup.MethodScope;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringDemo1 {
	
	
	/**   
	 * @Title: demo1   
	 * @Description: TODO(传统方式)   
	 * @param:       
	 * @return: void      
	 * @throws   
	 */
	@Test
	
	public void demo1() {
		UserService userService= new UserServiceImpl();
		userService.save();		
	}
	
	/**   
	 * @Title: demo2   
	 * @Description: TODO(Spring的方式的调用)   
	 * @param:       
	 * @return: void      
	 * @throws   
	 */
	@Test
	public void demo2() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("UserService");
		userService.save();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
