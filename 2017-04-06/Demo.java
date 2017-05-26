public class Demo{
	public static void main(String [] args ){
		
	}
}
interface IA{
	void study();
} 
interface IB{
	void say();
}
interface Izhuban{
	void useUSB();
}
class mouseUsbImpl implements IA,IB,Izhuban{
	public void useUSB(){
		
	}
	public void say(){
	
	}
	public void study(){
	
	}
}
class keyBoardUsb implements Izhuban{
	public void useUSB(){
		System.out.println("我是键盘，我用usb来打字的");
	}

	public void study(){
	
	}

	public void work(){
	
	}
}
