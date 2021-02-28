import java.util.Scanner;
class sq_sum
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int sum=0;
		for(int i=0;i<10;i++)
		{
			a[i] = scan.nextInt();
			sum+=(a[i]*a[i]);
		}
		System.out.println("The sum of squares is "+sum);
	}
}