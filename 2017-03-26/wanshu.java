public class wanshu{
	public static void main (String[] args) {
			int i=1;
	while(i<=1000)
	{
		int sum=0;
		int j=1;
		while(j<i)
		{
			if(i%j==0)
			{
				sum+=j;
			} 
			j++;
		}
		if(sum==i)
		{
			System.out.print(i+",");
		}
		i++;
	}
	}
}