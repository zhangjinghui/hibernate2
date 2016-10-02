package com.zjh.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.zjh.po.Father;
import com.zjh.po.HibernateSessionFactory;
import com.zjh.po.Sons;

public class FatherDAOImpl {
	public static void main(String[] args) {
		new FatherDAOImpl().queryAll();
	}
	public void add(){
		Session session=null;
		Transaction trans=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().openSession();
			trans=session.beginTransaction();
			
			Father f=new Father();
			f.setName("老王");
			
			Sons s1=new Sons();
			s1.setName("张三");
			s1.setFather(f);//儿子和父亲关联
			
			Sons s2=new Sons();
			s2.setName("李四");
			s2.setFather(f);//儿子和父亲关联
			
			f.getSonses().add(s1);//父亲和儿子关联
			f.getSonses().add(s2);//父亲和儿子关联
			
			session.save(f); 
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
			
			Father f=(Father)session.load(Father.class, 1);
			
			session.delete(f); //删除主表数据，对应的从表数据一并删除
			
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
	public void update(){
		Session session=null;
		Transaction trans=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().openSession();
			trans=session.beginTransaction();
			
			Father f=(Father)session.load(Father.class, 2);
			f.setName("呵呵");
			
			Set<Sons> set=f.getSonses();
			Iterator<Sons> it=set.iterator();
			int i=0;
			while(it.hasNext()){
				Sons s=it.next();
				s.setName("哈尔滨"+(++i));
			}
			
			session.update(f); 
			
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
	public void queryAll(){
		Session session=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().openSession();
			
			Query q=session.createQuery("from Father as a");//Father是父类，不是father表
			List<Father> list=q.list();
			for(Father f:list){
				System.out.println(f.getName());
				Set<Sons> set=f.getSonses();
				Iterator<Sons> it=set.iterator();
				
				while(it.hasNext()){
					System.out.println(it.next().getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
}
