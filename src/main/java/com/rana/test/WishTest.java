package com.rana.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rana.beans.WishGenerator;

public class WishTest {

	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/com/rana/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		WishGenerator bean = (WishGenerator) factory.getBean("wsg");
		String result = bean.generateWishMsg();
		System.out.println(result);

	}

}
