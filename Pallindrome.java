import java.util.Scanner;
class Pallindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter a number");
		int num=sc.nextInt();
		int rev=0;
		int dup=num;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;

		}
		System.out.println((rev==dup)?"number is pallindrome": " number is not pallindrome");
	}
}