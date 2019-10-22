package com.group5.model;



public class EpModel {
	private int id;
	private String manv;
	private String tennv;
	private String dc;
	private int sdt;
	public EpModel() {
		super();
	}
	public EpModel(int id, String manv, String tennv, String dc, int sdt) {
		super();
		this.id = id;
		this.manv = manv;
		this.tennv = tennv;
		this.dc = dc;
		this.sdt = sdt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public String getTennv() {
		return tennv;
	}
	public void setTennv(String tennv) {
		this.tennv = tennv;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	
}
