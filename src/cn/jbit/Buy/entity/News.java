package cn.jbit.Buy.entity;

import java.util.Date;


public class News {
	private int bn_ID;
	private String bn_title;
	private String bn_content;
	private Date bn_creteDate;
	public int getBn_ID() {
		return bn_ID;
	}
	public void setBn_ID(int bnID) {
		bn_ID = bnID;
	}
	public String getBn_title() {
		return bn_title;
	}
	public void setBn_title(String bnTitle) {
		bn_title = bnTitle;
	}
	public String getBn_content() {
		return bn_content;
	}
	public void setBn_content(String bnContent) {
		bn_content = bnContent;
	}
	public Date getBn_creteDate() {
		return bn_creteDate;
	}
	public void setBn_creteDate(Date bn_creteDate) {
		this.bn_creteDate = bn_creteDate;
	}
	
}
