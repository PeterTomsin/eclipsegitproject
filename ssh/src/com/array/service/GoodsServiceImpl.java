package com.array.service;

import java.util.List;

import com.array.bean.Goods;
import com.array.dao.GoodsDao;

/**
 *  SSH  ssh整合  struts2, hibernate5 spring4列表
 * @author PeterTomsin
 *
 */
public class GoodsServiceImpl implements GoodsService {

	private GoodsDao idao;
	
	
	@Override
	public List<Goods> getAllGoods() {
		
		List<Goods> glist = idao.getAllGoods();
		
		return glist;
	}

	public void setIdao(GoodsDao idao) {
		this.idao = idao;
	}
	
	

}
