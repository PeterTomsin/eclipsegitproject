package com.array.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.array.bean.Goods;

public class GoodsDaoImpl implements GoodsDao {

	
	// sessionFactory的注入
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 列表
	 */
	@Override
	public List<Goods> getAllGoods() {
		//1、获取session
		Session session = sessionFactory.openSession();
		
		//2、存入查询对象
		Query query = session.createQuery("from Goods");
		
		//3、获取结果
		List<Goods> glist = query.getResultList();
		
		//4、关闭连接
		session.close();
		sessionFactory.close();
		
		return glist;
	}
	
	

}
