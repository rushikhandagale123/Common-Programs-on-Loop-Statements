
class KrishnamurtiNumber
{
	public static void main(String[] args) {
		int num=149;
		int dup=num;
		int sum=0;
		while(dup>0)
		{
			int rem=dup%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;
			}
			sum+=fact;
			dup/=10;
		}
		if(sum==num){
			System.out.println(num + " is a Krishnamurti Number");
		}
		else{
			System.out.println(num +" not a Krishnamurti number");
		}

			
		
		
	}
}