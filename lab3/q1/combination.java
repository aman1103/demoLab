import java.util.Scanner;
class combination
{
	public static void swap(int[] a,int i,int j)
	{
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void print_combination(int[] a)
	{
		for(int i=0;i<3;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.print("\n");
	}
	public static void make_combinations(int[] a,int pos)
	{
		if(pos==2)
		{
			print_combination(a);
			return;
		}
		else
		{
			for(int i=pos;i<3;i++)
			{
				swap(a,i,pos);
				make_combinations(a,pos+1);
				swap(a,i,pos);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int [] a = new int[3];
		for(int i=0;i<3;i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("The combinations are : ");
		make_combinations(a,0);
	}
}