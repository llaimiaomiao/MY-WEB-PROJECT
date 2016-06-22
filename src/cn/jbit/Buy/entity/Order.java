package cn.jbit.Buy.entity;

import java.sql.Date;

public class Order {
	private int bo_ID;
	private String bo_userID;
	private String bo_username;
	private String bo_useraddress;
	private Date bo_createtime;
	private double bo_cost;
	private int bo_status;
	public int getBo_ID() {
		return bo_ID;
	}
	public void setBo_ID(int boID) {
		bo_ID = boID;
	}
	public String getBo_userID() {
		return bo_userID;
	}
	public void setBo_userID(String boUserID) {
		bo_userID = boUserID;
	}
	public String getBo_username() {
		return bo_username;
	}
	public void setBo_username(String boUsername) {
		bo_username = boUsername;
	}
	public String getBo_useraddress() {
		return bo_useraddress;
	}
	public void setBo_useraddress(String boUseraddress) {
		bo_useraddress = boUseraddress;
	}
	public Date getBo_createtime() {
		return bo_createtime;
	}
	public void setBo_createtime(Date boCreatetime) {
		bo_createtime = boCreatetime;
	}
	public double getBo_cost() {
		return bo_cost;
	}
	public void setBo_cost(double boCost) {
		bo_cost = boCost;
	}
	public int getBo_status() {
		return bo_status;
	}
	public void setBo_status(int boStatus) {
		bo_status = boStatus;
	}
}
