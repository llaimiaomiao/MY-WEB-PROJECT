package cn.jbit.Buy.entity;

import java.sql.Date;

public class User {
	private String bu_userID;
	private String bu_username;
	private String bu_password;
	private String bu_sex;
	private Date bu_birthday;
	private String bu_IDCard;
	private String bu_email;
	private String bu_phone;
	private String bu_address;
	private int bu_login;
	private int bu_status;
	public String getBu_userID() {
		return bu_userID;
	}
	public void setBu_userID(String buUserID) {
		bu_userID = buUserID;
	}
	public String getBu_username() {
		return bu_username;
	}
	public void setBu_username(String buUsername) {
		bu_username = buUsername;
	}
	public String getBu_password() {
		return bu_password;
	}
	public void setBu_password(String buPassword) {
		bu_password = buPassword;
	}
	public String getBu_sex() {
		return bu_sex;
	}
	public void setBu_sex(String buSex) {
		bu_sex = buSex;
	}
	public Date getBu_birthday() {
		return bu_birthday;
	}
	public void setBu_birthday(Date buBirthday) {
		bu_birthday = buBirthday;
	}
	public String getBu_IDCard() {
		return bu_IDCard;
	}
	public void setBu_IDCard(String buIDCard) {
		bu_IDCard = buIDCard;
	}
	public String getBu_email() {
		return bu_email;
	}
	public void setBu_email(String buEmail) {
		bu_email = buEmail;
	}
	public String getBu_phone() {
		return bu_phone;
	}
	public void setBu_phone(String buPhone) {
		bu_phone = buPhone;
	}
	public String getBu_address() {
		return bu_address;
	}
	public void setBu_address(String buAddress) {
		bu_address = buAddress;
	}
	public int getBu_login() {
		return bu_login;
	}
	public void setBu_login(int buLogin) {
		bu_login = buLogin;
	}
	public int getBu_status() {
		return bu_status;
	}
	public void setBu_status(int buStatus) {
		bu_status = buStatus;
	}
}
