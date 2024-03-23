import java.util.Scanner;
class Rev
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		String rev=" ";
		//   1242>0
		while(num>0)
		{
			int rem=num%10;
			rev=rev+rem;
			num/=10;
		}
		System.out.println(rev);
	}
}