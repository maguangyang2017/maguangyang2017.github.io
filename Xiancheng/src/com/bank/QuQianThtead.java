package com.bank;

public class QuQianThtead implements Runnable {
	@SuppressWarnings("unused")
	private Zhanghu zhanghu;
	private int money;
	public QuQianThtead(Zhanghu zhanghu,int money){
		this.zhanghu=zhanghu;
		this.money=money;
	}
	@Override
	public void run() {
		synchronized(zhanghu){
			if(zhanghu.getNumber()>=money){
				zhanghu.setNumber(zhanghu.getNumber()-money);
				System.out.println("取钱成功，取走了"+money);
			}else{
				System.out.println("余额不足,还剩"+zhanghu.getNumber()+"差"+(money-zhanghu.getNumber()));
			}
		}
		
	}
	
}
























