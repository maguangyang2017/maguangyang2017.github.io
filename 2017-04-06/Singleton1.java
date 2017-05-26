class Singleton1{
	private static Singleton1 instance = null;
	public static void says(){
		System.out.println("¿¡∫∫");
	}
	public static Singleton1 getInstance(){
		if(instance==null){
			instance = new Singleton1();
		}
		return instance;
	}                                            
	private Singleton1(){}
}