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
				System.out.println("ȡǮ�ɹ���ȡ����"+money);
			}else{
				System.out.println("����,��ʣ"+zhanghu.getNumber()+"��"+(money-zhanghu.getNumber()));
			}
		}
		
	}
	
}
























