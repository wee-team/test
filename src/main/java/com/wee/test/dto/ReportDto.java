package com.wee.test.dto;

import java.io.Serializable;

public class ReportDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4588151429458937716L;
	
	private String  idShop;
	private String  nameShop;
	private Integer countItem;
	
	
	
	public ReportDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ReportDto(String idShop, String nameShop, Integer countItem) {
		super();
		this.idShop = idShop;
		this.nameShop = nameShop;
		this.countItem = countItem;
	}



	public String getIdShop() {
		return idShop;
	}
	public void setIdShop(String idShop) {
		this.idShop = idShop;
	}
	public String getNameShop() {
		return nameShop;
	}
	public void setNameShop(String nameShop) {
		this.nameShop = nameShop;
	}
	public Integer getCountItem() {
		return countItem;
	}
	public void setCountItem(Integer countItem) {
		this.countItem = countItem;
	}
	
	
}
