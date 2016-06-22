package cn.jbit.Buy.entity;

public class Orderdetail {
	private int bod_ID;
	private int bo_ID;
	private int bn_ID;
	private int bod_count;
	private double bod_cost;
	public int getBod_ID() {
		return bod_ID;
	}
	public void setBod_ID(int bodID) {
		bod_ID = bodID;
	}
	public int getBo_ID() {
		return bo_ID;
	}
	public void setBo_ID(int boID) {
		bo_ID = boID;
	}
	public int getBn_ID() {
		return bn_ID;
	}
	public void setBn_ID(int bnID) {
		bn_ID = bnID;
	}
	public int getBod_count() {
		return bod_count;
	}
	public void setBod_count(int bodCount) {
		bod_count = bodCount;
	}
	public double getBod_cost() {
		return bod_cost;
	}
	public void setBod_cost(double bodCost) {
		bod_cost = bodCost;
	}
}
