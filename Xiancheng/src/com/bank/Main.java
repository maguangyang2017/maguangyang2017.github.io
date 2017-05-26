package com.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int shuru = sc.nextInt();
		Zhanghu zhanghu = new Zhanghu("liu",4000);
		QuQianThtead ka = new QuQianThtead(zhanghu,2000);
		QuQianThtead zhe = new QuQianThtead(zhanghu,3000);
		new Thread(ka).start();
		new Thread(zhe).start();
	}

}
