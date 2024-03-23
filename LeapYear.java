import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year");
		int year =sc.nextInt();
		if(year%4==0)
		{
			System.out.println("year is leap year");
		}
		else{
			System.out.println("not a leap year");
		}
	}
}