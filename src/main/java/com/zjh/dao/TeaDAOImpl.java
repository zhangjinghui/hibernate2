package com.zjh.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zjh.po.Father;
import com.zjh.po.HibernateSessionFactory;
import com.zjh.po.Sons;
import com.zjh.po.Stu;
import com.zjh.po.Tea;

public class TeaDAOImpl {
	public static void main(String[] args) {
		new TeaDAOImpl().del();
	}
	public void add(){
		Session session=null;
		Transaction trans=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().openSession();
			trans=session.beginTransaction();
			
			Tea t1=new Tea();
			t1.setId(1);
			t1.setName("mike");
			
			Tea t2=new Tea();
			t2.setId(2);
			t2.setName("jack");
			
			Stu s1=new Stu();
			s1.setId(1);
			s1.setName("小李");
			s1.getTeas().add(t1);
			s1.getTeas().add(t2);
			
			
			Stu s2=new Stu();
			s2.setId(2);
			s2.setName("小王");
			s2.getTeas().add(t1);
			s2.getTeas().add(t2);
			
			t1.getStus().add(s1);
			t1.getStus().add(s2);
			
			t2.getStus().add(s1);
			t2.getStus().add(s2);
			
			session.save(t1);
			session.save(t2);
			
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
	public void del(){
		Session session=null;
		Transaction trans=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().openSession();
			trans=session.beginTransaction();
			
			Tea t=(Tea)session.load(Tea.class, 1);
			
			session.delete(t);
			
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
}
