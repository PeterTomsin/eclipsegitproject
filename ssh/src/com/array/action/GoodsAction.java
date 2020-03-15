package com.array.action;

import java.util.List;

import com.array.service.GoodsService;
import com.array.bean.Goods;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author PeterTomsin
 *
 */
public class GoodsAction extends ActionSupport{
	
	//网络传输校验
	private static final long serialVersionUID = 1L;
	
	private GoodsService is = null;

	public GoodsService getIs() {
		return is;
	}

	public void setIs(GoodsService is) {
		this.is = is;
	}
	
	/**
	 * 整合列表查询操作
	 */
	public String execute() {
		
		List<Goods> goodslist = is.getAllGoods();
		ActionContext ac = ActionContext.getContext();
		ac.put("goodsList", goodslist);
		return "success";
	}
	
	
	
	
	
}
