package com.adarsh.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.adarsh.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		
		//hold name and location of spring cfg file
		res=new FileSystemResource("src/main/java/com/adarsh/cfg/applicationContext.xml");
		//create BeanFactory container
		factory=new XmlBeanFactory(res);
		//get the target class obj
		generator=(WishMessageGenerator) factory.getBean("wmg");
		//printing the result calling wishUser method
		System.out.println(generator.wishUser("Adarsh"));
	}

}
