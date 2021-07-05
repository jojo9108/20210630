package co.yedam.exercise;

import co.yedam.pilates.Gender;

public class VIP {
	private String vipgrade;
	private String vipname;
	private String vipphone;
	private Gender vipgen;

	public VIP() {
		this.vipgrade = "diamond";
		this.vipname = "buffett";
		this.vipphone = "01010";
		this.vipgen = Gender.MEN;
	}

	public VIP(String vipgrade, String vipname, String vipphone, Gender vipgen) {
		super();
		this.vipgrade = vipgrade;
		this.vipname = vipname;
		this.vipphone = vipphone;
		this.vipgen = vipgen;
	}

	public String getVipgrade() {
		return vipgrade;
	}

	public void setVipgrade(String vipgrade) {
		this.vipgrade = vipgrade;
	}

	public String getVipname() {
		return vipname;
	}

	public void setVipname(String vipname) {
		this.vipname = vipname;
	}

	public String getVipphone() {
		return vipphone;
	}

	public void setVipphone(String vipphone) {
		this.vipphone = vipphone;
	}

	public Gender getVipgen() {
		return vipgen;
	}

	public void setVipgen(Gender vipgen) {
		this.vipgen = vipgen;
	}

	public void setvipInfo() {
		System.out.println(
				"등급: " + this.vipgrade + " | 성함: " + this.vipname + " | 연락처: " + this.vipphone + " | 성별: " + this.vipgen);
	}

	public String getvipInfo() {
		return "등급: " + this.vipgrade + " | 성함: " + this.vipname + " | 연락처: " + this.vipphone + " | 성별: " + this.vipgen;

	}
}
