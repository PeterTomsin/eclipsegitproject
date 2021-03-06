package com.array.bean;
// Generated 2019-1-21 0:17:11 by Hibernate Tools 3.6.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Goods generated by hbm2java
 */
@Entity
@Table(name = "goods", catalog = "arraytech")
public class Goods implements java.io.Serializable {

	private int id;
	private String pname;
	private String pdate;
	private long price;
	private String pcity;
	private String mark;

	public Goods() {
	}

	public Goods(int id, String pname, String pdate, long price, String pcity, String mark) {
		this.id = id;
		this.pname = pname;
		this.pdate = pdate;
		this.price = price;
		this.pcity = pcity;
		this.mark = mark;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "pname", nullable = false)
	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Column(name = "pdate", nullable = false)
	public String getPdate() {
		return this.pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	@Column(name = "price", nullable = false, precision = 10, scale = 0)
	public long getPrice() {
		return this.price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Column(name = "pcity", nullable = false)
	public String getPcity() {
		return this.pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	@Column(name = "mark", nullable = false, length = 500)
	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
