package com.zjh.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zjh.po.HibernateSessionFactory;
import com.zjh.po.Hus;
import com.zjh.po.Wife;

public class HusDAOImpl {
	public static void main(String[] args) {
		new HusDAOImpl().updateZ();
	}
	public void add(){
		Session session=null;
		Transaction trans=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().openSession();
			trans=session.beginTransaction();
			
			Hus h=new Hus();//Hus.hbm.xml中<one-to-one></one-to-one>需要添加cascade属性才能保证修改主表的同时，修改从表
			h.setId(3);
			h.setName("郭靖");
			
			Wife w=new Wife();
			w.setId(3);
			w.setName("黄蓉");
			
			h.setWife(w);//一对一关系，po对象里包含一个wife
			w.setHus(h);//一对一关系，po对象里包含一个hus
			
			session.save(h);
			
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
	public void delZ(){
		Session session=null;
		Transaction trans=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().openSession();
			trans=session.beginTransaction();
			
			Hus h=(Hus)session.load(Hus.class, 3);
			session.delete(h);
			
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
	public void updateZ(){
		Session session=null;
		Transaction trans=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().openSession();
			trans=session.beginTransaction();
			
			Hus h=(Hus)session.load(Hus.class, 1);
			h.setName("java");
			h.getWife().setName("c++");
			
			session.save(h);
			
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
}
