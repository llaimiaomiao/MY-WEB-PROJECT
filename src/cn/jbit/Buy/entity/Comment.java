package cn.jbit.Buy.entity;

import java.sql.Date;

public class Comment {
	private int bc_ID;
	private String bc_content;
	private Date bc_createtime;
	private String bc_reply;
	private Date bc_replytime;
	private String bc_nikename;
	public int getBc_ID() {
		return bc_ID;
	}
	public void setBc_ID(int bcID) {
		bc_ID = bcID;
	}
	public String getBc_content() {
		return bc_content;
	}
	public void setBc_content(String bcContent) {
		bc_content = bcContent;
	}
	public Date getBc_createtime() {
		return bc_createtime;
	}
	public void setBc_createtime(Date bcCreatetime) {
		bc_createtime = bcCreatetime;
	}
	public String getBc_reply() {
		return bc_reply;
	}
	public void setBc_reply(String bcReply) {
		bc_reply = bcReply;
	}
	public Date getBc_replytime() {
		return bc_replytime;
	}
	public void setBc_replytime(Date bcReplytime) {
		bc_replytime = bcReplytime;
	}
	public String getBc_nikename() {
		return bc_nikename;
	}
	public void setBc_nikename(String bcNikename) {
		bc_nikename = bcNikename;
	}
}
