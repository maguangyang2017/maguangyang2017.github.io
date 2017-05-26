public class sushu{
	public static void main (String[] args) {
		int j=2,k=1,i=100;
		for(i=100;i<=200;i++){
		for(j=2,k=1;j<i/2;j++){
			if(i%j==0){
				k=0;
				break;
			}
			
		}
		if(k==1){
			System.out.print(i+",");
		}
	}
	}
}