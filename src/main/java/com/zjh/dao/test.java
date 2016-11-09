package com.zjh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

public class test {
	@Test
	public void test(){
		Configuration config=new Configuration().configure();//获得配置对象
		//获得服务注册对象
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).build();
		//获得SessionFactory对象
		SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
		Session session=sessionFactory.openSession();
		if(session!=null){
			System.out.println("session创建成功");
		}else{
			System.out.println("session创建失败");
		}
	}
}
