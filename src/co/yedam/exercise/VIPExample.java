package co.yedam.exercise;

import co.yedam.pilates.Gender;

public class VIPExample {
	public static void main(String[] args) {
		VIP vip1 = new VIP();
		vip1.setVipgrade("diamond");
		vip1.setVipname("buffett");
		vip1.setVipphone("01010");
		vip1.setVipgen(Gender.MEN);
		System.out.println(vip1.getvipInfo());
		VIP vip2 = new VIP("rubi", "musk", "011101", Gender.MEN);
		System.out.println(vip2.getvipInfo());

		VIP vip3 = new VIP("Sapphire", "francoise", "010123", Gender.WOMEN);
		System.out.println(vip3.getvipInfo());

		VIP[] viplist = new VIP[5];
		viplist[0] = vip1;
		viplist[1] = vip2;
		viplist[2] = vip3;
		viplist[3] = null;
		viplist[4] = null;

		for (int i = 0; i < viplist.length; i++)
			if (viplist[i] != null)
				System.out.println(viplist[i].getVipgrade() + "," + viplist[i].getVipname());

	}
}
